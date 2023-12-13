
import java.util.Scanner;
public class Gameplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        InputHelper.getPrettyHeader("Skyworld VI");


        String pFirstName = InputHelper.getNonZeroLenString(scan, "\nEnter the Player's First Name:");
        String pLastName = InputHelper.getNonZeroLenString(scan, "Enter the Player's Last Name:");

        String pUsername = "";
        pUsername = pFirstName + " " + pLastName;

        if (pFirstName.equalsIgnoreCase("chosen") && pLastName.equalsIgnoreCase("one")){
            int p1Age = InputHelper.getRangedInt(scan, "Get the Age: [0-999]", 0, 999); //Fun
        } else {
            int p1Age = InputHelper.getRangedInt(scan, "Get Player's Age: [16-40]", 16, 50); //Realism
        }

        String pBirthMonth = InputHelper.getNonZeroLenString(scan, "Enter Player's birth month:");
        if (pBirthMonth.equalsIgnoreCase("aprimay") || pBirthMonth.equalsIgnoreCase("jugust") || pBirthMonth.equalsIgnoreCase("septober") || pBirthMonth.equalsIgnoreCase("decembary")) {

        }
        int pBirthDay = InputHelper.getRangedInt(scan, "Enter Player's birth day:",1,15);


    }
}
