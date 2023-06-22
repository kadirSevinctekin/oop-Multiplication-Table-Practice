#  Object Oriented Programming Course Project: Multiplication Table Practice

In this project, you are expected to create a project that will help elementary school children memorize multiplication tables, and your project 
should have a graphical user interface (GUI). Projects that only work in the command line will not be considered for evaluation. 
The required features for your assignment are listed below:

When the game is opened, the user should be prompted to log in. The program should have one parent user and multiple child users.

The parent user should also be the administrator user and be able to make all kinds of adjustments.

The default exercise mode should consist of N random questions of the form axb (a: 1..10, b: 1..10). The parent user should be able to
define exercises by changing the ranges of a, b, and N as desired.

When a child starts an exercise, the timing should be visible on the screen (timer). The record should include information about which child 
started which exercise when, how long it took to complete the exercise, which multiplication questions were asked in that exercise, how long 
it took to answer each question, and which questions were answered correctly or incorrectly.

A speed and accuracy score should be generated from the exercise results, and it should be added to the record and communicated to the child 
at the end of the exercise. These scores should be kept in the "high score" table for that exercise.

There should be a reporting screen where the records are shown to the parent. It is a bonus point if the report is graphical. Reports should 
be saved as a text file with tabs separated so that they can be opened in Excel.

All settings, defined users, defined exercises, etc., in the program should be stored in a file using the serialization method.
