public class Item implements Comparable<Item> {
    double valorUnitario;
    double valorTotal;
    double pesoTotal;

    public Item(double valorTotal, double pesoTotal) {
        this.valorTotal = valorTotal;
        this.pesoTotal = pesoTotal;
        this.valorUnitario = valorTotal / pesoTotal;
    }

    @Override
    public int compareTo(Item o) {
        // Ordena em ordem decrescente de valor por peso
        return Double.compare(o.valorUnitario, this.valorUnitario);
    }

    @Override
    public String toString() {
        return String.format("unit: %.2f, vT: %.2f, pT: %.2f", 
valorUnitario, valorTotal, pesoTotal);
    }
}
