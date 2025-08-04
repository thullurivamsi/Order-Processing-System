# Order Processing System

A Java-based application demonstrating **SOLID principles** and **design patterns** through an order processing workflow with discount calculation, receipt management, and notification features.

**Overview

The **Order Processing System** is designed to handle customer orders efficiently by:
- Calculating discounts (Regular or Premium)
- Generating, and printing receipts
- Sending order notifications via Email or SMS

The project follows **Object-Oriented Programming (OOP)** and the **Strategy Pattern** to ensure scalability and maintainability.

**Features**

- **Discount Calculation**  
  - Regular discount: 20%  
  - Premium discount: 30%

- **Receipt Management**  
  - Generate detailed receipts with itemized costs  
  - Print receipts to the console  

- **Notifications**  
  - Email notifications with detailed order info  
  - SMS notifications with order confirmation

- **SOLID Principles**
  - **S**ingle Responsibility – Each class has a single purpose  
  - **O**pen/Closed – Easily add new discount strategies or notification types  
  - **L**iskov Substitution – Interfaces used for interchangeable components  
  - **I**nterface Segregation – Separate interfaces for specific behaviors  
  - **D**ependency Inversion – High-level modules depend on abstractions

**Tech Stack**

- **Language:** Java 11
- **Paradigm:** Object-Oriented Programming
- **Design Patterns:** Strategy Pattern, Dependency Injection

---


---

**How it works**

1. **Create Items & Customers**  
   Define available products and customer details.

2. **Create Orders**  
   Assign selected items to a customer order.

3. **Process Orders**  
   - Calculate the total price  
   - Apply the selected discount strategy  
   - Generate the receipt  
   - Print the receipt to the console  
   - Send a notification to the customer



