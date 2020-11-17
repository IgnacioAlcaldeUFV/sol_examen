# P1
En este ejercicio vamos a utilizar la libería <b>opencsv</b>. 
Para leer el archivo de entrada "best-golf-players.csv" crearemos un objeto plano (POJO) con atributos semejantes a las columnas del fichero csv indicado en el enunciado.
Para parsear el contenido del archivo en un objeto java utilizaremos anotaciones mediante @CSVBindByName. Así si una columna del fichero CSV se llama "Columna1" de tipo alfanumérico, crearé en el POJO un atributo de las siguiente forma:<br/>
     <i>public class Miclase {<br/>
           ...<br/>
           @CSVBindByName<br/>
           private String Columna1;<br/>
           <br/>
           ... otros atributos ...<br/>
          ....getters & setters...<br/> 
     }<br/></i>
De esta forma podremos parsear directamente cada fila del fichero csv en una lista de objetos correspondiente a MiClase (POJO). Las estructuras de datos y métodos que debemos usar son los siguientes:<br/>
a) Métodos para leer el fichero csv y cargarlo en la lista anterior: <br/>
        <i>BufferedReader fileReader = new BufferedReader(new FileReader("path a mi fichero csv"));<br/>
        CsvToBean<MiClase> csvToBean = new CsvToBeanBuilder<MiClase>(fileReader) //Lista de objetos que facilita opencsv para cargar todas las filas del csv<br/>
                                 .withType(MiClase.class)<br/>
                                 .withIgnoreLeadingWhiteSpace(true) // Para ignorar blancos<br/>
                                 .build()<br/><i/>
b) Parsear el la lista de objetos csv a una lista de objetos de MiClase:<br/>
           <i>List<MiClase> objetosDeMiClase = csvToBean.parse();<br/></i>
Una vez dispongamos de esta lista podemos realizar la serialización de objetos para generar el fichero JSON.
