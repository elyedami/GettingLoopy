public class Firstinitial {
    public static void main(String[] args) {

        String firstName = "J";
        String lastName = "Doe";

        String initial = firstName.toUpperCase();
        if (initial.equals("I")) {
            initial = lastName.toUpperCase().substring(0, 1);
        }


        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {
            System.out.print(" ");
            for (int j = 1; j <= 18; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}