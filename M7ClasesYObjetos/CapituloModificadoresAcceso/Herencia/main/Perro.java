package M7ClasesYObjetos.CapituloModificadoresAcceso.Herencia.main;

public class Perro extends Mascota  {

    //Constructor clase Perro
    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void dormir() { 
        System.out.println("El perro duerme");
    }

}
