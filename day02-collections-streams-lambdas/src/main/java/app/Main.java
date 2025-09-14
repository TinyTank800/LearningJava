package app;

import java.util.*;

public class Main {

    private static final List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Diana", "Eve", "Bob", "Charlie"));
    private static final Set<String> uniqueNames = Set.copyOf(names);

    private static final Map<String, Integer> namePopularity = new HashMap<>(Map.of(
        "Alice", 5,
        "Bob", 3,
        "Charlie", 7,
        "Diana", 5,
        "Eve", 3
    ));

    private static final Map<String, Integer> sortedNamePopularity = new LinkedHashMap<>();

    public static void main(String[] args) {
        names.add("Frank");
        names.remove("Alice");
        System.out.println(names.get(2));

        System.out.println("List of Names: " + names);
        System.out.println("List of Unique Names: " + uniqueNames);

        namePopularity.put("Frank", 4);
        System.out.println("Popularity of Frank: " + namePopularity.get("Frank"));

        int alicePOP = namePopularity.get("Alice");
        namePopularity.replace("Alice", alicePOP + 1);
        System.out.println("Updated Popularity of Alice: " + namePopularity.get("Alice"));

        //Lambda print names
        uniqueNames.forEach(n -> System.out.println("Hello, " + n + "!"));

        //Sort the map by value
        namePopularity.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(e -> sortedNamePopularity.put(e.getKey(), e.getValue()));

        System.out.println("Leaderboard:");
        for(Map.Entry<String, Integer> entry : sortedNamePopularity.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}