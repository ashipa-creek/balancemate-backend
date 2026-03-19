![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Backend-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

# 💸 Balance Mate

Balance Mate is a Spring Boot backend application designed to simplify group expense management. It allows users to create groups, add members, and track shared expenses efficiently.

---

## 🚀 Features

* 👤 User management
* 👥 Create and manage groups
* ➕ Add members to groups
* 💰 Expense tracking (in progress)
* 📊 Balance calculation between users

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## 📂 Project Structure

```
controller → Handles API requests  
service    → Business logic  
repository → Database interaction  
entity     → Database models  
```

---

## 🔗 API Endpoints (Sample)

| Method | Endpoint       | Description  |
| ------ | -------------- | ------------ |
| POST   | /users         | Create user  |
| POST   | /groups        | Create group |
| POST   | /group-members | Add member   |

---

## ⚙️ Setup Instructions

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the Spring Boot application

---

## 🔥 Future Enhancements

* Equal & unequal expense splitting
* Settle up feature
* Authentication & authorization (JWT)
* Frontend integration (React)

---

## 💡 Learning Highlights

* Built REST APIs using Spring Boot
* Designed relational database using JPA
* Debugged real-world issues (like SQL reserved keywords 😄)

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork and improve the project.

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
