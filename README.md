# 🎬 Movie Subscription Details Viewer (Spring Boot + YAML Configuration)

A simple Spring Boot application that reads **subscription details** (user info, watch history, preferences, ratings, and last-watched movie) from an external **YAML configuration file (`application.yml`)** and prints them in a clean, formatted way.

This project demonstrates:

✔ Reading data from YAML using `@ConfigurationProperties`  
✔ Mapping arrays, lists, and maps to Java objects  
✔ Running a Spring Boot console application  
✔ Clean POJO structure with validation  
✔ JUnit 5 test cases for configuration loading  

---

## 🚀 Features

- Read and bind YAML configuration into Java objects  

- Supports:

  - `int[]` arrays  

  - `List<String>`  

  - `Map<String, Integer>`  

  - Nested objects  

- Displays user subscription details in a formatted report  

- Fully tested with **JUnit 5**  

- Clean industry-level project structure  

---

## 📂 Project Structure

movie-subscription/

├── pom.xml

├── README.md

├── src

│   ├── main

│   │   ├── java

│   │   │   └── com

│   │   │       └── app

│   │   │           ├── MovieSubscriptionApplication.java

│   │   │           ├── config/SubscriptionConfig.java

│   │   │           ├── controller/SubscriptionController.java


│   │   │           ├── service/SubscriptionService.java

│   │   │           └── exception/InvalidSubscriptionDataException.java

│   │   │           └── exception/GlobalExceptionHandler.java

│   │   └── resources/application.yml

│   └── test

│       └── java

│           └── com

│               └── app

│                   ├── config/SubscriptionConfigTest.java

│                   ├── service/SubscriptionServiceUnitTest.java

│                   ├── controller/SubscriptionControllerWebTest.java

│                   └── IntegrationTest.java

└── .gitignore


---

## 🛠 Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **YAML Configuration**
- **@ConfigurationProperties**
- **JUnit 5**
- **Maven**

---

## 📝 application.yml (Final Version)

server:
  port: 9191

subscription:
  user-id: 9098
  user-name: "Bob Turner"
  plan: "Premium UHD"

  watch-time-hours: [15, 12, 9, 20]

  genres-preferred:
    - Thriller
    - Horror
    - Comedy

  active-devices:
    - Mobile
    - Laptop
    - SmartTV

  ratings:
    Inception: 5
    Conjuring: 4
    Hera Pheri: 5
    Tenet: 4

  last-watched:
    movie: "Dune"
    duration: "2h 35m"

---


# ▶️ How to Run the Project 
- Open in Eclipse

Right-click → Run As → Spring Boot App

---

# 📌 Expected Console Output:

===== SUBSCRIPTION DETAILS =====

User ID    : 9098

User Name  : Bob Turner

Plan       : Premium UHD

Watch Time : [15, 12, 9, 20]

Genres     : [Thriller, Horror, Comedy]

Devices    : [Mobile, Laptop, SmartTV]

Ratings    : {Inception=5, Conjuring=4, Hera Pheri=5, Tenet=4}

Last Movie : Dune

Duration   : 2h 35m

 ---

#  🧪 JUnit Test Included

File: SubscriptionPropertiesTest.java


✔ Validates:

Correct YAML mapping

Lists, Arrays & Maps

Nested object (LastWatched)

Non-null property loading

---

# 📘 UML Diagram

+-----------------------------+

|   SubscriptionProperties    |

+-----------------------------+

| - userId: int               |

| - userName: String          |

| - plan: String              |

| - watchTimeHours: int[]     |

| - genresPreferred: List     |

| - activeDevices: List       |

| - ratings: Map              |

| - lastWatched: LastWatched  |

+-----------------------------+


+-----------------------------+

|       LastWatched           |

+-----------------------------+

| - movie: String             |

| - duration: String          |

+-----------------------------+

---

 # 🛠 Technologies Used

Java 17+ / 20

Spring Boot 3.x

YAML Configuration

Maven

JUnit 5

---

# 🏁 Conclusion

This project is ideal for learning:


✔ How YAML maps to Java POJOs

✔ How Spring Boot handles configuration

✔ How to test configuration using JUnit
