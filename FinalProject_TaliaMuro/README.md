# Student Manager System

## Overview
The Student Manager System is a Java-based program that allows users to manage student records effifiently through a 
graphical user interface (GUI). It provides functionalities to perform the following operations:
  - Add new students
  - Search student by id or name
  - Display all students
  - Save student data to a file
  - Load student data from a file

## Setup Instructions
1. IDE
   - User must use a Java-supported IDE to run this application (IntelliJ Idea, Eclipse, etc.).
2. JavaFX
   - User must ensure JavaFX is configured for their environment.
3. Git
   - User must clone this repository <https://github.com/taliamuro/FinalProject_TaliaMuro.git> and open it in their IDE.
4. Run
   - User must run this program from the StudentManagerController class.

## Usage Guidelines
Graphical User Interface (GUI) Features:
1. Add a student:
   - Enter the student's name, ID, and GPA (all fields must be filled).
   - Click the "Add Student" button.
   - The student will appear in the TableView.
2. Search student by ID:
   - Enter the student's ID in the ID field.
   - Click the "Search by ID" button.
   - If a student with that ID exists, it will appear in the TableView.
3. Search student by partial name:
   - Enter part of a student's name in the name field.
   - Click the "Search by name button".
   - If student(s) with the partial name provided exist, they will appear in the TableView.
4. Display all students:
   - Click the "Display All Students" button.
   - All students that are the in system will appear in the TableView.
5. Save data to a file:
   - Click the "Save Data" button.
   - Enter a file name.
   - Data will be saved to the specified file if it does not already exist.
6. Load data from a file:
   - Click the "Load Data" button.
   - Enter the name of the file you wish to load data from.
   - The data from that file will appear in the TableView if it exists.

## Person Class
- Purpose: Abstract base class for all subclasses representing a person.
- Attributes: String name
- Methods:
  - getDescription()

## Student Class
- Purpose: Represents a student, extends Person.
- Attributes: int id, double gpa
- Methods:
  - getDescription()

## StudentManager Class
- Purpose: Manages file operations and implements FileHandler.
- Methods:
  - addStudent(Student student)
  - removeStudentsaveToFile()
  - searchStudentById(int id) throws StudentNotFoundException
  - saveToFile(String fileName, ObservableList<Student> students)
  - loadFromFile(String fileName, ObservableList<Student> tempStudents) throws IOException

## FileHandler Interface
- Purpose: Interface for file operations
- Methods:
  - saveToFile(String fileName, ObservableList<Student> students)
  - loadFromFile(String fileName, ObservableList<Student> tempStudents) throws IOException

## StudentManagerApplication Class
- Purpose: Handles user interactions
- Methods:
  - addStudent()
  - searchById()
  - searchByName()
  - displayAllStudents()
  - saveData()
  - loadData()

## StudentManagerController Class
- Purpose: Where user runs the program from.
- Methods:
  - start(Stage primaryStage): Initializes the GUI.

## StudentNotFoundException Class
- Purpose: Custom exception thrown when a student is not found during a search.

## FXML File
The FXML file that is derived from the Scene Builder application is used by the StudentApplication class to generate the
code for the GUI.