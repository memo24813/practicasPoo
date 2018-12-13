//import jdk.nashorn.internal.ir.BreakableNode;

//cual es el efecto de public para un metodo y una clase

public class Matrices{

    public static void main(String[] args)
    {
        int opcion,submenuInt,submenuFloat,matrizid,generaI,generaF,Msuma1,Msuma2,Mresta1,Mresta2,Mmulti1,Mmulti2,Mtras;

       System.out.println("\t\tBienvenido a Operaciones de Matrices");
        generaI=CapturaEntrada.capturarEntero("Cuantas Matrices Enteras Deseas Generar ");
        MatrizInt mInt[]= new MatrizInt[generaI];
        generaF=CapturaEntrada.capturarEntero("Cuantas Matrices Flotantes Deseas Generar ");
        MatrizFloat mFloat[]= new MatrizFloat[generaF];


        do{
            System.out.println("\tQue matrices deseas trabajar?");
            System.out.println("[1] Matriz Entera.");
            System.out.println("[2] Matriz Flotante.");
            System.out.println("[3] Salir.");
            opcion=CapturaEntrada.capturarEntero("Selecciona una opcion");
                switch(opcion)
                {
                    case 1:
                    do{
                        System.out.println("\nSelecciona una opcion:");
                        System.out.println("[1] Generar Una Matriz Entera.");
                        System.out.println("[2] Imprimir Matriz Entera.");
                        System.out.println("[3] Traspuesta De Una Matriz.");
                        System.out.println("[4] Suma De Una Matriz.");
                        System.out.println("[5] Resta De Una Matriz.");
                        System.out.println("[6] Multiplicacion De Una Matriz.");
                        System.out.println("[7] Regresar Al Menu Anterior.");
                        submenuInt=CapturaEntrada.capturarEntero("Selecciona una opcion.");
                                switch(submenuInt)
                                {
                                    case 1:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas usar para generarle numeros aleatorios");
                                    matrizid--;  
                                    if(matrizid>=0 && matrizid<generaI)
                                    {
                                    mInt[matrizid]= new MatrizInt(CapturaEntrada.capturarEntero("Ingresa el numero de renglones"),CapturaEntrada.capturarEntero("Ingresa el numero de columnas")); 
                                    mInt[matrizid].iniciarMatInt();
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI);
                                    }
                                    break;
                                
                                    case 2:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas usar para imprimirla");
                                    matrizid--;  
                                    if(matrizid>=0 && matrizid<generaI)
                                    {
                                    mInt[matrizid].imprimirMatInt();
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI);
                                    }
                                    break;
                
                                    case 3:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas hacer la traspuesta");
                                    matrizid--;  
                                    Mtras=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas guardar la traspuesta");
                                    Mtras--;  
                                    if(matrizid>=0 && matrizid<generaI && Mtras>=0 && Mtras<generaI && Mtras!=matrizid)
                                    {
                                    mInt[Mtras]=OperacionesMatrices.transponerMatInt(mInt[matrizid]); 
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI+" o escogio la misma matriz de la transpuesta para guardar.\n\n");
                                    }
                                    break;
                
                                    case 4:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    Msuma1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la suma");
                                    Msuma1--;  
                                    Msuma2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la suma");
                                    Msuma2--;
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la suma");
                                    matrizid--;  
                                    if(matrizid>=0 && matrizid<generaI && Msuma1>=0 && Msuma1<generaI && Msuma2>=0 && Msuma2<generaI && matrizid!=Msuma1 && matrizid!=Msuma2)
                                    {
                                    mInt[matrizid]=OperacionesMatrices.sumarMatInt(mInt[Msuma1],mInt[Msuma2]); 
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI+" o escogio la misma matriz de las sumas para guardar.\n\n");
                                    }
                                    break;
                
                                    case 5:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    Mresta1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la resta");
                                    Mresta1--;  
                                    Mresta2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la resta");
                                    Mresta2--;
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la resta");
                                    matrizid--;  
                                    if(matrizid>=0 && matrizid<generaI && Mresta1>=0 && Mresta1<generaI && Mresta2>=0 && Mresta2<generaI && matrizid!=Mresta1 && matrizid!=Mresta2)
                                    {
                                    mInt[matrizid]=OperacionesMatrices.restarMatInt(mInt[Mresta1],mInt[Mresta2]); 
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI+" o escogio la misma matriz de las sumas para guardar.\n\n");
                                    }
                                    break;
                
                                    case 6:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    Mmulti1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la multiplicacion");
                                    Mmulti1--;  
                                    Mmulti2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la multiplicacion");
                                    Mmulti2--;
                                    matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la resta");
                                    matrizid--;  
                                    if(matrizid>=0 && matrizid<generaI && Mmulti1>=0 && Mmulti1<generaI && Mmulti2>=0 && Mmulti2<generaI && matrizid!=Mmulti1 && matrizid!=Mmulti2)
                                    {
                                    mInt[matrizid]=OperacionesMatrices.multiplicarMatInt(mInt[Mmulti1],mInt[Mmulti2]); 
                                    }else
                                    {
                                        System.out.println("Lo sentimos, escogio una matriz mayor a "+generaI+" o escogio la misma matriz de las sumas para guardar.\n\n");
                                    }
                                    break;

                                    case 7:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }

                        }while(submenuInt!=7);
                    break;

                    case 2:
                    do{
                    System.out.println("\nSelecciona una opcion:");
                        System.out.println("[1] Generar Una Matriz Flotante.");
                        System.out.println("[2] Imprimir Matriz Flotante.");
                        System.out.println("[3] Traspuesta De Una Matriz.");
                        System.out.println("[4] Suma De Una Matriz.");
                        System.out.println("[5] Resta De Una Matriz.");
                        System.out.println("[6] Multiplicacion De Una Matriz.");
                        System.out.println("[7] Regresar Al Menu Anterior.");
                        submenuFloat=CapturaEntrada.capturarEntero("Selecciona una opcion.");
                    switch(submenuFloat)
                    {
                        case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas usar para generarle numeros aleatorios");
                        matrizid--;  
                        if(matrizid>=0 && matrizid<generaF)
                        {
                        mFloat[matrizid]= new MatrizFloat(CapturaEntrada.capturarEntero("Ingresa el numero de renglones"),CapturaEntrada.capturarEntero("Ingresa el numero de columnas")); 
                        System.out.println("holis");
                        mFloat[matrizid].iniciarMatFloat();
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF);
                        }
                        break;
                    
                        case 2:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas usar para imprimirla");
                        matrizid--;  
                        if(matrizid>=0 && matrizid<generaF)
                        {
                        mFloat[matrizid].imprimirMatFloat();
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF);
                        }
                        break;
    
                        case 3:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas hacer la traspuesta");
                        matrizid--;  
                        Mtras=CapturaEntrada.capturarEntero("Escoje el numero de matriz que deseas guardar la traspuesta");
                        Mtras--;  
                        if(matrizid>=0 && matrizid<generaF && Mtras>=0 && Mtras<generaF && Mtras!=matrizid)
                        {
                        mFloat[Mtras]=OperacionesMatrices.transponerMatFloat(mFloat[matrizid]); 
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF+" o escogio la misma matriz de la transpuesta para guardar.\n\n");
                        }
                        break;
    
                        case 4:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        Msuma1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la suma");
                        Msuma1--;  
                        Msuma2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la suma");
                        Msuma2--;
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la suma");
                        matrizid--;  
                        if(matrizid>=0 && matrizid<generaF && Msuma1>=0 && Msuma1<generaF && Msuma2>=0 && Msuma2<generaF && matrizid!=Msuma1 && matrizid!=Msuma2)
                        {
                        mFloat[matrizid]=OperacionesMatrices.sumarMatFloat(mFloat[Msuma1],mFloat[Msuma2]); 
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF+" o escogio la misma matriz de las sumas para guardar.\n\n");
                        }
                        break;
    
                        case 5:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        Mresta1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la resta");
                        Mresta1--;  
                        Mresta2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la resta");
                        Mresta2--;
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la resta");
                        matrizid--;  
                        if(matrizid>=0 && matrizid<generaF && Mresta1>=0 && Mresta1<generaF && Mresta2>=0 && Mresta2<generaF && matrizid!=Mresta1 && matrizid!=Mresta2)
                        {
                        mFloat[matrizid]=OperacionesMatrices.restarMatFloat(mFloat[Mresta1],mFloat[Mresta2]); 
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF+" o escogio la misma matriz de las sumas para guardar.\n\n");
                        }
                        break;
    
                        case 6:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        Mmulti1=CapturaEntrada.capturarEntero("Escoje el numero de la primera matriz que deseas hacer la multiplicacion");
                        Mmulti1--;  
                        Mmulti2=CapturaEntrada.capturarEntero("Escoje el numero de la segunda matriz que deseas hacer la multiplicacion");
                        Mmulti2--;
                        matrizid=CapturaEntrada.capturarEntero("Escoje el numero de la matriz donde deseas guardar la resta");
                        matrizid--;  
                        if(matrizid>=0 && matrizid<generaF && Mmulti1>=0 && Mmulti1<generaF && Mmulti2>=0 && Mmulti2<generaF && matrizid!=Mmulti1 && matrizid!=Mmulti2)
                        {
                        mFloat[matrizid]=OperacionesMatrices.multiplicarMatFloat(mFloat[Mmulti1],mFloat[Mmulti2]); 
                        }else
                        {
                            System.out.println("Lo sentimos, escogio una matriz mayor a "+generaF+" o escogio la misma matriz de las sumas para guardar.\n\n");
                        }
                        break;
                        case 7:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }
                     }while(submenuFloat!=7);

                    break;

                    case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                }

        }while(opcion!=3);
    }
    
}