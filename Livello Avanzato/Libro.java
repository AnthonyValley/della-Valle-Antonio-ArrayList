public class Libro {
    String titolo;
    String autore;
    int annoPubblicazione;

    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString() {
        return titolo + " di " + autore + " (" + annoPubblicazione + ")";
    }
}