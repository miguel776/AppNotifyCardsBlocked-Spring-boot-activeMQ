# NotifyCardsBlocked Springboot activeMQ

The follow repository contains two application and one ActiveMQ embedded to implement a system with the functionality of block credit cards and notify this by mail sending an excel with a list of blocked credit cards.

•	Using spring boot each app will be deploy in different server embedded and both will have different DDBB h2 embedded, in the port 8081 and 8281 respectively.

•	The communication between app-producer-cardsmanager and application app-consumer-cardsnotifier will be by JMS, acting the app-producer-cardsmanager as a producer gluing messages in our ActiveMQ embedded and the application app-consumer-cardsnotifier will act as a consumer reading these messages.

•	The application app-producer-cardsmanager is going to execute a couple of tacks  periodically, one of this tack  is going to check the table CARD_APP_A and is going to block all the cards that expired, the other tack  will send this list to the application app-consumer-cardsnotifier. 

•	The application app-consumer-cardsnotifier is the responsible to send an excel with the cards blocked by mail, when this app read a message from active MQ will record the content to the table CARD_BLOCKED_APP, on the other hand there is a scheduled tack that will be execute periodically and  will read the table CARD_BLOCKED_APP and will send the messages  that haven´t sent it at the moment.

•	To end, the application app-producer-cardsmanager have a restController that implement a couple of webServices to block credit cards from a web site http://localhost:8081/

## It has used the follow technologies.
Java 8 • Spring boot • Spring web • Spring DATA-JPA •  spring JMS •  activeMQ • Hibernate • Maven • Jackson Library • H2 as a data base • Thymeleaf

Running the demo:  

Step one: run ActiveMQ embedded, it is a plugin of maven, it is the proyect call jms-activemq-embedded.
•	Got to the folder  jms-activemq-embedded and run the command 
“mvn activemq:run” 

Step two; run the application app-consumer-cardsnotifier.
•	Go to the class RunAppCardsNotifier and  run the main method.

Step three; run The application app-producer-cardsmanager.
•	Go to the class RunAppCardsManager and  run the main method

• I have created a couple of script to record data and see the demo, this script will be executed when the app-producer-cardsmanager is started, also I have configurate the  scheduled tacks and will execute every 10 second.
You can monitories all the prosses by the console of eclipse or intellij and see the DDBB from http://localhost:8081/console and http://localhost:8082/console.

• To run the web site, go to http://localhost:8081
