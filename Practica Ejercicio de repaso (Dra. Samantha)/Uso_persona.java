public class Uso_persona{


    public static void main(String[] args) {
    
        Persona p1 = new Persona();
        Persona p2 = new Persona("Alex");
        Persona p3 = new Persona(20);
        Persona p4 = new Persona("Alex",20);


        System.out.println("Nombre: "+p1.nombre+", edad: "+p1.edad);
        System.out.println("Nombre: "+p2.nombre+", edad: "+p2.edad);
        System.out.println("Nombre: "+p3.nombre+", edad: "+p3.edad);
        System.out.println("Nombre: "+p4.nombre+", edad: "+p4.edad);

        p1.unMetodo(15);
        p2.unMetodo(15.5f);
    }
}