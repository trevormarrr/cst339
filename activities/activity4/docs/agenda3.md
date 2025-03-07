# Topic 4 Agenda - 3

## Please turn your Microphones up - sometimes I can't hear Students when they have questions, Thank You

## Announcements

- Please read the weekly announcements
- Markdown Links, please send the actual link to the Markdown file, not directory, for example:  

```
<path>/activities/activity/README.md
```

## Creating Data Services Using Spring Data JDBC Native Queries

- We will code a data service using the Repository design pattern to persist data to a relational MySQL database using Spring Data JDBC and custom native SQL queries. We will again use the standard CRUD Repository that is built into Spring Data JDBC and override some of the methods.  This would be useful if you ever needed to override any of the methods in the Repository and provide your own high-performance handwritten SQL.

#### data.entity.OrderEntity.java 

- The OrderEntity class is the Java Code that will be mapped to the SQL Data Structure

#### data.repository.OrdersRepository

- Sets the class variable dataSource and creates an instance of a JdbcTemplate
- Spring uses Constructor injection initializing the OrdersRepository class
- The OrdersRepository class extends CrudRepository<OrderEntity, Long>
- Injected with OrderEntity object and utilizing Long as the key to the record
- @Query(value = "SELECT * FROM ORDERS") - the query to perform
- The findAll method is derived from the CrudRepository class

#### data.OrdersDataService.java

- The OrdersDataService Class is the implementation of the DataAccessInterface Interface
- javax.sql.DataSource - A [factory](https://gitlab.com/bobby.estey/wikibob/-/blob/master/src/main/java/patterns/factory/factory.md) for:
     - Database Connections
     - Connection Pooling - technique that stores and manages reusable database connections
     - Distributed Transaction implementations - multiple resources such as repositories or database systems are used in order to perform the transaction
- org.springframework.jdbc.core.JdbcTemplate - Executes SQL queries and updates

## Orders Page

- Open Browser and Navigate to **localhost:port/login/**
