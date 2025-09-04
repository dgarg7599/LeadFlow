# LeadFlow - A Lead Management App

---

## 🚀 Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL** (Database)
- **Maven** (Build Tool)

---

## ✨ Features Implemented

- [x] Create a new Lead via API.
- [x] Get a list of all Leads.
- [x] Server-side validation for incoming data (e.g., required fields, valid email).
- [x] Duplicate email prevention.
- [x] Exception Handling.

---

## 🔧 How to Setup and Run the Project

**Prerequisites:**
- Java (JDK 17 or later)
- Maven
- MySQL Server

**Steps:**
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/dgarg7599/LeadFlow.git
    ```
2.  **Database Configuration:**
    - Open `src/main/resources/application.properties`.
    - Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` with your local MySQL details.
    - Make sure you have a database named `leadflow` or change it in the URL.

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

---

## 🧪 API Endpoints & Testing

You can use Postman to test the API.

### 1. Create a Lead

- **Method:** `POST`
- **URL:** `http://localhost:8080/api/leads/create`
- **Body (raw/JSON):**
  ```json
  {
    "firstName": "Divyansh",
    "lastName": "Garg",
    "email": "divyansh.garg@example.com",
    "phone": "9876543210"
  }


### 2. Get all Leads

- **Method:** `GET`
- **URL:** `http://localhost:8080/api/leads`

