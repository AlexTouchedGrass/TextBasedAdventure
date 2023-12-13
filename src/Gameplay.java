
import java.util.Scanner;
public class Gameplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pFirstName = InputHelper.getNonZeroLenString(scan, "Enter the Player's First Name:");
        String pLastName = InputHelper.getNonZeroLenString(scan, "Enter the Player's Last Name:");

        if (pFirstName.equalsIgnoreCase("chosen") && pLastName.equalsIgnoreCase("one")){
            int p1Age = InputHelper.getRangedInt(scan, "Get the Age: [0,999]", 0, 999); //Fun
        } else {
            int p1Age = InputHelper.getRangedInt(scan, "Get Player's Age: [16-40]", 16, 50); //Realism
        }


    }
}
