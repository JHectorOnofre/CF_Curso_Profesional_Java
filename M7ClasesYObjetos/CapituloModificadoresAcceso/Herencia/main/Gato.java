package M7ClasesYObjetos.CapituloModificadoresAcceso.Herencia.main;

public class Gato extends Mascota {

    //Constructor clase Gato
    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }
    
    @Override
    public void dormir() { 
        super.dormir(); //Super = clase padre
        System.out.println("El gato duerme");
    }
}
