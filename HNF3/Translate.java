public class Translate {
    public static void transl(String name, String lang) {

        switch (lang) {
            case "ENG":
                System.out.println("Good Morning " + name + "!");
                break;
            case "JAP":
                System.out.println("Ohayō " + name + "!");
                break;
            case "GER":
                System.out.println("Guten Morgen " + name + "!");
                break;
            default:
                System.out.println("Jó reggelt " + name + "!");
                break;
        }
    }
}
