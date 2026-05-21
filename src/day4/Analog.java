import java.util.Scanner;

public class Analog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vowels = 0, consonants = 0, numbers = 0, special = 0;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            else if (ch >= '0' && ch <= '9') {
                numbers++;
            } 
            else if (ch != ' ') {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + special);

        sc.close();
    }
}
