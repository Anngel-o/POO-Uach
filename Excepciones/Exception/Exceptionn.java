package Excepciones.Exception;

import java.io.*;
//La Exception más general abajo de las demás Exceptions
public class Exceptionn {
    static File file = null;
    static FileReader reader = null;
    static BufferedReader buffer = null;
    public static void main(String[] args) throws Exception{
        try {
            file = new File("C:\\Users\\Anngel O\\OneDrive\\Escritorio\\POO Uach\\Excepciones\\Exception\\Mainrn.txt");
            reader = new FileReader(file);
            //FileReader permite leer caracteres
            buffer = new BufferedReader(reader);
            //BufferReader contiene metodos para leer lineas completas

            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            int a;
        } catch (FileNotFoundException ex) { //Error cuando el fichero no existe
            System.out.println("Error: " + ex.getMessage());
        } catch(IOException ex) { //Error al leer el fichero
            System.out.println("Error: " + ex.getMessage());
        } finally {
            //El archivo se cierra si el programa se ejecuta correctamente o si lanza un Exception
            try {
                if (file != null) {
                    reader.close();
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

    }
}
