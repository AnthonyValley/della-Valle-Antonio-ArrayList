import java.util.ArrayList;

public class ContaElementi {
    public static int contaElementi(ArrayList<Integer> lista) {
        return lista.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        System.out.println(contaElementi(numeri));
    }
}