import java.util.ArrayList;

public class FiltraPari {
    public static ArrayList<Integer> filtraPari(ArrayList<Integer> lista) {
        ArrayList<Integer> pari = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pari.add(num);
            }
        }
        return pari;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(4);
        System.out.println(filtraPari(numeri));
    }
}