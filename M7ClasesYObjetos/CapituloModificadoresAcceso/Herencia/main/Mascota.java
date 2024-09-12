package M7ClasesYObjetos.CapituloModificadoresAcceso.Herencia.main;

public class Mascota {
    
    //Atributos
    public String nombre;
    public String raza;
    public int edad;

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Métdos
    public void dormir() {
        System.out.println("La mascota duerme");
    }
    //Getter
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
