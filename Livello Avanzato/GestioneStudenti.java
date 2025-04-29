import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestioneStudenti {
    ArrayList<Studente> studenti = new ArrayList<>();

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public Studente studenteMigliore() {
        Studente migliore = studenti.get(0);
        for (Studente s : studenti) {
            if (s.mediaVoti > migliore.mediaVoti) {
                migliore = s;
            }
        }
        return migliore;
    }

    public ArrayList<Studente> studentiConMediaSuperioreA8() {
        ArrayList<Studente> risultato = new ArrayList<>();
        for (Studente s : studenti) {
            if (s.mediaVoti > 8.0) {
                risultato.add(s);
            }
        }
        return risultato;
    }

    public void ordinaPerCognomeNome() {
        Collections.sort(studenti, Comparator
            .comparing((Studente s) -> s.cognome)
            .thenComparing(s -> s.nome));
    }

    public void stampaStudenti() {
        for (Studente s : studenti) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        GestioneStudenti gestione = new GestioneStudenti();
        gestione.aggiungiStudente(new Studente("Anna", "Bianchi", 9.2));
        gestione.aggiungiStudente(new Studente("Luca", "Rossi", 7.5));
        gestione.ordinaPerCognomeNome();
        gestione.stampaStudenti();
    }
}