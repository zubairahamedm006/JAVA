# 📅 Day 12 - Java OOP Concepts: Abstraction & Interface

## 📖 Topics Covered
- What is Abstraction?
- Why Abstraction is Needed
- Abstract Class
- Abstract Method
- Concrete Method
- Rules of Abstract Class
- Interface
- Multiple Inheritance using Interface
- Default Methods
- Static Methods
- Functional Interface
- Difference between Abstract Class and Interface
- Real-Time Examples

---

## 📚 What I Learned

### 🔹 Abstraction
- Abstraction means hiding the implementation details and showing only the essential features to the user.
- It helps reduce complexity and improves security.
- Achieved using:
  - Abstract Class
  - Interface

### 🔹 Abstract Class
- Declared using the `abstract` keyword.
- Cannot be instantiated (cannot create objects).
- Can contain:
  - Abstract methods
  - Normal methods
  - Constructors
  - Variables

### 🔹 Abstract Method
- A method without a body.
- Must be implemented by the child class.

### 🔹 Concrete Method
- A normal method with implementation inside an abstract class.

### 🔹 Interface
- Used to achieve 100% abstraction (before Java 8).
- Declared using the `interface` keyword.
- Methods are public and abstract by default.
- Variables are public, static, and final by default.
- A class implements an interface using the `implements` keyword.

### 🔹 Multiple Inheritance
- Java doesn't support multiple inheritance using classes.
- It supports multiple inheritance using interfaces.

### 🔹 Default Method (Java 8)
- Interface can contain methods with implementation using the `default` keyword.

### 🔹 Static Method (Java 8)
- Interface can also contain static methods.

### 🔹 Functional Interface
- An interface with only one abstract method.
- Used in Lambda Expressions.

---

## 💻 Programs Practiced

- Simple Abstract Class Example
- Abstract Class with Constructor
- Abstract Method Implementation
- Vehicle Example using Abstraction
- Animal Example using Abstract Class
- Simple Interface Example
- Multiple Interface Example
- Default Method Example
- Static Method Example
- Functional Interface Example

---

## 🎯 Key Differences

| Abstract Class | Interface |
|----------------|-----------|
| Uses `extends` | Uses `implements` |
| Can have constructors | Cannot have constructors |
| Can contain instance variables | Variables are `public static final` |
| Supports both abstract and normal methods | Mostly abstract methods (can also have default/static methods) |
| Supports single inheritance | Supports multiple inheritance |

---

## 💡 Real-Time Examples

### Abstraction
- ATM Machine
- Car Driving
- Mobile Phone
- Washing Machine

### Interface
- USB Port
- Remote Control
- Payment Gateway
- Bluetooth Device

---

## 🧠 Easy Tricks to Remember

### 🔹 Abstraction
**Hide the implementation, Show the functionality.**

Example:
> You drive a car without knowing how the engine works.

---

### 🔹 Interface
**A contract that every implementing class must follow.**

Example:
> Every vehicle follows the same rule:
> Start(), Stop(), Brake()

---

## 🚀 Skills Improved

- Object-Oriented Programming Concepts
- Code Reusability
- Java Class Design
- Understanding Real-World Modeling
- Multiple Inheritance using Interfaces

---

## 📌 Outcome

Today I learned how Java achieves abstraction using Abstract Classes and Interfaces. I also understood the differences between them, implemented multiple inheritance using interfaces, and practiced several real-world examples to strengthen my OOP concepts.

---

## 🛠️ Technologies Used

- Java
- VS Code
- JDK 17

---

### ⭐ Day 12 Completed Successfully!
