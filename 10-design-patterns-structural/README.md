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