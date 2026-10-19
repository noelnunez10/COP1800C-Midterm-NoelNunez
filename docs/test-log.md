

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

## Exercise 3: StudyRoom — Test Log

Room: Quiet Room  
Capacity: 6

| Test | Input / Operation | Expected Result | Actual Result | Status |
|---|---|---|---|---|
| E3-T1 | reserve(4) | true, Reserved: 4, Remaining: 2 | true, Reserved: 4, Remaining: 2 | Passed |
| E3-T2 | reserve(3) | false, Reserved: 4, Remaining: 2 | false, Reserved: 4, Remaining: 2 | Passed |
| E3-T3 | cancel(2) | true, Reserved: 2, Remaining: 4 | true, Reserved: 2, Remaining: 4 | Passed |
| E3-T4 | reserve() | true, Reserved: 3, Remaining: 3 | true, Reserved: 3, Remaining: 3 | Passed |
| E3-T5 | reserve(3) | true, Reserved: 6, Remaining: 0 | true, Reserved: 6, Remaining: 0 | Passed |
| E3-T6 | cancel(7) | false, Reserved: 6, Remaining: 0 | false, Reserved: 6, Remaining: 0 | Passed |
| E3-T7 | reserve(0) | false, Reserved: 6, Remaining: 0 | false, Reserved: 6, Remaining: 0 | Passed |
| E3-T8 | cancel(-1) | false, Reserved: 6, Remaining: 0 | false, Reserved: 6, Remaining: 0 | Passed |
| E3-T9 | Null title | Constructor rejected | Null title rejected. | Passed |
| E3-T10 | Spaces-only title | Constructor rejected | Blank title rejected. | Passed |
| E3-T11 | Zero capacity | Constructor rejected | Zero capacity rejected. | Passed |
| E3-T12 | Negative capacity | Constructor rejected | Negative capacity rejected. | Passed |
| E3-T13 | Default constructor | Capacity: 4 | Capacity: 4 | Passed |
| E3-T14 | Reserve 4, then cancel 4 | true, Reserved: 0, Remaining: 4 | true, Reserved: 0, Remaining: 4 | Passed |

### Test Summary
All 8 sequential operations passed. The 4 invalid constructor checks produced the expected rejection messages. The default constructor and full cancellation also worked correctly.

## Exercise 4 — Campus Resource Manager

### Test Results

The program was tested with nine required tests and six additional tests. All nine required tests were completed in one continuous run.

| Test | Action | Expected Result | Status |
|---|---|---|---|
| A | Reserve 2 seats in Quiet Study | Success: true, Reserved: 2 | Passed |
| B | Reserve 3 more seats in Quiet Study | Success: false, Reserved: 2 | Passed |
| C | Reserve 1 seat in Computer Lab | Success: true, Reserved: 1 | Passed |
| D | Cancel 1 seat in Quiet Study | Success: true, Reserved: 1 | Passed |
| E | Reserve 2 seats in Group Study | Success: true, Reserved: 2 | Passed |
| F | Cancel 2 seats in Computer Lab | Success: false, Reserved: 1 | Passed |
| G | Select resource number 4 | Invalid resource number | Passed |
| H | Reserve 0 seats in Quiet Study | Success: false, Reserved: 1 | Passed |
| I | Display the final report | Total revenue: 17.00 | Passed |
| Extra 1 | Reserve -1 seats | Success: false, Reserved: 0 | Passed |
| Extra 2 | Select resource number 0 | Invalid resource number | Passed |
| Extra 3 | Enter `abc` in the menu | Invalid input message | Passed |
| Extra 4 | Enter `abc` as seat quantity | Invalid input message | Passed |
| Extra 5 | Enter menu option 9 | Invalid option message | Passed |
| Extra 6 | Reserve exactly 4 seats in Quiet Study after restarting | Success: true, Reserved: 4 | Passed |


### Conclusion

All 15 tests passed successfully. The program correctly handles reservations, cancellations, invalid inputs, revenue calculations, and occupancy percentages.