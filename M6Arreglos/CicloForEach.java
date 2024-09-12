package M6Arreglos;

public class CicloForEach {

    /* For each: Permite recorrer los elementos de una colección
     * En cada iteración nos permitirá obtener el valor de cada elemento
     * desde el índice 0
     * 
     * Se usa cuando se requiera RECORRER un arreglo Y OBTENER los valores que posee
     * Si queremos insertar o modificar, ser requiere el FOR TRADICIONAL
     */
    public static void main(String[] args) {

        // for each requiere al menos 1 variable (del mismo tipo de dato que el arreglo)

        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        for (int valorPorIndice : calificaciones) {
            suma += valorPorIndice;
        }
        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es " + promedio);
        
    }
}
