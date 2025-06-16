# 🏨 Hotel Management System (Console-Based Java Application)

A simple Java-based console application to manage hotel room operations such as adding, updating, deleting, and viewing room details. This system uses file handling (`room.txt`) to store and retrieve room data persistently.

---

## 📌 Features

- ➕ Add Room
- 📄 View All Rooms
- 🔍 Search Room by Room Number
- ✏️ Update Room Details
- ❌ Delete Room
- 💾 Persistent Storage using `room.txt`

---

## 🧱 Technologies Used

- Java (JDK 8+)
- Java IO (BufferedReader, BufferedWriter, FileReader, FileWriter)
- Command Line Interface (CLI)

---

## 📁 Project Structure

```
HotelManagementSystem/
├── dao/
│   └── RoomDAO.java
├── model/
│   └── Room.java
├── room.txt
├── HotelManagementApp.java
└── README.md
```

- `HotelManagementApp.java` – Main application entry point (CLI-based).
- `RoomDAO.java` – Handles CRUD operations with file I/O.
- `Room.java` – Model class for Room entity.
- `room.txt` – Stores all room records.
- `README.md` – You're reading it :)

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/HotelManagementSystem.git
cd HotelManagementSystem
```

### 2. Compile and Run

```bash
javac HotelManagementApp.java dao/*.java model/*.java
java HotelManagementApp
```

---

## 🧾 Input Format

When adding or updating a room, you'll be prompted for the following:

- **Room Number** (e.g., `101`)
- **Availability** (`Available` or `Occupied`)
- **Cleaning Status** (`Cleaned` or `Dirty`)
- **Price** (e.g., `1200.0`)
- **Bed Type** (`Single` or `Double`)

---

## 🛡️ Error Handling

- Prevents crashes on wrong input using `try-catch`.
- Validates basic data types (e.g., price must be numeric).
- Graceful messages for operations on non-existent room numbers.

---

## 📌 Data Storage

All room records are saved in a plain text file:

```txt
room.txt
```

Each room's data is written in a line-by-line or comma-separated format (as defined in your `RoomDAO` class). This enables persistence between runs of the application.

---


---

