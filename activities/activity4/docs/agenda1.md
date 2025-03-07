# Topic 4 Agenda - 1

## Please turn your Microphones up - sometimes I can't hear Students when they have questions, Thank You

## Announcements

- Please read the weekly announcements
- Markdown Links, please send the actual link to the Markdown file, not directory, for example:  

```
<path>/activities/activity/README.md
```

## Creating Data Services Using Spring Java Database Connectivity (JDBC)

- We will code a data service using the Data Access Object (DAO) design pattern to persist data to a relational MySQL database using Spring JDBC
- We will use the standard JDBC template that is built into Spring JDBC and use Structured Query Language (SQL) to persist data to and from the database

#### pom.xml update

- spring-boot-starter-data-jdbc - Spring Boot application with JDBC libraries
- mysql-connector-java - Java driver implementation of the MySQL protocol
- jasypt-spring-boot-starter - Provides Encryption support for property sources, e.g. Databases in Spring Boot Applications

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jdbc</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.33</version>
</dependency>
<dependency>
	<groupId>com.github.ulisesbocchio</groupId>
	<artifactId>jasypt-spring-boot-starter</artifactId>
	<version>2.1.0</version>
</dependency>
```

#### Application Properties - Database Settings 

- [application.properties](../../../src/main/resources/application.properties)

#### MAMP / MySQL Workbench / Jasypt - Installation

- [My Apache MySQL PHP (MAMP)](https://www.mamp.info/en/downloads/)
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- [Jasypt Encryption / Decryption](https://www.devglan.com/online-tools/jasypt-online-encryption-decryption)

#### Database Shell Script

- [CST-339-RS-Activity4-MySQL.sql.txt](CST-339-RS-Activity4-MySQL.sql.txt)
- [CST-339-RS-Activity4-MySQL.sql](CST-339-RS-Activity4-MySQL.sql)
- Download Database Shell Script and execute in MySQL Workbench

###### Object Relational Mapping (ORM) between the SQL Script and Java Class

- CST-339-RS-Activity4-MySQL.sql and entity.OrderEntity.java

#### data.DataAccessInterface.java 

- The data directory is the location for entity, mapper and respository classes
- The DataAccessInterface Interface has 5 method definitions, utilizing (Create, Read, Update, Delete - CRUD) definitions

#### data.OrdersDataService.java

- The OrdersDataService Class is the implementation of the DataAccessInterface Interface
- javax.sql.DataSource - A [factory](https://gitlab.com/bobby.estey/wikibob/-/blob/master/src/main/java/patterns/factory/factory.md) for:
     - Database Connections
     - Connection Pooling - technique that stores and manages reusable database connections
     - Distributed Transaction implementations - multiple resources such as repositories or database systems are used in order to perform the transaction
- org.springframework.jdbc.core.JdbcTemplate - Executes SQL queries and updates

#### data.repository.OrdersRepository.java

- Sets the class variable dataSource and creates an instance of a JdbcTemplate
- Spring uses Constructor injection initializing the OrdersRepository class
- The OrdersRepository class extends CrudRepository<OrderEntity, Long>
- Injected with OrderEntity object and utilizing Long as the key to the record
- @Query(value = "SELECT * FROM ORDERS") - the query to perform
- The findAll method is derived from the CrudRepository class

## Orders Page

- Open Browser and Navigate to **localhost:port/login/**
