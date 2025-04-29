import java.util.ArrayList;

public class TrovaMaxMin {
    public static void trova(ArrayList<Integer> lista) {
        int max = lista.get(0);
        int min = lista.get(0);

        for (int num : lista) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(5);
        numeri.add(2);
        numeri.add(9);
        trova(numeri);
    }
}