<h1>Spring Framework 5: Beginner to Guru</h1>

<h2>Verify Your Environment</h2>

* Verify Java is installed: java -version
* Verify JDK is installed: javac -version
* Verify Maven is installed: mvn -v
* Verify Gradle is installed: gradle 0v

<h2>Section 2 -Building a Spring Boot Web App</h2>

<h3>Spring Initializr</h3>

* We can download a pre-configured project to our specification.

<a href="https://start.spring.io/">Spring Initializr</a>

<h3>Open Project in IntelliJ</h3>

<a href="https://github.com/springframeworkguru/spring5webapp">Github spring5webapp</a>

* Command to execute 
* ./mvnw spring-boot:run
* maven wrapper

<h3>Using JPA Entities</h3>

<a href="https://github.com/springframeworkguru/spring5webapp/tree/starter-jpa-entities">Starting Source</a>

<a href="https://github.com/springframeworkguru/spring5webapp/tree/jpa-entities">Ending Source</a>

* What is JPA?
    * JPA stand for Java Persistence API
    * JPA is the official API for working with relational data in Java
    * JPA is only a specification
        * JPA is not a concrete implementation
        
* What does JPA do?
    * JPA is a bridge from Java's object world to how data is stored in relational databases.
    * ORM - Object Relational Mapping
    * JPA offers Java developers database independence
    * One API will support many relational databases

* JPA 2.0
    * Java Community Process as JSR 317
    * Aproved in Decembro of 2009
    * Added SQL Hints
    * Added Validation
    * Added criteria query API

* JPA 2.1
    * Added custom type convertrs
    * Criteria Update/Delete for bulk updates & deletes
    * Schema Generation
    
* JPA 2.1 Implementations
    * Hibernate (72%)
    * EclipseLink (13%)
    * OpenJPA (2%)


* Hibernate 5
    * September 2015
    * Adopted by Spring Framework in version 4.2 (2015)
    * Adopted by Spring Boot in version 1.4 (2016)


<h3>Using GitHub</h3>

<a href="https://www.youtube.com/watch?v=w3jLJU7DT5E">What is GitHub</a>

<a href="https://www.youtube.com/watch?v=HwrPhOp6-aM&list=PL0lo9MOBetEHhfG9vJzVCTiDYcbhAiEqL">Training • GitHub and Git Foundations</a>

<h3>Spring Data JPA Repositories</h3>

* Spring Data Repositories
    * Provides an Implementation of the Repository Pattern
    * Concept is originally from Eric Evans'book Domain Driven Design
    * Repository has methods for retrieving domain objects should delegate to a specialized Repository object such that alternative storage implementations may be interchanged

    * This is important. It allows you to easily substitue the persistence layer
    *  i.e going from SQL to NoSQL

* Spring Data JPA
    * Is part of a larger family of Spring Data projects
    * Uses Hibernate for persistence to supported RBDS systems.
    * Spring Data JPA provides the implementation at run time
    * No SQL Required


* What's the difference between JpaRepository, PagingAndSortingRepository and CrudRepository
    * JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.

    * Their main functions are:
    * CrudRepository mainly provides CRUD functions.
    * PagingAndSortingRepository provides methods to do pagination and sorting records.
    * JpaRepository provides some JPA-related methods such as flushing the persistence context and deleting records in a batch.
    * Because of the inheritance mentioned above,  JpaRepository will have all the functions of CrudRepository and PagingAndSortingRepository. So if you don't need the repository to have the functions provided by JpaRepository and PagingAndSortingRepository , use CrudRepository.
    
* h2
* Make sure JDBC URL is jdbc:h2:mem:testdb

<h2>Assignment - Add Publisher Entity<h2>

* Assignment - Publisher Entity
    * Create a new entity 'Publisher', with name and address attributes
    * Remove publisher string from Book entity. Add Publisher use a @OneToOne relationship
    * Add Publisher repository
    * Modify DevBootstrap to populate publisher / book entity
    * Inspect DB in H2 Console
