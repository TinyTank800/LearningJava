# Day 2 – Collections, Streams, Lambdas

### Q1: 
> What’s the difference between a `List` and a `Set`?
> ### Example:
> Create a `List<String>` of 5 player names. Create a `Set<String>` with the same names, but include a duplicate. Print both collections and compare the results.
> ### Requirement:
> - You can add, remove, and get elements from a `List`.
> - You understand that a `Set` removes duplicates and has no guaranteed order.

### Q2: 
> What is a `Map` used for, and how is it different from a `List`?
> ### Example:
> Create a `Map<String, Integer>` where the key is a player name and the value is their score. Add 3 entries, update one score, and print the results.
> ### Requirement:
> - You can insert, update, and get values by key.
> - You know that a `Map` does not allow duplicate keys.

### Q3: 
> What does a lambda expression let you do in Java?
> ### Example:
> Given a `List<String>`, use `.forEach()` with a lambda to print each name in uppercase.
> ### Requirement:
> - You can write a lambda like `n -> System.out.println(n)`.
> - You can use `.forEach()` with a lambda to process each element.
> - You understand that a lambda is a shorter way of writing an anonymous function.

### Q4: 
> How do streams help with data processing compared to loops?
> ### Example: 
> From a `List<String> names`, use a stream to filter only names that start with `"A"`. Collect the results into a new `List<String>` and print them.
> ### Requirement:
> - You can filter elements in a stream.
> - You can transform (map) values in a stream.
> - You can collect results into a `List` or `Set`.

### Mini-Project:
> Build a simple “Leaderboard.”
> - Use a `Map<String, Integer>` to store player → score.
> - Use a stream to sort players by score (highest first).
> - Print the ranking in the format:
> ```
>   1. Alice - 50
>   2. Bob - 40
>   3. Charlie - 20
>   ```
> ### Requirement:
> - You can combine `Map`, streams, and lambdas.
> - You can sort by value instead of key.
> - You can print a leaderboard showing rank, player, and score.

### Notes
> - Tried to create a set with duplicates set already using set.of() but that threw an error for duplicate objects.
> - had to use the same list set with duplicates and use set.CopyOf() method which cuts off the duplicates.
> - Sets also seem to have no order.
> - Since creating a list.of() makes an immutable list, I had to create a new arraylist and pass the list.of() to it to be able to add, remove, or update elements.
> - Map is also immutable so creating a new hashmap with map of lets you add.
> - Streams allow you to process maps/collections in a functional way.
> - Using the stream you can then sort that stream with a custom comparator.
> - I used Map.Entry.comparingByValue() to turn the stream into a map of entries then set the compare by value to be a key value set and compare by the values. 
> - Reverse makes it go from highest to lowest instead of lowest to highest.
> - Then used a lambda off the stream to upsert the results into a new map and display that using another lambda foreach.
> - Linked has map had to be used as normal hashmap does not contain order of insertion.