import java.io.*;
import java.util.*;

public class Exerc1Grafo {

    public static void main(String[] args) {
        try {
            // Abrindo o arquivo de entrada
            Scanner scanner = new Scanner(new File("entrada.txt"));

            // Lendo o número de vértices (n) e arestas (m)
            int n = scanner.nextInt(); // número de vértices
            int m = scanner.nextInt(); // número de arestas

            // Criando uma lista de adjacências para cada vértice
            LinkedList<Integer>[] adj = new LinkedList[n];

            // Inicializando cada lista
            for (int i = 0; i < n; i++) {
                adj[i] = new LinkedList<>();
            }

            // Lendo as arestas do grafo
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(); // vértice de origem
                int v = scanner.nextInt(); // vértice de destino

                // Como o grafo é não direcionado, adicionamos ambos os sentidos
                adj[u].add(v);
                adj[v].add(u);
            }

            // Exibindo os vizinhos e grau de cada vértice
            for (int i = 0; i < n; i++) {
                // Ordena os vizinhos (opcional, para saída igual ao exemplo)
                Collections.sort(adj[i]);

                // Imprimindo no formato pedido
                System.out.println("N(" + i + ") = " + adj[i] + ", grau = " + adj[i].size());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
