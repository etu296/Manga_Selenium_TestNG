# Automation Testing with Selenium

## Objective

Create automated tests for the following scenarios using Selenium:
1. Login Functionality
2. Manga Search and Display
3. Manga Details Modal

## Test Scenarios

### 1. Login Functionality

**Scenario**: Verify that the login functionality works correctly.

**Steps**:
1. Open the application.
2. Verify that the login page is displayed.
3. Enter valid login credentials (e.g., testuser and password).
4. Click the "Login" button.
5. Verify that the user is redirected to the manga search page.

### 2. Manga Search and Display

**Scenario**: Verify that searching for manga returns the correct results.

**Steps**:
1. Ensure the user is on the manga search page.
2. Enter the search term "Naruto" into the search box.
3. Click the "Search" button.
4. Verify that manga cards with the name "Naruto" are displayed.
5. Enter the search term "One Piece" into the search box.
6. Click the "Search" button.
7. Verify that manga cards with the name "One Piece" are displayed.
8. Enter the search term "Seven Deadly Sins" into the search box.
9. Click the "Search" button.
10. Verify that manga cards with the name "Seven Deadly Sins" are displayed.
11. Enter a search term that returns no results (e.g., "No manga found").
12. Click the "Search" button.
13. Verify that a "No manga found" message is displayed.

### 3. Manga Details Modal

**Scenario**: Verify that the modal displays the correct manga details.

**Steps**:
1. Ensure the user is on the manga search page.
2. Click the "Details" link on a manga card.
3. Verify that the modal appears and displays the correct manga information (image, name, summary).
4. Click the "Close" button on the modal.
5. Verify that the modal is closed and no longer visible.

## Setup

1. **Install Dependencies**:
   - Ensure you have the necessary dependencies installed. You will need:
     - Java Development Kit (JDK)
     - Maven or Gradle (for dependency management)
     - Selenium WebDriver
     - TestNG or JUnit (for test execution)
     - ChromeDriver (or another WebDriver if using a different browser)

2. **Configure WebDriver**:
   - Make sure the WebDriver executable (e.g., `chromedriver.exe` for Chrome) is available and its path is configured correctly in your test scripts.

3. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/your-project.git
   cd your-project
