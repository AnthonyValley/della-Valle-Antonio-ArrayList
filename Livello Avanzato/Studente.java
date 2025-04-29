public class Studente {
    String nome;
    String cognome;
    double mediaVoti;

    public Studente(String nome, String cognome, double mediaVoti) {
        this.nome = nome;
        this.cognome = cognome;
        this.mediaVoti = mediaVoti;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + mediaVoti + ")";
    }
}