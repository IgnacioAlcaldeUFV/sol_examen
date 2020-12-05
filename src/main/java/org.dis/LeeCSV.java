// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;


// Otros imports ...

public class LeeCSV {

    public List<golfPlayer> parseaCSV(String path) {
        List<golfPlayer> players = csvToBean.parse();
        return players;
    }
}
