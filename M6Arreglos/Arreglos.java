package M6Arreglos;

/* Arreglo - Estructura de datos:
 * Permite almaenar datos del MISMO TIPO
 * La longitud es INMUTABLE en tiempo de ejecución una vez definida
 * A cada elemento /dato dentro le corresponde un índice
 *      - Para leerlos, modificarlos, insertar nuevos, etc
 *      - En Java el indice inicial es 0
 * Los arreglos pueden ser de n dimensiones
 */

public class Arreglos {

    public static void main(String[] args) {
        
        // TipoDato nombreEnPlural [];
        String nombres [];
        nombres = new String [5]; // Se inicializa y da tamaño de 5 (de 0a4)

        // Escritura/Insertar elemento:
        nombres [0] = "Hector"; // Se agreaga en el indice 0 (al inicio)

        // lectura:
        System.out.println(nombres[0]); // los valores se obtienen mediante su índice
        System.out.println(nombres[1]); // null => representación de ausencia de un valor
        System.out.println(nombres[2]);

    }

}
