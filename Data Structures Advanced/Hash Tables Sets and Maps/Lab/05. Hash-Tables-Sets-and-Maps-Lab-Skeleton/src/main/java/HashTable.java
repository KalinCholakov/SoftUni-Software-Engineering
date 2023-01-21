import java.util.*;

public class HashTable<K, V> implements Iterable<KeyValue<K, V>> {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.80d;

    private LinkedList<KeyValue<K, V>>[] slots;
    private int count;
    private int capacity;

    public HashTable() {
        this(INITIAL_CAPACITY);
    }

    public HashTable(int capacity) {
        this.slots = new LinkedList[capacity];
        this.count = 0;
    }

    public void add(K key, V value) {
        this.growIfNeeded();
        int slotNumber = this.findSlotNumber(key);
        if (this.slots[slotNumber] == null) {
            this.slots[slotNumber] = new LinkedList<>();
        }

        for (KeyValue<K, V> element : slots[slotNumber]) {
            if (element.getKey().equals(key)) {
                throw new IllegalArgumentException("Key already exists: " + key);
            }
        }

        KeyValue<K, V> kvp = new KeyValue<>(key, value);
        this.slots[slotNumber].addLast(kvp);
        this.count++;
    }

    private int findSlotNumber(K key) {
        return Math.abs(key.hashCode()) % this.slots.length;
    }

    private void growIfNeeded() {
        if ((double) (this.size() + 1) / this.capacity() > LOAD_FACTOR) {
            this.grow();
        }
    }

    private void grow() {
        HashTable<K, V> newHashTable = new HashTable<>(2 * this.slots.length);
        for (LinkedList<KeyValue<K, V>> element : this.slots) {
            if (element != null) {
                for (KeyValue<K, V> keyValue : element) {
                    newHashTable.add(keyValue.getKey(), keyValue.getValue());
                }
            }
        }

        this.slots = newHashTable.slots;
        this.count = newHashTable.count;
    }

    public int size() {
        return this.count;
    }

    public int capacity() {
        return this.slots.length;
    }

    public boolean addOrReplace(K key, V value) {
        this.growIfNeeded();
        int slotNumber = this.findSlotNumber(key);
        if (this.slots[slotNumber] == null) {
            this.slots[slotNumber] = new LinkedList<>();
        }

        for (KeyValue<K, V> element : slots[slotNumber]) {
            if (element.getKey().equals(key)) {
                element.setValue(value);
                return false;
            }
        }

        KeyValue<K, V> kvp = new KeyValue<>(key, value);
        this.slots[slotNumber].addLast(kvp);
        this.count++;
        return true;
    }

    public V get(K key) {
        KeyValue<K, V> element = this.find(key);
        if (element == null) {
            throw new IllegalArgumentException();
        }
        return element.getValue();
    }

    public KeyValue<K, V> find(K key) {
        int slotNumber = this.findSlotNumber(key);
        LinkedList<KeyValue<K, V>> elements = this.slots[slotNumber];
        if (elements != null) {
            for (KeyValue<K, V> element : elements) {
                if (element.getKey().equals(key)) {
                    return element;
                }
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        return this.find(key) != null;
    }

    public boolean remove(K key) {
        int slotNumber = findSlotNumber(key);
        LinkedList<KeyValue<K, V>> element = this.slots[slotNumber];
        if (element != null) {
            for (KeyValue<K, V> keyValue : element) {
                if (keyValue.getKey().equals(key)) {
                    element.remove(keyValue);
                    this.count--;
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        this.slots = new LinkedList[INITIAL_CAPACITY];
    }

    public Iterable<K> keys() {
        List<K> keys = new ArrayList<>();
        this.forEach(e -> keys.add(e.getKey()));
        return keys;
    }

    public Iterable<V> values() {
        List<V> values = new ArrayList<>();
        this.forEach(e -> values.add(e.getValue()));
        return values;
    }

    @Override
    public Iterator<KeyValue<K, V>> iterator() {
        return new HashTableIterator();
    }

    private class HashTableIterator implements Iterator<KeyValue<K, V>> {

        private Deque<KeyValue<K, V>> stack;

        private HashTableIterator() {
            this.stack = new ArrayDeque<>();
            for (LinkedList<KeyValue<K, V>> slot : slots) {
                if (slot != null) {
                    for (KeyValue<K, V> kvp : slot) {
                        this.stack.addFirst(kvp);
                    }
                }
            }
        }


        @Override
        public boolean hasNext() {
            return !this.stack.isEmpty();
        }

        @Override
        public KeyValue<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return this.stack.removeFirst();
        }
    }
}
