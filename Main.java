import java.util.ArrayList;
import java.util.Scanner;

/*____________________________________________________________________________________________________________________________ */

//Create packages according to these class categories when done.
//complete the whole program in the main class first.
class Vars{
    //Shift variables to this class once done.

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


class Main{

/*____________________________________________________________________________________________________________________________ */

    /*List of tasks of User has to complete in order to Score points */
    static ArrayList <String> Tasks= new ArrayList<>();

/*____________________________________________________________________________________________________________________________ */

    /*Users Score that will be used to user level */
    static int Score;

/*____________________________________________________________________________________________________________________________ */
    
    public static void AddTask(String Task){
        /*Adds A task to the Task ArrayList and prints the taskList */
        Tasks.add(Task);
        System.out.print("The Updated Task List: "+Tasks);
    }

/*____________________________________________________________________________________________________________________________ */


    public static void Cancle(String Task){
        /*Cancles task incase user created a task by mistake */

        System.out.println("Task"+"Add the taskName here"+"Cancled");
    }

/*____________________________________________________________________________________________________________________________ */

    public static void Done(int TaskIndex){
        /*Deletes the task from the list, prints new score*/
        Tasks.remove(TaskIndex);
        Score += 5;
        System.out.println("Remaining Tasks: "+Tasks);
        System.out.println("Congratulations, you Scored 5 points, Here's your current Score: "+Score);
    }

/*____________________________________________________________________________________________________________________________ */

    public static void main(String[] args){
        /* Main Function */

        Scanner sc=new Scanner(System.in);
        
/*____________________________________________________________________________________________________________________________ */

        /* Make a Function of this  */

        /*Ask user to choose a functionality */
        System.out.print("Choose a functionality, AddTask to add, Done to complete a task: ");
        

        switch (sc.nextLine()){

            /* Switch to User's choice of functionality. */

            case "AddTask":
                System.out.println("Enter a task to add to the TaskList: ");
                AddTask(sc.nextLine());
                break;
                
            case "DoneTask":
                System.out.println("Enter the Task.no you just completed: ");
                Done((int)sc.nextInt()-1);
                System.out.println("Congratulations You earned 5 points, Your Current score: "+Score);
                
            break;

            default:
                System.out.println("Error: Functionality not found!");
                break;
        }

/*____________________________________________________________________________________________________________________________ */

            /*Close the scanner in the end of the program to release memory */
            //Find out about Write a code to close the scanner object 'sc'

/*____________________________________________________________________________________________________________________________ */
        
    }
}