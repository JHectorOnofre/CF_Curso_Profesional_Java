package M6Arreglos;

public class InsertarRegistros {
    
    public static void main(String[] args) {
        

        /* 1.Un arreglo que se declara y determina a tener 10 elementos
         * 2.Se almacenan (insertan) valores en cada índice
         * 3.Se imrpime cada valor
         */
        int valores[] = new int[10]; // 1.

        System.out.println("Versión NO optima en código: "); // 2. incersión
        valores[0] = 0;
        valores[1] = 1;
        valores[2] = 2;
        valores[3] = 3;
        valores[4] = 4;
        valores[5] = 5;

        System.out.println(valores[0]); // 3. Impresión de valores
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);
        System.out.println(valores[4]);
        System.out.println(valores[5]);

        System.out.println();


        System.out.println("Versión optimizada:");
        // ¿Cómo optimizar para un arreglo de n elementos?
        int valores2[] = new int[10];
            // en cada iteración asignamos un valor a un índice:
        for (int indice = 0; indice < valores2.length; indice++) {

            valores2[indice] = indice;
        } // 2. El ciclo optimiza la parte de inserción

        for (int valor : valores2) {
            System.out.println(valor);
        } // 3. Optimiza la impresión de valores


    }
}
