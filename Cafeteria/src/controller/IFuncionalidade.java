package controller;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import models.Insumo.Insumo;
import models.Pessoa.Pessoa;
import models.Produto.*;
import models.Venda.Venda;
import util.Log;
import util.Textos;

public class IFuncionalidade {

    //////// PARTE DO PRODUTO ////////
    public static void ListarProdutos(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarProdutos());
            log.add(dataFormated + " Produtos foram listados!");

        } catch (Exception erroListarProduto) {
            System.out.println("Não há produtos registradas");
            log.add(dataFormated + " Erro ao listar produtos, não há produtos registrados!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void AdicionarProduto(Cafeteria cafeteria, Produto produto) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.AdicionarProduto(produto);
            log.add(dataFormated + " Produto " + produto.getNomeProduto() + " cadastrado com sucesso!");

        } catch (Exception erroAdicionarProduto) {
            System.out.println("Produto ja registrado");
            log.add(dataFormated + " Erro ao cadastrar " + produto.getNomeProduto() + ", produto já cadastrado!");

        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void RemoverProduto(Cafeteria cafeteria, int removerProdutoId) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.RemoverProduto(removerProdutoId);
            System.out.println("Produto removido!");
            log.add(dataFormated + " Produto, com id " + removerProdutoId + " removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Produto, com id " + removerProdutoId + " não encontrado");
            log.add(dataFormated + " Erro ao remover, produto com id " + removerProdutoId + " não cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    //////// PARTE DO INSUMO ////////
    public static void ListarInsumos(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarInsumos());
            log.add(dataFormated + " Insumos foram listados!");
            
        } catch (Exception erroListarInsumos) {
            System.out.println("Não há insumos registrados");
            log.add(dataFormated + " Erro ao listar insumos, não há insumos registrados!");
        }
        Log.salvar(log.getTextos(), "Log");
    }
    
    public static void AdicionarInsumo(Cafeteria cafeteria, Insumo insumo) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.AdicionarInsumo(insumo);
            log.add(dataFormated + " Insumo " + insumo.getNomeInsumo() + " cadastrado com sucesso!");

        } catch (Exception erroAdicionarInsumo) {
            System.out.println("Insumo ja registrado");
            log.add(dataFormated + " Erro ao cadastrar " + insumo.getNomeInsumo() + ", insumo já cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void RemoverInsumo(Cafeteria cafeteria, int codInsumo) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.RemoverInsumo(codInsumo);
            System.out.println("Insumo removido!");
            log.add(dataFormated + " Insumo, com id " + codInsumo + " removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Insumo, com id " + codInsumo + " não encontrado");
            log.add(dataFormated + " Erro ao remover, insumo com id " + codInsumo + " não cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    //////// PARTE DA PESSOA ////////
    public static void ListarPessoas(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarPessoas());
            log.add(dataFormated + " Pessoas foram listadas!");
        } catch (Exception erroListarPessoas) {
            System.out.println("Não há pessoas registradas");
            log.add(dataFormated + " Erro ao listar pessoas, não há pessoas registrados!");
        }
        Log.salvar(log.getTextos(), "Log");
    }
    
    public static void ListarFuncionarios(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarFuncionarios());
            log.add(dataFormated + " Funcionarios foram listadas!");
        } catch (Exception erroListarFuncionarios) {
            System.out.println("Não há funcionários registrados");
            log.add(dataFormated + " Erro ao listar funcionarios, não há funcionarios registrados!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void ListarUsuarios(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarUsuarios());
            log.add(dataFormated + " Usuarios foram listados!");
        } catch (Exception erroListarUsuarios) {
            System.out.println("Não há usuários registrados");
            log.add(dataFormated + " Erro ao listar usuarios, não há usuarios registrados!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void AdicionarFuncionario(Cafeteria cafeteria, Pessoa funcionario) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.AdicionarFuncionario(funcionario);
            log.add(dataFormated + " Funcionario " + funcionario.getNome() + " cadastrado com sucesso!");
        } catch (Exception erroAdicionarFuncionário) {
            System.out.println("Funcionário ja registrado");
            log.add(dataFormated + " Erro ao cadastrar " + funcionario.getNome() + ", funcionario já cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void RemoverFuncionario(Cafeteria cafeteria, int codFuncionario) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.RemoverFuncionario(codFuncionario);
            System.out.println("Funcionario removido!");
            log.add(dataFormated + " Funcionario, com id " + codFuncionario + " removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Funcionario, com id " + codFuncionario + " não encontrado");
            log.add(dataFormated + " Erro ao remover, funcionario com id " + codFuncionario + " não cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void AdicionarUsuario(Cafeteria cafeteria, Pessoa usuario) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.AdicionarUsuario(usuario);
            log.add(dataFormated + " Usuario " + usuario.getNome() + " cadastrado com sucesso!");
        } catch (Exception erroAdicionarUsuario) {
            System.out.println("Usuário ja registrado");
            log.add(dataFormated + " Erro ao cadastrar " + usuario.getNome() + ", usuario já cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void RemoverUsuario(Cafeteria cafeteria, int codUsuario) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.RemoverUsuario(codUsuario);
            System.out.println("Usuario removido!");
            log.add(dataFormated + " Usuario, com id " + codUsuario + " removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Usuario, com id " + codUsuario + " não encontrado");
            log.add(dataFormated + " Erro ao remover, usuario com id " + codUsuario + " não cadastrado!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    //////// PARTE DA VENDA ////////
    public static void ListarVendas(Cafeteria cafeteria) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            System.out.println(cafeteria.ListarVendas());
            log.add(dataFormated + " Vendas foram listadas!");
        } catch (Exception erroListarVenda) {
            System.out.println("Não há vendas registradas");
            log.add(dataFormated + " Erro ao listar vendas, não há vendas registradas!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void AdicionarVenda(Cafeteria cafeteria, Venda venda) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.AdicionarVenda(venda);
            log.add(dataFormated + " Venda " + venda.getIdVenda() + " cadastrada com sucesso!");
        } catch (Exception erroAdicionarVenda) {
            System.out.println("Venda ja registrada");
            log.add(dataFormated + " Erro ao cadastrar venda " + venda.getIdVenda() + ", venda já cadastrada!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

    public static void RemoverVenda(Cafeteria cafeteria, int codVenda) throws Exception{
        Textos log = new Textos(new ArrayList<String>());
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormated = data.format(formato);

        try {
            cafeteria.RemoverVenda(codVenda);
            log.add(dataFormated + " Venda " + codVenda + " removida com sucesso!");
        } catch (Exception erroRemoverVenda) {
            System.out.println("Venda não encontrada");
            log.add(dataFormated + " Erro ao remover venda " + codVenda + ", venda não cadastrada!");
        }
        Log.salvar(log.getTextos(), "Log");
    }

}
