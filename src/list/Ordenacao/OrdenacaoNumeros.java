package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    // Atributo para armazenar a lista de números
    private List<Integer> numeros = new ArrayList<>();

    // Construtor sem parâmetros
    public OrdenacaoNumeros() {
    }

    // Método para adicionar um número à lista
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    // Método para ordenar a lista em ordem ascendente
    public void ordenarAscendente() {
        Collections.sort(numeros);
    }

    // Método para ordenar a lista em ordem descendente
    public void ordenarDescendente() {
        Collections.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1); // Inverte a ordem de comparação
            }
        });
    }

    // Método para exibir a lista de números
    public void exibirNumeros() {
        System.out.println(numeros);
    }

    //Testando
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(10);

        System.out.println("Lista não ordenada: " + ordenacaoNumeros.numeros); // [5, 3, 10]

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Lista ordenada ascendente: " + ordenacaoNumeros.numeros); // [3, 5, 10]

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Lista ordenada descendente: " + ordenacaoNumeros.numeros); // [10, 5, 3]
   
    }
}
