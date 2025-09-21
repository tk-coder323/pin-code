import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String oikeaPin = "1231";
        String pin="";

        // Loopataan niin kauan, kunnes pin ei ole sama oikeaPin
        
        do {
            System.out.println("Anna pin");
            pin = in.nextLine();
        } while (!pin.equals(oikeaPin));
        System.out.println("Olet kirjautunut sisään");

    }
}
