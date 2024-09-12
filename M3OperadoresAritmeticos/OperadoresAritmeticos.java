package M3OperadoresAritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //Operadores Aritméticos

        int variableX = 50, variableY = 10;
        int resultado;

        resultado = variableX + variableY; //suma
        System.out.println(resultado);

        resultado = variableX - variableY; //resta
        System.out.println(resultado);

        resultado = variableX * variableY; //multiplicación
        System.out.println(resultado);

        resultado = variableX / variableY; //division
        System.out.println(resultado);

        variableX++; //incrementa en 1
        System.out.println("la variable X ahora vale: " + variableX);

        variableX--; //decremento en 1
        System.out.println("la variable X ahora vale: " + variableX);

        //Incrementar o Decrecer en "n"
        variableX += 100; 
        System.out.println("la variable X ahora vale: " + variableX);

        variableX -= 50;
        System.out.println("la variable X ahora vale: " + variableX);

        // Multiplicar y dividir por "n"
        variableY *= 3;
        System.out.println("la variable Y ahora vale: " + variableY);

        variableY /= 2;
        System.out.println("la variable Y ahora vale: " + variableY);
    }
}
