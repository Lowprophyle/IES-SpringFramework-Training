# Mission 3 - Relational Database

## Background 
Previously in Mission 2, the data was stored in a global list, which is not persisted. Thus, this time we will persist the data in MySQL.

## Prerequisite 
1. Completed Mission 2
2. Basic understanding about Relational Database
3. Basic understanding about JDBC [1](https://www.baeldung.com/spring-jdbc-jdbctemplate) [2](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html)
3. Basic understanding about MySQL
4. Set up MySQL on your workstation. For Windows, you may use https://dev.mysql.com/downloads/installer/

## STEPS

1. Design database table
2. Create a table in your local MySQL instance
3. Configure your Spring Boot application to connect to the MySQL instance using JDBC.
4. Create a repository class to perform CRUD on the database table using JdbcTemplate. Try using @Repository annotation.
5. Run your application, verify the CRUD endpoints using Postman. Remember to verify the records in the database too.