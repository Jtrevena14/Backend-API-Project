#Backend-API-Project
This backend API takes in a post request in the form of a .JSON file and stores the information inside of an object, each JSON file containing the name of a person and email, with a random UUID that is randomly generated for each object, Each object is stored in a "Database" which is an arraylist of objects named "DB", utilizing a method called "getPeople" to request a @GetMapping that displays all of the people objects in the database along with their attributes and UUID. 
This program is built using Java SpringBoot Framework and Java 11 and can be ran using any IDE that supports Spring Boot.
Requests can be sent using Postman a software used to send artificial requests in the form of .JSON files, requests are sent to a localhost:8080 tomcat server
Post Request url: localhost:8080/api/v2/demo
Get Request url: localhost:8080/api/v2/demo/people
