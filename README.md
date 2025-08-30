# Java HackerRank Code

This repository contains solutions to foundational Java programming problems, modeled after HackerRank’s 30 Days of Code. Each folder represents a day and each file contains that day's solution and the core logic.

## Folder Structure

```
Java-HackerRank-Code/
├── day-1/
│   └── solution.java
├── day-2/
│   └── Solution.java
├── day-3/
│   └── Solution.java
├── day-4/
│   └── Solution.java
├── day-5/
│   └── Solution.java
├── day-6/
│   └── Solution.java
├── day-7/
│   └── Solution.java
├── day-8/
│   └── Solution.java
```

## Challenge Descriptions

### Day 1: Hello World
- **Task:** Print "Hello, World." and "Hello, Java." on two separate lines.
- **Explanation:** This is the classic starting program for any language. It introduces you to Java's `System.out.println` command, allowing you to output text to the console.

---

### Day 2: Java Stdin and Stdout I
- **Task:** Read a string and two integers from standard input, then print each value on its own line in the order they were read.
- **Explanation:**  
  This challenge helps you practice reading different types of input from the user. You will first read a word (string), then two numbers (integers), and print them out exactly as they were entered. This exercise builds your understanding of Java’s `Scanner` class, which is commonly used for input in console-based programs.

---

### Day 3: Conditional Statements
- **Task:** Given an integer N, print "Weird" if N is odd, or if it’s even and in the range 6 to 20 (inclusive). Print "Not Weird" if the number is even and in the range 2 to 5 (inclusive), or if it’s even and greater than 20.
- **Explanation:** This problem teaches you how to use `if`, `else if`, and `else` statements in Java. You’ll check whether a number is odd or even and then use its value to decide what message to print.

---

### Day 4: Java Stdin and Stdout II
- **Task:** Read three types of input from the user: an integer, a double, and a string. Then print them out in reverse order with labels.
- **Explanation:** This challenge gets you comfortable with Java’s input methods. It reinforces how to read different data types from the user and how to output them in a formatted way.

---

### Day 5: Java Output Formatting
- **Task:** Take multiple pairs of a string and an integer as input and print them in a table, making sure the string is left-justified and the number is three digits with leading zeros if needed.
- **Explanation:** You will learn how to use formatted printing (`System.out.printf`) to align text and pad numbers, which is essential for making neat and readable console output.

---

### Day 6: Java Loops I
- **Task:** Given an integer N, print its multiplication table for values 1 through 10, each on a new line in the format "N x i = result".
- **Explanation:** This teaches you how to use loops and basic arithmetic. It's a classic exercise to get comfortable with Java’s `for` loop and simple math operations.

---

### Day 7: Java Loops II
- **Task:** For a series of queries, each with three integers (a, b, n), print a sequence of numbers based on the formula:  
  `a + 2^0 * b, a + 2^0 * b + 2^1 * b, ..., a + 2^0 * b + 2^1 * b + ... + 2^(n-1) * b`
- **Explanation:** This problem helps you practice nested loops and series calculations. You’ll see how to build and print a sequence based on mathematical patterns, using powers of two and cumulative addition.

---

### Day 8: Java Datatypes
- **Task:** For several given numbers, determine which Java primitive datatypes (`byte`, `short`, `int`, `long`) can store the number.
- **Explanation:** Learn about Java’s numeric data types and their ranges. For each input, check which data types can fit the number and report the results. This is useful for understanding the limitations and capabilities of each data type.

---

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/realrohitsingh/Java-HackerRank-Code.git
   ```
2. Go to the desired day's folder:
   ```bash
   cd Java-HackerRank-Code/day-1
   ```
3. Compile and run the solution:
   ```bash
   javac Solution.java
   java Solution
   ```

## Contributing

Pull requests are welcome! If you can improve solutions or add explanations, feel free to open an issue or submit a PR.

## License

This project is open source and available under the [MIT License](LICENSE).