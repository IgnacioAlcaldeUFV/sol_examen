//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;
//imports ...

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribeJSON {

    public static void main(String[] args) {

        LeeCSV lector = new LeeCSV();

        List<golfPlayer> golfPlayerList = lector.parseaCSV("best-golf-players.csv");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            FileWriter fileWritter  = new FileWriter("best-golf-players.json");

            gson.toJson(golfPlayerList, fileWritter);
            fileWritter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
 }
