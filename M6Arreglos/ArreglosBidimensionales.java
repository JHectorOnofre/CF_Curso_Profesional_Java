package M6Arreglos;

public class ArreglosBidimensionales {

    /* En Java un Arreglo "multidimensional" no es más que un 
     * arreglo de arreglos; en lugar de que en un índice se agregue 
     * un valor, se agreaga un arreglo 
     */

    public static void main(String[] args) {
        
        //  Bidimensional = Matríz (tabla que tiene filas y columnas)
        
        /* Se agrega un par de corchetes por cada dimensión, cada uno con 
        la cantidad de elementos que puede almacenar
        [] primer valor = filas
        [] segundo valor = columnas

        Para posicionarse en una celda del tablero, se hace mediante
        2 coordenadas, fila y columnas
        */ 

        //tipoDato nombreMatriz [][] = new tipoDato[nFilas][nColumnas]
        int matriz[][] = new int[4][3]; // 4 filas, 3 columnas

        // fila 1
        matriz[0][0] = 1;// insertamos valor en posición x,y de la 1ra casilla
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        // fila 2
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        // fila 3
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // fila 4
        matriz[3][0] = 10;
        matriz[3][1] = 11;
        matriz[3][2] = 12;

        System.out.println(matriz[0][0]); // Leer la el valor en posición x/y (fila/columna)

        // recorrer una matriz bidimensional con ciclo for anidado (1-filas, 2-columnas)
        System.out.println("con for anidado:");
        for (int posicionX = 0; posicionX < matriz.length; posicionX ++) {

            for (int posicionY = 0; posicionY < matriz[posicionX].length; posicionY ++) {

                System.out.println(matriz[posicionX][posicionY]);
            }
        }
        System.out.println();


        // Refactor: hacerlo con un for each:
        System.out.println("refactor con for each:");
        for ( int[] fila : matriz) {
            for (int celda : fila) {
                System.out.println(celda);
            }
        }
    }
    
}
