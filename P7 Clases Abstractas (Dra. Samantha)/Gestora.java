public class Gestora{

        //José Ruiz, No: 741258, desde 2012, 81 clientes captados a 7.90 cada uno.
        //María Núñez, No: 896325, desde 2013, salario fijo base = 1155.00.
    public static void main(String[] args)
    {
        
        EAsalariado empleado1= new EAsalariado(569587,"Javier","Gomez",2008,1225.00);
        EComision empleado2= new EComision(695235,"Eva","Nieto",2010,8.10,179);

        //empleado3
        EComision empleado3= new EComision();
        empleado3.setNum_Trabajador(741258);
        empleado3.setNombre("Jose");
        empleado3.setApellidos("Ruiz");
        empleado3.setAnio_Ingreso(2012);
        empleado3.setNumero_Cliente(81);
        empleado3.setMonto_Cliente(7.90);
        empleado3.setSalario_Comision();
        //empleado 4
        EAsalariado empleado4= new EAsalariado();
        empleado4.setNum_Trabajador(896325);
        empleado4.setNombre("Maria");
        empleado4.setApellidos("Nunez");
        empleado4.setAnio_Ingreso(2013);
        empleado4.setPorcentaje_Adicional(2013);
        empleado4.setSueldo_Fijo(1155.00);
    
        //arreglo de empleados
        Empleado empleados[]= new Empleado[4];
        empleados[0]=empleado1;
        empleados[1]=empleado2;
        empleados[2]=empleado3;
        empleados[3]=empleado4;

        Empleado.sueldoMayor(empleados);
        Empleado.mostrarTodos(empleados);
    }
}