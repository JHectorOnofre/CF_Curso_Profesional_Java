package M7ClasesYObjetos.CapituloModificadoresAcceso.mainUsuario;

public class Main {

    public static void main(String[] args) {
        
        // Modificadores de acceso
        /* 
        Usuario hector = new Usuario("Hector", "Pass"); // instancia 

        System.out.println(hector.username);
        System.out.println(hector.getPassword());

        hector.saluda(); */

        //Sobrecarga de constructores:
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Usuario2");
        Usuario usuario3 = new Usuario("Usuario3", "Password");

        usuario1.saluda();
        usuario2.saluda();
        usuario3.saluda();
    }

} 
