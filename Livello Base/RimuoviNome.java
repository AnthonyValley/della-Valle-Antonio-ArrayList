import java.util.ArrayList;

public class RimuoviNome {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Anna");
        nomi.add("Luca");
        nomi.add("Marco");

        nomi.remove("Luca");

        for (String nome : nomi) {
            System.out.println(nome);
        }
    }
}