package M6Arreglos;

public class StringsComoCadenas {

    /* Un String no es mas que una cadena de caracteres, los cuales
     * se encuentran en una posición específica, es decir, que 
     * ¡tienen un índice!
     */
    public static void main(String[] args) {

        // length() = conocer la cantidad de caracteres
        String numeroCaracteres = "Hola mundo";
        System.out.println(numeroCaracteres.length());


        // charArt() = obtener un carácter con respecto a su índice
        String mensaje = "Hola mundo";
        char letraM = mensaje.charAt(5); //contando el espacio
        System.out.println(letraM); //retorna un valor tipo Char
        
        
        // indexOf / lastIndexOf = conocer en qué índice se encuentra un caracter
        String mensaje2 = "Hola Mundo";
        int indiceDe = mensaje2.indexOf("M");
        int ultimoIndice = mensaje2.lastIndexOf("o");
        System.out.println(indiceDe);
        System.out.println(ultimoIndice);

            /*Ambos métodos retornan el índice de la PRIMERA APARICIÓN del caracter 
             bucado, la única DIFERENCIA es que indexOF hará la búsqueda de Izquierda 
             a Derecha, caso conrario con lastIndexOf

             En caso de que el caracter NO EXISTA, retornarán "-1"

             Si queremos que la búsqueda comience a partir de un índice, 
             se colorará un segundo argumento, este será el índice a partir del
             cual se iniciará la búsqueda
             */
        
        String mensaje3 = "Este mensaje poseee más letras a";
        int primerIndice = mensaje3.indexOf("a");
        int segundoIndice = mensaje3.indexOf("a", primerIndice + 1);
        

        // .substring(indiceInicial) = obtener un sub string a partir de un índice dado
        String mensaje4 = "Hola de nuevo";
        int indiceLetraN = mensaje4.indexOf("n");
        
        String subString = mensaje4.substring(indiceLetraN);
        System.out.println(subString);


        // .substring(indiceInicial, indiceFinal) retornar un sub string a determinado 
        String mensaje5 = "Hola de nuevo";
        int indiceLetraL = mensaje5.indexOf("l");
        String subString1 = mensaje5.substring(indiceLetraL, indiceLetraL + 4);
        System.out.println(subString1);


    }
    
}
