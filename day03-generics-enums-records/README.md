# Day 3 – Generics, Enums, Records

### Q1:
> Why do generics exist in Java?
> ### Example:
> Create a generic `Box<T>` class that can hold any type. Put an `Integer` in one and a `String` in another.
> ### Requirement:
> - You can declare and use a generic class.
> - You can use type parameters (`<T>`) correctly.
> - You understand how generics improve type safety and reduce casting.

### Q2:
> How would you model Minecraft items with an `enum`?
> ### Example:
> Create an `enum ItemType { SWORD, PICKAXE, BOW }` with custom fields for durability and attack power. Print their values.
> ### Requirement:
> - You can define an enum with constants.
> - You can add fields and methods to an enum.
> - You can iterate over enum values.

### Q3:
> What are Java `records` and why are they useful?
> ### Example:
> Create a `record Position(int x, int y)` and instantiate it. Use its built-in methods like `toString()`, `equals()`, and accessors.
> ### Requirement:
> - You can declare a record.
> - You understand that records are immutable data carriers.
> - You can use their auto-generated methods.

### Mini-Project:
> Build a small **Inventory system**:
> - Use a `List<Box<ItemType>>` to store items.
> - Create an `enum` for item types with durability.
> - Represent a player’s inventory as a `record` with `playerName` and their item list.
> ### Requirement:
> - You can combine generics, enums, and records in one small program.
> - You can print a summary of the inventory using streams or loops.

### Notes
> - Dont fully understand generics or when they are really used but did learn they are good for functions/classes which can take any type and do the same thing with them. Example reading a key value pair.
> - Enums are a way to define a set of custom types with custom fields when used with a constuctor. They can also have methods.
> - Records are a good way to make immutable data objects with auto generated methods, getters, setters, constuctors and such.
> - I made a quick inventory using a record for the inventory to hold playername and a list of items.
> - these items were held inside a generic box class which was using an enum for its item type and since the enum had data i could track durability and damage from it.
> - The Generics allowed me to make a unique object which was cast to an enum type that contained all data i needed. The record then allowed me to store an inventory of unique items for each player using the built in constructors and methods.
> - Records cannot be changed after creation(immutable) so i cant add or remove items from the player. Better to use a hashmap or similar for that.