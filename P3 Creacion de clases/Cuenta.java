public class Cuenta{

    String nombre_Propietario;
    String direccion;
    int num_Cuenta;
    int fecha_Activacion;
    double balance;
    int fecha_Nacimiento;
    String num_Tarjeta;
    int cvv;
    int fecha_Vencimiento;

    public Cuenta(String nombre_Propietario,String direccion,int num_Cuenta,int fecha_Activacion,double balance,int fecha_Nacimiento,String num_Tarjeta,int cvv,int fecha_Vencimiento)
    {
        this.nombre_Propietario=nombre_Propietario;
        this.direccion=direccion;
        this.num_Cuenta=num_Cuenta;
        this.fecha_Activacion=fecha_Activacion;
        this.balance=balance;
        this.fecha_Nacimiento=fecha_Nacimiento;
        this.num_Tarjeta=num_Tarjeta;
        this.cvv=cvv;
        this.fecha_Vencimiento=fecha_Vencimiento;
    }

    void consultar_Saldo()
    {
        System.out.println("Bienvenido "+nombre_Propietario);
        System.out.println("Numero de cuenta: "+num_Cuenta);
        System.out.println("Balace: "+balance);
        System.out.println("Gracias por visitarnos!!.");
    }

    void retirar_Saldo()
    {
        int retiro;
        String captura;
        System.out.println("Bienvenido "+nombre_Propietario);
        System.out.println("Numero de cuenta: "+num_Cuenta);
        System.out.println("Balance: "+balance);
        System.out.println("\t\tCuanto saldo desea retirar?:");
        captura=LectorTeclado.leer();
        retiro=Integer.parseInt(captura);
        if(retiro>balance)
        {
            System.out.println("Lo sentimos no cuenta con el suficiente saldo.");
        }else
        {
            this.balance-=retiro;
            System.out.println("El saldo se retiro con exito!!");
            System.out.println("balance: "+balance);
        }
    }
    void depositar_Saldo()
    {
        int deposito;
        String captura;
        System.out.println("Bienvenido "+nombre_Propietario);
        System.out.println("Numero de cuenta: "+num_Cuenta);
        System.out.println("Balance: "+balance);
        System.out.println("\t\tCuanto saldo desea Depositar?:");
        captura=LectorTeclado.leer();
        deposito=Integer.parseInt(captura);
        if(deposito<=0)
        {
            System.out.println("Lo sentimos no puede depositar cifras negativas o nulas.");
        }else
        {
            this.balance+=deposito;
            System.out.println("El saldo se deposito con exito!!");
            System.out.println("balance: "+balance);
        }
    }
    void cambiar_Direccion(String direccion)
    {
        this.direccion=direccion;
    }
    
    void reportar_Tarjeta()
    {   
        String tarjeta;
        System.out.println("\t\tReporte de tarjetas perdidas");
        System.out.println("Ingrese el numero de tarjeta: ");
        tarjeta=LectorTeclado.leer();
        if(this.num_Tarjeta.equalsIgnoreCase(tarjeta))
        {
            this.num_Tarjeta="431958471039485";
            System.out.println("Su tarjeta ha sido reportada correctamente.\nSe le ha asignado otra tarjeta,solo pase a recogerla");
        }
    }
    void baja_Tarjeta()
    {
        String tarjeta;
        int num_Cuenta;
        System.out.println("Bienvenido a Bajas de tarjeta\n");
        System.out.println("Ingrese num de cuenta:");
        num_Cuenta=Integer.parseInt(LectorTeclado.leer());
        if(this.num_Cuenta==num_Cuenta)
        {
            System.out.println("Bienvenido "+this.nombre_Propietario);
            System.out.println("Ingrese la tarjeta para dar de baja:");
            tarjeta=LectorTeclado.leer();
            if(this.num_Tarjeta.equalsIgnoreCase("0"))
            {
                System.out.println("Su tarjeta ya esta dada de baja.");
            }else if(tarjeta.equalsIgnoreCase(this.num_Tarjeta))
            {
                System.out.println("La tarjeta "+this.num_Tarjeta+"Fue dada de baja.");
                this.num_Tarjeta="0";
            }else
            {
                System.out.println("Usted ingreso un numero de tarjeta erroneo.");
            }
        }
    }
}