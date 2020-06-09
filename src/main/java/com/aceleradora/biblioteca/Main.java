package com.aceleradora.biblioteca;
import java.util.ArrayList;
public class Main {

    public static ArrayList<Livros>ListaDeLivros = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
        criarLivros();
        imprimirListaDeLivros();

    }

    public static void criarLivros(){
        Livros livros1 = new Livros("Barbara Liskov", "Program development in Java");
        ListaDeLivros.add(livros1);
        Livros livros2 = new Livros("Elisabeth Freeman, Kathy Sierra", "Use a Cabeça: Padrões de projet");
        ListaDeLivros.add(livros2);
    }
    private static void imprimirListaDeLivros() {
        System.out.println("Lista de Livros:");
        for (Livros livro : ListaDeLivros) {
            livro.obterInformacoes();
        }
    }

/*package com.biblioteca;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Main {

    public static ArrayList<Livro> listaDeLivros = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        criarLivros();
        String opcao;

        do {
            System.out.println("Bem vinda à Biblioteca. \n Escolha uma opcao: \n [0]- Sair \n [1]-Imprimir lista de livros  ");
            Scanner entradaDoUsuario = new Scanner(System.in);
            opcao = entradaDoUsuario.next();
            if (opcao.equals("1")){
                imprimirListaDeLivros();
            }
        } while(!opcao.equals("0"));
    }

    private static void imprimirListaDeLivros() {
        for (Livro livro :listaDeLivros) {
            livro.obterInformacoes();
        }
    }

    /*private static void imprimirListaDeLivros() {
        for (int indice = 0; indice < listaDeLivros.size() ; indice ++) {
            listaDeLivros.get(indice).obterInformacoes();
        }
    }*/
/*
    public static void criarLivros(){
        Livro prideAndPrejudice = new Livro("Jane Austen", "pride and prejudice", 1865);
        listaDeLivros.add(prideAndPrejudice);
        Livro Sapiens = new Livro("Yuval Noah Harari", "Sapiens", 2009);
        listaDeLivros.add(Sapiens);
    }*/
}
