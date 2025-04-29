import java.util.ArrayList;
import java.util.Scanner;

public class RicercaParola {
    public static void main(String[] args) {
        ArrayList<String> parole = new ArrayList<>();
        parole.add("ciao");
        parole.add("mondo");
        parole.add("java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci parola: ");
        String parola = sc.nextLine();

        if (parole.contains(parola)) {
            System.out.println("Parola trovata!");
        } else {
            System.out.println("Parola non trovata.");
        }
        sc.close();
    }
}