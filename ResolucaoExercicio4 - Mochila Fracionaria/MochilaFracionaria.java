import java.util.*;

public class MochilaFracionaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();      // número de itens
        double W = leitor.nextDouble(); // capacidade da mochila

        List<Item> itens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double valor = leitor.nextDouble();
            double peso = leitor.nextDouble();
            itens.add(new Item(valor, peso));
        }

        // Ordena por valor unitário (valor por peso), do maior para o menor
        Collections.sort(itens);

        double valorTotal = 0.0;
        double pesoAtual = 0.0;

        for (Item item : itens) {
            if (pesoAtual + item.pesoTotal <= W) {
                // Cabe o item inteiro
                valorTotal += item.valorTotal;
                pesoAtual += item.pesoTotal;
            } else {
                // Cabe apenas uma fração do item
                double pesoRestante = W - pesoAtual;
                valorTotal += item.valorUnitario * pesoRestante;
                break; // a mochila está cheia
            }
        }

        System.out.println(itens);
        System.out.printf("%.2f\n", valorTotal);

        leitor.close();
    }
}
