import java.util.Scanner;

public class Captura_Personas{

    public static void main(String[] args)
    {
        int tecla;
        Estudiante Alumno1=new Estudiante();
        Trabajador Trabajador1=new Trabajador();
        Jubilado Jubilado1=new Jubilado();

        Scanner opcion=new Scanner(System.in);
        do{
            System.out.println("\t\t\tBienvenido al Sistema de capturas.\nQue accion desea realizar?");
            System.out.println("\t1)Capturar Estudiante.");
            System.out.println("\t2)Capturar Trabajador.");
            System.out.println("\t3)Capturar Jubilado.");
            System.out.println("\t4)Salir.");
            tecla=opcion.nextInt();

                switch(tecla)
                {
                    case 1:
                            Alumno1.setNombre(Capturar.capturaString("Ingrese Nombre del Alumno:"));
                            Alumno1.setEdad(Capturar.capturaInt("Ingrese Edad del Alumno:"));
                            Alumno1.setMatricula(Capturar.capturaInt("Ingrese Matricula del Alumno:"));
                            Alumno1.setPromedio(Capturar.capturaDouble("Ingrese Promedio del Alumno:"));
                            Alumno1.setNum_Seguro(Capturar.capturaInt("Ingrese Numero de Seguro del Alumno:"));

                            System.out.println("\t\tDatos del Alumno.");
                            System.out.println("Nombre: "+Alumno1.getNombre());
                            System.out.println("Edad: "+Alumno1.getEdad());
                            System.out.println("Matricula: "+Alumno1.getMatricula());
                            System.out.println("Promedio: "+Alumno1.getPromedio());
                            System.out.println("Numero seguro: "+Alumno1.getNum_Seguro());

                    break;

                    case 2:
                    Trabajador1.setNombre(Capturar.capturaString("Ingrese Nombre del Trabajador:"));
                    Trabajador1.setEdad(Capturar.capturaInt("Ingrese Edad del Trabajador:"));
                    Trabajador1.setNum_Empleado(Capturar.capturaInt("Ingrese Numero de Empleado del Trabajador:"));
                    Trabajador1.setRFC(Capturar.capturaString("Ingrese RFC del Trabajador:"));
                    Trabajador1.setNum_Seguro(Capturar.capturaInt("Ingrese Numero de Seguro del Trabajador:"));

                    System.out.println("\t\tDatos del Trabajador.");
                    System.out.println("Nombre: "+Trabajador1.getNombre());
                    System.out.println("Edad: "+Trabajador1.getEdad());
                    System.out.println("Numero empleado: "+Trabajador1.getNum_Empleado());
                    System.out.println("RFC: "+Trabajador1.getRFC());
                    System.out.println("Numero seguro: "+Trabajador1.getNum_Seguro());

                    break;

                    case 3:
                    Jubilado1.setNombre(Capturar.capturaString("Ingrese Nombre del Jubilado:"));
                    Jubilado1.setEdad(Capturar.capturaInt("Ingrese Edad del Jubilado:"));
                    Jubilado1.setNum_Jubilado(Capturar.capturaInt("Ingrese Numero de Jubilado del Jubilado:"));
                    Jubilado1.setRFC(Capturar.capturaString("Ingrese RFC del Jubilado:"));
                    Jubilado1.setNum_Seguro(Capturar.capturaInt("Ingrese Numero de Seguro del Jubilado:"));

                    System.out.println("\t\tDatos del Jubilado.");
                    System.out.println("Nombre: "+Jubilado1.getNombre());
                    System.out.println("Edad: "+Jubilado1.getEdad());
                    System.out.println("Numero Jubilado: "+Jubilado1.getNum_Jubilado());
                    System.out.println("RFC: "+Jubilado1.getRFC());
                    System.out.println("Numero seguro: "+Jubilado1.getNum_Seguro());
                    break;

                    case 4:
                    System.out.println("Adios!!");
                    break;

                    default:
                    System.out.println("ERROR!!\n\nSelecciono una opcion invalida intente de nuevo.");
                    break;    
                }

            
        }while(tecla!=4);

    }
}