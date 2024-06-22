package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import controller.Cafeteria;
// import models.Produto.Produto;
// import view.IFuncionalidade;

public class Serializador {

    public static Cafeteria ler() throws Exception{
        Cafeteria cafeteria = null;
        try{
            File pasta = new File("obj");
            if (!pasta.exists()) {
                pasta.mkdir();
        }

            FileInputStream arqDes = new FileInputStream("obj/arquivo.ser");
            ObjectInputStream oDes = new ObjectInputStream(arqDes);
            cafeteria = (Cafeteria) oDes.readObject();
            oDes.close();
            arqDes.close();

        } catch (FileNotFoundException e) {
            // System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        return cafeteria;
    }

    public static void gravar(Cafeteria cafeteria) throws Exception{ 
        try{
            FileOutputStream arqSer = new FileOutputStream("obj/arquivo.ser");
            ObjectOutputStream oSer = new ObjectOutputStream(arqSer);
            oSer.writeObject(cafeteria);
            oSer.close();
            arqSer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
         } 
    } 
}