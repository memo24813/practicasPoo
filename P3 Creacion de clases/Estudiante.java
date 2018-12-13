public class Estudiante{
    String Nombre;
    int Matricula;
    int Periodo_ingreso;
    String Direccion;
    String Fecha_nacimiento;
    boolean Estado_escolar;
    double Promedio;
    int semestre;
    boolean beca;
    String[] Materias;

        public Estudiante(String Nombre,int Matricula,int Periodo_ingreso,String Direccion,String Fecha_nacimiento,boolean Estado_escolar,double Promedio,int semestre,int numMaterias)
        {
            this.Nombre=Nombre;
            this.Matricula=Matricula;
            this.Periodo_ingreso=Periodo_ingreso;
            this.Direccion=Direccion;
            this.Fecha_nacimiento=Fecha_nacimiento;
            this.Estado_escolar=Estado_escolar;
            this.Promedio=Promedio;
            this.Materias=new String[numMaterias];

            for(int i=1; i<=Materias.length; i++)
            {
              System.out.println("Ingrese Materia "+i+":");
              Materias[i-1]=LectorTeclado.leer();  
            }
        }
    public void Cambiar_Direccion(String Direccion)
    {
        this.Direccion=Direccion;
    }     
    public void ver_Direccion()
    {
        System.out.println(this.Direccion);        
    }
    public void verificar_estado()
    {
        if(Estado_escolar==true)
        {
            System.out.println("Activo.");
        }
            else
            {
                System.out.println("Baja temporal.");
            }
    }
    public void solicitar_Beca()
    {
        if(Promedio>=80 && beca==false)
        {
            System.out.println("Usted ha sido aprobado para tener una beca.");
        }
        else if(beca==true)
        {
            System.out.println("Usted ya tiene una beca");
        }
        else
        {
            System.out.println("Lo sentimos, usted no califica para una beca.");
        }
    }

    public void informacion_Alumno()
    {
        System.out.println("\t\tSistema de Alumnos");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Matricula: "+Matricula);
        System.out.println("Periodo Ingreso: "+Periodo_ingreso);
        System.out.println("Direccion: "+Direccion);
        System.out.println("Fecha de Nacimiento: "+Fecha_nacimiento);
        System.out.print("Estado: ");verificar_estado();
        System.out.println("Promedio: "+Promedio);
        System.out.println("Semestre: "+semestre);
        }
               
    public void imprimir_Horario()
    {
        System.out.println("\t\tTus Materias");
        for(int i=0; i<Materias.length; i++)
        {
            if(this.Materias[i]!="0")
            {
                System.out.println(this.Materias[i]);
            }
        }

    }
    public void baja_Materia()
    {
        String bajaMateria;
        System.out.println("\t\tSistema de bajas");
        System.out.println("Estas materias son las disponibles para dar de baja:");
        for(int i=0; i<Materias.length; i++)
        {
             if(Materias[i].equals("0")==false)
            {
                System.out.println(this.Materias[i]);
            } 
        }
        bajaMateria=LectorTeclado.leer();
        for(int i=0; i<Materias.length; i++)
        {
        if(bajaMateria.equalsIgnoreCase(Materias[i]))
        {
            Materias[i]="0";
            System.out.println("La baja se realizo con exito!!.");
        }

        }
    }

}