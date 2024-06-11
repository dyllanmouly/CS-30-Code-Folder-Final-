import java.util.ArrayList;
import java.util.Scanner;

public class adventure {

    static int choice2;
    static int volcanoInjury, huh, choiceV1, choiceV2, choiceV3, choiceV4; //volcano ints
    static int choiceD1, choiceD2, choiceD3; //desert ints
    static int choiceL1, choiceL2, choiceL3; //Lake ints
    static int itemsequipped, CurrentlyEquippedList, itemsbag;
    static int sword, shield, armor;

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
        System.out.println("You decide to head north, and you find yourself standing at the base of the Volcano. [ENTER]");
        keys.nextLine();
        System.out.println("You try to recall the King's words, and remember that the [Legendary Sword of Flame] is located here. [ENTER]");
        keys.nextLine();
        System.out.println("He didn't tell you where though. You sigh, and continue down the road. [ENTER]");
        keys.nextLine();
        System.out.println("You stumble upon a fork in the road. Do you go: [1] Left, or [2] Right? ");
        choiceV1 = keys.nextInt();
            if (choiceV1 == 1){
                volcanoCont1();
            }
            if (choiceV1 == 2){
                volcanoCont1alt();
            }
        return 0;
    }
    public static int volcanoCont1alt(){
        Scanner keys = new Scanner(System.in);
        System.out.println("You decided to go right. [Enter]");
        keys.nextLine();
        System.out.println("You head down the path and come across a dead end. [ENTER]");
        keys.nextLine();
        if (huh == 1){
            System.out.println("Why did you come back down this path? [ENTER]");
            keys.nextLine();
            System.out.println("You stand there for a second, baffled by the fact that it's still a dead end. [ENTER]");
            keys.nextLine();
            System.out.println("As you stand there confused, you feel the ground start to shake. The ground cracks open, revealing a lava pit that you are now falling into. Ending 5: DEAD End. "); //ENDING
        }
        else{
            System.out.println("Disappointed, you turn around and go back down the road. [ENTER]");
            huh++;
            keys.nextLine();
            volcanoStart();
        }
        return 0;
    }

    public static int volcanoCont1(){
            Scanner keys = new Scanner(System.in);
            System.out.println("You decide to go left. [ENTER]");
            keys.nextLine();
            System.out.println("As you continue down the path, you feel the ground start to shake. You look up to see the volcano starting to erupt! [ENTER]");
            keys.nextLine();
            System.out.println("You panic, and start to run faster down the path. [ENTER]");
            keys.nextLine();
            System.out.println("As you run, you look up to see a magma boulder falling from the sky at you. Looks like it's going far. Do you dodge: [1] Left, or [2] Right? ");
            choiceV2 = keys.nextInt();
            if (choiceV2 == 1){
                System.out.println("You dodge to the left, but get hit by the boulder. You dodged right into it you fool. (injury +1) [ENTER]");
                volcanoInjury++;
                keys.nextLine();
                System.out.println("Although you are injured, you keep running. [ENTER]");
                keys.nextLine();
                volcanoCont2();
            }   
            if (choiceV2 == 2){
                System.out.println("You skillfully dodge the falling boulder, and continue running down the path. [ENTER]");
                keys.nextLine();
                volcanoCont2();
            }
            return 0;
        }
    public static int volcanoCont2(){
        Scanner keys = new Scanner(System.in);
        System.out.println("Yet again, you see another boulder fall from the sky. This one seems like it's falling short. Do you dodge: [1] Left, or [2] Right?");
        choiceV3 = keys.nextInt();
            if (choiceV3 == 1){
                System.out.println("You see the boulder falling short and run away from it, avoiding it entirely. [ENTER]");
                keys.nextLine();
                volcanoCont3();
            }
            if (choiceV3 == 2){
                System.out.println("You see the boulder falling short and decide to give it a big hug, but it didn't reciprocate your feelings, deciding to crush you under it's weight. (injury + 1) [ENTER]");
                volcanoInjury++;
                keys.nextLine();
                volcanoCont3();
            }
        return 0;
    }
    public static int volcanoCont3(){
        Scanner keys = new Scanner(System.in);
        System.out.println("You can sense the volcano calming down, but you have one more hurdle. [ENTER]");
        keys.nextLine();
        System.out.println("You see one final boulder. It looks bigger than the rest. Do you dodge: [1] Left, or [2] Right?");
        choiceV4 = keys.nextInt();
            if (choiceV4 == 1){
                System.out.println("You try to run to the left, but the boulder follows you. [ENTER]");
                keys.nextLine();
                System.out.println("You manage to jump out of the way before the boulder falls down, but the shockwave from it hitting the ground knocks you back into a wall. (injury + 1) [ENTER]");
                volcanoInjury++;
                keys.nextLine();
                if (volcanoInjury == 3){
                    System.out.println("As you hit the wall, you break your back, and are stuck there, unable to move. [ENTER] ");
                    keys.nextLine();
                    System.out.println("A little while later, you succumb to your injuries. Ending 4: Rock Eater"); // ENDING
                    keys.nextLine();
                }
                else if(volcanoInjury <= 2){
                    volcanoCont4();
                }
            }
            if (choiceV4 == 2){
                System.out.println("You dodge to the right, but the boulder seems to be falling right on top of you. [ENTER]");
                keys.nextLine();
                System.out.println("You unsheath your sword and prepare. When the boulder is about to fall on top of you, you cut it cleanly in half, both sides of it falling around you. [ENTER]");
                keys.nextLine();
                volcanoCont4();
            }

        return 0; 
    }

    public static void volcanoCont4(){
        Scanner keys = new Scanner(System.in);
        System.out.println("With the volcano's eruption finished, you continue down the path. [ENTER]");
        keys.nextLine();
        System.out.println("After a little while of walking, you find yourself in front of a red temple like building. [ENTER]");
        keys.nextLine();
        System.out.println("You enter the building and look around. [ENTER]");
        keys.nextLine();
        System.out.println("You look straight ahead to see a pedestal with a sword sticking out of it. [ENTER]");
        keys.nextLine();
        if (volcanoInjury >= 2){
            System.out.println("You stumble up the stairs and attempt to pull the sword out . . . [ENTER]");
            keys.nextLine();
            System.out.println(". . . but you fail, your strength not enough after getting hit by all the boulders. [ENTER]");
            keys.nextLine();
            System.out.println("You decide to head back, and try again another day. . . if you feel like it. Ending wtf: Big Ouch"); /// ENDING
        }
        else if (volcanoInjury <= 1){
            System.out.println("You walk up the stair and attempt to pull the sword out . . . [ENTER]");
            keys.nextLine();
            System.out.println(". . . and you succeed, gloriously removing the sword from the pedestal with one clean movement. [ENTER]");
            keys.nextLine();
            System.out.println("You exit the temple and return back to the city, succeeding in collecting one of the legendary warrior pieces.");
            keys.nextLine();
            splitpaths();
        }

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

    public static int lakeStart()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("You venture yourself towards the lakes as told by the king. Somewhere around here, there lies the [Water Shield] as the king foretold. [ENTER]");
        keys.nextLine();
        System.out.println("Then again. . . he didn't tell you where it is. [What a foolish king...] you said to yourself. [ENTER]");
        keys.nextLine();
        System.out.println("You venture deep into the lakes as the water slowly rises towards your waist as you explore more further. [ENTER]");
        keys.nextLine();
        System.out.println("You feel something hit your feet, you stop and think if you should grab it. Do you? [1] [2]");
        choiceL1 = keys.nextInt();
        if (choiceL1 == 1){
            System.out.println("You crouched down to grab whatever it is underwater, you feel a button and you tap on it. . . [ENTER]");
            keys.nextLine();
            System.out.println("You hear the ground rumbling and as such, you stay on guard and look around your surroundings. [ENTER]");
            keys.nextLine();
            System.out.println("Unknowingly, the ground below you was a gate and suddenly; the gates open leaving you to fall quickly. [ENTER]");
            keys.nextLine();
            System.out.println("From below, you see a big mushroom for you to safely land on. [ENTER]");
            keys.nextLine();
            System.out.println("As such, you landed on the mushroom with no injuries. But you stumbled yourself upon a new area, an underground water temple. [ENTER]");
            keys.nextLine();
            System.out.println("The gates above you have closed. Assuming there will be another way to get out of here once you achieve the shield. [ENTER]");
            keys.nextLine();
            LakeCont();
            
        }
        if (choiceL1 == 2){
            System.out.println("");
            System.out.println("You decided to ignore the thump on your foot and continue walking towards deeper into the lakes in the woods. [ENTER]");
            keys.nextLine();
            System.out.println("You continue walking aimlessly, seeming as if you have no guide and no direction to where to go, you just continue walking. [ENTER]");
            keys.nextLine();
            System.out.println("You begin to think how long are these lakes and woods as you continue to walk forward. [ENTER]");
            keys.nextLine();
            System.out.println("... [ENTER]");
            keys.nextLine();
            System.out.println("... [ENTER]");
            keys.nextLine();
            System.out.println("... [ENTER]");
            keys.nextLine();
            System.out.println("Such time has passed and you lost track of time, but your determination to find something atleast when the walking is done burns evermore greater. [ENTER]");
            keys.nextLine();
            System.out.println("Ending: ??? [See you on the other side]"); //ENDING
        }
        return 0;
    }
    public static int LakeCont()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("You see another massive gate infront of you and it requires something for it to be opened. [ENTER]");
        keys.nextLine();
        System.out.println("Maybe what you grabbed earlier from the surface has something to do with it. So you take it out of your pocket and go infront of the gate. [ENTER]");
        keys.nextLine();
        System.out.println("You put the object infront of the gate and it starts brightly glowing as the gate slowly opens at the same time.");
        keys.nextLine();
        System.out.println("You put the bright object down and infront of you, there lies the shield ontop of a stand. [ENTER]");
        keys.nextLine();
        System.out.println("You cautiously walk towards it, thinking there'd be traps in here. . . [ENTER]");
        keys.nextLine();
        System.out.println("But to a surprise, there was none. You sighe a relief and picked up the shield. [ENTER]");
        keys.nextLine();
        System.out.println("BUT!!!!! [ENTER]");
        keys.nextLine();
        System.out.println("The whole place starts to rumble and shaking violently as its about to collapse! [ENTER]");
        keys.nextLine();
        System.out.println("[  youre shitting with me right now ._.  ] as you said to yourself, but no time for that you began to run towards the mushroom. [ENTER]");
        keys.nextLine();
        System.out.println("You jump infront of the mushroom and you suddenly get boosted up very high in the sky, the gates from the surface were also opened but were rapidly closing. [ENTER]");
        keys.nextLine();
        System.out.println("You BARELY make it through as the gates close tight behind you, as you fly into the air, you fall and crash down towards the water, leaving you very drenched. [ENTER]");
        keys.nextLine();
        System.out.println("You get up and fix yourself, and now you have the shield on your left hand. [ENTER]");
        keys.nextLine();
        System.out.println("It is time to head back to the crossroads you said, but it will take a long due to how far you ventured in here. [ENTER]");

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