# Factorial Calculation Using Recursion

A Java Maven project that computes the factorial of a number using a recursive method, with edge case handling and JUnit 5 unit tests.

---

## Project Structure

```
FactorialCalculation-UsingRecursion/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── FactorialCalculator.java
│   └── test/
│       └── java/
│           └── FactorialCalculatorTest.java
└── pom.xml
```

---

## How It Works

The `factorial(int n)` method uses **recursion** — a technique where a method calls itself with a smaller input until it reaches a base case.

```
factorial(5)
  └── 5 * factorial(4)
        └── 4 * factorial(3)
              └── 3 * factorial(2)
                    └── 2 * factorial(1)
                          └── returns 1  ← base case
```

**Result:** 5 × 4 × 3 × 2 × 1 = **120**

---

## Edge Cases Handled

| Input | Behaviour |
|-------|-----------|
| `0`   | Returns `1` — by mathematical definition, 0! = 1 |
| `1`   | Returns `1` — base case |
| Negative number | Throws `IllegalArgumentException` |

---

## Prerequisites

- Java 11+
- Maven 3.6+

---

## Running the Project

**Compile and run `main`:**
```bash
mvn compile exec:java -Dexec.mainClass="FactorialCalculator"
```

**Run unit tests:**
```bash
mvn test
```

**Expected output from `main`:**
```
factorial(0) = 1
factorial(1) = 1
factorial(5) = 120
factorial(10) = 3628800
factorial(12) = 479001600
factorial(-3) → Error: Factorial is not defined for negative numbers: -3
```

---

## Dependencies

| Dependency | Version | Scope |
|------------|---------|-------|
| JUnit Jupiter | 5.10.0 | test |

## Author

Nhlalala Lubisi
