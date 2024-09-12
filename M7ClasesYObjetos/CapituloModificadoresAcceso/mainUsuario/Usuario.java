package M7ClasesYObjetos.CapituloModificadoresAcceso.mainUsuario;

public class Usuario {
    
    public String username;
    private String password;

    // Constructor
    public Usuario() {
        this.username = "";
        this.password = "";
    }

    public Usuario(String username) {
        this.username = "";
        this.password = "";
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void saluda() {
        System.out.println("Hola, mi user name es " + this.username);
    }


    // Getter
    public String getPassword() {
        return this.password;
    }

    // Setter
    public void setPassword(String password) {
        this.password = password; // asignamos el valor a nuestro atributo
    }
    
}
