import java.util.Scanner;
public class Plaindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter polindrome :");
        String text = input.nextLine();
        text.toLowerCase();
        String revers = "";

        int i = text.length() - 1;
        while (true) {
            revers += text.charAt(i);i--;
            if (i < 0) {
                break;
            }
        }
        if (text.equals(revers)) {
            System.out.println( text + " its palindrome: " + revers);
        }
        else {
            System.out.println(text  + " its not palindrome: " + revers);


        }
    }
}
