# Topic 4 Agenda - 2

## Please turn your Microphones up - sometimes I can't hear Students when they have questions, Thank You

## Announcements

- Please read the weekly announcements
- Markdown Links, please send the actual link to the Markdown file, not directory, for example:  

```
<path>/activities/activity/README.md
```

## Creating Data Services Using Spring Data JDBC

- We will code a data service using the Repository design pattern to persist data to a relational MySQL database using Spring Data Java Database Connectivity (JDBC)
- We will use the standard Create, Read, Update, Delete (CRUD) Repository that is built into Spring Data JDBC, which provides an Object Relational Mapping (ORM) interface that allows you to easily persist object to and from the database without having to write Structured Query Language (SQL) and is mapped to an existing database schema
- The proper design and separation of both application object models and entity object models, such that the presentation layer is not polluted with data persistence technologies

#### Database Shell Script

- [CST-339-RS-Activity4-MySQL.sql.txt](CST-339-RS-Activity4-MySQL.sql.txt)
- [CST-339-RS-Activity4-MySQL.sql](CST-339-RS-Activity4-MySQL.sql)
- Download Database Shell Script and execute in MySQL Workbench

###### Object Relational Mapping (ORM) between the SQL Script and Java Class

- CST-339-RS-Activity4-MySQL.sql and entity.OrderEntity.java

#### data.entity.OrderEntity.java 

- The OrderEntity class is the Java Code that will be mapped to the SQL Data Structure

#### data.mapper.OrderRowMapper.java 

- The OrderRowMapper class returns the ResultSet from the query

#### data.repository.OrdersRepository

- Sets the class variable dataSource and creates an instance of a JdbcTemplate
- Spring uses Constructor injection initializing the OrdersRepository class
- The OrdersRepository class extends CrudRepository<OrderEntity, Long>
- Injected with OrderEntity object and utilizing Long as the key to the record
- @Query(value = "SELECT * FROM ORDERS") - the query to perform
- The findAll method is derived from the CrudRepository class

#### data.DataAccessInterface.java 

- The data directory is the location for entity, mapper and repository classes
- The DataAccessInterface Interface has 5 method definitions, utilizing (Create, Read, Update, Delete - CRUD) definitions

#### data.OrdersDataService.java

- The OrdersDataService Class is the implementation of the DataAccessInterface Interface
- javax.sql.DataSource - A [factory](https://gitlab.com/bobby.estey/wikibob/-/blob/master/src/main/java/patterns/factory/factory.md) for:
     - Database Connections
     - Connection Pooling - technique that stores and manages reusable database connections
     - Distributed Transaction implementations - multiple resources such as repositories or database systems are used in order to perform the transaction
- org.springframework.jdbc.core.JdbcTemplate - Executes SQL queries and updates

## Orders Page

- Open Browser and Navigate to **localhost:port/login/**
