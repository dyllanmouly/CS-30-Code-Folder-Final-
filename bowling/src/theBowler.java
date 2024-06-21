import java.util.Scanner;

public class theBowler {
    static int averageBowler, eliteBowler, bowlingTotal, bowlingScore, i;
    static int averageBowlerPercent, eliteBowlerPercent; 
    public static void main(String[] args) throws Exception {
        
        for (i = 100; i > 0; i--)
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("Enter bowling score(-1 to exit): ");
            bowlingScore = keys.nextInt();
            if (bowlingScore <= 199 && bowlingScore > -1){
                averageBowler++;
                bowlingTotal++;
            }
            if (bowlingScore >= 200 && bowlingScore <= 300){
                eliteBowler++;
                bowlingTotal++;
            }
            else if (bowlingScore == -1){
                System.out.println("Average Bowlers %: " + (double)averageBowler / bowlingTotal * (100));
                System.out.println("Elite Bowler  %: " + (double)eliteBowler / bowlingTotal * (100));
                System.exit(0);
            }
            if (bowlingScore < 0 || bowlingScore > 301){
                System.out.println("fake bowler");
            }
            
        }
    }
}
