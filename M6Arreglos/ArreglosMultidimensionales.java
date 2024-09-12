package M6Arreglos;

public class ArreglosMultidimensionales {

    /* En Java podemos crear arreglos bidimensionales sin necesidad de establecer la longitud de las filas
     * Ejemplo: Se necesita almacenar las calificaciones de 5 alumnos, sin embargo, cada uno cursa una cantidad
     * diferente de materias: El alumno A cursa 2, el alumno B cursa 4, el alumno C cursa 5, el alumno D cursa
     * 3 y el alumno E sólo 1. Quedando un arreglo (matriz 5x5)"irregular" con algunas celdas sin valor similar a 
     * la siguiente:
     * 
     * A |  9 | 10 |    |    |    |
     * B | 10 | 10 | 10 | 10 |    |
     * C |  9 |  9 | 10 | 10 | 10 |
     * D | 10 | 10 | 10 |    |    |
     * E | 08 |    |    |    |    |
     * 
     * Se debe crear un Arreglo que almacene arreglos de diferentes longitudes:
     * 
     */

     public static void main(String[] args) {
        // 1. tipoDato ArregloBidimensional[][] = new [5][] => Como la longitud de filas es irregular, sólo se especifca cuántas tendrá
        int calificaciones[][] = new int[5][]; // arreglo que posee 5 filas, cada una poseera una longitud diferente

        // 2. se asigna un nuevo arreglo a cada fila:
        calificaciones [0] = new int [1]; // alumno E: Fila 0 - 1 calificación
        calificaciones [1] = new int [2]; // alumno A: Fila 1 - 2 caflificaciones
        calificaciones [2] = new int [3]; // alumno D: Fila 2 - 3 calificaciones
        calificaciones [3] = new int [4]; // alumno B: Fila 3 - 4 calificaciones
        calificaciones [4] = new int [5]; // alumno C: Fila 4 - 5 calificaciones
        /*
        * Concepto resultante:
        * E |  8 |
        * A |  9 | 10 |
        * D | 10 | 10 | 10 |
        * B | 10 | 10 | 10 | 10 |
        * C |  9 |  9 | 10 | 10 | 10 |
        */

        // 3. Una vez que se establecen las longitudes, se asignan valores:
        calificaciones [0][0] = 8; // alumno de la primera fila [posion 0, 0] = calificación 8
        
        calificaciones [1][0] = 9;
        calificaciones [1][1] = 10;

        calificaciones [2][0] = 10;
        calificaciones [2][1] = 10;
        calificaciones [2][2] = 10;

        calificaciones [3][0] = 10;
        calificaciones [3][1] = 10;
        calificaciones [3][2] = 10;
        calificaciones [3][3] = 10;

        calificaciones [4][0] = 9;
        calificaciones [4][1] = 9;
        calificaciones [4][2] = 10;
        calificaciones [4][3] = 10;
        calificaciones [4][4] = 10;

        // 4. Para imprimir las calificaciones en consola, a partir de 2 ciclos for

        for (int []calificacionesPorAlumno : calificaciones) {

            for( int calificacion : calificacionesPorAlumno) {

                //Dando formato a la salida
                System.out.print(calificacion + " "); // calificaciones de cada alumno
            }
            System.out.println(""); // cada que se impriman todas las calificaciones de un alumno: un salto de línea
        }
        /*
         * Se genera un arreglo bidimensional sin conocer la longitud de los arreglos por almacenar:
         * 1. declaramos un arreglo de 2 dimensiones, especficando cuántas filas poseeraá
         * 2. en cada fila, almacenasmos un nuevo arreglo que posea la longitud deseada
         */

     }
}
