public class ArvoreBinaria {

    public static int contarNosFolha(No raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.esquerda == null && raiz.direita == null) {
            return 1;
        }
        return contarNosFolha(raiz.esquerda) + contarNosFolha(raiz.direita);
    }

    public static void main(String[] args) {
        No raiz = new No("A");
        raiz.esquerda = new No("B");
        raiz.direita = new No("C");
        raiz.esquerda.esquerda = new No("D");
        raiz.esquerda.direita = new No("E");
        raiz.direita.direita = new No("F");

        int folhas = contarNosFolha(raiz);
        System.out.println("Número de nós folha: " + folhas);  
    }
}
