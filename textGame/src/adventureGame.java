import java.util.ArrayList;
import java.util.Scanner;
public class adventureGame {

    static int choice1, itemsequipped, CurrentlyEquippedList, itemsbag;
    public static void main(String[] args) throws Exception {
        adventure run = new adventure();


        Scanner keys = new Scanner(System.in);
        System.out.println("You are a brave adventurer in the Kingdom of Pernk. [ENTER]");
        keys.nextLine();
        System.out.println("One day, you are called down by the King to go on an important quest. Do you: [1] Answer the King's Call? [2] Go back to bed? ");
        choice1 = keys.nextInt();
        if (choice1 == 1){
            run.kingsCall();
            
        }
        if (choice1 == 2){
            System.out.println("You decided to stay in bed. You thought that fighting was too much work, and you needed your beauty sleep. [ENTER]");
            keys.nextLine();
            System.out.println("Ending 11/11: [Sleepy]"); //ENDING
            keys.nextLine();
            System.exit(0);
        }
    }

}
