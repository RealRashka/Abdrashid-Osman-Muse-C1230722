import java.util.Scanner;
public class Sentenal_value {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                String input;

                System.out.println("Enter integer number!! \n" +
                        " Tap 'n' to exit.");

                while (true) {
                    System.out.print("Enter number: ");
                    input = scanner.nextLine();

                    if (input.equals("n")) {
                        break;
                    }

                    if (input.matches("-?\\d+")) {
                        sum += Integer.parseInt(input);
                    } else {
                        System.out.println("plese enter number or tap 'n' to exit.");
                    }
                }

                System.out.println("The sum is : " + sum);
            }
        }
