package M7ClasesYObjetos.main; // Se crea un paquete "main"


public class Main { 

    public static void main(String[] args) {
        /* 2. Para crear un nuevo objeto en el método main se sigue la sig. estructura:
        * a) colocamos el tipo (Perro)
        * b) colocamos en nombre de nuestro objeto ("Lazy")
        * c) signo = new nombreClase()
        */
        Perro lazy = new Perro(); // se instancia un obejo

        //5 - argumentos de los parámetros
        lazy.establecerAtributos("Lassie", "Beagle", 4); 

        // 3. Una vez instanciado el objeto se puede trabajar con sus atributos y métodos:
        //lazy.nombre = "Lazy";
        //lazy.raza = "Beagle";
        //lazy.edad = 4; LA LINEA 17 HACE INNECESARIAS ESTAS LINEAS DE CODIGO

        System.out.println("El nombre es: " + lazy.nombre);
        System.out.println("La raza es: " + lazy.raza);
        System.out.println("La edad es: " + lazy.edad);

        // se manda a llamar el método 
        lazy.comer();
        lazy.dormir();
        lazy.ladrar();
    }
}
