package M7ClasesYObjetos.CapituloModificadoresAcceso.Herencia.main;

public class Main {

    public static void main(String[] args) {
        
        //Instancias:
        Gato gato = new Gato ("gato", "raza", 2);
        Perro perro = new Perro ("perro", "raza", 4);

        gato.dormir();
        perro.dormir();
    }

}
