import java.util.*;

public class Arvore {
    No raiz;

    public Arvore() {
        // Montando a árvore conforme a imagem
        raiz = new No("A");
        raiz.esquerda = new No("B");
        raiz.direita = new No("C");
        raiz.esquerda.esquerda = new No("D");
        raiz.esquerda.direita = new No("E");
        raiz.direita.direita = new No("F");
    }

    public void buscaPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            buscaPreOrdem(no.esquerda);
            buscaPreOrdem(no.direita);
        }
    }

    public void buscaEmOrdem(No no) {
        if (no != null) {
            buscaEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            buscaEmOrdem(no.direita);
        }
    }

    public void buscaPosOrdem(No no) {
        if (no != null) {
            buscaPosOrdem(no.esquerda);
            buscaPosOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public void buscaEmNivel() {
        if (raiz == null) return;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }
}
