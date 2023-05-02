package com.oopconcepts.interviewconcepts;

public class ArchitectureStyles {
    /*
    * TYPES OF ARCHITECTURE
1) Monolithic: the software app is developed as a single, self contained unit. All the components of the app are tightly coupled but can be difficult to scale as the app grows in complexity. Think of all the code for the program being packaged together and running on one single machine.
Example: A real life example of a monolithic app is the Adobe Creative Suite: It has Photoshop, Illustrator, and InDesign. It runs on the user’s local machine and the components are packaged together and runs on a single machine

* 2)Client-server architecture: separates app into 2 components:
    -Client component- handles the user interface
    -Server component: handles data storage and processing
Examples: both Gmail and Amazon are examples of client-server architecture. The user interacts with Amazon, places an order, and it sends it to the Amazon server

* The client sends requests to the server and receives responses, making it more scalable.

* 3) Service-oriented: uses loosely coupled services to handle various functions of the application. Services are normally accessed through APIs, allowing more flexibility.
Example: Think of an online clothing store where different services handle different functions such as payment processing, product search. They all communicate in order to provide a cohesive experience
Netflix is a real world example that provides various services that are independent that communicate with each other: ie billing, recommendations, etc

* 4) Microservices: a variation of service-oriented architecture, where the app is made up of multiple independent small services that can be developed, deployed, and scaled independently. Each service performs a specific function and communicates with other servers using well-defined APIs
Example: Let’s take the same clothing website, but each service is broken down into smaller independent components, ie search bar, product recommendations, filtering

* 5) Event-driven architecture: app is designed to respond to events, like user actions or system events. Often used in complex, distributed systems where different components need to react in real time.
Example: think of a banking app, where every time money is deposited or withdrawn, it will update account balances or generate a report

* 6) Layered: separates the app into layers, with each layer responsible for a different function. Layers typically ordered in hierarchy with top layer being user interface and the bottom being the data storage

*
* ________Key interview questions:_________
What is a microservice?
-A microservice is a software architecture style that breaks up components of an application into individual services that communicate with each other.
How do microservices help with scale?
Scalability is easier to achieve with microservices than it is with a monolithic application because it is:
	- Faster to deploy a microservice
	-Easier to experiment on the microservice
	-You can use different languages for each microservice

    *
    *
    *
    * */
}
