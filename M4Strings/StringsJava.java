package M4Strings;

public class StringsJava {

    public static void main(String[] args) {

        // String = tipo "Clase", no un tipo de dato primitivo

        String mensaje = "Hola soy una cadena";
        String mensaje2 = new String("Texto"); //sintaxis válida


        System.out.println(mensaje);
        System.out.println(mensaje2);
        

        //Métodos para Strings:

        int cantidad = mensaje.length(); //num elementos
        boolean contiene = mensaje.contains("hola"); //case sensitive

        System.out.println(cantidad);
        System.out.println(contiene);


        boolean comienzaCon = mensaje.startsWith("Hola");
        boolean terminaCon = mensaje.endsWith("String");

        System.out.println(comienzaCon);
        System.out.println(terminaCon);

        // .concat() = sólo puede unir 2 Strings
        String nuevoString = mensaje.concat(" este es el Modulo de Strings en Java");
        System.out.println(nuevoString);

    }
        

}
