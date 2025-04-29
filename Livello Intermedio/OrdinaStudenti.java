import java.util.ArrayList;
import java.util.Collections;

public class OrdinaStudenti {
    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<>();
        studenti.add("Marco");
        studenti.add("Anna");
        studenti.add("Luca");

        Collections.sort(studenti);

        for (String nome : studenti) {
            System.out.println(nome);
        }
    }
}