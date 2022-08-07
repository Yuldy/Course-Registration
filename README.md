# CourseRegistrationProgram
## Description
- Program designed for registering students in courses.
- Gives 4 actions for the user to take.
  - Add Student (asks for name, student ID number, whether the student has paid tuition)
  - Drop Student (asks for name, student ID number, whether the student has paid tuition)
  - Print Course Information (Displays number of students enrolled with information of each student name and ID of who is currently enrolled in course.
  - Exit Course Registration Program

- **MINOR BUG: Prints Course Information after each task**

**KEY NOTES:**
- A student cannot be on the roster and or waitlist all at once.
- Students on the waitlist would be added and stored in the order that they were added in.
- Student must pay tuition to be added to either roster or waitlist of course.


## Program Demonstration
```
Welcome to the Course Registration system for the following course.
Introduction to Python
----------------------------
0 enrolled (Maximum size of class 5)
0 on waitlist (Maximum size of waitlist 5)

What action would you like to take
1 to add a student
2 to drop a student
3 to print the course
4 to exit
1
Enter the student's name: 
Klay Thompson
Enter the student's ID: 
1111
Has the student paid tuition yet? Enter y or n: 
y
Klay Thompson( 1111) added successfully to either roster or waitlist
Introduction to Python
----------------------------
1 enrolled (Maximum size of class 5)
	Klay Thompson (1111)
0 on waitlist (Maximum size of waitlist 5)


Welcome to the Course Registration system for the following course.
Introduction to Python
----------------------------
1 enrolled (Maximum size of class 5)
	Klay Thompson (1111)
0 on waitlist (Maximum size of waitlist 5)

What action would you like to take
1 to add a student
2 to drop a student
3 to print the course
4 to exit
```


