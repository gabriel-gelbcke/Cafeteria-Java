import java.util.Scanner;

import view.*;
import util.Serializador;
import controller.Cafeteria;

//Equipe Cafeteria
//ANTÔNIO ADAIR CABREIRA NETO - 8833702233
//DAVI ALVES DE LINS - 8834109170
//GABRIEL GELBCKE DA SILVA - 8833957134
//GUSTAVO TORRES GIROTO - 8834184341

public class App {
    public static void main(String[] args) throws Exception {

        Cafeteria cafeteria = Serializador.ler();

        if(cafeteria == null){
            cafeteria = new Cafeteria();
        }

        Scanner in = new Scanner(System.in);
        int escolha = 0;
        boolean menu = true;

        while (menu){
            try{
            System.out.println("Escolha uma categoria: \n" + 
            "1 - Produtos \n" +
            "2 - Insumos \n" +
            "3 - Usuarios \n" +
            "4 - Funcionarios \n" +
            "5 - Vendas \n" +
            "0 - Sair");
            escolha = in.nextInt();
        } catch(Exception e) {
            escolha = 999;
            in.nextLine();
        }
            switch (escolha) {
                case 1:
                    IProdutos.menu(cafeteria);
                    Serializador.gravar(cafeteria);
                    break;
                case 2:
                    IInsumos.menu(cafeteria);
                    Serializador.gravar(cafeteria);
                    break;
                case 3:
                    IUsuarios.menu(cafeteria);
                    Serializador.gravar(cafeteria);
                    break;
                case 4:
                    IFuncionarios.menu(cafeteria);
                    Serializador.gravar(cafeteria);
                    break;
                case 5:
                    IVendas.menu(cafeteria);
                    Serializador.gravar(cafeteria);
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
            Serializador.gravar(cafeteria);
    }
}