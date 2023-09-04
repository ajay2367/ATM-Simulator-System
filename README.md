# BankApplication
BankApplication is build using java swings and my sql
# ATM Simulator System Readme

## Overview

The ATM Simulator System is a Java-based application that simulates the functionality of an Automated Teller Machine (ATM). This system uses the Java Database Connectivity (JDBC) API to interact with a MySQL database for user authentication, account creation, deposit, and withdrawal operations. This README file provides information on setting up and using the ATM Simulator System.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed:

- Java Development Kit (JDK) - Version 8 or higher
- MySQL Database Server - Installed and running
- MySQL Connector/J - JDBC driver for MySQL
- IDE for Java development (e.g., Eclipse, IntelliJ IDEA, or Visual Studio Code)
- Basic knowledge of Java, MySQL, and JDBC

## Setup

1. **Clone the Repository**:

   Clone the ATM Simulator System repository to your local machine:

   ```bash
   git clone https://github.com/ajay2367/atm-simulator-system.git
   ```

2. **Create a MySQL Database**:

   - Open your MySQL client or command-line interface.
   - Create a new database for the ATM Simulator, e.g., `atm_simulator`.

3. **Configure Database Connection**:

   Open the `src/main/java/com/atm/config/DatabaseConfig.java` file and update the following database connection properties:

   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/atm_simulator";
   private static final String USER = "your_mysql_username";
   private static final String PASSWORD = "your_mysql_password";
   ```

   Replace `your_mysql_username` and `your_mysql_password` with your MySQL credentials.

4. **Import Database Schema**:

   Import the database schema by running the SQL script provided in the `database` directory:

   ```bash
   mysql -u your_mysql_username -p atm_simulator < database/atm_simulator_schema.sql
   ```

5. **Compile and Run**:

   Open the project in your preferred IDE and compile/run the `Main.java` file to start the ATM Simulator System.

## Usage

The ATM Simulator System provides the following functionality:

- **Login**: Users can log in using their account number and PIN.
- **Create a New Account**: New users can create a new account by providing their details.
- **Deposit**: Users can deposit money into their account.
- **Withdrawal**: Users can withdraw money from their account.

Follow the on-screen prompts to navigate through the system and perform these operations.

## Directory Structure

The project directory structure is organized as follows:

```
atm-simulator/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── atm/
│   │   │   │   │   ├── config/
│   │   │   │   │   │   └── DatabaseConfig.java
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── AccountDAO.java
│   │   │   │   │   │   └── UserDAO.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── Account.java
│   │   │   │   │   │   └── User.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── AccountService.java
│   │   │   │   │   │   └── UserService.java
│   │   │   │   │   ├── ATM.java
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── util/
│   │   │   │   │       ├── InputValidator.java
│   │   │   │   │       └── UserInput.java
│   │   ├── resources/
│   │   │   └── atm_simulator_schema.sql
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── atm/
│   │   │           ├── dao/
│   │   │           │   ├── AccountDAOTest.java
│   │   │           │   └── UserDAOTest.java
│   │   │           └── service/
│   │   │               ├── AccountServiceTest.java
│   │   │               └── UserServiceTest.java
│   └── resources/
│       └── log4j.properties
│
├── .gitignore
├── README.md
└── pom.xml
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

- AJAY SAI

## Acknowledgments

Special thanks to anyone or any resources you'd like to acknowledge (e.g., tutorials, libraries, etc.).

## Support

If you have any questions or encounter any issues, please contact [your email address].

---

Enjoy using the ATM Simulator System!
