public class Gameplay {
    public static void main(String[] args) {
        String p1FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 1's First Name:");
        String p1lastName = InputHelper.getNonZeroLenString(scan, "Enter Person 1's Last Name:");
        int p1Age = InputHelper.getRangedInt(scan, "Get Person 1's Age: [1-99]", 1, 99);
    }
}
