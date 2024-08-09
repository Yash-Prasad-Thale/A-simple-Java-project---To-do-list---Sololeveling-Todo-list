# A-simple-Java-project---To-do-list---Sololeveling-Todo-list

Goal/Introduction: 
This project is started by me in order to motivate myself into studying by making a To-Do list that will help me focus more on studying by converting completing my tasks into a Sololeveling game.

#Type of Application: CommandLine Application.

#Current developments: 
05-08-2024: I am creating the basic functionalities now into a single class.

Process I'm going to follow while making it:
1. Create basic functionalities of a "ToDo List" first in "the main class".
2. To create a leveling system that Categorizes users into different levels of sololeveling(eg. E rank Sololeveler ,D Rank Sololeveler, C Rank Sololeveler, B Rank Sololeveler, A Rank Sololeveler ).
3. Bundle these funtionalities into related classes.
4. Seperate these funtionalities into Packages for reducing code redundancy(confusion), as the program becomes more and more complex.
5. Create a way to store the variable values into a CSV file.
6. Create a way to retrive the data saved in CSV file and reloading it into variables(Using File handling and maybe any library to handle data in the csv file).
7. Try to implement Threading to make the program more snappier.
   

#Technical info:

(i). Variables:
  1. Score: A variable that store's the overall score of the user.
  2. Tasks: A ArrayList that saves tasks(I choose a ArrayList because it is Dynamic in Java).

(ii). Features I have decided to add:
1. I have decided to use a ArrayList as a storage(Temporary){Like a R.A.M. in a computer system.} for "Tasks".
2. A 'AddTask()' function to "Add a task to the To-Do list".
3. A 'Cancle()' function to "Cancle a task incase a user creates a task by mistake".
4. A 'Done()' function to "Mark a task completed and remove it from 'Tasks' and add +5 to user's 'Score'. "
5. A 'MissedTask()' function to "Mark a task as a 'missed task' and remove it deducting -10 from the 'Score' ".
6. A 'FunctChoice()' function to " Get user's choice of functionality {I want to improve it to take a funtionality from sentences user enters using specific keywords.}".
7. A 'SololevelerLevel()' function to implement a leveling into the tasks application{Using "Switch case statements"}.
8. A 'EndOfDay()' funtion to Save the data into a CSV(Commma seperated values) file using some library{I'll work on it in the end.}.

