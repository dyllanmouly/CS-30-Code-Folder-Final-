import java.util.ArrayList;
import java.util.Scanner;

public class adventure {
    
    static int choice2;

    public static int kingsCall(){
        Scanner keys = new Scanner(System.in);
        System.out.println("You set out towards the King's castle. [Enter]");
        keys.nextLine();
        System.out.println("You arrive at the castle and open the giant double doors that separate you from the throne room. [Enter]");
        keys.nextLine();
        System.out.println("King: 'Hello adventurer!' \n      'I have called you here because there is a great evil in our lands.' \n      'This evil is a powerful dragon who has awoken recently.' \n      'You will have to find the 3 legendary warrior pieces to be able to defeat him.' \n      'However, and these pieces are scattered across the land.' [Enter]");
        keys.nextLine();
        System.out.println("King: 'You need to find the Legendary Sword of Flame, hidden in the volcano up north.' \n      'The Shield of Water, hidden in the deep lake to the east.' \n      'And the Rock Armor, hidden in the desert to the west.' [Enter]");
        keys.nextLine();
        System.out.println("King: 'The Dragon's Lair is to the south, you'll have to go there after collecting all the warrior pieces.' \n      'I wish you luck brave warrior, please save our kingdom!' [Enter]");
        keys.nextLine();
        System.out.println("After the King's yap sesh, you leave the castle in search for the warrior pieces. [Enter]");
        keys.nextLine();
        splitpaths();
        return 0;
    }

    public static int splitpaths(){
        Scanner keys = new Scanner(System.in);
        System.out.println("You stumble upon the crossroads. [Enter]");
        keys.nextLine();
        System.out.println("This is where you will take your first step on your adventure. [Enter]");
        keys.nextLine();
        System.out.println("You can go 4 ways. [1] North, [2] East [3] South, [4] West. Which will you choose? ");
        choice2 = keys.nextInt();
        if (choice2 == 1){
            volcanoStart();
        }
        if (choice2 == 2){
            lakeStart();
        }
        if (choice2 == 3){
            dragonStart();
        }
        if (choice2 == 4){
            desertStart();
        }
        else{
            System.out.println("You got confused and ended up walking in a circle. Try again? [Enter]");
            keys.nextLine();
            splitpaths();
        }
        return 0;
    }

    public static int volcanoStart(){
        Scanner keys = new Scanner(System.in);
        System.out.println("volcantio");
        keys.nextLine();
        return 0;
    }
    public static int lakeStart(){
        Scanner keys = new Scanner(System.in);
        System.out.println("klake ");
        keys.nextLine();
        return 0;
    }
    public static int dragonStart(){
        Scanner keys = new Scanner(System.in);
        System.out.println("dargon");
        keys.nextLine();
        return 0;
    }
    public static int desertStart(){
        Scanner keys = new Scanner(System.in);
        System.out.println("desert");
        keys.nextLine();
        return 0;
    }

    // public void beforedragonFight()
    // {
    //     Scanner keys = new Scanner(System.in);
    //     System.out.println("You arrive at the dragons gate--feeling pumped you then stop yourself just to make sure if you are fully equipped.");
    //     keys.nextLine();
    //     System.out.println("You are currently equipped with:" + CurrentlyEquippedList + "\n With these items, do you feel ready to fight and slay the dragon? \n (You cannot go back, unless you want to be executed for being a coward). [1]");
    //     keys.nextLine();
    //     System.out.println("Very well, you prepare yourself as you open death doors of the dragon. From here on out, you feel courageous, a warrior who will save the Kingdom of Pernk. \n You feel Dragon-Hearted.");
    // }
    
    // public void dragonFight()
    // {
    //     Scanner keys = new Scanner(System.in);
    //     if (CurrentlyEquippedList == 3){
    //         System.out.println("You enter the Dragon's Den and begun your battle. You took hard hits and did the same to the dragon. \n You moved swiftly to dodge the dragons attack and attacked it from weak areas. \n Finally, the dragon was heavily injured and tired and so were you, so you took this one chance and. . . \n Slayed the dragon ocne and for all!");

    //     }
    // }
}