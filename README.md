# COP1800C-Midterm-NoelNunez

## Project Information

Student: Noel Nunez  
Course: COP1800C - Java Programming I  
Professor: Dr. Daniel Narváez  
Semester: Fall 2026  
JDK Version: Oracle OpenJDK 25.0.4  
IDE: IntelliJ IDEA

### Project Purpose

This repository contains four Java programming exercises for the Practical Midterm. Each exercise practices different Java concepts, including variables, conditions, loops, arrays, methods, and object-oriented programming.

## Resources and Assistance

Resources used: Class presentations 1–7, course assignment instructions, and IntelliJ IDEA.

AI assistance: I used AI to help organize the test tables in `test-log.md`, prepare documentation, and organize the screenshots in the evidence folder. I reviewed the code and tested the programs in IntelliJ IDEA.

## Exercise 1 — Study Budget

Main class: StudyBudget.java

This program calculates the cost of a student's study visit based on complete 30-minute blocks. Each block costs 5 fee units. A 20% discount applies when the student has an active membership and completes at least 4 blocks.

### Features

- Uses variables and constants.
- Validates the student's name and study minutes.
- Calculates complete blocks and remaining minutes.
- Uses if/else to determine the discount.
- Displays the final fee with two decimal places.

### How to Run

1. Open the project in IntelliJ IDEA.
2. Open exercise1/src/StudyBudget.java.
3. Click the green Run button next to the main method.
4. Check the results in the Run console.

Testing: docs/test-log.md  
Evidence: docs/evidence/Exercise1JavaMidterm.png

## Exercise 2 — Attendance Analyzer

Main class: AttendanceAnalyzer.java

This program uses an array to store the number of visits in three study rooms during four periods.

It calculates total visits, the grand total, average visits, the room with the highest attendance, and the number of busy rooms.

### Features

- Uses an array.
- Calculates attendance totals and averages.
- Finds the room with the highest attendance.
- Uses a menu to display results and search for rooms.
- Handles invalid inputs.

### How to Run

1. Open exercise2/src/AttendanceAnalyzer.java in IntelliJ IDEA.
2. Run the mai` method.
3. Use the menu to view the summary, search for a room, or exit.


## Exercise 3 — StudyRoom

Main class: StudyRoomDemo.java

This exercise uses object-oriented programming to manage study room reservations.

The StudyRoom class has private fields for the room title, capacity, and reserved seats. It uses constructors, getters, and overloaded methods.

### Features

- Creates study room objects.
- Reserves and cancels seats.
- Checks remaining capacity.
- Rejects invalid reservations and cancellations.
- Uses constructors and method overloading.

### How to Run

1. Open exercise3/src in IntelliJ IDEA.
2. Run the main method in StudyRoomDemo.java.
3. Check the reservation and cancellation results in the console.

Testing: docs/test-log.md
Evidence: docs/evidence/Exercise3JavaMidterm.png

## Exercise 4 — Campus Resource Manager

Main class: ResourceApp.java

This program manages reservations for campus study spaces and computer labs.

It uses inheritance, an interface, an abstract class, and an array to manage different resources.

### Features

- Reserves and cancels seats.
- Checks available seats.
- Rejects invalid reservations and cancellations.
- Calculates revenue and occupancy.
- Displays a report for all resources.
- Handles invalid menu options and non-numeric inputs.

### Resources

| Resource | Capacity | Fee per Seat |
|---|---:|---:|
| Quiet Study | 4 | 3 |
| Computer Lab | 3 | 8 |
| Group Study | 2 | 3 |

### Reusing StudyRoom

For Exercise 4, I copied the StudyRoom class from Exercise 3 into exercise4/src.

I used a copy so Exercise 4 can run independently. The CampusResource class extends StudyRoom and uses its reservation and cancellation methods.

### How to Run

1. Open exercise4/src in IntelliJ IDEA.
2. Run the mai` method in ResourceApp.java.
3. Select an option from the menu:
    - 1 — Reserve seats
    - 2 — Cancel seats
    - 3 — Display report
    - 0 — Exit

### Testing

The program passed 9 required tests and 6 additional tests.

The final report showed a total revenue of 17.00, with occupancy values of 25.0%, 33.3%, and 100.0%.

Testing: docs/test-log.md` 

Evidence:docs/evidence/Exercise4JavaMidterm.png

## Documentation

- docs/reasoning.md contains the plans, reasoning answers, and explanations.
- docs/test-log.md contains the test cases and results.
- docs/evidence/ contains screenshots for all four exercises.
