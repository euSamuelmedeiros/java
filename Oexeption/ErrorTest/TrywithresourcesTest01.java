package Oexeption.ErrorTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TrywithresourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo(){
        try( Reader reader = new BufferedReader(new FileReader("test.txt"));) {

        } catch (IOException e ){

        }
    }

    public static void lerArquivo2() {
        Reader reader = null; // ---> reader = ler arquivo

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
