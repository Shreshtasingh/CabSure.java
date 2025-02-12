
# **CabSure – Java-Based Cab Booking System 🚖**  

**CabSure** is a **Java-based cab booking system** that allows users to book cabs, track rides, and manage payments efficiently. The project ensures a seamless cab booking experience with secure user authentication and real-time ride updates.  

---

## **Table of Contents**  
- [Features](#features)  
- [Technologies Used](#technologies-used)  
- [Project Structure](#project-structure)  
- [Installation](#installation)  
- [Running the Project](#running-the-project)  
- [Usage](#usage)  
- [Screenshots](#screenshots)  
- [Contributing](#contributing)  
- [License](#license)  

---

## **Features**  

✅ **User Authentication** – Login and register system for riders & drivers  
✅ **Cab Booking** – Select pickup & drop locations for ride booking  
✅ **Ride Tracking** – Live ride status updates  
✅ **Fare Calculation** – Dynamic pricing based on distance and traffic  
✅ **Payment Integration** – Cash and online payment options  
✅ **Admin Panel** – Manage drivers, users, and ride history  

---

## **Technologies Used**  

| Technology  | Description  |
|-------------|-------------|
| **Java**  | Core programming language  |
| **JDBC (Java Database Connectivity)**  | Connecting to MySQL database  |
| **MySQL**  | Storing ride, user, and driver data  |
| **Swing (Optional)**  | GUI-based interface for booking  |
| **File Handling**  | Storing temporary ride data (if no database used)  |

---

## **Project Structure**  

```
CabSure/
│── src/                     # Source code files
│   │── models/              # Java classes for User, Driver, Ride, etc.
│   │── database/            # Database connection and queries
│   │── ui/                  # UI components (if using Swing)
│── resources/               # Configuration files
│── CabSure.java             # Main entry point
│── README.md                # Project documentation
```

---

## **Installation**  

### **Prerequisites**  
Ensure you have the following installed:  
- [Java JDK (>= 8)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  
- [MySQL Database](https://www.mysql.com/)  
- A code editor (Eclipse, IntelliJ IDEA, or VS Code)  

### **Clone the Repository**  
```bash
git clone https://github.com/Shreshtasingh/CabSure.java.git
```
```bash
cd CabSure.java
```

### **Compile the Java Files**  
```bash
javac -d bin src/*.java
```

---

## **Running the Project**  

### **Set Up MySQL Database**  
1. Start the MySQL server  
2. Create a database:  
   ```sql
   CREATE DATABASE cabsure_db;
   ```
3. Import the initial database schema:  
   ```sql
   USE cabsure_db;
   SOURCE database/init.sql;
   ```
4. Update database credentials in `database/DBConnection.java`  

### **Run the Application**  
```bash
java -cp bin CabSure
```

---

## **Usage**  

1. **User Registration/Login** – Riders and drivers can create accounts.  
2. **Book a Ride** – Enter pickup and destination locations.  
3. **Assign Driver** – The system assigns a driver based on availability.  
4. **Track Ride** – View real-time ride updates.  
5. **Payment Processing** – Pay the ride fare via cash or online methods.  

---

## **Screenshots**  

🚀 *You can add screenshots of the console output or GUI here* 🚀  

---

## **Contributing**  

Contributions are welcome! Follow these steps:  
1. **Fork** this repository.  
2. **Create** a new branch:  
   ```bash
   git checkout -b feature-name
   ```
3. **Make your changes** and commit:  
   ```bash
   git commit -m "Added new feature"
   ```
4. **Push** to your branch:  
   ```bash
   git push origin feature-name
   ```
5. **Open a Pull Request** and wait for approval.  

