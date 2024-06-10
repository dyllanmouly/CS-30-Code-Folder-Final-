import java.util.ArrayList;
import java.util.Scanner;
public class adventureGame {

    static int choice1, itemsequipped, CurrentlyEquippedList, itemsbag;
    public static void main(String[] args) throws Exception {
        adventure run = new adventure();


        Scanner keys = new Scanner(System.in);
        System.out.println("You are a brave adventurer in the Kingdom of Pernk. [Enter]");
        keys.nextLine();
        System.out.println("One day, you are called down by the King to go on an important quest. Do you: [1] Answer the King's Call? [2] Go back to bed? ");
        choice1 = keys.nextInt();
        if (choice1 == 1){
            run.kingsCall();
            
        }
        if (choice1 == 2){
            System.out.println("You decided to stay in bed. You thought that fighting was too much work, and you needed your beauty sleep.");
            keys.nextLine();
            System.out.println("Ending 1/6: [Sleepy]");
        }
    }
    public static int playersstuff()
    {
        adventure run = new adventure();

        if (itemsequipped == 3){
            Scanner keys = new Scanner(System.in);
            System.out.println("You were fully equipped and after a long fight, you have slain the dragon. \n The Townspeople have commended your actions and you are awarded a title named: \n [Valiant Hero].");
            keys.nextLine();
            System.out.println("Ending 2/6: [Hero of Pernk]");
            run.dragonFight();


    

        }
        else if (itemsequipped < 3){
            Scanner keys = new Scanner(System.in);
            System.out.println("You were not fully equipped; but decided to go to battle anyway. \n You fought bravely but ultimately lost and because of that... \n The townspeople and their village are destroyed.");
            keys.nextLine();
            System.out.println("Ending 3/6: [Fallen Warrior]");
            run.dragonFight();
        }
        return CurrentlyEquippedList;
    }
}
