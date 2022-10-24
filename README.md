# Banco## Instructions

This test has the purpose of evaluating your skills in analyzing a problem, elaborating a solution and code organization. Answer the questions to the best of your ability. Solutions that are more thought out and have better overall design will earn extra points. So it's worth putting the effort into making your code/solution 'look good'.

Each part of each question has a small story contextualizing your situation. You must produce code to resolve the problem. We want to see this code besides the answer for each question, so please provide the code you have produced to resolve the question.

Identify the language used. You can use any language of your liking.

Good luck!

## Question 1

You are a security expert attempting to break into a company which paid you to do so. By exploiting security flaws you discover that valid passwords must follow a certain pattern.

Pattern rules:

The password must be between 184759-856920.

At least two adjacent digits must be the same (like 22 in 122346).

Starting from left to right, digits only increase or stay the same (like 111237 or 135678).

Examples:
222222 is valid (double 22, never decreases).
236775 is not valid (decreasing pair of digits 75).
345789 is not valid (no double).

Before attempting brute force you would like to know how many possible combinations of the password can exist. How many passwords exist following these rules?

## Question 2

You're a famous detective and you've been called into town to solve a case. Seems like this particular criminal left clues to his next victim. The clues say the next location the criminal will attack is Cross Street but there is no address. The police don't seem too interested in figuring out the clue and the commissioner seems to be ignoring you and went to the rooftop. On a USB drive you've found a document with a large list of numbers and in several different places you've found clues as to what the numbers mean. You've figured out the following.

Each line represents a command.

Commands starting with 20 increase the "address" variable. For example:

Command 201 increases the address variable by 1.
Command 2010 increases the address variable by 10.
Commands starting with 5 jump to another command. For example:

Command 51 executes the next instruction.
Command 52 ignores the next instruction and executes the one after.
Command 510 jumps 10 instructions forward.
Commands starting with any other digit do nothing and the next command is executed in succession.

The program starts at the first number and ends once there is no command left to be executed.

Assuming the address starts at zero and given the input document (commands.txt), what is the value of the address variable when the document ends?

Starting from 25.
25 is not a known command. So nothing is done.
52 jumps two ahead to 202.
202 increases the address variable by 2.
54 jumps ahead to 201
201 increases the address variable by 1.
There is no longer a command to execute so the result is that the address is 3.

Example:
25
52
53
202
54
402
203
510
201
