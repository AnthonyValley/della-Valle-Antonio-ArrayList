import java.util.ArrayList;

public class SommaValori {
    public static int somma(ArrayList<Integer> lista) {
        int somma = 0;
        for (int num : lista) {
            somma += num;
        }
        return somma;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(5);
        numeri.add(10);
        numeri.add(15);
        System.out.println(somma(numeri));
    }
}