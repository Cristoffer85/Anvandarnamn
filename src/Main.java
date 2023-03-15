import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hej, vad heter du!");

        // Hämta inmatning från användaren
        String namn = new Scanner(System.in).nextLine();

        // Skriv ut hälsning och namnet
        System.out.println("Hej " + namn+ "!");
    }
}
