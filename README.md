# 🛒 E-Commerce Website Automation Testing Project

This project is an **Automation Testing Suite** developed for an e-commerce platform using **Selenium WebDriver**, **Core Java**, and a **Data-Driven Framework**. It is built using **Page Object Model (POM)** design pattern and integrates **TestNG** and **Cucumber** for test execution and reporting.

---

## 📌 Features

- Automated test cases for major e-commerce functionalities like:
  - Login / Logout
  - Product Search
  - Add to Cart
  - Checkout Process
- Supports **Regression** and **Functional** Testing
- Uses **Page Object Model (POM)** for clean code structure
- **Data-Driven Testing** with Excel file support
- Integrated with **TestNG** and **Cucumber BDD**
- Screenshot capture on test failure
- Cross-browser execution support (Chrome, Firefox, etc.)

---

## 🧰 Technologies Used

- **Java** (Core Java)
- **Selenium WebDriver**
- **TestNG**
- **Cucumber** (BDD)
- **Apache POI** (for Excel data handling)
- **Maven** (for project build and dependencies)
- **Page Object Model (POM)** design pattern

---

## 🗂️ Folder Structure
selenium-swag-project/
│
├── src/test/java/
│ ├── pages/ # Page classes (POM)
│ ├── testcases/ # TestNG or Cucumber test files
│ └── utilities/ # Utility classes (Excel, WebDriver setup)
│
├── src/test/resources/
│ ├── testdata/ # Excel or JSON test data
│ └── features/ # Cucumber .feature files (if BDD used)
│
├── test-output/ # TestNG reports (auto-generated)
├── screenshots/ # Screenshots on failure
├── pom.xml # Maven build file
└── README.md # Project overview

