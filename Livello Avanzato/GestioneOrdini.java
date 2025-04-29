import java.util.ArrayList;

public class GestioneOrdini {
    ArrayList<Ordine> ordini = new ArrayList<>();

    public void aggiungiOrdine(Ordine ordine) {
        ordini.add(ordine);
    }

    public double totaleImporti() {
        double totale = 0;
        for (Ordine o : ordini) {
            totale += o.importo;
        }
        return totale;
    }

    public ArrayList<Ordine> ordiniSopraSoglia(double soglia) {
        ArrayList<Ordine> risultato = new ArrayList<>();
        for (Ordine o : ordini) {
            if (o.importo > soglia) {
                risultato.add(o);
            }
        }
        return risultato;
    }

    public Ordine ordineImportoMaggiore() {
        Ordine maggiore = ordini.get(0);
        for (Ordine o : ordini) {
            if (o.importo > maggiore.importo) {
                maggiore = o;
            }
        }
        return maggiore;
    }

    public ArrayList<Ordine> ricercaPerCliente(String cliente) {
        ArrayList<Ordine> risultato = new ArrayList<>();
        for (Ordine o : ordini) {
            if (o.cliente.equalsIgnoreCase(cliente)) {
                risultato.add(o);
            }
        }
        return risultato;
    }

    public void stampaOrdini() {
        for (Ordine o : ordini) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        GestioneOrdini gestione = new GestioneOrdini();
        gestione.aggiungiOrdine(new Ordine(1, "Mario", 120.50));
        gestione.aggiungiOrdine(new Ordine(2, "Anna", 80.00));
        gestione.stampaOrdini();
    }
}