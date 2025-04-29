import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestioneLibri {
    ArrayList<Libro> libri = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public ArrayList<Libro> trovaLibriPrimaDel(int anno) {
        ArrayList<Libro> risultato = new ArrayList<>();
        for (Libro libro : libri) {
            if (libro.annoPubblicazione < anno) {
                risultato.add(libro);
            }
        }
        return risultato;
    }

    public ArrayList<Libro> trovaLibriPerAutore(String autore) {
        ArrayList<Libro> risultato = new ArrayList<>();
        for (Libro libro : libri) {
            if (libro.autore.equalsIgnoreCase(autore)) {
                risultato.add(libro);
            }
        }
        return risultato;
    }

    public void ordinaPerAnno() {
        Collections.sort(libri, Comparator.comparingInt(l -> l.annoPubblicazione));
    }

    public void stampaLibri() {
        for (Libro libro : libri) {
            System.out.println(libro);
        }
    }

    public static void main(String[] args) {
        GestioneLibri gestione = new GestioneLibri();
        gestione.aggiungiLibro(new Libro("Il Signore degli Anelli", "Tolkien", 1954));
        gestione.aggiungiLibro(new Libro("1984", "Orwell", 1949));
        gestione.ordinaPerAnno();
        gestione.stampaLibri();
    }
}