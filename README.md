Three-Level Password System
Overview
This project implements a Three-Level Password Authentication System in Java to enhance security by combining different authentication techniques. The system consists of:

Textual Password: A standard alphanumeric password.
Graphical Password: Selecting predefined images in a specific sequence.
Behavioral Authentication: Capturing typing behavior as an additional security measure.
The system aims to provide a more secure and user-friendly authentication process, making it more difficult for attackers to gain unauthorized access.

Folder Structure
css
Copy code
ThreeLevelPasswordSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Level1TextualPassword.java
│   │   │   ├── Level2GraphicalPassword.java
│   │   │   ├── Level3BehavioralAuth.java
│   │   │   ├── PasswordSystem.java
│   │   └── resources/
│   │       ├── images/ (optional: store graphical password images here)
│
└── README.md
Features
Level 1: Textual Password Authentication
The user is prompted to input a textual password (e.g., securePassword123).
Level 2: Graphical Password Authentication
The user must enter the correct image sequence (e.g., 1-3-2) as the graphical password.
Level 3: Behavioral Authentication
The user types the word "Authenticate" within a time limit (e.g., 5 seconds). The system checks for both the correctness and typing speed.
How to Run the Project
Prerequisites
Java Development Kit (JDK) installed. You can download it from Oracle's website.
Visual Studio Code with the Java Extension Pack installed.
Setup Instructions
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/ThreeLevelPasswordSystem.git
Open the Project in VS Code:

Open VS Code.
Select File > Open Folder and choose the cloned project folder.
Compile and Run the Program:

Right-click on PasswordSystem.java in the Explorer and select Run Java.
Alternatively, you can compile and run the program from the terminal:
bash
Copy code
javac *.java
java PasswordSystem
Authenticate:

Follow the on-screen instructions to input the three levels of authentication.
Example Walkthrough
Level 1 (Textual Password): Enter the correct password (e.g., securePassword123).
Level 2 (Graphical Password): Enter the correct image sequence (e.g., 1-3-2).
Level 3 (Behavioral Authentication): Type the word "Authenticate" as quickly as possible (under 5 seconds).
If all levels are successfully passed, the system will grant access.

Customization
You can easily customize the authentication system by modifying the following:

Textual Password: Change the password in Level1TextualPassword.java.
Graphical Password Sequence: Adjust the image sequence in Level2GraphicalPassword.java.
Behavioral Timing: Modify the time threshold for typing in Level3BehavioralAuth.java.
Technologies Used
Java: Core language for building the system.
Scanner: For user input.
System: For measuring typing speed in behavioral authentication.
