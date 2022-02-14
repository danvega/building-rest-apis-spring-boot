# Building REST APIs with Spring Boot

https://blog.jetbrains.com/idea/2022/02/new-live-stream-building-rest-apis-with-spring-boot/ 

## Agenda

- Introduction
  - Agenda  
  - About Me
  - What is an API
  - What is REST
- Create a new Spring Boot Project
  - start.spring.io (do you see this little start next to it? bookmark it)
    - Java 17 (We are moving to Spring Boot 3.0 and Spring Framework 6.0)
    - Java 18 is right around the corner
    - Grocery Store Analogy
  - IntelliJ Initializr
    - I'm a paying customer
    - A friend of mine who is learning java is using intellij
- Model (this is the resource)
  - LiveStream (start with a regular class)
  - Tests
  - Move to a record (immutable data classes)
- Controller
  - Create new LiveStreamController
    - Talk about the top level annotations
  - We need some data
- Repository
  - Create a LiveStreamRepository
  - Don't mark it with @Repository just yet
  - This is a good time to talk about Dependency Injection 
- Dependency Injection (IoC) 
  - What is it? 
  - you could create a new() instance but how do you mock that? 
  - you might run into code that does field injection (josh longs quote)
  - use constructor injection, IntelliJ is telling us there is a good solution here.
  - @Autowired, don't need to do that now
- LiveStream Controller CRUD methods
  - MVC (controllers are supposed to be thin / dumb) 
  - findAll, findById, create, update, delete
  - you could open up a tool like postman to test these methods but IntelliJ has a built-in tool for that 
  - create and update - data validation 
    - remember it's now a separate dependency
  - response status codes
  - ResponseEntity (mention this)
  - Test each one using the HttpClient but point out this is where you can write tests
- Spring Bean Validation
  - https://blogs.oracle.com/javamagazine/post/diving-into-java-records-serialization-marshaling-and-bean-state-validation
  - Show API
  - server.error.include-message=always
  - server.error.include-binding-errors=always
- HATEOAS
- Testing
  - If we have time left we can do some testing 



Spring Repository is very close to DAO pattern where DAO classes are responsible for providing CRUD operations on database tables. However, if you are using Spring Data for managing database operations, then you should use Spring Data Repository interface.
