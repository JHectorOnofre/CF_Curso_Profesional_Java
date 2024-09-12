package M5InstruccionesDeControl;

/* Las instrucciones de control nos permiten que el flujo de ejecución de
 * nuestro programa avance, se detenga o se ramifique según los cambios
 * en el estado del programa. En Java podemos definir 3 tipos de instrucciones:
 * - De seleccción 
 * - De iteración 
 * - De salto 
 */

public class Condicionales {

    public static void main(String[] args) {
        
        /*  Instrucción de Selección: permiten ejecutar ciertos bloques de código 
        dependiendo de ciertos criterios a evaluar, es decir Condicionar el código
        por medio de la palabra reservada "if" 
        */

        String colorLuz = "Verde";

        if (colorLuz.equals("Verde")) {

            System.out.println("Puede avanzar");

        } else if (colorLuz.equals("Amarillo")) {

            System.out.println("Alto parcial");

        } else if (colorLuz.equals("Rojo")) { // Si no es 

            System.out.println("Alto total");

        } else {
            System.out.println("El color no es válido");
        }

    }

}
