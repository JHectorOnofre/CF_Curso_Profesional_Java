package M3OperadoresAritmeticos;

public class Cast {

    public static void main(String[] args) {
        
        int variableA = 50, variableM = 10;
        float variableZ = 5.5f;
        int resultado;
        float resultado2;

        // Cast: convertir el valor de una variable en un tipo en concreto

        resultado = variableA + (int)variableZ; //5.5 
        System.out.println(resultado);

        resultado2 = (float)variableM + variableZ;
        System.out.println(resultado2);
    }

}
