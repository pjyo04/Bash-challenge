Suppose you're creating a program to manage a school's enrollment system.
Your program should have a `Student` class, which has the following attributes:

name: a string representing the student's name
id: an integer representing the student's ID number
courses: an array of strings representing the courses the student is enrolled in
Your Student class should have the following methods:

A constructor that takes in the student's name and ID number and initializes the name and id attributes.
Getter and setter methods for the name, id, and courses attributes.
A method called addCourse that takes in a string representing a course and adds it to the courses array.
A method called printInfo that prints out the student's name, ID number, and enrolled courses.

Additionally, you should create a `GraduateStudent` class that inherits from the Student class. The GraduateStudent class should have an additional attribute:

researchArea: a string representing the graduate student's research area
The GraduateStudent class should have the following methods:

A constructor that takes in the graduate student's name, ID number, and research area, and initializes the name, id, and researchArea attributes.
Getter and setter methods for the researchArea attribute.
Override the printInfo method from the Student class to also print out the graduate student's research area.
