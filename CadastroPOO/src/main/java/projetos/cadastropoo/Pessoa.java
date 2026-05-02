package projetos.cadastropoo;


public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
        
    public void mostrar() {
        System.out.printf("Nome: %-20s | Idade:%d%n", nome, idade);
    }
    
}
