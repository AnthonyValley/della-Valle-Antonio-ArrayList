import java.util.ArrayList;

public class InvertiLista {
    public static ArrayList<Integer> inverti(ArrayList<Integer> lista) {
        ArrayList<Integer> invertita = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertita.add(lista.get(i));
        }
        return invertita;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        ArrayList<Integer> invertita = inverti(numeri);
        System.out.println(invertita);
    }
}