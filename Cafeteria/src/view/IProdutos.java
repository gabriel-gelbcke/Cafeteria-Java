package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Cafeteria;
import controller.IFuncionalidade;
import models.Produto.Produto;

public interface IProdutos {
    
    public static void menu(Cafeteria cafeteria) throws Exception{
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        String nome;
        int qtd;
        double preco;
        boolean menu = true;
        int cod;
        
        while (menu) {
            try{
                System.out.println("Escolha o que quer fazer: \n" + 
                "1 - Adicionar Produto\n" +
                "2 - Remover Produto \n" +
                "3 - Listar Produtos \n" +
                "0 - Sair");
                escolha = in.nextInt();
            } catch(Exception e) {
                escolha = 999;
                in.nextLine();
            }

            switch (escolha) {
                case 1:
                    try{
                        System.out.println("Nome Produto:");
                        nome = in.next();
                        in.nextLine();
                        System.out.println("Quantidade Produto:");
                        qtd = in.nextInt();
                        in.nextLine();
                        System.out.println("Preço Produto:");
                        preco = Double.parseDouble(in.nextLine());

                        Produto prod = new Produto(nome, qtd, preco);
                        IFuncionalidade.AdicionarProduto(cafeteria, prod);

                    } catch(Exception e) {
                        System.out.println("Algo errado no cadastro!");
                        break;
                    }
                    menu = false;
                    break;

                case 2:
                    try{
                        System.out.println("Codigo do produto para remover:");
                        cod = in.nextInt();
                        IFuncionalidade.RemoverProduto(cafeteria, cod);

                    } catch(InputMismatchException e) {
                        System.out.println("Algo errado no input!");
                        in.nextLine();
                        break;
                    }

                    menu = false;
                    break;

                case 3:
                    IFuncionalidade.ListarProdutos(cafeteria);
                    menu = false;
                    break;

                case 0:
                    menu = false;
                    break;

                case 999:
                    System.out.println("Input fora do range!");
                    break;

                default:
                    System.out.println("Input fora do range!");
                    break;
            }
        }
    }
}