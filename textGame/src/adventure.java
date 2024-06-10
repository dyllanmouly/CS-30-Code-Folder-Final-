import java.util.ArrayList;
import java.util.Scanner;

public class adventure {

    static int choice2, choiceD1, choiceD2, choiceD3, choiceD4, itemsequipped, CurrentlyEquippedList, itemsbag;

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
        System.out.println("You decide to head north, and you find yourself standing at the base of the Volcano. [Enter]");
        keys.nextLine();
        System.out.println("You try to recall the King's words, and remember that the Sword of Flame is located here. [Enter]");
        keys.nextLine();
        System.out.println("He didn't tell you where though. [Enter]");
        keys.nextLine();
        volcanoCont1();
        return 0;
    }
    public static int volcanoCont1(){
        
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
        System.out.println("You decided to go West and find yourself in the Desert. [ENTER]");
        keys.nextLine();
        System.out.println("You recalled the king's words as he said the [Rock Armor] would be in here. [ENTER]");
        keys.nextLine();
        System.out.println("But because of his alzheimers, He didn't tell where. So you are forced to look at every spot in the desert while being attacked by the suns heat. [ENTER]");
        keys.nextLine();
        System.out.println("From afar, you see a temple and you are curious to see what treasures lies within. [ENTER]");
        keys.nextLine();
        System.out.println("Do you plan to go towards the temple? or keep searching around your area. [1] [2]");
        choiceD1 = keys.nextInt();
        if (choiceD1 == 1){
            desertcont1();
        }
        if (choiceD1 == 2){
            System.out.println("You decide to not go to the temple as you believe there are more treasures lurking around in your area.");
            keys.nextLine();
            System.out.println("Unfortunately, your travels around the area has caused you to be de-hydrated due to the heat, which in turn leads you to your death. Great choice of action Hero. \n Ending 6: [Dehydration]");
        }
        return 0;
    }
    public static int desertcont1()
    {
        Scanner keys = new Scanner(System.in);

        System.out.println("You decide to continue forward to the temple and investigate its treasures. [ENTER]");
        keys.nextLine();
        System.out.println("You enter the temple and see colored blocks on the ground, alongside small pillars on the side. [ENTER]");
        keys.nextLine();
        System.out.println("The middle colored group stands out the most to you. It looks raggid, cracked, and has holes, which at a closer look, leads into something deeper below. [ENTER]");
        keys.nextLine();
        System.out.println("It seems that you need to break the ground as it will unvail more treasures, do you break the block? [1] [2]");
        choiceD2 = keys.nextInt();
        if (choiceD2 == 1){
            System.out.println("You decided to break the ground knowing the risk for breaking your legs as you land. [ENTER]"); 
            keys.nextLine();
            System.out.println("You look down and see a TRAP! pressure plate waiting to be stepped on the ground. With your quick thinking, you quickly move to the side and land safely out of the plates reach. [ENTER]");
            desertcont2();
        }
        if (choiceD2 == 2){
            System.out.println("You decided to break the ground knowing the risk for breaking your legs as you land. [ENTER]"); 
            keys.nextLine();
            System.out.println("You look down and see a TRAP! pressure plate waiting to be stepped on the ground. \n You were too late to move to the side and you explode instantly the moment you landed on the pressure plate. \n Ending 7: [metro-booming make it boom]\n \n ");
        }
        return 0;

    }
    public static int desertcont2()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("You find yourself underneath the grounds of the temple after landing, there lies 4 chests in every side. [ENTER]");
        keys.nextLine();
        System.out.println("You assume one of these chests will have the treasure, which chest do you for first? [1] [2] [3] [4]");
        choiceD3 = keys.nextInt();
        if (choiceD3 == 1){
            System.out.println("You open the chest on your left and uncover. . . Cobwebs, Dust, Pieces of ripped fabric and nothing more. Disappointing one to say.");
            desertcont2();
        }
        if (choiceD3 == 2){
            System.out.println("You open the chest on your right and uncover. . . A small Dyllan Mouly plushie ready to screw you up. You exploded instantly on the spot. GG ");
            keys.nextLine();
            System.out.println("Ending 8: [get pernked asshat lol by: Dyllan Mouly]");
        }
        if (choiceD3 == 3){
            System.out.println("You open the chest infront of you and uncover. . . A piece of paper, sticks, a small bone and a broken rod. Another dentrimented chest. Lets try again. [ENTER]");
            desertcont2();
        }
        if (choiceD3 == 4){
            System.out.println("You open the chest behind you and uncover. . . The Rock Armor! This is the armor piece that the king was talking about. [ENTER]");
            keys.nextLine();
            System.out.println("You grabbed the armor piece and climbed yourself out of the hole, and out towards the crossroads to contine your adventure.");
            splitpaths();
        }
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
            System.out.println("You enter the Dragon's Den and begun your battle. You took hard hits and did the same to the dragon. \n You moved swiftly to dodge the dragons attack and attacked it from weak areas. \n Finally, the dragon was heavily injured and tired and so were you, so you took this one chance and. . . \n Slayed the dragon ocne and for all! [Enter]");
            keys.nextLine();
            System.out.println("Pernk Badge achieved: [Pernk's Greatest Hero]");
    
            
        }
        else{
            System.out.println("You enter the Dragon's Den and begun your battle. You took hard hits and did the same to the dragon. \n You moved swiftly to dodge the dragons attack and attacked it from weak areas. \n Finally, the dragon was heavily injured and tired and so were you, so you took this one chance and. . . \n Died in a gruesome death in the arena. [Enter]");
            
        }
        
    }
}