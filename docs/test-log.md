

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