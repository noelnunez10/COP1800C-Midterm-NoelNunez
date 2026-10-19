

# Practical Midterm - Test Log
## Le pedi a la IA que me ayudara a hacer la tabla, ya que mis predicciones las tenia en simple texto pero queria que se viera bien.
## Exercise 1: Study Budget

| Test ID | Input and starting state | Predicted result | Actual result |
|---|---|---|---|
| E1-T1 | Ana Lee, 95 min, active | 3 blocks, 5 minutes left, final fee 15.00 | Passed |
| E1-T2 | Ana Lee, 120 min, active | 4 blocks, discount 4.00, final fee 16.00 | Passed |
| E1-T3 | Ana Lee, 120 min, inactive | 4 blocks, no discount, final fee 20.00 | Passed |
| E1-T4 | Ana Lee, 29 min, active | 0 blocks, 29 minutes left, final fee 0.00 | Passed |
| E1-T5 | Blank name, 95 min, active | The program should reject the empty name. | Passed |
| E1-T6 | Ana Lee, 0 min, active | The program should show an error because minutes cannot be zero. | Passed |
| E1-T7 | Ana Lee, 150 min, active | 5 blocks, discount 5.00, final fee 20.00 | Passed |


## Exercise 2: Attendance Analyzer — Test Log

| Test | Input | Expected Result | Actual Result | Status |
|---|---|---|---|---|
| E2-T1 | Menu: 1 | Room totals: 6, 7, 5. Period totals: 3, 6, 5, 4. Grand total: 18. Average: 1.50. Highest: Room 2. Busy rooms: 2. | Room totals: 6, 7, 5. Period totals: 3, 6, 5, 4. Grand total: 18. Average: 1.50. Highest: Room 2. Busy rooms: 2. | Passed |
| E2-T2 | Menu: 2, Room: 1 | Room 1 total: 6. Status: Busy. | Room 1 total: 6. Status: Busy. | Passed |
| E2-T3 | Menu: 2, Room: 3 | Room 3 total: 5. Status: Not busy. | Room 3 total: 5. Status: Not busy. | Passed |
| E2-T4 | Menu: 2, Room: 0 | Invalid room number. | Invalid room number. | Passed |
| E2-T5 | Menu: 2, Room: 4 | Invalid room number. | Invalid room number. | Passed |
| E2-T6 | Menu: 2, Room: xyz | Invalid input. Enter a number. | Invalid input. Enter a number. | Passed |
| E2-T7 | Menu: abc | Invalid input. Enter a number. | Invalid input. Enter a number. | Passed |
| E2-T8 | Menu: 9 | Invalid option. Try again. | Invalid option. Try again. | Passed |
| E2-T9 | Menu: 0 | Goodbye! | Goodbye! | Passed |
| E2-T10 | Tie matrix: {{1,1},{0,2},{0,0}}, Menu: 1 | Room totals: 2, 2, 0. Period totals: 1, 3. Grand total: 4. Average: 0.67. Highest: Room 1. Busy rooms: 0. | Room totals: 2, 2, 0. Period totals: 1, 3. Grand total: 4. Average: 0.67. Highest: Room 1. Busy rooms: 0. | Passed |
| E2-T11 | Zero-filled 3x4 matrix, Menu: 1 | Room totals: 0, 0, 0. Period totals: 0, 0, 0, 0. Grand total: 0. Average: 0.00. Highest: Room 1. Busy rooms: 0. | Room totals: 0, 0, 0. Period totals: 0, 0, 0, 0. Grand total: 0. Average: 0.00. Highest: Room 1. Busy rooms: 0. | Passed |

### Test Summary

All 11 tests passed successfully. The program correctly calculates room and period totals, handles invalid inputs, follows the tie rule, and works with a zero-filled matrix.
