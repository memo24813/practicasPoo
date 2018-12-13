class Estudiante {
    int a; //Se inicializa en cero por cada objeto creado
    static int b;//se inicializa en cero cuando la clase es cargada y no por cada objeto

    Estudiante()
    {
        // Constructor que incremente en 1 la variable static b
        b++;
    }

    public void mostrarInfo()
    {
        System.out.println("Valor de a = "+a);
        System.out.println("Valor de b = "+b);
    }
// en un metodo static solo puede declarar o llamar variables static
// se peude descomentar para ver el error
// public static void incrementar(){
//a++;
//}
}