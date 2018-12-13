public class Uso_estudiante{
    
     public static void main(String[] args) {
     
        Estudiante e1= new Estudiante();
        Estudiante e2= new Estudiante();
        e1.mostrarInfo();
        e2.mostrarInfo();
        // accediendo a la variable b static de la clase creada
        e1.b++; // incrementa en 1
        // Accediendo directamente desde la clase, sin instanciar un objeto
        Estudiante.b++;// incrementa en 1
        // como se puede ver la variable b static es compartida por todas las
        //instancia de la clase
        e2.mostrarInfo();
    }
}