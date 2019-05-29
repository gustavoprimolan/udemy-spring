<h1>Section 03 - Dependency Injection with the Spring Framework</h1>

<h2>SOLID Principles of OOP</h2>

* Depedency Injection is a very important concept but the SOLID OOP.

* History of SOLID Principals
    * The SOLID principles date back to March of 1995
    * The principles are from Robert "Uncle Bob" mARTIN
    * Started as writings, which ultimately were turned into the book "Agile Software Development: Principles, Patterns, and Practices"
    * Michael Feathers is credited with coming up with the SOLID acronym
    
    * Why Use the SOLID Principles of OOP?
        * Object Oriented Programming is a powerful concept.
        * But, OOP does not always lead to quality software
        * The 5 principles focus on dependency management
        * Poor dependency management leads to code that is brittle, fragile, and hard to change.
        * Proper dependency management leads to quality code that is easy to maintain
        
* Single Responsibility Principle
    * Just because you can doesn't mean you should
    * Every Class should have a single responsibility
    * There should never be more than one reason for a class to change
    * Your classes should be small. No more than a screen full of code.
    * Avoid 'god' classes
    * Split big classes into smaller classes.

* Open Closed Principle
    * Open Chest Surgey is not needed when putting on a coat
    * Your classes should be open for extension
    * But closed for modification
    * You should be able to extend a classes behavior, without modifying it.
    * Use private variables with getters and setters - ONLY when you need them.
    * Use abstract base classes

* Liskov Substitution Principle
    * If it looks like a duck, quacks like a duck, but needs batteries you probabli have the wrong abstraction.
    * By Barbara Liskov, in 1998
    * Objects in a program would be replaceable with instances of their subtypes WITHOUT altering the correctness of the program.
    * Violations will often fail the "Is a" test.
    * A Square "Is a" Rectangle
    * However a Rectangle IS NOT a Square
    
* Interface Segregation Principle
    * You want me to plug this in, Where?
    * Make fine grained interfaces that are client specific
    * Many client specific interfaces are better than one "general purpose" interface
    * Keep your components focused and minimize dependencies between them
    * Notice relationship to the Single Responsibility Principle?
        * ie avoid 'god' interfaces

* Dependency Inversion Principle
    * Would you solder a lamp directly to the eletrician wiring in a wall?
    * Abstractions should not depend upon details.
    * Details should depend upon abstractions
    * Important that higher level and lower level objects depend on the same abstract interaction
    * This is not the same as Dependency Injection - which is how objects obtain dependent objects.
    
* Summary
    * The SOLID principles of OOP will lead you to better quality code.
    * Your code will be more testable and easier to maintain.
    * A key theme is avoiding tight coupling in your code.


<h2>The Spring Framework Context</h2>

* Spring Application Context. All Spring Beans and those all get stored in Application Context.
* This is where Spring does all its work of keeping track of the dependencies of what it needs to create first and how it needs to be created, where it's going to get it
