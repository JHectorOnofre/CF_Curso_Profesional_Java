package M4Strings;

public class MetodosDeFormato {

    public static void main(String[] args) {
        
        String mensaje = "  Este es un String   ";
        System.out.println(mensaje);

        // Métodos para estandarizar texto
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase()); 

        System.out.println(mensaje.trim()); //remueve espacios al inicio o al final 
        System.out.println(mensaje.toLowerCase().trim());


        // .FORMAT()
        String mensaje2 = "";
        String curso = "Java";
        float valor = 10.872041f; // 6dígitos

        // ".format" Retorna un nuevo String
        mensaje2 = String.format("Bienvenido al curso de %s", curso);
        System.out.println(mensaje2);


        // %d = numeros enteros, %f para flotantes, %s para Strings
        mensaje2 = String.format("El total de %d articulos es %.3f %s", 3, valor, "unidades"); // .3f hace referencia a que mostrará solo 3 digitos
        System.out.println(mensaje2);

        //printf permite imprimir con el formato directamente si el String no se usará después:
        System.out.printf("El total de %d articulos es %.3f %s", 3, valor, "unidades \n"); 
        


        // COMPARAR cadenas
        String cadena1 = "Hola";
        String cadena2 = "hola";

        boolean resultado = cadena2.equals(cadena1); //método Case sensitive, estandarizar mediante .toUpper/LowerCase()
        System.out.println("ambas cadenas son iguales? " + resultado);

        boolean resultadoConcatenado = cadena2.toLowerCase().equals(cadena1.toLowerCase());
        System.out.println(resultadoConcatenado);

        boolean resultadoOptimizado = cadena1.equalsIgnoreCase(cadena2); //compara solo que el texto sea el mismo
        System.out.println(resultadoOptimizado);


        // CONCATENAR
        String nombreUsuario = "Hector";
        String esteCurso = "Curso de Java";

            // concat()
        String usandoConcat = "Hola, bienvenido ".concat(nombreUsuario);
        usandoConcat = usandoConcat.concat(" al ");
        usandoConcat = usandoConcat.concat(esteCurso);
        System.out.println(usandoConcat);

            // +
        String usandoSimbolo = "Hola, bienvenido" + nombreUsuario +" al " + esteCurso + ".";
        System.out.println(usandoSimbolo);

    }

}
