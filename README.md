GYM MEMBERSHIP MANAGEMENT SYSTEM
Project Proposal
SECJ2154 OBJECT ORIENTED PROGRAMMING
Session: [Your Session/Year]
Section: [Your Section]

Team Members Information
Name
Matric Number
Role
[Team Member 1]
[Matric No.]
Team Leader
[Team Member 2]
[Matric No.]
Member
[Team Member 3]
[Matric No.]
Member

Lecturer: [Lecturer Name]

1.0 Introduction
1.1 Background
The fitness industry has experienced significant growth as more individuals prioritize health and wellness. Gym facilities require efficient systems to manage their operations, including member registrations, class schedules, trainer assignments, and payment processing. A comprehensive Gym Membership Management System is essential to streamline these processes and enhance both member experience and administrative efficiency.
1.2 Problem Statement
Traditional gym management often involves manual record-keeping, leading to inefficiencies such as:
Difficulty tracking member attendance and membership status
Challenges in scheduling classes and managing trainer availability
Lack of centralized feedback collection from members
Time-consuming payment and membership renewal processes
Limited reporting capabilities for business insights
1.3 Proposed Solution
The Gym Membership Management System is a Java-based application designed to address these challenges by providing a centralized platform where:
Administrators can manage members, trainers, classes, and generate comprehensive reports
Trainers can view their assigned classes, manage schedules, and track member progress
Members can register for memberships, enroll in classes, provide feedback, and track their fitness journey
1.4 Objectives
The main objectives of this system are:
Implement encapsulation concepts to ensure data security and integrity
Demonstrate class relationships including association, aggregation, composition, and inheritance
Apply polymorphism for flexible system behavior
Utilize interfaces for standardized contract implementation
Implement exception handling for robust error management
Create a user-friendly command-line interface for all user roles
1.5 Scope
The system will support three main user roles:
Administrator: Full system access with management and reporting capabilities
Trainer: Access to class schedules, member lists, and performance tracking
Member: Access to membership information, class enrollment, and feedback submission

2.0 List of Suggested Functions
2.1 Administrator Functions
Member Management
Add new members to the system
View all registered members
Update member information
Delete/deactivate members
Search members by ID or name
Trainer Management
Add new trainers with specialization
View all trainers and their schedules
Update trainer information
Assign trainers to classes
Remove trainers from the system
Class Management
Create new fitness classes (Yoga, Spinning, CrossFit, etc.)
Set class schedules and capacity limits
Assign trainers to classes
View class enrollment status
Cancel or modify classes
Membership Plan Management
Define membership tiers (Basic, Premium, VIP)
Set pricing and duration for each tier
View active membership plans
Feedback Management
View feedback submitted by members
Sort feedback by rating (ascending/descending)
Filter feedback by class or trainer
Export feedback for analysis
Report Generation
Generate member reports (attendance, active memberships)
Generate class reports (enrollment, revenue)
Generate trainer reports (classes taught, member ratings)
Generate revenue reports by membership tier
Sort reports by various criteria
Payment Processing
Record membership payments
Track payment history
Generate payment receipts
2.2 Trainer Functions
Profile Management
View personal information
Update contact details and specialization
Class Management
View assigned classes
View enrolled members for each class
Mark member attendance
Add class notes or announcements
Member Progress Tracking
View members attending their classes
Track member performance (optional)
2.3 Member Functions
Profile Management
Register for gym membership
View personal membership information
Update contact information
Change password
Membership Operations
View available membership plans
Select and purchase membership tier
View membership status and expiry date
Renew membership
Class Enrollment
Browse available fitness classes
View class schedules and trainer information
Enroll in classes (if capacity available)
Withdraw from enrolled classes
View personal class schedule
Feedback System
Submit feedback for attended classes
Rate classes and trainers (1-5 stars)
Provide written comments
Attendance Tracking
View personal attendance history
Check check-in status for classes

3.0 Class Description Diagram
3.1 Core Classes
3.1.1 Person (Abstract Class)
Attributes: personID, name (Name object), phoneNo, email, password
Methods: Abstract methods for login validation, profile display
Purpose: Base class for Admin, Trainer, and Member
3.1.2 Name (Component Class)
Attributes: firstName, lastName
Methods: getFullName(), setFirstName(), setLastName()
Relationship: Composition with Person
3.1.3 Admin (extends Person)
Attributes: adminID, memberList, trainerList
Methods: addMember(), removeMember(), addTrainer(), removeTrainer(), generateReport(), manageFeedback()
Relationships: Association with Member, Trainer, GymClass
3.1.4 Trainer (extends Person)
Attributes: trainerID, specialization, certifications, assignedClasses
Methods: viewSchedule(), markAttendance(), viewEnrolledMembers()
Relationships: Association with GymClass
3.1.5 Member (extends Person)
Attributes: memberID, membershipTier, joinDate, expiryDate, enrolledClasses, attendanceHistory
Methods: registerMembership(), enrollClass(), withdrawClass(), submitFeedback(), viewSchedule()
Relationships: Association with GymClass, Feedback, MembershipPlan
3.1.6 GymClass
Attributes: classID, className, schedule, capacity, enrolledCount, trainer, enrolledMembers, feedbackList
Methods: addClass(), removeClass(), addMember(), removeMember(), checkCapacity()
Relationships: Association with Trainer, Member; Aggregation with Feedback
Implements: Chargeable interface
3.1.7 MembershipPlan (implements Chargeable)
Attributes: planID, planName, duration, price, benefits
Methods: calculateCharge(), displayPlanDetails()
Relationship: Association with Member
3.1.8 Feedback
Attributes: feedbackID, member, gymClass, rating, comment, date
Methods: submitFeedback(), displayFeedback()
Implements: RatingComparator interfaces
3.1.9 Payment
Attributes: paymentID, member, amount, paymentDate, paymentType, receiptNo
Methods: processPayment(), generateReceipt(), validatePayment()
Relationship: Association with Member
3.1.10 Report (Abstract Class)
Attributes: reportID, reportDate, reportType
Methods: abstract generateReport(), abstract displayReport()
Implements: IDComparator interfaces
3.1.11 MemberReport (extends Report)
Attributes: member, attendanceCount, enrolledClasses
Methods: generateReport(), displayReport()
Relationship: Aggregation with Member
3.1.12 ClassReport (extends Report)
Attributes: gymClass, enrollmentCount, revenue, averageRating
Methods: generateReport(), displayReport()
Relationship: Aggregation with GymClass
3.1.13 TrainerReport (extends Report)
Attributes: trainer, classesTaught, totalMembers, averageRating
Methods: generateReport(), displayReport()
Relationship: Aggregation with Trainer
3.2 Interface Classes
3.2.1 Chargeable
Methods: calculateCharge()
Implemented by: GymClass, MembershipPlan
3.2.2 IDComparator (Ascending/Descending)
Methods: compare()
Implemented by: Report subclasses
3.2.3 RatingComparator (Ascending/Descending)
Methods: compare()
Implemented by: Feedback
3.3 OOP Concepts Implementation
Encapsulation: All classes use private attributes with getter/setter methods
Association:
Admin manages Members and Trainers
Member enrolls in GymClass
Trainer teaches GymClass
Aggregation:
Report contains Member/GymClass/Trainer information
GymClass contains Feedback
Composition:
Person has Name (strong ownership)
Inheritance:
Admin, Trainer, Member extend Person
MemberReport, ClassReport, TrainerReport extend Report
Polymorphism:
Overridden methods: displayReport(), calculateCharge()
Interface & Implements:
Chargeable, IDComparator, RatingComparator
Exception Handling:
FileNotFoundException for data persistence
IOException for file operations
Custom exceptions for invalid operations

4.0 Basic Command-Line Interaction Design
4.1 Main Menu

================================
GYM MEMBERSHIP MANAGEMENT SYSTEM
================================
Select Your Role:
1. Administrator
2. Trainer
3. Member
4. Exit
   Enter choice: _

4.2 Administrator Flow
4.2.1 Admin Login

================================
ADMINISTRATOR LOGIN
================================
Enter Admin ID: _
Enter Password: _

[If successful]
Login successful! Welcome, Admin [Name]

4.2.2 Admin Main Menu

================================
ADMINISTRATOR MENU
================================
1. Member Management
2. Trainer Management
3. Class Management
4. Membership Plan Management
5. Feedback Management
6. Report Generation
7. Logout
   Enter choice: _

4.2.3 Member Management Submenu

================================
MEMBER MANAGEMENT
================================
1. Add New Member
2. View All Members
3. Search Member
4. Update Member Information
5. Delete Member
6. Back to Main Menu
   Enter choice: _

Example - Add New Member:

Enter Member ID: M001
Enter First Name: John
Enter Last Name: Doe
Enter Phone Number: 012-3456789
Enter Email: john.doe@email.com
Enter Password: ********

Member added successfully!

4.2.4 Report Generation Submenu

================================
REPORT GENERATION
================================
1. Member Reports
2. Class Reports
3. Trainer Reports
4. Revenue Reports
5. Back to Main Menu
   Enter choice: _

Example - Member Report:

================================
MEMBER REPORT - M001
================================
Name: John Doe
Membership: Premium
Status: Active
Join Date: 2025-01-01
Expiry Date: 2025-12-31
Enrolled Classes: 5
Total Attendance: 23 sessions
================================

4.3 Trainer Flow
4.3.1 Trainer Login

================================
TRAINER LOGIN
================================
Enter Trainer ID: _
Enter Password: _

4.3.2 Trainer Main Menu

================================
TRAINER MENU
================================
1. View Profile
2. View My Schedule
3. View Class Roster
4. Mark Attendance
5. Logout
   Enter choice: _

4.3.3 View Class Roster

================================
CLASS: YOGA BASICS (C001)
================================
Schedule: Monday, 9:00 AM
Capacity: 20 members
Enrolled: 15 members

Enrolled Members:
1. M001 - John Doe
2. M002 - Jane Smith
3. M003 - Mike Johnson
   ...
   ================================

4.4 Member Flow
4.4.1 Member Main Menu (First Time)

================================
WELCOME TO GYM MEMBERSHIP SYSTEM
================================
1. Register New Membership
2. Login
3. Back to Main Menu
   Enter choice: _

4.4.2 Member Registration

================================
MEMBER REGISTRATION
================================
Enter First Name: _
Enter Last Name: _
Enter Phone Number: _
Enter Email: _
Create Password: _

Select Membership Plan:
1. Basic - RM 50/month
    - Access to gym equipment
    - 2 classes per month

2. Premium - RM 100/month
    - Access to gym equipment
    - Unlimited classes
    - Free personal training session

3. VIP - RM 200/month
    - All Premium benefits
    - Priority class booking
    - Nutrition consultation

Enter choice: _

Registration successful! Your Member ID is: M015

4.4.3 Member Dashboard

================================
MEMBER DASHBOARD
================================
Welcome, [Member Name]!
Membership: Premium
Status: Active
Expiry Date: 2025-12-31

1. View Profile
2. Browse Classes
3. My Class Schedule
4. Submit Feedback
5. View Attendance History
6. Renew Membership
7. Logout
   Enter choice: _

4.4.4 Browse Classes

================================
AVAILABLE CLASSES
================================
1. Yoga Basics (C001)
   Trainer: Sarah Lee
   Schedule: Mon/Wed/Fri, 9:00 AM
   Capacity: 15/20
   Fee: RM 10/session

2. CrossFit Advanced (C002)
   Trainer: Mike Chen
   Schedule: Tue/Thu, 6:00 PM
   Capacity: 20/20 (FULL)
   Fee: RM 15/session

3. Spinning Class (C003)
   Trainer: Lisa Wong
   Schedule: Mon/Wed, 7:00 PM
   Capacity: 8/15
   Fee: RM 12/session

Enter class number to enroll (0 to go back): _

4.4.5 Submit Feedback

================================
SUBMIT FEEDBACK
================================
Your Attended Classes:
1. Yoga Basics
2. Spinning Class

Select class: 1

Rate the class (1-5 stars): 5
Rate the trainer (1-5 stars): 5

Enter your comments:
_

Feedback submitted successfully!
Thank you for your feedback.

4.5 Error Handling Examples

Error: Member ID already exists!
Error: Class is full. Cannot enroll.
Error: Membership has expired. Please renew.
Error: Invalid login credentials.
Error: File not found. Creating new data file...


5.0 Expected Deliverables
Complete Java source code with proper documentation
UML Class Diagram showing all relationships
Use Case Diagram
User Manual with step-by-step instructions
Test cases and results
Project demonstration

6.0 Development Timeline
Week
Task
1
Requirements analysis and system design
2
Core class implementation (Person, Admin, Member, Trainer)
3
Class and membership management implementation
4
Feedback and report system implementation
5
Testing, debugging, and documentation
6
Final presentation preparation


7.0 Conclusion
The Gym Membership Management System will provide a comprehensive solution for managing gym operations efficiently. By implementing key OOP concepts such as encapsulation, inheritance, polymorphism, and interfaces, the system will be robust, maintainable, and scalable. This project will demonstrate practical application of object-oriented programming principles while addressing real-world business needs in the fitness industry.

