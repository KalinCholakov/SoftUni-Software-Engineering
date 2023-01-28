import java.util.Objects;

public class Battlecard implements Comparable<Battlecard> {

    private int id;
    private CardType type;
    private String name;
    private double damage;
    private double swag;


    public Battlecard(int id, CardType type, String name, double damage, double swag) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.swag = swag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getSwag() {
        return swag;
    }

    public void setSwag(double swag) {
        this.swag = swag;
    }

    @Override
    public int compareTo(Battlecard other) {
        int compare = Double.compare(other.damage, this.damage);

        if (compare == 0) {
            compare = Integer.compare(this.id, other.id);
        }

        return compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battlecard that = (Battlecard) o;
        return id == that.id &&
                Double.compare(that.damage, damage) == 0 &&
                Double.compare(that.swag, swag) == 0 &&
                type == that.type &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, damage, swag);
    }
}