## Lo de '#' le pregunta a la IA como hacer la letras mas grandes para que se mire mejor redactado y ordenado
# Practical Midterm - Reasoning 

## Exercise 1: Study Budget

### Plan or Pseudocode

1. Store the student's name, minutes, and membership status.
2. Remove extra spaces from the name and validate the data.
3. Convert the name to uppercase and get its first character.
4. Calculate complete blocks and remaining minutes.
5. Check if the student qualifies for the discount.
6. Calculate the discount and final fee.
7. Display the results with two decimal places.

### E1-R1: Why does the eligibility rule require AND rather than OR?

We use AND because both conditions must be true to get the discount. The student needs an active membership and at least 4 complete blocks. If we use OR, a student with an active membership but only 2 blocks could get the discount, which is incorrect.

### E1-R2: Why would a discount rate represented by integer division of 20 by 100 cause an error?

In Java, when we divide 20 by 100 using integers, the result is 0 because Java removes the decimal part. This would make the discount 0 instead of 20%. To fix this, we use 0.20 or 20.0 / 100 so Java keeps the decimal value.

## Exercise 2: Attendance Analyzer

### Plan

1. Create an array to store the visits for each room and period.
2. Use nested loops to calculate the room totals and period totals.
3. Calculate the grand total and the average.
4. Find the room with the highest number of visits.
5. Count how many rooms have 6 or more visits.
6. Create a menu using while and switch.
7. Allow the user to search for a room and handle invalid inputs.

### E2-R1: Where should the row accumulator be reset, and why?

The row total should start at zero for each new room. This prevents visits from the previous room from being added to the next room. For example in my code, each position in the totals array starts at zero.

### E2-R2: How do we convert a displayed room number to an array index, and why do we validate first?

We subtract 1 from the room number because Java arrays start at index 0. For example, Room 3 is at index 2. We check the room number first to prevent an invalid array index.

### E2-R3: How does the comparison preserve the tie rule?

I use > instead of >= when comparing room totals. If two rooms have the same total, the program keeps the first room. This makes sure the room with the lowest number wins the tie.

## Exercise 3: StudyRoom

### Plan

1. Create a StudyRoom class with private fields for title, capacity, and reserved seats.
2. Validate the title and capacity in the constructor.
3. Create a second constructor with a default capacity of 4.
4. Add getter methods to check the room information.
5. Create reserve and cancel methods that check requests before changing reserved seats.
6. Create StudyRoomDemo to test reservations, cancellations, constructors, and object references.

### E3-R1: Why can changing state before validation violate the invariant?

If we change the reserved seats before checking the request, the number of reservations could become negative or greater than the capacity. This would break the rule that reserved seats must always be between zero and the room capacity. We validate first to prevent this problem.

### E3-R2: How are the two reserve methods an example of overloading?

Both methods have the same name, but different parameters. The reserve(int seats) method reserves a specific number of seats, while reserve() calls reserve(1) to reserve one seat. 

### E3-R3: What happens when an alias makes a reservation?

An alias is another reference to the same object. It does not create a new room. If we reserve a seat using the alias, the original reference also shows the updated number of reserved seats because both references point to the same object.

### Exercise 4 — Plan

1. Reuse the StudyRoom class from Exercise 3 to manage reservations, cancellations, and room capacity.
2. Create a Priced interface with the feePerSeat() method.
3. Create an abstract class called CampusResource that extends StudyRoom and implements Priced.
4. Add methods in CampusResource to calculate revenue and occupancy.
5. Create two subclasses: StudySpace with a fee of 3 per seat and ComputerLab with a fee of 8 per seat.
6. Create a CampusResource array with three resources: Quiet Study, Computer Lab, and Group Study.
7. Use a while loop and a switch statement to create a menu for reservations, cancellations, reports, and exiting.
8. Validate resource numbers, seat quantities, and user input to prevent invalid operations.
9. Use StringBuilder to display a report with reserved seats, remaining seats, revenue, occupancy, and total revenue.
10. Test the program with the required cases and additional invalid inputs to confirm that everything works correctly.

### Exercise 4 — Reasoning Challenges

### Exercise 4 — Reasoning Challenges

**E4-R1: Why can CampusResource return two different fees? What is the difference between overriding and overloading?**

A CampusResource can refer to a StudySpace (fee 3) or a ComputerLab (fee 8). Overriding means using the same method with different results in different classes. 

**E4-R2: What is the difference between CampusResource and Priced?**

Priced requires resources to have a feePerSeat() method. CampusResource uses this fee to calculate revenue and also calculates occupancy.

**E4-R3: How does cancellation affect revenue?**

Canceling seats lowers the number of reserved seats, so revenue decreases. 

**E4-R4: Why should the resource array be created outside the menu loop?**

If we create the resources inside the loop, they reset every time the menu appears. Keeping them outside the loop saves the reservations until the program ends.