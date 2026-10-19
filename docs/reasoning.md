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