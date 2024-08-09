import java.util.ArrayList;
import java.util.Scanner;

// Always document all the changes made here:

// To be Complete:
//1. Complete RetRank functionality.
//2. Add A Missed task functionality Below cancle functionality.
//3. Find some solution to Quit the Main Loop.
//3. Close the scanner in the end of the program to release memory.
//4. Find out about Write a code to close the scanner object 'sc'

// Notes: 
// Complete "ChooseFunctionality" as well as you go on adding functionalities

// Done:
// Adding the main loop and using the choose functionality made using switch case statement.



/*____________________________________________________________________________________________________________________________ */

//Create packages according to these class categories when done.
//complete the whole program in the main class first.
class Vars{
    //Shift variables to this class once done.
    // And
    // Make them Private

}

/*____________________________________________________________________________________________________________________________ */

class Choose{
    //Shift the code for user choice here.
    
}

/*____________________________________________________________________________________________________________________________ */

class Controls extends Vars{
    //Shift the controls/Functionalities here once done.

}

/*____________________________________________________________________________________________________________________________ */

class IterateOverTasks extends Vars{

    public static void PrintTasks(ArrayList<String> Tasks){
        for(String task : Tasks){
            System.out.print(task+" ");
        }
    }
}
/*____________________________________________________________________________________________________________________________ */


class Main{

    /* Main Function */
    public static void main(String[] args){
        
        // Main loop;
        while(true){
            
        //to "Choose a functionality" and keep on recording Added/Removed/Completed/Missed tasks
            ChooseFunctionality();

        }

/*____________________________________________________________________________________________________________________________ */

            

/*____________________________________________________________________________________________________________________________ */
        
    }

/*____________________________________________________________________________________________________________________________ */

    /*List of tasks of User has to complete in order to Score points */
    static ArrayList <String> Tasks= new ArrayList<>();

/*____________________________________________________________________________________________________________________________ */

    /*Users Score that will be used to user level */
    static int Score;

/*____________________________________________________________________________________________________________________________ */
    
    public static void AddTask(String Task){
        /*Adds A task to the Task ArrayList and prints it */
        Tasks.add(Task);
        System.out.print("The Updated Task List: "+Tasks);
    }

/*____________________________________________________________________________________________________________________________ */


    public static void Cancle(String Task){
        /*Cancles task incase user created a task by mistake */

        System.out.println("Task"+"Add the taskName here"+"Cancled");
    }
/*____________________________________________________________________________________________________________________________ */

// Add A Missed task functionality here.

/*____________________________________________________________________________________________________________________________ */

    public static void Done(int TaskIndex){
        /*Deletes the task from the list, prints new score*/
        Tasks.remove(TaskIndex);
        Score += 5;
        System.out.println("Remaining Tasks: "+Tasks);
        System.out.println("Congratulations, you Scored 5 points, Here's your current Score: "+Score);
    }

/*____________________________________________________________________________________________________________________________ */

    // Return Rank - Returns(for now prints the Sololeveling Rank of the user)
    public static void RetRank(int score){

        switch(score){
            case 100:
                // The print statements here will be removed when making GUI
                System.out.println("E Rank Sololearner");
                break;
            case 200:
                System.out.println("D Rank Sololearner");
                break;
            case 300:
                System.out.println("B Rank Sololearner");
                break;
            default:
                System.out.println("Try. try, but, don't Cry, Buddy!");
        }
    }

/*____________________________________________________________________________________________________________________________ */

    public static void ChooseFunctionality(){
        
        
                /* A Scanner object to get User's Choice of Functionality:  */
                Scanner sc=new Scanner(System.in);
                /*Ask user to choose a functionality */
                System.out.println("Choose a functionality, ");
                System.out.println("AddTask to add, DoneTask to complete, Cancle to cancle a task: ");
        
                switch (sc.nextLine()){
        
                    /* Switch to User's choice of functionality. */

                    // Complete this function as well as you go on adding functionalities

                    // 
                    case "AddTask":
                        System.out.println("Enter a task to add to the TaskList: ");
                        AddTask(sc.nextLine());
                        
                    break;
                        
                    case "DoneTask":
                        System.out.println("Enter the Task.no you just completed: ");
                        Done((int)sc.nextInt()-1);
                        //This println is temperorary:{ I have to print rank here and remaining score to the next rank. }
                        System.out.println("Congratulations You earned 5 points, Your Current score: "+Score);
                        
                    break;
                    
                    case "Quit":
                        System.out.println("Thanks for using my program: Yash Thale ");
                        // Add something to Quit the Main Loop
                    break;

                    default:
                        System.out.println("Error: Functionality not found!");
                    break;
                    
                }
                
        
    }

/*____________________________________________________________________________________________________________________________ */

    
}