
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int stringLength = characterString.length();
        int numSmileys = ((stringLength + 1) / 2) + 3;

        for (int i = 0; i < numSmileys; i++) {
            System.out.print(":)");
        }
        if (stringLength % 2 == 0) {
            System.out.println("\n:) " + characterString + " :)");
        } else {
            System.out.println("\n:) " + characterString + "  :)");
        }
        for (int i = 0; i < numSmileys; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

}
