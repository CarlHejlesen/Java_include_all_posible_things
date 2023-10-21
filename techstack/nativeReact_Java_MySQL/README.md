# Dokumentation for This techstack
[Back link](/README.md)
## Vi bruger Techstacken  React native, Java(Spring framework), Database[Ikke valgt indu]


## Client 
Dette er vores APP, det som brugerne kommer til at kunne åbne, på deres telefon.



## Back end

Java, hvor vi bruger Spring framework

## Database MySQL

Password til min server er: password


Forstå MySQL
MySQL fungere på den måde at hver eneste ting du ønsker at fortage dig skal ske igennem commandoer eller "Statements"
Dette betyder at når du fx skal intergere med din MySQL server, laver du statements som du sender til serveren som den så eksikvere

Derfor er der mange som først lærer at bruge MySQL commandoer i deres cmd før de faktisk starter på at programere.
Du kan dog let springe dette step over, hvis du lærer lidt om MySQL igennem trial and error.
Kan anbefale Denne extesion så du kan se hvad du laver, og hvad du ikke laver: MySQL af weijan chen.

## Commandoer som er gode at kende



#### String createDbQuery = "CREATE DATABASE " + dbName;

## Forstå tables

#### String createTableQuery =
                              "CREATE TABLE " + tableName + " "
                            + "(id INT NOT NULL AUTO_INCREMENT, "
                            + " name VARCHAR(255), "
                            + " age INT, "
                            + " PRIMARY KEY ( id ))"; 

(id INT NOT NULL AUTO_INCREMENT,)



## Forstå måde at indsætte på

#### String insertSQL = "INSERT INTO "+tableName +" (name, age) VALUES (?, ?)";

Dette er en SQL INSERT kommando, som tilføjer en ny række til en tabel i en database. Den bruger placeholders (?) for at undgå SQL-injektion og gøre det lettere at indsætte faktiske værdier på en sikker måde.

Dette specificerer de kolonnenavne, hvori du vil indsætte data. I dette tilfælde vil du indsætte data i kolonnerne name og age.
VALUES (?, ?):

Dette angiver de værdier, du vil indsætte i de specificerede kolonner. Men i stedet for at angive de faktiske værdier direkte i strengen, bruger du ? som en placeholder. Dette gør det muligt at binde faktiske værdier til kommandoen på et senere tidspunkt, hvilket er især nyttigt for at undgå SQL-injektion.

Bare brug det da det er godt for sikkerhed.




## How to run

For at kører appen skal du være inde i mappen også køre kommandoen npm start
(Du kan højreklikke på mappen og vælge åben terminal i mappen, som er en god genvej istedet for at skulle bruge cd....)

