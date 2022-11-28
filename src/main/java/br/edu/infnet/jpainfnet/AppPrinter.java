package br.edu.infnet.jpainfnet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.jpainfnet.model.interfaces.IPrinter;

public class AppPrinter {
    public static void imprimir(String mensagem, IPrinter printer) {
        System.out.println(mensagem);

        printer.impressao();
    }

    public static void readFromFile(String arquivo) {
        String path = "src/main/resources/static/" + arquivo + ".txt";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();
            while(linha !=null){
                System.out.println(linha);

                linha = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
