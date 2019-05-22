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

<a href="https://www.youtube.com/watch?v=HwrPhOp6-aM&list=PL0lo9MOBetEHhfG9vJzVCTiDYcbhAiEqL">What is GitHub</a>
