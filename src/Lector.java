import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.com.google.Gson;/*
import java.lang.reflect.*;*/





public class Lector {
    public static void main (String[] args){
        String json= "";

        try {

            BufferedReader br=new BufferedReader(new FileReader("ejemplo.jason"));


            String linea="";
            while ((linea= br.readLine()) != null){
                json += linea;

            }
            br.close();

        }catch(FileNotFoundException ex){
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);

        }catch(IOException ex){
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(json);
        Gson gson = new Gson();
        carta c=     gson.fromJson(json, Carta.class);
        System.out.println(c);

    }
}