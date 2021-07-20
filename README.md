# spring-mongo-rest
learning spring data with mongo atlas and spring data rest

Steps of creating the project:

1. goto [Spring Initializr](https://start.spring.io/) 
1. select Rest Repositories, and Spring Data MongoDB
1. Prepare a mongodb and obtain the connection string
1. update application.properties
1. Create model
1. Create repository extends MongoRepository
1. Add @RepositoryRestResource to the repository
1. start application

- The service can be tested via REST API calls
- findByName is hidden under /books/search/findByName
- update is done via PUT
