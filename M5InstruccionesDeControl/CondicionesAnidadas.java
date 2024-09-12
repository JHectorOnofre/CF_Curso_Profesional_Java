package M5InstruccionesDeControl;

public class CondicionesAnidadas {
    //Condiciones anidadas = condiciones dentro de condiciones 

    public static void main(String[] args) {
        /*El promedio mínimo para aprobar es de 7.
         * Sie l promedio es diez = Muchas felicidades
         * Si es aprobatorio pero menor a diez = Felñicidades
         * Si no es aprobatorio = Es necesario repasar bloques
        */
        int promedio = 9;

        if (promedio >= 7 ) {
            // Condicion anidada
            if (promedio == 10) {
                System.out.println("Muchas felicidades");
            } else {
                System.out.println("Felicidades");
            }

        } else {
            // El promedio no es aprobatorio < 7:
            System.out.println("Es necesario repasar bloques");
        }


        // EJEMPLO 2: Scope y Alcance
        int promedio2 = 10; // variable promedio2 declarada dentro del bloque de la Clase

        if (promedio2 > 7) {
            // variable 'mensaje' ha sido declarada dentro del bloque de la condición if
            String mensaje = "Felicidades, tu promedio es de " + promedio2;

            if (promedio2 == 10) {
                System.out.println(mensaje);
            }
        }
        // System.out.println(mensaje); => Error, fuera del Scope donde se declaró
    }
}
