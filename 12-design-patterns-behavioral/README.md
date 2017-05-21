# Design Patterns: Behavioral

## Chain of Responsibility
### Concepts
* Decoupling of sender and receiver
* Receiver contains reference to next receiver
* Promotes loose coupling
* No Handler - OK
* Examples:
  * java.util.logging.Logger#log()
  * javax.servlet.Filter#doFilter()
  * Spring Security Filter Chain

### Design
* Chain of receiver objects
* Handler is Interface based
* ConcreteHandler for each implementation
* Each Handler has a reference to the next
* Handler, ConcreteHandler

### Pitfalls
* Handling/Handler guarantee
* Runtime configuration risk
* Chain length/performance issues

### Contrast
#### Chain of Responsibility
* Handler is unique
* Successor
* Can utilize the Command

#### Command
* Command also unique
* Encapsulates function
* Reversible or Trackable in nature

## Command
### Concepts
* Encapsulate request as an Object
* Object-oriented callback
* Decouple sender from processor
* Often used for "undo" functionality
* Example:
  * java.lang.Runnable
  * javax.swing.Action

### Design
* Object per command
* Command Interface
* Execute Method
* 'Unexecute' method
* Reflection
* Command, Invoker, ConcreteCommand

### Pitfalls
* Dependence on other patterns
* Multiple Commands
* Make use of Memento
* Prototype for copies

### Contrast
#### Command
* Object per command
* Class contains the 'what'
* Encapsulates action

#### Strategy
* Object per strategy
* Class contains the 'how'
* Encapsulates algorithm

## Interpreter
### Concepts
* Represent grammar
* Interpret a sentance
* Map a domain
* AST
* Example:
  * java.util.Pattern
  * java.text.Format

### Design
* AbstractExpression
* Interpret
* TerminalExpression
* NonterminalExpression
* Context, AbstractExpression, TerminalExpression, NonterminalExpression, Client

### Pitfalls
* Complexity
* Class per rule
* Use of other patterns
* Adding new variant
* Specific case

### Contrast
#### Interpreter
* Access to properties because it contains the object
* Function as methods
* Adding new functionality changes every variant

#### Visitor
* Needs Observer functionality
* Functionality found in one place
* Adding new variant requires changing every visitor

## Iterator
### Concepts
* Traverse a container
* Doesn't expose underlying structure
* Decouples algorithms
* Sequential
* Example:
  * java.util.Iterator
  * java.util.Enumeration

### Design
* Interface based
* Factory Method based
* Independent, but fail fast
* Enumerators are fail safe
* Iterator, ConcreteIterator

### Pitfalls
* Access to Index
* Directional
* Speed/Efficiency

### Contrast
#### Iterator
* Interface based
* Algorithm is removed
* No index
* Concurrent modification

#### For Loop
* Traversal in client
* Exposes an index
* Doesn't change underlying object
* foreach syntax not supported
* Typically slower

## Mediator
### Concepts
* Loose coupling
* Well-defines, but complex
* Reusable components
* Hub/Router
* Examples:
  * java.util.Timer
  * java.lang.reflect.Method#invokde()

### Design
* Interface bases
* Concrete class
* Minimizes inheritance
* Mediator knows about colleagues
* Mediator, ConcreteMediator

### Pitfalls
* Deity object
* Limits subclassing
* Over or with Command

### Contrast
#### Mediator
* Defines Interaction
* Object decoupling
* More specific

#### Observer
* One-to-Many
* Object decoupling
* More generic

## Memento
### Concepts
* Restore Object to previous state
* Externalize internal state
* Undo/Rollback
* Shields complex internals
* Examples:
  * java.util.Date
  * java.io.Serializable

### Design
* Class based
* Originator
* Caretaker
* Memento
* Magic Cookie

### Pitfalls
* Can be expensive if large copy
* Deletes/history
* Exposing information

### Contrast
#### Memento
* State captured
* Independent state
* Caretaker/History

#### Command
* Request captured
* Independent request
* History side benefit

## Observer
### Concepts
* One to Many
* Decoupling
* Even Handling
* Pub/Sub
* M-V-C
* Examples:
  * java.util.Observer
  * java.util.EventListener
  * javax.jms.Topic

### Design
* Subject
* Observer
* Observable
* Views are Observers
* Subject, Concrete Subject, Observer, Concrete Observer

### Pitfalls
* Unexpected updates
* Large sized consequences
* What changed

### Contrast
#### Observer
* One-to-Many
* Decoupled
* Broadcast Communication

#### Mediator
* One-to-one-to-Many
* Decoupled
* Complex Communication

## State
### Concepts
* Localize state behavior
* State Object
* Separate what from where
* OCP
* Examples:
  * None!
  * JSF
  * Iterator?

### Design
* Abstract Class / Interface
* Class based
* Context unaware
* Context, State, ConcreteState

### Pitfalls
* Know your States
* More classes
* Keep logic out of Context
* State change triggers

### Contrast
#### State
* Interface based
* Transitions
* Class per State

#### Strategy
* Interface based
* Algorithms are independent, don't know about next state
* Class per Algorithm

## Strategy
### Concepts
* Eliminate conditional statements
* Behavior encapsulated in classes
* Difficult to add new strategies
* Client aware of strategies
* Client chooses strategy
* Examples:
  * java.util.Comparator

### Design
* Abstract base class
* Concrete class per strategy
* Removes if/else conditionals
* Strategies are independent
* Context, Strategy, ConcreteStrategy

### Pitfalls
* Client aware of Strategies
* Increase number of classes

### Contrast
#### Strategy
* Interface based
* Algorithms are Independent
* Class per Algorithm

#### State
* Interface based
* Transitions
* Class per State

##Template
### Concepts
* Code reuse
* Common in libraries/frameworks
* IoC
* Algorithm emphasis
* Examples:
  * java.util.Collections#sort()
  * java.util.AbstractList#indexOf()

### Design
* Abstract Base class
* Base calls Child
* Hooks
* Operations
* AbstractBase, ConcreteClass

### Pitfalls
* Restrict access
* Confusing hierarchy
* Difficult Program flow

### Contrast
#### Template
* Same algorithm, different implementations
* Class based
* Compile time

#### Strategy
* Algorithm per Strategy
* Interface based
* Run time

##Visitor
### Concepts
* Separate Algorithm from Object
* Adding new features
* Maintain Open/Close principle
* Visitor changes
* Examples:
  * java.lang.model.element.Element
  * java.lang.model.element.ElementVisitor

### Design
* Interface based
* Visitor and Element
* Elements have visit method
* Visitor knows every Element
* Visitor, ConcreteVisitor, Element, ConcreteElement

### Pitfalls
* Plan for adaptability
* Indirection somewhat confusing
* Adapter pattern

### Contrast
#### Visitor
* Interface based
* Externalized changes
* Multiple visitors
#### Iterator
* Interface based / Anonymous
* Encapsulates
* Singular