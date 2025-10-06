# SeleniumJava-CoreFeatures

A concise, hands-on collection of **Selenium WebDriver** examples and utilities in **Java** covering the main Selenium features and common web-automation scenarios. This repo contains sample code, a Maven `pom.xml`, browser driver(s), and test output examples to help you learn and bootstrap real tests quickly.

---

## What this repo covers
This repository focuses on the core Selenium features and practical patterns you’ll use every day while automating web applications with Java:

- Browser drivers & WebDriver setup (ChromeDriver, driver binaries)
- Locating elements (id, name, css, xpath, className, etc.)
- Waits & synchronization (implicit, explicit, fluent waits)
- Actions (mouse hover, drag-and-drop, double click, keyboard actions)
- Handling alerts, dialogs and popups
- Frames / iframes switching
- Window / tab handling and navigation
- Dropdowns (select), checkboxes and radio buttons
- JavaScript execution via `JavascriptExecutor`
- Screenshots & test artifacts capture on failure
- File uploads & downloads handling
- Cookies and session handling
- Test organization: TestNG examples and suite configuration
- Page Object Model (POM) pattern and reusable driver utilities
- Test reporting and test-output examples

---

## Quick start

### Prerequisites
- Java JDK 8+ (JDK 11 recommended)  
- Maven (if you want to use the included `pom.xml`)  
- A chromedriver binary (this repo includes a `chromedriver-win64` folder for Windows)

### Run tests (Maven)
If you use Maven:
```bash
# from repo root
mvn clean test
