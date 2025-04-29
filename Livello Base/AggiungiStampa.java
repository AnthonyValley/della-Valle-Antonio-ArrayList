import java.util.ArrayList;

public class AggiungiStampa {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Anna");
        nomi.add("Luca");
        nomi.add("Marco");
        nomi.add("Sara");
        nomi.add("Giulia");

        for (String nome : nomi) {
            System.out.println(nome);
        }
    }
}