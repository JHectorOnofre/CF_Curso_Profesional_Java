package M5InstruccionesDeControl;

public class CicloFor {

    public static void main(String[] args) {
        
        //Ciclo for

        /*  for (inicialización; condición; iteración) {}
        * Las sentencias se ejecutan de izquierda a derecha L->R:

        * inicialización = donde declaramos e inicializamos las variables que vamos a
                usar durante el ciclo (las variables inicialiadas deben ser del mismo tipo)
                
        * Condición que dicta si debe cumplirse otra iteración

        * Iteración = se pueden colocar 1 o 9 sentencias que queremos sean ejecutadas en 
                cada iteración
        */


        // Imprime los resultados de la tabla de multiplicar del número 7:
        System.out.println("Los 10 primeros Multiplos de 7 son: ");
        for (int numero = 7, x = 1; x<11; System.out.println(numero*x), x++) { 
            //x números por los cuales se va a multiplicar
        }
        System.out.println();


        // Legibilidad del código: separando sentencias:
        System.out.println("Tabla de multiplicar del 7: ");
        for (int numero = 7, x = 1; x<11; ) { 
            
            int resultado = numero * x;
            String mensaje = numero + " * " + x + " = " + resultado; //formato

            System.out.println(mensaje);
            x++;
        }
        System.out.println();



        // Números pares del 1 al 50
        System.out.println("Números pares del 1 a 50: ");
        for (int numero = 1; numero < 51; numero ++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
    
}
