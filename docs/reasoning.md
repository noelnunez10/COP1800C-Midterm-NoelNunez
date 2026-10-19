### Lo de # le pregunta a la IA como hacer la letras mas grandes para que se mire mejor redactado y ordenado
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