package app.enums;

public enum Items {
    SWORD(100, 4),
    PICKAXE(125, 3),
    BOW(75, 2);

    private final int durability;
    private final int damage;

    Items(int durability, int damage) {
        this.durability = durability;
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public int getDamage() {
        return damage;
    }
}
