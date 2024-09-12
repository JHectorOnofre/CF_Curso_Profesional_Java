package M5InstruccionesDeControl;

public class SentenciasDeSalto {


    /* Java admite 3 sentencias de salto:
     * Break: 
            - Permite terminar una secuencia de instrucciones
            - Permite salir de un ciclo (While, Do-While, For)
            - Una forma de "go to"
     
     * Continue: Se usa principalmente dentro de ciclos.
     *      - Permite que el ciclo salte a la siguiente Iteración
     * Return
     */
    
    public static void main(String[] args) {
        
        System.out.println("Ejemplos que tienen un Break:");
        //Break and Continue
        int valor = 10;

        switch(valor) {
            case 10:
                System.out.println("Es 10");
                break;//interrumpe la ejecución, impidiendo el default
            
            default:
                System.out.println("No es 10");
        }
        System.out.println();



        for (int x = 1; x < 31; x++) {
            if (x == 15) {
                break; // Al llegar a 14, se detendrá
            }
            System.out.println(x);
        }
        System.out.println("Ciclo completado!");
        System.out.println(); // Salto de línea



        for (int i = 0; i < 3; i++) { // Ciclo que itera 3 veces
            System.out.println("Siguiente" + i + ": ");

            for(int j = 0; j < 50; j++) { // Ciclo anidado que itera 50 veces
                if (j == 10) { // Se detiene a la 10 iteración del ciclo j
                    break;
                }
                System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println("Ciclo completado");
        System.out.println();
        


        System.out.println("Ejempos de Continue");
        for (int x = 0; x < 10; x++) {
            if (x == 5) { //Al llegar al número marcado "continue" lo salta y continua
                continue;
            }
            System.out.println(x); // 0 a 10 "saltando" el 5
        }

    }
}
