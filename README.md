# REST_API_CRUD_Angular_Spring Boot_H2
 
The Program mainly contains the some basic details of countries like name,capital,population and code. This repository contains source code for the program that I designed for the Pearson Practical Test for Platform Automation Internship. The backend is developed using Spring Boot framework & H2 database while the front end was developed using Angular framework. (latest version)

First download the repository.

The folder contains mainly three sections,

angular-country (Frontend) - developed using Angular

country (Backend) - developend using Spring Boot framework and H2 database

Project Screenshots - Screenshots of User Interfaces and h2 console login Interface

First open the project folder with Spring Tool Suite and dependencies that I have used in backend development are

spring-boot-starter-data-jpa | spring-boot-starter-web | spring-boot-starter-web-services | h2 database |

RUN the project as a Spring Boot Application

H2 console path is -> http://127.0.0.1:8080/h2-console

Username : sa

Password : 


base Url is -> http://127.0.0.1:8080/rest/v2

You can use POSTMAN to test CRUD operations, pass the values as a raw JSON object

http://127.0.0.1:8080/rest/v2/countries - GET, POST

http://127.0.0.1:8080/rest/v2/countries/{id} - GET,PUT & DELETE by id

Now to check the frontend, open the country-angular folder through VScode or prefered IDE and first install missing dependancies then run the program using

"ng serve" command in VScode

Since I have implemented " @CrossOrigin(origins = "http://localhost:4200") " in the CountryController class You won't get any issues regarding ports since backend use 8080 while the frontend use 4200.
