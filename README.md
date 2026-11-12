# SE1020 – Object Oriented Programming
## Lab Sheet 03 - Question 03: Employee Performance & Bonus System

**Institution:** Sri Lanka Institute of Information Technology (SLIIT)  
**Faculty:** Faculty of Computing  
**Academic Year:** Year 1 Semester 2  
**Student ID:** IT22896568  

---

### 📖 Scenario Overview
This project implements a system to manage employee performance evaluations and calculate annual salary bonuses based on their performance rating.

Key OOP principles applied:
- **Encapsulation:** Private attributes (`employeeId`, `name`, `basicSalary`, `performanceRating`) with appropriate getters and setters.
- **Data Validation:** Enforces validation in setters (performance rating must be between 1 and 5, salary cannot be negative).
- **Business Logic:** Implements bonus and total salary calculation methods based on the company's evaluation policy.

---

### 📊 Bonus Calculation Policy

| Performance Rating | Bonus Percentage |
| :---: | :---: |
| **5** | 20% of Basic Salary |
| **4** | 15% of Basic Salary |
| **3** | 10% of Basic Salary |
| **2** | 5% of Basic Salary |
| **1** | No Bonus (0%) |

$$\text{Total Salary} = \text{Basic Salary} + \text{Bonus}$$

---

### 📁 Project Structure

```text
├── Question03/
│   ├── Employee.java       # Encapsulated Employee class with calculations
│   └── EmployeeApp.java    # Main driver class to take inputs and display results
├── .gitignore              # Ignores compiled class files and IDE artifacts
└── README.md               # Project documentation
```

---

### 🚀 How to Compile and Run

1. **Compile the source files:**
   ```bash
   javac Question03/*.java
   ```

2. **Run the application:**
   ```bash
   java -cp Question03 EmployeeApp
   ```

---

### 💻 Sample Output

```text
Enter Employee ID: 130
Enter Employee Name: Kalhari Perera
Enter Basic Salary: 20000
Enter Performance Rating (1-5): 3

Employee Details:
Employee ID: 130
Name: Kalhari Perera
Basic Salary: 20000.0
Performance Rating: 3
Bonus: 2000.0
Total Salary: 22000.0
```
