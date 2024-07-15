package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Cafeteria;
import controller.IFuncionalidade;
import models.Insumo.Insumo;

public interface IInsumos {

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
                "1 - Adicionar Insumo\n" +
                "2 - Remover Insumo \n" +
                "3 - Listar Insumos \n" +
                "0 - Sair");
                escolha = in.nextInt();
            } catch(Exception e) {
                escolha = 999;
                in.nextLine();
            }

            switch (escolha) {
                case 1:
                    try{
                        System.out.println("Nome Insumo:");
                        nome = in.next();
                        in.nextLine();
                        System.out.println("Quantidade Insumo:");
                        qtd = in.nextInt();
                        in.nextLine();
                        System.out.println("Preço Insumo:");
                        preco = Double.parseDouble(in.nextLine());

                        Insumo insu = new Insumo(nome, qtd, preco);
                        IFuncionalidade.AdicionarInsumo(cafeteria, insu);

                    } catch(Exception e) {
                        System.out.println("Algo errado no cadastro!");
                        break;
                    }
                    menu = false;
                    break;

                case 2:
                    try{
                        System.out.println("Codigo do insumo para remover:");
                        cod = in.nextInt();
                        IFuncionalidade.RemoverInsumo(cafeteria, cod);

                    } catch(InputMismatchException e) {
                        System.out.println("Algo errado no input!");
                        in.nextLine();
                        break;
                    }

                    menu = false;
                    break;

                case 3:
                    IFuncionalidade.ListarInsumos(cafeteria);
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
