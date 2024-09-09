package main;

import modelo.Produto;

/**
 * @author Victor Emmanuel
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mercado {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Produto> produtos;
    private static Map<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        menu();
    }

     private static void menu() {

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------Menu-------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("******* Selecione uma Operação que deseja realizar *******");
        System.out.println("----------------------------------------------------------");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Comprar Produto");
        System.out.println("4 - Carrinho");
        System.out.println("5 - Sair");

        int option = input.nextInt();


        switch (option) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                listarProduto();
                break;
            case 3:
                comprarProduto();
                break;
            case 4:
                verCarrinho();
                break;
            case 5:
                System.out.println("Obrigado pela preferencia");
                System.exit();
            default:
                System.out.println("Opção Invalida");
                menu();
                break;

        }
     }

    private static void comprarProduto() {
    }

    private static void listarProduto() {
    }

    private static void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nome = input.next();

        System.out.println("Preço do produto: ");
        double preco = input.nextDouble();

        Produto produto = new Produto(nome, preco)
                produtos.add(produto);

        System.out.println(new StringBuilder().append(produto.getNome()).append(" cadastrado com sucesso!").toString());
        menu()

        static void listarProduto;() {
            if (produtos.size() > 0) {

                for (Produto p : produtos) {
                    System.out.println(p);
                }

         else   }
            System.out.println("Nenhum produto cadastrado!");

            menu();


     }
}