# Codsoft_NumberGame
# Number Game – Codsoft Internship Task 1

# Overview

This project is the first task of my Codsoft Java Internship.
It is a console-based number guessing game built entirely in Java.
The program generates a random number within a given range and the player has to guess it by entering numbers in the console. After each guess the game provides feedback — whether the guess is too high, too low, or correct — until the user finds the correct number.

The goal of the project is to strengthen core Java programming skills such as:

using loops and conditional statements,

applying the java.util.Random class for random number generation, and

handling user input safely with the Scanner class.
# Features

Random number generation: The program secretly chooses an integer between 1 and 100 at the start of each round.

User feedback: After every guess, the player is told if the number is higher or lower than the target.

Attempt counter: Tracks the number of guesses and displays it when the player wins.

Replay option: After a round ends, the player can immediately start a new round without restarting the program.

Input validation: Handles invalid input gracefully to prevent crashes.
# Objectives

This task was designed to:

1. Practice writing clean and readable Java code.


2. Demonstrate understanding of fundamental programming concepts.


3. Show the ability to interact with users through the console.


4. Implement simple game logic using conditionals and loops.
# Tools & Technologies

Programming language: Java (JDK 11 or later recommended)

IDE / Editor: Any Java-compatible IDE (Eclipse, IntelliJ IDEA, VS Code) or command-line tools.

Standard Libraries: java.util.Random and java.util.Scanner.
# How to Run

1️⃣ Clone the Repository

git clone https://github.com/<your-username>/codsoft-task1-number-game.git
cd codsoft-task1-number-game

2️⃣ Compile the Code

javac NumberGame.java

3️⃣ Run the Game

java NumberGame


---

# Example Gameplay

Welcome to the Number Game!
I'm thinking of a number between 1 and 100.

Enter your guess: 45
Too low! Try again.

Enter your guess: 78
Too high! Try again.

Enter your guess: 63
Congratulations! You guessed the number in 3 attempts.

Would you like to play again? (y/n): n
Thanks for playing!



