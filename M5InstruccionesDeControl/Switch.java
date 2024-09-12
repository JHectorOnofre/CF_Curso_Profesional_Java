package M5InstruccionesDeControl;

public class Switch {

    public static void main(String[] args) {

        // Instrucción de Iteración

        /* En java, la sentencia Switch nos permitirá ejecutar diferentes partes
         * de código basándonos en una expresión, el valor de esta puede ser:
         * - un entero, un String, un enumerador pero NO un boolean
         * 
         * Es una opción más óptima a grandes condiciones que pudieran contener
         * muchas sentencias "else if"
         * 
         * Al igual que el If y Else if, la forma en la que se evalúan los casos
         * es DESCENDENTE
         */

         // Caso semáforo:
         String colorLuz = "Rosa";

         switch (colorLuz) {

            case "Verde":
                System.out.println("Puede continuar");
                break; // palabra reservada que termina un flujo
            
            case "Amarillo":
                System.out.println("Alto parcial");
                break;
                
            case "Rojo":
                System.out.println("Alto total");
                break;

            default : 
                System.out.println("Color NO válido");
            /* una vez definidos todos los casos que nos interesan y 
            exista posibilidad de retornar otro valor (otro color), default se 
            ejecutará cuando ninguno de los casos contemplados se cumpla 
            
            Al ser el último bloque en ejecutarse, no es necesario colocar un 'break' */
         }
        
    }
}
