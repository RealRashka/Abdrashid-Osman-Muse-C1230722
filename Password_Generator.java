import java.util.Scanner;
import java.util.Random;
public class Password_Generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&*";

        String allChars = capital + small + numbers + symbols;

        System.out.print("so gali tirada passwordkaga ino noqdo aad rabto: ");
        int length = input.nextInt();

        String password = "";
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        System.out.println(" Passwordkaaga waa : " + password);

    }
}
