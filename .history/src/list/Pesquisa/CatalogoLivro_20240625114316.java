package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //atributo
    private  List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
          return livrosPorAutor;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
      public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
              livrosPorIntervaloAnos.add(l);
            }
          }
          return livrosPorIntervaloAnos;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
      public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
              livroPorTitulo = l;
              break;
            }
          }
          return livroPorTitulo;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

      //Testando
    
      public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivro catalogoLivro = new catalogoLivro();
    
        // Adicionando livros ao catálogo
        catalogoLivro.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivro.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivro.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivro.pesquisarPorAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2025, 2030));
    
        // Exibindo livros por título
        System.out.println(catalogoLivro.pesquisarPorTitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivro.pesquisarPorTitulo("Título Inexistente"));
      }
}
