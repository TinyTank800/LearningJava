package app;

import app.enums.Items;
import app.inventory.Inventory;
import app.utils.Box;

import java.util.List;

public class Main {

    private static final Box<Integer> boxInt = new Box<Integer>();
    private static final Box<String> boxString = new Box<String>();

    private static final Items sword = Items.SWORD;

    public static void main(String[] args) {
        //Generics
        boxInt.set(123);
        boxString.set("Hello Generic Box");

        Integer intValue = boxInt.get();
        String strValue = boxString.get();

        System.out.println("Integer Value: " + intValue);
        System.out.println("String Value: " + strValue);

        //Enums
        System.out.println("Sword has " + sword.getDurability() + " durability and does " + sword.getDamage() + " damage.");

        for(Items item : Items.values()) {
            System.out.println(item + " - Durability: " + item.getDurability() + ", Damage: " + item.getDamage());
        }

        //Records
        Box<Items> swordBox = new Box<>();
        swordBox.set(Items.SWORD);

        Box<Items> bowBox = new Box<>();
        bowBox.set(Items.BOW);

        Inventory inventory = new Inventory("PlayerOne", List.of(swordBox, bowBox));

        System.out.println("Inventory of " + inventory.playerName() + ":");
        for(Box<Items> itemBox : inventory.items()) {
            Items item = itemBox.get();
            System.out.println("- " + item + " (Durability: " + item.getDurability() + ", Damage: " + item.getDamage() + ")");
        }
    }

}