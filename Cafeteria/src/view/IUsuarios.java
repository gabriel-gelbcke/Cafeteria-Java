package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Cafeteria;
import controller.IFuncionalidade;
import models.Pessoa.Usuario;

public interface IUsuarios {

    public static void menu(Cafeteria cafeteria) throws Exception{
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        String nome, cpf, email;
        boolean menu = true;
        int cod;
        
        while (menu) {
            try{
                System.out.println("Escolha o que quer fazer: \n" + 
                "1 - Adicionar Usuario\n" +
                "2 - Remover Usuario \n" +
                "3 - Listar Usuarios \n" +
                "0 - Sair");
                escolha = in.nextInt();
            } catch(Exception e) {
                escolha = 999;
                in.nextLine();
            }

            switch (escolha) {
                case 1:
                    try{
                        System.out.println("Nome Usuario:");
                        nome = in.next();
                        System.out.println("Cpf Usuario:");
                        cpf = in.next();
                        System.out.println("Email Usuario:");
                        email = in.next();

                        Usuario user = new Usuario(nome, cpf, email);
                        IFuncionalidade.AdicionarUsuario(cafeteria, user);

                    } catch(Exception e) {
                        System.out.println("Algo errado no cadastro!");
                        break;
                    }
                    menu = false;
                    break;

                case 2:
                    try{
                        System.out.println("Codigo do usuario para remover:");
                        cod = in.nextInt();
                        IFuncionalidade.RemoverUsuario(cafeteria, cod);

                    } catch(InputMismatchException e) {
                        System.out.println("Algo errado no input!");
                        in.nextLine();
                        break;
                    }

                    menu = false;
                    break;

                case 3:
                    IFuncionalidade.ListarUsuarios(cafeteria);
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
