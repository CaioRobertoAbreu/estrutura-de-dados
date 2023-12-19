package br.com.caio.aula01.vetornaoordenado;

import java.util.Objects;

public class VetorNaoOrdenado {

    private final int capacidade;
    private int ultimaPosicao;
    private int[] valores;

    public int getUltimaPosicao() {
        return ultimaPosicao;
    }

    public VetorNaoOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.ultimaPosicao = -1;
        this.valores = new int[capacidade];
    }

    public void imprime() {
        if (ultimaPosicao == -1)
            System.out.println("[]");
        else {
            System.out.print("[");
            for (int i = 0; i <= ultimaPosicao; i++) {
                System.out.print(valores[i] + ",");
            }
            System.out.println("]");
        }
    }

    public void insere(int valor) {
        if (ultimaPosicao == (capacidade - 1))
            System.out.println("Capacidade máxima atingida");
        else{
            this.ultimaPosicao++;
            this.valores[ultimaPosicao] = valor;

        }
    }

    /**
     *
     * @param valor
     * @return index ref ao valor
     */
    public int pesquisa(int valor){
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (Objects.equals(valores[i], valor))
                return i;
        }
        return -1;
    }

    public void excluir(int valor){
        var index = pesquisa(valor);

        if (index > -1) {
            for(int i = index; i < ultimaPosicao; i++){
                valores[i] = valores[i + 1];
            }
            --ultimaPosicao;
        }
    }
}
