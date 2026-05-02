package projetos.cadastropoo;

import java.util.ArrayList;
import java.util.Comparator;

public class Cadastro {

    private ArrayList<Pessoa> lista = new ArrayList<>();

    public void adicionar(Pessoa p) {
        lista.add(p);
    }

    public void listar() {

        if (lista.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;

        }

        //Case Insensitive: O uso do .toLowerCase() garante que "exemplo: ana venha antes de "Raphael",
        //mesmo que uma esteja com letra minúscula e a outra não.
        lista.sort(Comparator.comparing(p -> p.getNome().toLowerCase())); // Ordena a lista por nome antes de mostrar
        for (Pessoa p : lista) {
            p.mostrar();
        }
    }

    public boolean buscar(String nome) {
        for (Pessoa p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.mostrar();
                return true; // Achou
            }
        }
        return false; // Não achou ninguém
    }

    public boolean remover(String nome) {

        for (Pessoa p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                lista.remove(p);
                return true;
            }

        }

        return false;
    }
}
