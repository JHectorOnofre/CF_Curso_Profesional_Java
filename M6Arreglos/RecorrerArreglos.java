package M6Arreglos;

public class RecorrerArreglos {

    public static void main(String[] args) {
    
        int calificaciones [] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        System.out.println("De un total de " + calificaciones.length + " calificaciones"); // conocer longitud del arreglo
    
        // Recorrer con ciclo for
        for (int indice = 0; indice < calificaciones.length; indice ++) {

            suma += calificaciones[indice]; // suma los elementos del arreglo de califs
        }
        float promedio = suma / calificaciones.length; // divide la suma entre el num de elementos
        System.out.println("Su promedio es: " + promedio);

    }
}
