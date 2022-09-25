import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name here: ");
        String name = scan.nextLine();
        System.out.println("Select your language (HUN/ENG/JAP/GER): ");
        String lang = scan.nextLine();

        Translate.transl(name,lang);
    }
}
