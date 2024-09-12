package M5InstruccionesDeControl;

public class DoWhile {
    
    public static void main(String[] args) {
        
        /*Do While nospermitirá ejecutar un bloque de código de forma repetida hasta que
         * una condición deje de cumplirse. A diferencia del ciclo While, este debe de
         * ejecutarse por lo menos una vez
         */

         //while: primero se evalúa, si se cumple, se ejecuta
         int contadorWhile = 10;
         while (contadorWhile < 10) {
            System.out.println("Contador While: " + contadorWhile);
            contadorWhile++;
            // No se visualiza nada, ya que 10 no es < 10, la condición es falsa
         }

         //Do While: Primero se ejecuta el código 1 vez, si se cumple de nuevo vuelve hasta que no
         int contadorDo = 10;
         do {
            System.out.println("Contador del Do-While: " + contadorDo);
         } while (contadorDo < 10);
    }
}
