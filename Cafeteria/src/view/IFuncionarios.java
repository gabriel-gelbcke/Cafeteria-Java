package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Cafeteria;
import controller.IFuncionalidade;
import models.Pessoa.Funcionario;

public interface IFuncionarios {

    public static void menu(Cafeteria cafeteria) throws Exception{
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        String nome, cpf;
        double salario;
        boolean menu = true;
        int cod;
        
        while (menu) {
            try{
                System.out.println("Escolha o que quer fazer: \n" + 
                "1 - Adicionar Funcionario\n" +
                "2 - Remover Funcionario \n" +
                "3 - Listar Funcionarios \n" +
                "0 - Sair");
                escolha = in.nextInt();
            } catch(Exception e) {
                escolha = 999;
                in.nextLine();
            }

            switch (escolha) {
                case 1:
                    try{
                        System.out.println("Nome Funcionario:");
                        nome = in.next();
                        in.nextLine();
                        System.out.println("Cpf Funcionario:");
                        cpf = in.next();
                        in.nextLine();
                        System.out.println("Salario Funcionario:");
                        salario = Double.parseDouble(in.nextLine());

                        Funcionario user = new Funcionario(nome, cpf, salario);
                        IFuncionalidade.AdicionarFuncionario(cafeteria, user);

                    } catch(Exception e) {
                        System.out.println("Algo errado no cadastro!");
                        break;
                    }
                    menu = false;
                    break;

                case 2:
                    try{
                        System.out.println("Codigo do Funcionario para remover:");
                        cod = in.nextInt();
                        IFuncionalidade.RemoverFuncionario(cafeteria, cod);

                    } catch(InputMismatchException e) {
                        System.out.println("Algo errado no input!");
                        in.nextLine();
                        break;
                    }

                    menu = false;
                    break;

                case 3:
                    IFuncionalidade.ListarFuncionarios(cafeteria);
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
