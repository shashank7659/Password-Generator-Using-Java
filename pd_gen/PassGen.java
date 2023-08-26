
import java.util.Scanner;

public class PassGen {
    public static void main(String[] args) {

        System.out.println("Enter the length of Password");
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();
        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String digits = "0123456789";
        String special_characters = "!@#$%^&*()_-+=<>?";

        String password = "";
        for (int i = 0; i < digit; i++) {
            int rand = (int) (4 * Math.random());

            switch (rand) {
                case 0:
                    rand = (int) (digits.length() * Math.random());
                    password += digits.charAt(rand);
                    break;
                case 1:
                    rand = (int) (lower_cases.length() * Math.random());
                    password += lower_cases.charAt(rand);
                    break;
                case 2:
                    rand = (int) (upper_cases.length() * Math.random());
                    password += upper_cases.charAt(rand);
                    break;
                case 3:
                    rand = (int) (special_characters.length() * Math.random());
                    password += special_characters.charAt(rand);
                    break;
            }
        }
        System.out.println("Generated Password: " + password);
    }
}
