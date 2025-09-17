package app.inventory;

import app.enums.Items;
import app.utils.Box;

import java.util.List;

public record Inventory(String playerName, List<Box<Items>> items) {

}
