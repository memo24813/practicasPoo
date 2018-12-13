#include "matriz.h"

int main()
{
    int menu,menuInt,menuFloat;
    MatrizInt m1,m2,m3,m4,m5,m12;
    MatrizFloat m6,m7,m8,m9,m10,m11;
    printf("\t\tBienvenido!!.\n");
do{
printf("Que opcion desea realizar?.\n\t1)Generar matriz entera.\n\t2)Generar Matriz flotante.\n\t3) Salir.");
scanf("%d",&menu);
    switch(menu)
    {
        case 1:
            system("cls");
    do{
        printf("\n\nElige una opcion para realizar con una matriz entera.\n");
        printf("\t1) Generar matriz con numeros aleatorios\n\t2) Suma de matrices\n\t3) Resta de matrices\n\t4) traspuesta de matriz\n\t5) Multiplicacion\n\t6)Salir.");
        scanf("%d",&menuInt);    
            switch(menuInt)
            {
                case 1:
                    m1.d.renglon=capturaInt("ingrese renglones m1: ");
                    m1.d.columna=capturaInt("Ingrese columnas m1: ");
                    m1.matriz=reservaMInt(m1.d.renglon,m1.d.columna);
                    m2.d.renglon=capturaInt("ingrese renglon m2: ");
                    m2.d.columna=capturaInt("Ingrese columna m2: ");
                    m2.matriz=reservaMInt(m1.d.renglon,m1.d.columna);
                    iniciarMatrizInt(m1);
                    iniciarMatrizInt(m2);
                    printf("Matriz 1:\n");
                    imprimirMatrizInt(m1);
                    printf("Matriz 2:\n");
                    imprimirMatrizInt(m2);
                break;
                case 2:
                    printf("\nSe imprimiran la suma de las siguientes matrices.\nMatriz 1 + Matriz 2:\n");
                    m3=sumaMatrizInt(m1,m2);
                    imprimirMatrizInt(m3);
                break;
                case 3:
                    printf("\nSe imprimiran la resta de las siguientes matrices.\nMatriz 1 - Matriz 2:\n");
                    m12=restaMatrizInt(m1,m2);
                    imprimirMatrizInt(m12);
                break;
                case 4:
                    m4=traspuestaMatrizInt(m1);
                    printf("\nSe imprimiran la traspuesta de la matriz.\nTraspuesta Matriz 1:\n");
                    imprimirMatrizInt(m4);
                break;
                case 5:
                    printf("\nSe imprimiran la multiplicacion de la matriz 1 y matriz 2.\nMatriz 1 * Matriz 2:\n");
                    m5=multiplicarMatrizInt(m1,m2);
                    imprimirMatrizInt(m5);
                break;
                case 6:
                    mensaje("Sera llevado al menu anterior,\nPresione una tecla para continuar..");
                break;
                default:
                    printf("Ingreso una opcion incorrecta, intenta de nuevo.");
                break;
            }
    }while(menuInt!=6);
        system("cls");
        break;
        case 2:
        system("cls");
    do{
        printf("\n\nElige una opcion para realizar con una matriz Floatante.\n");
        printf("\t1) Genera e imprime matriz con numeros aleatorios.\n\t2) Suma de matrices\n\t3) Resta de matrices\n\t4) traspuesta de matriz\n\t5) Multiplicacion\n\t6)Salir.");
        scanf("%d",&menuFloat);    
            switch(menuFloat)
            {
                case 1:
                    m6.d.renglon=capturaInt("ingrese renglones m1: ");
                    m6.d.columna=capturaInt("Ingrese columnas m1: ");
                    m6.matriz=reservaMFloat(m1.d.renglon,m1.d.columna);
                    m7.d.renglon=capturaInt("ingrese renglon m2: ");
                    m7.d.columna=capturaInt("Ingrese columna m2: ");
                    m7.matriz=reservaMFloat(m1.d.renglon,m1.d.columna);
                    iniciarMatrizFloat(m6);
                    iniciarMatrizFloat(m7);
                    printf("Matriz 1:\n");
                    imprimirMatrizFloat(m6);
                    printf("Matriz 2:\n");
                    imprimirMatrizFloat(m7);
                break;
                case 2:
                    printf("\nSe imprimiran la suma de las siguientes matrices.\nMatriz 1 + Matriz 2:\n");
                    m8=sumaMatrizFloat(m6,m7);
                    imprimirMatrizFloat(m8);
                break;
                case 3:
                    printf("\nSe imprimiran la resta de las siguientes matrices.\nMatriz 1 - Matriz 2:\n");
                    m11=restaMatrizFloat(m6,m7);
                    imprimirMatrizFloat(m11);
                break;
                case 4:
                    m9=traspuestaMatrizFloat(m6);
                    printf("\nSe imprimiran la traspuesta de la matriz.\nTraspuesta Matriz 1:\n");
                    imprimirMatrizFloat(m9);
                break;
                case 5:
                    printf("\nSe imprimiran la multiplicacion de la matriz 1 y matriz 2.\nMatriz 1 * Matriz 2:\n");
                    m10=multiplicarMatrizFloat(m6,m7);
                    imprimirMatrizFloat(m10);
                break;
                case 6:
                    mensaje("Sera llevado al menu anterior,\nPresione una tecla para continuar..");
                break;
                default:
                    printf("Ingreso una opcion incorrecta, intenta de nuevo.");
                break;
            }
    }while(menuFloat!=6);
    system("cls");
        break;
        case 3:
        mensaje("Usted esta saliendo del programa.\n\tpresione una tecla para continuar...");
        if(m1.matriz && m2.matriz && m3.matriz && m4.matriz){
        free(m1.matriz);
        free(m2.matriz);
        free(m3.matriz);
        free(m4.matriz);
        }
        break;
        default:
        mensaje("Selecciono una opcion incorrecta intente de nuevo...\n\tPresione una tecla para continuar..");
        system("cls");
        break;
    }


}while(menu!=3);


    return 0;
}