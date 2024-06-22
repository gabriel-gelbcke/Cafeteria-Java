package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Cafeteria;
import controller.IFuncionalidade;
import models.Insumo.Insumo;
import models.Pessoa.Funcionario;
import models.Pessoa.Usuario;
import models.Produto.Produto;
import models.Venda.Venda;

public interface IVendas {

    public static void menu(Cafeteria cafeteria) throws Exception{
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        int codProd, codInsu, codFunci, codUser;
        boolean menu = true;
        int cod;
        boolean prox = true;
        
        while (menu) {
            try{
                System.out.println("Escolha o que quer fazer: \n" + 
                "1 - Cadastrar Venda\n" +
                "2 - Remover Venda \n" +
                "3 - Listar Vendas \n" +
                "0 - Sair");
                escolha = in.nextInt();
            } catch(Exception e) {
                escolha = 999;
                in.nextLine();
            }

            switch (escolha) {
                case 1:
                    try{
                        System.out.println("Id Produto:");
                        codProd = in.nextInt();
                        System.out.println("Id Insumo:");
                        codInsu = in.nextInt();
                        System.out.println("Id Funcionario:");
                        codFunci = in.nextInt();
                        System.out.println("Id Usuario:");
                        codUser = in.nextInt();
                        
                        if(cafeteria.BuscarProduto(codProd) == null){prox = false;}
                        if(cafeteria.BuscarInsumo(codInsu) == null){prox = false;}
                        if(cafeteria.BuscarFuncionarios(codFunci) == null){prox = false;}
                        if(cafeteria.BuscarUsuarios(codUser) == null){prox = false;}

                        if(prox == true){
                            Produto prodVenda = cafeteria.BuscarProduto(codProd);
                            Insumo insuVenda = cafeteria.BuscarInsumo(codInsu);
                            Funcionario funciVenda = cafeteria.BuscarFuncionarios(codFunci);
                            Usuario userVenda = cafeteria.BuscarUsuarios(codUser);

                            Venda venda = new Venda(prodVenda, insuVenda, funciVenda, userVenda);
                            IFuncionalidade.AdicionarVenda(cafeteria, venda);
                        }else{
                            System.out.println("Algo no cadastro não encontrado!");
                        }

                    } catch(Exception e) {
                        System.out.println("Algo errado no cadastro!");
                        break;
                    }
                    menu = false;
                    break;

                case 2:
                    try{
                        System.out.println("Codigo da venda para remover:");
                        cod = in.nextInt();
                        IFuncionalidade.RemoverVenda(cafeteria, cod);

                    } catch(InputMismatchException e) {
                        System.out.println("Algo errado no input!");
                        in.nextLine();
                        break;
                    }

                    menu = false;
                    break;

                case 3:
                    IFuncionalidade.ListarVendas(cafeteria);
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
