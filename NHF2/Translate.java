public class Translate {
    String name;
    String lang;

    public static void transl(String name, String lang) {

        if (lang.equals("HUN")) {
            System.out.println("Jó reggelt " + name + "!");
        }

        else if (lang.equals("ENG")) {
            System.out.println("Good Morning " + name + "!");
        }

        else if (lang.equals("JAP")) {
            System.out.println("Ohayō " + name + "!");
        }

        else if (lang.equals("GER")) {
            System.out.println("Guten Morgen " + name + "!");
        }

        else System.out.println("Jó reggelt " + name + "!");

    }
}
