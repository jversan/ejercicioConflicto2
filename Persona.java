public class Persona(){
    public String DNI;
    public String nombre;
    public String apellidos;
    public int edad;

    /**
     * Creamos el constructor de la clase Persona
     * @author Jose Antonio
     * @version 1.0
     */
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * Creamos los métodos getter y setter de cada una de las variables
     * @author Jose Antonio y David Dorante
     * @version 1.0
     * @return (getter -> devuelve el valor de la variable / setter -> actualiza el valor de la variable)
     */
    public String setDNI(String DNI){
        this.DNI = DNI;
    }

    public String getDNI(){
        return this.DNI;
    }

    public String setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public int setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    /**
     * Creamos un método saludar, en el que la persona va a devolver un saludo indicando su nombre y edad
     * @author David Dorante
     * @version 1.0
     * @return saludo junto a nombre del usuario y su edad
     */
    public void saludar(){
        System.out.println("Hola, soy mi nombre es y me llamo: "+this.nombre+" y tengo "+this.edad + " años");
    }

    /**
     * Creamos un método calcularAnioNacimiento, en el que calculamos el año en el que nació la persona, restando el año actual menos la edad de la persona
     * @author Jose Antonio
     * @version 1.0
     * @return año de nacimiento de la persona
     */
    public int calcularAnioNacimiento() {
        int anioActual = 2023;
        return anioActual - this.edad;
    }


}