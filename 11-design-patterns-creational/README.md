# Design Patterns: Creational

## Singleton

### Concepts
* Only one instance created
* Guarantees control of resource
* Lazily loaded
* Examples:
  * Runtime
  * Logger
  * Spring Beans
  * Graphic Managers

### Design
* Class is responsible for lifecycle
* Static in nature
* Needs to be thread safe
* Private instance
* Private constructor
* No parameters required for constructor

### Pitfalls
* Often overused
* Difficult to unit test
* If not careful, not thread-safe
* Sometimes confused for Factory (Not a singleton if constructor takes params)
* java.util.Calendar is NOT a Singleton
  * Prototype
  
### Contrast
#### Singleton
* Returns same instance
  * One constructor method - no args
* No Interface

#### Factory
* Returns various instances
  * Multiple constructors
* Interface driven
* Adaptable to environment more easily

## Builder
### Concepts
* Handles complex constructors
* Large  number of parameters
* Immutability
* Examples
  * StringBuilder
  * DocumentBuilder
  * Locale.Builder
  
### Design
* Flexibility over telescoping constructors
* Static inner class
* Calls appropriate constructor
* Negates the need for exposed setters
* Java 1.5+ can take advantage of Generics

### Pitfalls
* Immutable
* Inner static class
* Designed first
* Complexity

### Contrast
#### Builder
* Handles complex constructors
* No interface required
* Can be a separate class
* Works with legacy code

#### Prototype
* Implemented around a clone
* Avoids calling complex constructors
* Difficult to implement in legacy code

## Prototype
### Concepts
* Avoids costly creation
* Avoids subclassing
* Typically doesn't use "new"
* Often utilizes an Interface
* Usually implemented with a Registry
* Example:
  * java.lang.Object#clone()

### Design
* Clone/Cloneable
* Avoids keywword "new"
* Although a copy, each instance is unique
* Costly construction not handled by client
* Can still utilize parameters for construction
* Shallow VS Deep Copy

### Pitfalls
* Sometimes not clear when to use
* Used with other patterns
  * Registry
* Shallow vs Deep Copy

### Contrast
#### Prototype
* Lighter weight construction
  * Copy Constructor or Clone
* Shallow or Deep
* Copy of itself

#### Factory
* Flexible Objects
  * Multiple constructores
* Concrete Instances
* Fresh Instance

## Factory
### Concepts
* Doesn't expose instantiation logic
* Defer to subclasses
* Common interface
* Specified by architecture, implemented by user
* Examples:
  * Calendar
  * ResourceBundle
  * NumberFormat

### Design
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method

### Pitfalls
* Complexity
* Creation in subclass
* Refactoring, need to be designed from the beginning

### Contrast
#### Factory
* Returns various instances
  * Multiple constructors
* Interface driven
* Subclasses
* Adaptable to environment more easily

#### Singleton
* Returns same instance
* One constructor - no args
* No Interface
* No Subclass

## AbstractFactory
### Concepts
* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses
* Examples:
  * DocumentBuilder
  * Frameworks

### Design
* Groups Factories together
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method
* Composition

### Pitfalls
* Complex (Most complex)
* Runtime switch
* Pattern within a pattern
* Problem specific
* Starts as Factory

### Contrast
#### Factory
* Returns various instances
  * Multiple constructors
* Interface driven
* Adaptable to environment more easily

#### Abstract Factory
* Implemented with Factory
* Hides the Factory
* Abstracts Environment
* Built through Composition