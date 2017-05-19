# Design Patterns: Structural

## Adapter

### Concepts
* Plug adapter
* Convert interface into another interface - Have client talk to existing interface
* Legacy - Don't want to or can't change
* Translating request from client to code we are adapting to
* Client, Adapter, Adaptee
* Example:
  * Array -> Lists
  * Streams
  
### Design Considerations
* Client centric
* Integrated new with old
* Interface, but not required
* Adaptee can be the implementation 

### Example Arrays.asList()
```java
Integer[] arrayOfInts = new Integer[] {42, 43, 44};
List<Integer> listOfInts = Arrays.asList(arrayOfInts);
System.out.println(arrayOfInts);
System.out.println(listOfInts);
```
### Pitfalls
* Not a lot
* Don't complicate
* Multiple Adapters
* Don't add functionality

### Contrast
#### Adapter
* Works after code is designed
* Legacy
* Retrofitted
* Provides different interface

#### Bridge
* Designed upfront
* Abstraction and implementation vary
* Built in advance
* Both adapt multiple systems

## Bridge

### Concepts
* Decouple Abstraction and implementation
* Encapsulation, Composition, Inheritance
* Changes in Abstraction won't affect client
* Details won't be right
* Examples:
  * Driver
  * JDBC
  
### Design
* Interfaces and Abstract classes
* Composition over Inheritance
* More than Composition
* Expect change from both sides
* Abstraction, Implementor, Refined Abstraction, Concrete Implementor

### Pitfalls
* Increases complexity
* Conceptually difficult to plan
* More than just OO
* What goes where

### Contrast
#### Bridge
* Design upfront
* Abstraction and implementation vary
* Built in advance
* Complex

#### Adapter
* Works after code is designed
* Legacy
* Retrofitted
* Provides different interface

## Composite

### Concepts
* Components represent part or whole structure
* Compose objects into tree structures
* Individual object treated as Composite
* Same operations applied on individual and composites
* Examples:
  * java.awt.Component
  * JSF widgets
  * RESTful service GETs
  
### Design
* Tree structures
* Component
* Leaf or Composite, same operations
* Composite knows about child objects
* Component, Leaf, Composite

### Pitfalls
* Can overly simplify system
* Difficult to restrict, rely on runtime checks instead of compile type safety
* Implementation can possibly be costly for huge composites or if it is implemented poorly

### Contrast
#### Composite
* Tree structure
* Leaf and Composite have same interface
* Unity between objects

#### Decorator
* Contains another entity (Composition)
* Modifies behavior, usually adds functionality
* Does not change underlying object

## Decorator

### Concepts
* Also called a wrapper
* Add behavior without affecting others
* More than just inheritance
* Single Responsibility Principle - Every class should have responsibility over a single part of the functionality provided by the software, should be entirely encapsulated by the class
* Compose behavior dynamically
* Examples:
  * java.io.InputStream
  * java.util.Collections#checkedList
  * UI components in AWI and Swing
  
### Design
* Inheritance based
* Utilized composition and inheritance (is-a, has-a)
* Alternative to subclassing
* Constructor requires instance from hierarchy

### Pitfalls
* New class for every feature added
* Multiple little objects
* Often confused with simple inheritance

### Facade Pattern
