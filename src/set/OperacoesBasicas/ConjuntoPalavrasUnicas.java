package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

 // Atributo para armazenar o conjunto de palavras únicas
 private Set<String> palavras = new HashSet<>();

 // Construtor sem parâmetros
 public ConjuntoPalavrasUnicas() {
 }

 // Método para adicionar uma palavra ao conjunto
 public void adicionarPalavra(String palavra) {
     palavras.add(palavra.toLowerCase()); // Converte para minúsculas
 }

 // Método para remover uma palavra do conjunto
 public void removerPalavra(String palavra) {
     palavras.remove(palavra.toLowerCase()); // Converte para minúsculas
 }

 // Método para verificar se uma palavra está presente no conjunto
 public boolean verificarPalavra(String palavra) {
     return palavras.contains(palavra.toLowerCase()); // Converte para minúsculas
 }

 // Método para exibir todas as palavras únicas do conjunto
 public void exibirPalavrasUnicas() {
     for (String palavra : palavras) {
         System.out.println(palavra);
     }
 }

 public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

    conjuntoPalavras.adicionarPalavra("casa");
    conjuntoPalavras.adicionarPalavra("carro");
    conjuntoPalavras.adicionarPalavra("casa"); // Não adiciona duplicatas

    System.out.println("Verificar se 'CASA' está presente: " + conjuntoPalavras.verificarPalavra("CASA")); // true

    conjuntoPalavras.removerPalavra("carro");

    System.out.println("Palavras únicas: ");
    conjuntoPalavras.exibirPalavrasUnicas(); // Casa
 }
 
}
