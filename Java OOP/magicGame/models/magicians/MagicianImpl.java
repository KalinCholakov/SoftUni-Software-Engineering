package magicGame.models.magicians;

import magicGame.models.magics.Magic;

import static magicGame.common.ExceptionMessages.*;

public abstract class MagicianImpl implements Magician {
    private String username;
    private int health;
    private int protection;
    private Magic magic;

    protected MagicianImpl(String username, int health, int protection, Magic magic) {
        this.setUsername(username);
        this.setHealth(health);
        this.setProtection(protection);
        this.setMagic(magic);
    }

    private void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new NullPointerException(INVALID_MAGICIAN_NAME);
        }
        this.username = username;
    }

    private void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_HEALTH);
        }
        this.health = health;
    }

    private void setProtection(int protection) {
        if (protection < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_PROTECTION);
        }
        this.protection = protection;
    }

    private void setMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(INVALID_MAGIC);
        }
        this.magic = magic;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getProtection() {
        return this.protection;
    }

    @Override
    public Magic getMagic() {
        return this.magic;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void takeDamage(int points) {
        /*int directDamage = points > this.protection ? points - this.protection : 0;
        this.setProtection(Math.max(this.protection - points, 0));
        this.setHealth(Math.max(this.health - directDamage, 0));*/

        int damage = points;
        if (damage >= this.protection) {
            damage -= protection;
            this.protection = 0;
            this.health -= damage;
        } else {
            this.protection -= damage;
        }

        /*if (this.getProtection() - points > 0) {
            this.setProtection(this.getProtection() - points);
        } else {
            this.setProtection(0);

            if (this.getHealth() - points > 0) {
                this.setHealth(this.getHealth() - points);
            } else {
                this.setHealth(0);
                this.isAlive = false;
            }
        }*/

    }

    @Override
    public String toString() {

        String sb = String.format("%s: %s", this.getClass().getSimpleName(), this.getUsername()) +
                System.lineSeparator() +
                String.format("Health: %d", this.getHealth()) +
                System.lineSeparator() +
                String.format("Protection: %d", this.getProtection()) +
                System.lineSeparator() +
                String.format("Magic: %s", this.getMagic().getName());

        return sb.trim();
    }
}
