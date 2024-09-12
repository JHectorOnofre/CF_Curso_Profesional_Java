package M3OperadoresAritmeticos;

public class OperadoresRealacionalesLogicos {

    public static void main(String[] args) {
        
     /*OPERADORES RELACIONALES
     * Simbolos que se usan para comparar 2 valores, el 
     * resultado será un valoor tipo boolean
     * 
     * En Java existen 6:
     * > mayor que
     * < menor que
     * >= mayor o igual 
     * <= menor o igual 
     * == igual 
     * != diferente
     */

        int variable1 = 200, variable2 = 200;
        boolean resultado;

        System.out.println("Resultados de operadores relacionales");
   
        resultado = variable1 > variable2;
        System.out.println(resultado);

        resultado = variable1 > variable2;
        System.out.println(resultado);

        resultado = variable1 >= variable2;
        System.out.println(resultado);

        resultado = variable1 <= variable2;
        System.out.println(resultado);

        resultado = variable1 == variable2;
        System.out.println(resultado);

     /*OPERADORES LOGICOS
     * Se obtiene como resultado un valor boolean, a diferencia de los relacionales, 
     * estos se pueden implementar la cantidad de veces que se requiera en una misma
     * expresión
     * 
     * Existen 3:
     * && (AND): todas las condiciones deben cumplirse para que el resultado sea verdadero
     * || (OR): Al menos una condición debe cumpolirse para que resulte verdadero
     * ! (NOT): Niega la condición por el valor contrario     */

        
        boolean resultado2;

        System.out.println("Resultados de operadores logicos:");

        resultado2 = 5 >= 5 && true && 10 > 9; //AND ambas se cumplen: verdadero
        System.out.println(resultado2);

        resultado2 = false || false || false || true; // OR: se cumple 'true'
        System.out.println(resultado2);

        resultado2 = false || false || false; // OR: ninguna se cumple
        System.out.println(resultado2);

        resultado2 = 5 >= (2*3) || false; // OR: ninguna se cumple
        System.out.println(resultado2);

        resultado2 = (5 >= (2*3) || true) && (true && 10 > 5); // OR: ambas se cumplen
        System.out.println(resultado2);


        System.out.println(!true); //Not
        System.out.println(!false); // Not


    }
    
}
