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

Sådan her det ud når man laver en ny table
#### String createTableQuery =
                              "CREATE TABLE " + tableName + " "
                            + "(id INT NOT NULL AUTO_INCREMENT, "
                            + " name VARCHAR(255), "
                            + " age INT, "
                            + " PRIMARY KEY ( id ))"; 


**CREATE TABLE person**  

Denne del starter oprettelsen af en ny tabel i databasen med navnet "person". Alt hvad der kommer efter dette i parenteserne er definitionen af kolonnerne (felterne) i den tabel.

**id:**

 Navnet på kolonnen.

**INT:** 

Dette specificerer, at data-typen for denne kolonne er et heltal (integer).

**NOT NULL:** 

Denne betingelse sikrer, at kolonnen altid skal have en værdi for hver række (dvs. den kan ikke indeholde NULL-værdier).

**AUTO_INCREMENT:** 

Dette er en speciel egenskab for MySQL, der betyder, at hver gang en ny række tilføjes til tabellen, vil denne kolonne automatisk få en værdi, der er én højere end den forrige række. Dette er især nyttigt for primære nøgler.

**VARCHAR(255):** 

Angiver, at data-typen for denne kolonne er en tekststreng med en maksimal længde på 255 tegn.

**DATE:** 

Data-typen for denne kolonne er en dato.

**DEFAULT CURRENT_DATE:** 

Hvis der ikke angives en værdi for denne kolonne, når en ny række tilføjes, vil den automatisk blive sat til den aktuelle dato.

**VARCHAR(255):** 

Tekststreng med en maksimal længde på 255 tegn.

**UNIQUE:** 

Dette garanterer, at hver værdi i denne kolonne er unik for hele tabellen. Det er nyttigt for felter som e-mail, hvor hvert indlæg skal være forskelligt.

**PRIMARY KEY:** 

Dette definerer den primære nøgle for tabellen. En primær nøgle sikrer, at hver række i tabellen kan identificeres entydigt ved hjælp af denne nøgle.



## Forstå måde at indsætte på

#### String insertSQL = "INSERT INTO "+tableName +" (name, age) VALUES (?, ?)";

Dette er en SQL INSERT kommando, som tilføjer en ny række til en tabel i en database. Den bruger placeholders (?) for at undgå SQL-injektion og gøre det lettere at indsætte faktiske værdier på en sikker måde.

Dette specificerer de kolonnenavne, hvori du vil indsætte data. I dette tilfælde vil du indsætte data i kolonnerne name og age.
VALUES (?, ?):

Dette angiver de værdier, du vil indsætte i de specificerede kolonner. Men i stedet for at angive de faktiske værdier direkte i strengen, bruger du ? som en placeholder. Dette gør det muligt at binde faktiske værdier til kommandoen på et senere tidspunkt, hvilket er især nyttigt for at undgå SQL-injektion.

Bare brug det da det er godt for sikkerhed.

## Eksempler på

- [x] Class that returns a connection to server or database (Return_connection_to_server)
- [x] Class that creates table (create_table)
- [x] Class that get all data from a Table (get_all_people)
- [x] Class that inserts data to a table(insert_person_in_table)
- [x] Class that gets first mathc in table(GetFirstDataInSkeama)
- [x] Class that creates a database (create_db)


## How to run

For at kører appen skal du være inde i mappen også køre kommandoen npm start
(Du kan højreklikke på mappen og vælge åben terminal i mappen, som er en god genvej istedet for at skulle bruge cd....)

