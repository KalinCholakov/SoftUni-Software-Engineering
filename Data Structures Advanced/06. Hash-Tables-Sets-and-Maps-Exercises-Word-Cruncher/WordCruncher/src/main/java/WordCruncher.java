import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class WordCruncher {
    private static List<String> pool;
    private static String target;
    private static List<String> buffer = new ArrayList<>();
    private static Set<String> result = new HashSet<>();
    private static StringBuilder aggregator = new StringBuilder();
    private static Map<Integer, ArrayList<String>> tree = new HashMap<>();
    private static Map<String, Integer> resources = new HashMap<>();
    private static Map<String, Integer> counter = new HashMap<>();

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        pool = Arrays.stream(reader.readLine().split(", "))
                .collect(Collectors.toList());

        target = reader.readLine();

        ArrayList<String> toRemove = new ArrayList<>();
        for (String str : pool) {
            if (!target.contains(str)) {
                toRemove.add(str);
            } else if (!resources.containsKey(str)) {
                resources.put(str, 1);
                counter.put(str, 0);
            } else {
                resources.put(str, resources.get(str) + 1);
            }
        }
        pool.removeAll(toRemove);


        for (int i = 0; i < target.length(); i++) {
            tree.put(i, new ArrayList<>());
        }

        for (String element : pool) {
            int index = target.indexOf(element);
            while (index != -1) {
                tree.get(index).add(element);
                index = target.indexOf(element, index + 1);
            }
        }

        treeTraverse(0);

        System.out.print(aggregator.toString());
    }

    private static void treeTraverse(int index) {
        if (index == target.length()) {
            printCombination();
        } else {
            for (int i = 0; i < tree.get(index).size(); i++) {
                String element = tree.get(index).get(i);
                if (resources.get(element) > counter.get(element)) {
                    counter.put(element, counter.get(element) + 1);
                    buffer.add(element);
                    treeTraverse(index + element.length());
                    buffer.remove(buffer.lastIndexOf(element));
                    counter.put(element, counter.get(element) - 1);
                }
            }
        }
    }

    private static void printCombination() {
        String text = String.join("", buffer);
        if (text.equals(target)) {
            String output = String.join(" ", buffer);
            if (result.add(output)) {
                aggregator.append(output).append(System.lineSeparator());
            }
        }
    }
}
