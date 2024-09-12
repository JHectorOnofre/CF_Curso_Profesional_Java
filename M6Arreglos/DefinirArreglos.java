package M6Arreglos;

public class DefinirArreglos {

    public static void main(String[] args) {
        
        // Otras formas de declarar un Arreglo 
        
        // 1 - Decalarar e inicializar por separado:
        String nombres [];
        nombres = new String[5]; //limitado a 5 elementos (0a4)


        // 2 - Declarar y definir Arreglo en 1 línea:
        String apellidos [] = new String[3];


        /* 3 - Declarar el arreglo y Colocar los valores directamente orden: 
         * Útil cuando YA sabemos los valores a almacenar y el ORDEN
         * en que se van a almacenar
        */
        String lenguajes [] = {"Python", "Java", "JavaScript"};

    }
    /* 
    IMPORTANTE: 
    Independientemente de la forma de declarar un arreglo, si intentamos
    acceder a un índice que NO EXISTA, obtendremos un valor; es importante
    conocer antes el tamaño del arreglo para saber qué índices podemos usar
    */
}
