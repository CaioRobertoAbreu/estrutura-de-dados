package br.com.caio.aula01.vetornaoordenado;

public class main {

    public static void main(String[] args) {

        var vetor = new VetorNaoOrdenado(5);
        vetor.imprime();

        vetor.insere(2);
        vetor.insere(3);
        vetor.insere(8);
        vetor.insere(5);
        vetor.insere(1);
        vetor.insere(19);
        vetor.imprime();

        System.out.println(vetor.getUltimaPosicao());

        System.out.println(vetor.pesquisa(5));
        System.out.println(vetor.pesquisa(1));

        System.out.println("exclusao".toUpperCase());
        vetor.excluir(2);
        vetor.excluir(8);
        vetor.excluir(1);
        vetor.imprime();
        System.out.println("Ultima posicao: " + vetor.getUltimaPosicao());

        System.out.println("insere".toUpperCase());
        vetor.insere(2);
        vetor.insere(8);
        vetor.insere(1);
        vetor.imprime();
    }
}
