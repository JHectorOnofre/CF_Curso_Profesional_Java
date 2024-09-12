package M7ClasesYObjetos.main;

public class Perro {
    // representar una entidad "Perro"

    // 1. generando un par de ATRIBUTOS  , para ello se requieren un par de 
    //variables dentro del bloque de la clase:

    String nombre;
    String raza;
    int edad;
  
    /* 5. Se genera un nuevo método para establecer un valor a los atributos de 
    la  clase Perro. No serán valores por default, sino valores que provengan de parámetros */
    void establecerAtributos(String nombre, String raza, int edad) {

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    // 4. Métodos: Para definir acciones a nuestra clase, se crean los 3 siguientes métodos:
    void comer() { // "void" significa que no va a retornar un valor
        System.out.println("El perro se encuentra comiendo");
    }

    void dormir() {
        System.out.println("El perro se encuentra durmiendo");
    }

    void ladrar(){
        System.out.println("El perro se encuentra ladrando");
    }

}
