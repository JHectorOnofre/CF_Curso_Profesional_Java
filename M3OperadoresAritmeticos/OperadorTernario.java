package M3OperadoresAritmeticos;

public class OperadorTernario {
    public static void main(String[] args) {
    
        /* Operador especial que puede ser usado en casos de:
         * "Si esto, entonces esto" "If that then that (IFTTT)
         * Se usa mediante el signo "?", su estructura es:
         * 
         * expresion1 ? expresion2 : expresion3
         * expresion1 debe evaluar un boolean (su resultado deve ser true/false)
         * Si retorna vardadero, se ejecuta la expresión 2
         * En caso contrario, se ejecuta la expresión 3
         */

         // Regularmente se usa para asignar valores a una variable
         String mensaje = 10 > 9 ? "es mayor" : "es menor";
         System.out.println(mensaje);

         // se puede hacer con variables de cualqueir tipo
         int enteros = true ? 1 : 0; //"si verdadero, entonces 1; caso contrario, 0"
         System.out.println(enteros);
    }

}
