import java.util.ArrayList;

public class EliminaDuplicati {
    public static ArrayList<Integer> eliminaDuplicati(ArrayList<Integer> lista) {
        ArrayList<Integer> nuovaLista = new ArrayList<>();
        for (int num : lista) {
            if (!nuovaLista.contains(num)) {
                nuovaLista.add(num);
            }
        }
        return nuovaLista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(2);
        numeri.add(3);
        System.out.println(eliminaDuplicati(numeri));
    }
}