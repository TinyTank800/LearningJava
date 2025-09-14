**Day 1 – Classes, Objects, Inheritance**

**Q1**: What’s the difference between a class and an object?

**Example:** Write a Player class with fields name and health. Create two Player objects with different names.

**Requirement:**
- You can define a class with fields and methods.
- You can instantiate multiple objects.
- You can extend a class (e.g., Warrior extends Player).

**NOTES:**
After starting with a basic player class with fields for name and health, I created two player objects with different names.
After the original players I made a warrior class that extended player and added additional functionality like attacking.
After that was created I added the initial game logic and game start logic to make a "game".
This would create a list of players and make them have random attack amounts and fight till only one of them was left.
I made sure to try and keep values final and static where needed to ensure immutability.
Ended up having to go away from a for loop because it would error when removing items/players from the list.
I found out that was due to the for loop using an iterator and would error since a value its trying to loop was removed.