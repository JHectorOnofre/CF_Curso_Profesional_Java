package M5InstruccionesDeControl;

public class CicloWhile {
    // Estructura de Tipo Iteración

    public static void main(String[] args) {
        // While: Permite ejecutar un bloque de código repetidamente hasta que una condición deje de cmplirse

        int contador = 1;
        while (contador < 11) { // evalúa una condición que retorne un valor booleano
            System.out.println("Hola" + contador);
            contador ++; // cada iteración aumenta 11 para que no se vuelva infinito
        }


        // Es OPTIMO en casos en los que no sabemos cuántas iteraciones vamos a realizar:
        int contador2 = 0;
        int numero = 1500480; // número del cual queremos conocer cantidad de digitos

        // cuando dividimos un número /10 dará como resultado un numero con un digito menos
        // 100 / 10 = 10

        while ( numero > 0 ) {
            numero = numero / 10; 
            contador ++; //cada que quitemos un dígito contamos
        }
        System.out.println("El número dado posee " + contador2 + "dígitos");

    }
    
}
