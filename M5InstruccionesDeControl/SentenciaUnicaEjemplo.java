package M5InstruccionesDeControl;

public class SentenciaUnicaEjemplo {

    public static void main(String[] args) {
        
        /*Cuando nos encontramos trabajando con Ciclo, condiionales
         * o Else, (aquellos que únicamente ejecuten 1 línea de código)
         * podemos OMITIR el uso de llaves {}
         * 
         * Son OBLIATORIAS cuando se ejecutan 2 o más, de esta forma
         * se está creadno un bloque
         */
        
        boolean valor = true;

        if (valor) // {
            System.out.println("Es verdadero");
            // }
        else // {
            System.out.println("Es falso");
        // }
        

        for (int x = 0; x < 5; x++) //{
            System.out.println("Mensaje");
        //}

    }
    
}
