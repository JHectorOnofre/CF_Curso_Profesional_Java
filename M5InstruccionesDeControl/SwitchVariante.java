package M5InstruccionesDeControl;

public class SwitchVariante {

    public static void main(String[] args) {
        
        // EJEMPLO 1
        char calificacion = 'B';

        switch(calificacion) {
            case 'A' :
                System.out.println("Excelente!");
                break;
            
            case 'B' :
            case 'C' :
                System.out.println("Bien hecho");
                break;
            
            case 'D':
                System.out.println("Aprobatorio");
                break;

            case 'F':
                System.out.println("Puedes mejorar!");
                break;

            default:
                System.out.println("Calificación no válida");

        }
            /* Si un break no se encuentra se procede a ejecutar el caso siguiente.
             * Se imprimirían las respuestas de los casos B y subsecuentes hasta el
             * último en ejecutar
             */

        //EJEMPLO 2: Estructura base
        int i = 5;

        switch (i) {
            case 0: 
                System.out.println("i es cero");
                break;
            case 1: 
                System.out.println("i es uno");
                break;
            case 2: 
                System.out.println("i es dos");
                break;
            case 3: 
                System.out.println("i es tres");
                break;
            default :
                System.out.println("i es mayor que tres");
        }


        //EJEMPLO 3:
        int a = 2;

        switch(a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("a es menor que 5");
                break;
            case 5:
                System.out.println("a es igual a cinco");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("a es mayor a 6 y menor a 10");
                break;
            default:
                System.out.println("a es 10 o mayor a 10");
        }


        // EJEMPLO 4
        int numeroMes = 4;
        String estacion = "", mes = "";

        switch (numeroMes) {
            case 12:
                mes = "Diciembre";
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                mes = "Marzo";
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
                break;
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;
            case 9: 
                mes = "Septiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;
        } // End switch Ejemplo4
        System.out.println("El mes de " + mes+ " se encuentra en la estación de " + estacion);
    }
    
    
}
