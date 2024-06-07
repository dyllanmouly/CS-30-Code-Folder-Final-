import java.util.ArrayList;
import java.util.Scanner;

public class adventure {
    

    public static int kingsCall(){
        Scanner keys = new Scanner(System.in);
        System.out.println("You set out towards the King's castle. [Enter]");
        keys.nextLine();
        System.out.println("You arrive at the castle and open the giant double doors that separate you from the throne room. [Enter]");
        keys.nextLine();
        return 0;
        
    }


    public void beforedragonFight()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("You arrive at the dragons gate--feeling pumped you then stop yourself just to make sure if you are fully equipped.");
        keys.nextLine();
        System.out.println("You are currently equipped with:" + CurrentlyEquippedList + "\n With these items, do you feel ready to fight and slay the dragon? \n (You cannot go back, unless you want to be executed for being a coward). [1]");
        keys.nextLine();
        System.out.println("Very well, you prepare yourself as you open death doors of the dragon. From here on out, you feel courageous, a warrior who will save the Kingdom of Pernk. \n You feel Dragon-Hearted.");
    }
    public void dragonFight()
    {
        Scanner keys = new Scanner(System.in);
        if (CurrentlyEquippedList == 3){
            System.out.println("You enter the Dragon's Den and begun your battle. You took hard hits and did the same to the dragon. \n You moved swiftly to dodge the dragons attack and attacked it from weak areas. \n Finally, the dragon was heavily injured and tired and so were you, so you took this one chance and. . . \n Slayed the dragon ocne and for all!");

        }

    }
}