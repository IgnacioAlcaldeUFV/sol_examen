// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;


// Otros imports ...

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class LeeCSV {

    public List<golfPlayer> parseaCSV(String path) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("best-golf-players.csv"));

            CsvToBean<golfPlayer> csvToBean = new CsvToBeanBuilder<golfPlayer>(fileReader) //Lista de beans para cargar el csv
                    .withType(golfPlayer.class)
                    .withIgnoreLeadingWhiteSpace(true) // Para ignorar blancos
                    .build();

            List<golfPlayer> players = csvToBean.parse();
            return players;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
