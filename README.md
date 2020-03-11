# OHero
"Be your own hero."
* Objective:
  * Create a text adventure game using Java fundamentals.

## Minimum Viable Product (MVP)
* This game must have certain features to be viable:
  * Interaction of multiple characters (The Player, NPCs of some kind)
  * Player choices must somehow affect stats of The Player
  * Stats must be applied within interactions
  * A functional inventory
  * Persistence

## Specs
* The project should include some concept of
  * `Display` class
    * Text to be read by The Player (including menus) should be handled in an Object Oriented, single responsibility way. IE, make a class to handle display, reduce duplicated code as much as possible.
  * `Character` Abstraction
    * There will be many kinds of characters. The Player will have a Hero, there will be NPCs, bosses, other entities within the game. How will you handle that while duplicating the least amount of code?
  * `The Game Loop`
    * This game must continue running until either:
       A: The player intentionally exits or,
       B: The game comes to an end.
  * `Inventory and Collections`
    * How will you have the application track different characters, The Player's character inventory, and a reflection upon stats?
  * `Random Encounters`
    * Utilizing Dice and other known tools, create a means of randomizing encounters, initial stats rolls for characters, or otherwise.
  * `Testing`
    * Is not optional. Any portion of your code base which can be tested, should be tested using TDD.

  
 

## Developmental Notes
* OHero (Be your own Hero!) is an adventure game. The adventure is making the game. As such, player input is required early and often and **EVERY DECISION** should impact the state of The Player's character. Those state changes (IE, Stats) should reflect future interactions.
* You are to utilize tools and techniques you have learned throughout the course to plan and solve the problems involved with creating a functional game with a manageable code base.
* Manage your abstractions. Think through and understand where methods should be - does The Player move to the next room, or does the current active character being used by that player move to the next room? Does it matter?
* You must have a completed and approved UML diagram before you proceed to do any development
* All public methods should be tested.

