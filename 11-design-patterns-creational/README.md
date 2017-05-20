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