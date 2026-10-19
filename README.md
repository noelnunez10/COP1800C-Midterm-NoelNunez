# COP1800C-Midterm-NoelNunez
## Project Information

Student: Noel Nunez

Course: COP1800C - Java Programming I

Professor: Dr. Daniel Narváez

Semester: Fall 2026

JDK Version: Oracle OpenJDK 25.0.4

IDE: IntelliJ IDEA

Project Purpose:
This repository contains four Java programming exercises for the Practical Midterm. Each exercise practices different Java concepts, including variables, conditions, loops, arrays, methods, and object-oriented programming.

## Resources and Assistance

Resources used for the code : Class presentations 1-7, course assignment instructions, and IntelliJ IDEA.
AI: I used AI for the part of test-log.md to make the chart, used it also to help upload the screenshot in evidence.    


## Exercise 1: Study Budget

Main class: StudyBudget.java

Description:

This program calculates the cost of a student's study visit based on the number of complete 30-minute blocks. Each block costs 5 fee units. The program gives a 20% discount if the student has an active membership and completes at least 4 blocks.

Features:
- Uses variables and constants.
- Validates the student's name and study minutes.
- Calculates complete blocks and remaining minutes.
- Uses if/else to determine the discount.
- Displays the final fee with two decimal places.

How to run:
1. Open the project in IntelliJ IDEA.
2. Open exercise1/src/StudyBudget.java.
3. Click the green Run button next to the main method.
4. Check the results in the Run console.

Testing:
The test cases and results are documented in docs/test-log.md.

Evidence:
A screenshot of the program output is saved in docs/evidence/Exercise1JavaMidterm.png.

## Exercise 2: Attendance Analyzer

This exercise uses an array to store the number of visits in three study rooms during four periods.

The program calculates the total visits for each room and period, the grand total, the average visits per cell, the room with the highest attendance, and the number of busy rooms.

It also includes a menu that allows the user to view the summary, search for a room, or exit the program. Invalid inputs are handled without stopping the program.


### Testing

The program was tested with the original matrix, invalid menu and room inputs, a tie between rooms, and a matrix containing only zeros.

All 11 tests passed. The results are documented in docs/test-log.md, and a screenshot is saved in docs/evidence/Exercise2JavaMidterm.png.

## Exercise 3: StudyRoom

This exercise uses Object-Oriented Programming to manage study room reservations.

The StudyRoom class has private fields for the room title, capacity, and reserved seats. It uses constructors, getters, and overloaded methods to manage reservations safely.

The program allows users to reserve and cancel seats while making sure the number of reserved seats never becomes negative or greater than the room capacity.


### Testing

The results are documented in docs/test-log.md, and the screenshot is saved in docs/evidence/Exercise3JavaMidterm.png.