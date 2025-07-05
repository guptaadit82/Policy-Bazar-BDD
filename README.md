# Policy-Bazar-BDD

# 🧪 Policy Bazar BDD Automation Framework

This project is a Behavior-Driven Development (BDD) based test automation framework developed to automate and validate various user workflows of the [Policy Bazar](https://www.policybazaar.com/) website using Cucumber, Selenium, and Java.

## 🚀 Features

- BDD framework using **Cucumber + Selenium WebDriver + TestNG**
- Page Object Model (POM) design pattern
- Cross-browser execution support
- Realistic test scenarios for insurance plan selections and form submissions
- Integrated with **Maven** for build management
- ExtentReports for rich HTML reporting
- Clean, modular, and scalable test architecture

## 🧰 Tech Stack

| Tool/Tech      | Purpose                         |
|----------------|---------------------------------|
| Java           | Programming Language            |
| Selenium       | Browser Automation              |
| Cucumber       | BDD Framework                   |
| TestNG         | Test Management & Execution     |
| Maven          | Build Management                |
| ExtentReports  | Reporting                       |
| Git/GitHub     | Version Control                 |


## 📁 Project Structure

Policy-Bazar-BDD/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/          # Page classes (POM)
│   ├── test/
│   │   ├── java/
│   │   │   └── stepdefinitions/ # Step Definitions
│   │   └── resources/
│   │       ├── features/       # Cucumber feature files
│   │       └── config/         # Config files
│
├── pom.xml                    # Maven config
├── testng.xml                 # TestNG suite
└── README.md                  # Project description



## 📄 Sample Test Scenarios Covered

* Selecting insurance plans (Health, Life, Car, etc.)
* Filling and validating personal and contact information
* Verifying page navigations and error validations
* Validating premium calculations and comparison workflows

---

## 🤝 Contributions

Feel free to raise issues or pull requests to enhance the framework.
Created by [Aditya Gupta](https://github.com/guptaadit82)

