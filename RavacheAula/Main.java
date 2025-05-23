import java.util.*;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        System.out.print("Pré-Ordem: ");
        arvore.buscaPreOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em-Ordem: ");
        arvore.buscaEmOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-Ordem: ");
        arvore.buscaPosOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em Nível: ");
        arvore.buscaEmNivel();
        System.out.println();
    }
}
