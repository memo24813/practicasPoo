import java.util.Scanner;

public class Calcular_rfc{

    public static void main(String args[])
    {
        Scanner opcion=new Scanner(System.in);
        RFC rfc= new RFC();
        Persona alumno=new Persona();
        Persona maestro=new Persona();
        int op,opm1;

        do{
            System.out.println("\t\tCALCULAR RFC");
            System.out.println("1) RFC para alumno.");
            System.out.println("2) RFC para maestro.");
            System.out.println("3) Salir.");  
            opm1=opcion.nextInt();
            switch(opm1)
            {
                case 1:
                do{
                    System.out.println("\t\tCALCULAR RFC Alumno");
                    System.out.println("1) Ingresar Datos.");
                    System.out.println("2) Imprimir RFC.");
                    System.out.println("3) Imprimir Datos.");
                    System.out.println("4) Salir.");
                    op=opcion.nextInt();
                    switch(op)
                    {
                        case 1:
                        System.out.println("Ingrese primer nombre:");
                        opcion.nextLine();
                        alumno.setPrimer_Nombre(opcion.nextLine());
                
                        System.out.println("Ingrese segundo nombre:");
                        alumno.setSegundo_Nombre(opcion.nextLine());
                
                        System.out.println("Ingrese apellido paterno:");
                        alumno.setApellido_Paterno(opcion.nextLine());
                
                        System.out.println("Ingrese apellido materno:");
                        alumno.setApellido_Materno(opcion.nextLine());
                
                        System.out.println("Ingrese edad en este formato dia/mes/anio ejemplo 22/07/1990:");
                        alumno.setFecha(opcion.nextLine());
                 
                        break;
                        
                        case 2:
                        System.out.println("Su rfc es: "+rfc.calcular_Rfc(alumno.getPrimer_Nombre(),alumno.getSegundo_Nombre(),alumno.getApellido_Paterno(),alumno.getApellido_Materno(),alumno.getFecha()));
                        
                        break;
            
                        case 3:
                        System.out.println("Primer Nombre: "+alumno.getPrimer_Nombre());
                        System.out.println("Segundo Nombre: "+alumno.getSegundo_Nombre());
                        System.out.println("Apellido Paterno: "+alumno.getApellido_Paterno());
                        System.out.println("Apellido Materno: "+alumno.getApellido_Materno());
                        System.out.println("Fecha nacimiento: "+alumno.getFecha());
                        break;
            
                        case 4:
                        System.out.println("Sera enviado al menu anterior...");
                        break;
                    }
                    }while(op!=4);
                break;

                case 2:
                do{
                    System.out.println("\t\tCALCULAR RFC Maestro");
                    System.out.println("1) Ingresar Datos.");
                    System.out.println("2) Imprimir RFC.");
                    System.out.println("3) Imprimir Datos.");
                    System.out.println("4) Salir.");
                    op=opcion.nextInt();
                    switch(op)
                    {
                        case 1:
                        System.out.println("Ingrese primer nombre:");
                        opcion.nextLine();
                        maestro.setPrimer_Nombre(opcion.nextLine());
                
                        System.out.println("Ingrese segundo nombre:");
                        maestro.setSegundo_Nombre(opcion.nextLine());
                
                        System.out.println("Ingrese apellido paterno:");
                        maestro.setApellido_Paterno(opcion.nextLine());
                
                        System.out.println("Ingrese apellido materno:");
                        maestro.setApellido_Materno(opcion.nextLine());
                
                        System.out.println("Ingrese edad en este formato dia/mes/anio ejemplo 22/07/1990:");
                        maestro.setFecha(opcion.nextLine());
                 
                        break;
                        
                        case 2:
                        System.out.println("Su rfc es: "+rfc.calcular_Rfc(maestro.getPrimer_Nombre(),maestro.getSegundo_Nombre(),maestro.getApellido_Paterno(),maestro.getApellido_Materno(),maestro.getFecha()));
                        
                        break;
            
                        case 3:
                        System.out.println("Primer Nombre: "+maestro.getPrimer_Nombre());
                        System.out.println("Segundo Nombre: "+maestro.getSegundo_Nombre());
                        System.out.println("Apellido Paterno: "+maestro.getApellido_Paterno());
                        System.out.println("Apellido Materno: "+maestro.getApellido_Materno());
                        System.out.println("Fecha nacimiento: "+maestro.getFecha());
                        break;
            
                        case 4:
                        System.out.println("Sera enviado al menu anterior...");
                        break;
                    }
                    }while(op!=4);
                break;

                case 3:
                System.out.println("Adios!!..");
                break;
            }  
        }while(opm1!=3);
        opcion=null;
        System.runFinalization();
    }
}