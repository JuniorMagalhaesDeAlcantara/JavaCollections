package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
//Atributo para armazenar a lista de numeros
    private List<Integer>numeros;
    
//Construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
// Método para adicionar um número à lista
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
// Método para calcular a soma dos números
    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
// Método para encontrar o maior número
        public int encontrarMaiorNumero() {
            if (numeros.isEmpty()) {
                throw new RuntimeException("Lista vazia!");
            }
    
            int maior = numeros.get(0);
            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        }
    
// Método para encontrar o menor número
        public int encontrarMenorNumero() {
            if (numeros.isEmpty()) {
                throw new RuntimeException("Lista vazia!");
            }
    
            int menor = numeros.get(0);
            for (int numero : numeros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }
    
// Método para exibir todos os números da lista
        public List<Integer> exibirNumeros() {
            return new ArrayList<>(numeros); // Retorna uma cópia da lista
        }
// Testando
        public static void main(String[] args) {
            SomaNumeros somaNumeros = new SomaNumeros();

            somaNumeros.adicionarNumero(5);
            somaNumeros.adicionarNumero(3);
            somaNumeros.adicionarNumero(10);
            
            
            System.out.println("Soma dos números: " + somaNumeros.calcularSoma()); // 18
            System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero()); // 10
            System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero()); // 3
            System.out.println("Números da lista: " + somaNumeros.exibirNumeros()); // [5, 3, 10]   
        }
}
