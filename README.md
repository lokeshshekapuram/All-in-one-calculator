
# Advanced Calculator in Java

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [How to Run](#how-to-run)
- [Usage Example](#usage-example)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

## Overview
The **Advanced Calculator** is a Java-based console application that allows users to perform basic arithmetic operations as well as advanced mathematical functions such as power, square root, and trigonometric functions. The calculator provides a simple text-based menu interface for user interaction.

This project serves as an example of how to implement various mathematical operations in Java and handle user inputs with basic error handling.

## Features
- **Basic Operations**:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`)

- **Advanced Operations**:
  - Power (`x^y`)
  - Square Root (`√x`)
  - Trigonometric Functions (`sin`, `cos`, `tan`) with angle input in degrees
  - Natural Logarithm (`log`)

- **Error Handling**:
  - Division by zero
  - Logarithm of non-positive numbers
  - Square root of negative numbers

- **Modular Design**:
  - Clean, easy-to-read code with separate methods for each operation.
  - Supports future enhancements and modifications.

## How to Run
### Prerequisites:
- **Java Development Kit (JDK)** installed on your machine. You can download it [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Steps:
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/advanced-calculator-java.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd advanced-calculator-java
   ```

3. **Compile the program**:
   ```bash
   javac AdvancedCalculator.java
   ```

4. **Run the program**:
   ```bash
   java AdvancedCalculator
   ```

5. Use the **menu** to choose an operation and follow the prompts to enter numbers.

## Usage Example

When you run the program, you will see an interface like this:

```bash
Select operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Power (x^y)
6. Square Root (√x)
7. Sin(x)
8. Cos(x)
9. Tan(x)
10. Log(x)
11. Exit

Enter your choice: 1
Enter first number: 10
Enter second number: 5
Result: 15.0
```

The program will then display the result based on your chosen operation.

## Future Enhancements
- **Inverse Trigonometric Functions**: Support for `asin`, `acos`, and `atan`.
- **Memory Functions**: Ability to store, recall, and clear previous calculations.
- **Graphical User Interface (GUI)**: Adding a GUI using JavaFX or Swing for a more interactive experience.
- **Calculation History**: A feature to track and display previous calculations.
- **Additional Math Functions**: Implement hyperbolic functions (`sinh`, `cosh`, etc.).

## Contributing
Contributions are welcome! Please follow these steps to contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.
