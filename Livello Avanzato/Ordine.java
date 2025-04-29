public class Ordine {
    int idOrdine;
    String cliente;
    double importo;

    public Ordine(int idOrdine, String cliente, double importo) {
        this.idOrdine = idOrdine;
        this.cliente = cliente;
        this.importo = importo;
    }

    @Override
    public String toString() {
        return idOrdine + " - " + cliente + ": " + importo + "€";
    }
}