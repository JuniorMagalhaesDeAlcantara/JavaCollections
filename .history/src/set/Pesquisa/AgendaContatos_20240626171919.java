package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public class AgendaContatos {

        // Atributo para armazenar os contatos em um conjunto
        private Set<Contato> contatosSet = new HashSet<>();
    
        // Construtor sem parâmetros
        public AgendaContatos() {
            this.contatosSet = new HashSet<>();
        }
    
        // Método para adicionar um contato à agenda
        public void adicionarContato(String nome, int numero) {
            // Cria um novo objeto Contato com os dados fornecidos
            Contato novoContato = new Contato(nome, numero);
    
            // Verifica se o contato já existe antes de adicionar
            if (!contatosSet.contains(novoContato)) {
                // Se não existe, adiciona o contato ao conjunto
                contatosSet.add(novoContato);
                System.out.println("Contato \"" + nome + "\" adicionado com sucesso!");
            } else {
                // Se o contato já existe, exibe uma mensagem informativa
                System.out.println("Contato \"" + nome + "\" já existe na agenda!");
            }
        }
    
        // Método para exibir todos os contatos da agenda
        public void exibirContatos() {
            if (!contatosSet.isEmpty()) {
                // Se a agenda não está vazia, percorre cada contato e imprime seus dados
                for (Contato contato : contatosSet) {
                    System.out.println(contato);
                }
            } else {
                // Se a agenda está vazia, exibe uma mensagem informativa
                System.out.println("A agenda de contatos está vazia!");
            }
        }
    
        // Método para pesquisar contatos por nome (começando com o nome informado)
        public Set<Contato> pesquisarPorNome(String nome) {
            // Cria um conjunto vazio para armazenar os contatos encontrados
            Set<Contato> contatosEncontrados = new HashSet<>();
    
            if (!contatosSet.isEmpty()) {
                // Se a agenda não está vazia, percorre cada contato
                for (Contato contato : contatosSet) {
                    // Verifica se o nome do contato começa com o nome informado (pesquisa por nome parcial)
                    if (contato.getNome().startsWith(nome.toUpperCase())) {
                        // Se o contato for encontrado, adiciona-o ao conjunto de contatos encontrados
                        contatosEncontrados.add(contato);
                    }
                }
    
                // Se nenhum contato for encontrado, exibe uma mensagem informativa
                if (contatosEncontrados.isEmpty()) {
                    System.out.println("Nenhum contato encontrado com o nome \"" + nome + "\"!");
                }
    
                // Retorna o conjunto de contatos encontrados
                return contatosEncontrados;
            } else {
                // Se a agenda está vazia, lança uma exceção
                throw new RuntimeException("A agenda de contatos está vazia!");
            }
        }
    
        // Método para atualizar o número de telefone de um contato
        public Contato atualizarNumeroContato(String nome, int novoNumero) {
            // Cria um objeto Contato nulo para armazenar o contato atualizado
            Contato contatoAtualizado = null;
    
            if (!contatosSet.isEmpty()) {
                // Se a agenda não está vazia, percorre cada contato
                for (Contato contato : contatosSet) {
                    // Verifica se o nome do contato coincide com o nome informado (comparação sem distinção de maiúsculas e minúsculas)
                    if (contato.getNome().equalsIgnoreCase(nome)) {
                        // Se o contato for encontrado, atualiza o número de telefone e define o contatoAtualizado
                        contato.setNumero(novoNumero);
                        contatoAtualizado = contato;
    
                        // Encerra o loop após encontrar o contato
                        break;
                    }
                }
    
                // Se nenhum contato for encontrado, exibe uma mensagem informativa
                if (contatoAtualizado == null) {
                    System.out.println("Contato \"" + nome + "\" não encontrado para atualização!");
                }
            } else {
                // Se a agenda está vazia, lança uma exceção
                throw new RuntimeException("A agenda de contatos está vazia!");
            }

  public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos
    AgendaContatos agendaContatos = new AgendaContatos();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContatos();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos.exibirContatos();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }




}
