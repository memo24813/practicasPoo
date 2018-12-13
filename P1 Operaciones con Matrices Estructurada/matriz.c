#include "matriz.h"

int capturaInt(char mensaje[])
{
    int valor;
    printf("%s",mensaje);
    scanf("%d",&valor);
    printf("\n");
    return valor;
}

int** reservaMInt(int renglon, int columna)
{
    int **m1=(int**)malloc(renglon*sizeof(int*));
    int i;
        for(i=0; i<renglon; i++)
        {
            m1[i]=(int*)malloc(columna*sizeof(int));
        }
        return m1;
}
float** reservaMFloat(int renglon, int columna)
{
    float **m1=(float**)malloc(renglon*sizeof(float*));
    int i;
        for(i=0; i<renglon; i++)
        {
            m1[i]=(float*)malloc(columna*sizeof(float));
        }
        return m1;
}

void iniciarMatrizInt(MatrizInt m1)
{
    if(!m1.matriz)
    {
        printf("No hay memoria.");
    }
    else
    {
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m1.matriz[i][j]=rand()%10;
        }
    }
    }
}

void iniciarMatrizFloat(MatrizFloat m1)
{
    if(!m1.matriz)
    {
        printf("No hay memoria.");
    }
    else
    {
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m1.matriz[i][j]=(rand()%1000)/100.0;
        }
    }
    }
}

void imprimirMatrizInt(MatrizInt m1)
{
    if(!m1.matriz)
    {
    
    }
    else
    {
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            printf("%d\t",m1.matriz[i][j]);
        }
        printf("\n");
    }
    }
}
void imprimirMatrizFloat(MatrizFloat m1)
{
    if(!m1.matriz)
    {
    
    }
    else
    {
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            printf("%.2f\t",m1.matriz[i][j]);
        }
        printf("\n");
    }
    }
}

int validacionMatrizInt(MatrizInt m1,MatrizInt m2)
{
    if(m1.d.columna==m2.d.columna && m1.d.renglon== m2.d.renglon)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int validacionMatrizFloat(MatrizFloat m1,MatrizFloat m2)
{
    if(m1.d.columna==m2.d.columna && m1.d.renglon== m2.d.renglon)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int validacionMultiplicarInt(MatrizInt m1,MatrizInt m2)
{
    if(m1.d.columna==m2.d.renglon)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int validacionMultiplicarFloat(MatrizFloat m1,MatrizFloat m2)
{
    if(m1.d.columna==m2.d.renglon)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

MatrizInt sumaMatrizInt(MatrizInt m1,MatrizInt m2)
{
    int i,j;
    MatrizInt m3;
        m3=m1;
        m3.matriz=reservaMInt(m3.d.renglon,m3.d.columna);
    if(validacionMatrizInt(m1,m2))
    {

        for(i=0; i<m1.d.renglon; i++)
        {
            for(j=0; j<m1.d.columna; j++)
            {
                m3.matriz[i][j]=(m1.matriz[i][j]+m2.matriz[i][j]);
            }
        }
    }
    else
    {
        printf("La matriz no es de la misma dimension, por lo cual no se puede realizar la suma.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    return m3;
}

MatrizInt restaMatrizInt(MatrizInt m1,MatrizInt m2)
{
    int i,j;
    MatrizInt m3;
        m3=m1;
        m3.matriz=reservaMInt(m3.d.renglon,m3.d.columna);
    if(validacionMatrizInt(m1,m2))
    {

        for(i=0; i<m1.d.renglon; i++)
        {
            for(j=0; j<m1.d.columna; j++)
            {
                m3.matriz[i][j]=(m1.matriz[i][j]-m2.matriz[i][j]);
            }
        }
    }
    else
    {
        printf("La matriz no es de la misma dimension, por lo cual no se puede realizar la suma.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    return m3;
}

MatrizFloat sumaMatrizFloat(MatrizFloat m1,MatrizFloat m2)
{
    int i,j;
    MatrizFloat m3;
        m3=m1;
        m3.matriz=reservaMFloat(m3.d.renglon,m3.d.columna);
    if(validacionMatrizFloat(m1,m2))
    {

        for(i=0; i<m1.d.renglon; i++)
        {
            for(j=0; j<m1.d.columna; j++)
            {
                m3.matriz[i][j]=(m1.matriz[i][j]+m2.matriz[i][j]);
            }
        }
    }
    else
    {
        printf("La matriz no es de la misma dimension, por lo cual no se puede realizar la suma.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    return m3;
}

MatrizFloat restaMatrizFloat(MatrizFloat m1,MatrizFloat m2)
{
    int i,j;
    MatrizFloat m3;
        m3=m1;
        m3.matriz=reservaMFloat(m3.d.renglon,m3.d.columna);
    if(validacionMatrizFloat(m1,m2))
    {

        for(i=0; i<m1.d.renglon; i++)
        {
            for(j=0; j<m1.d.columna; j++)
            {
                m3.matriz[i][j]=(m1.matriz[i][j]-m2.matriz[i][j]);
            }
        }
    }
    else
    {
        printf("La matriz no es de la misma dimension, por lo cual no se puede realizar la suma.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    return m3;
}

MatrizInt traspuestaMatrizInt(MatrizInt m1)
{
    int i,j;
    MatrizInt m3=m1;
    m3.matriz=reservaMInt(m3.d.renglon,m3.d.columna);

    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m3.matriz[j][i]=m1.matriz[i][j];
        }
    }
  return m3;  
}

MatrizFloat traspuestaMatrizFloat(MatrizFloat m1)
{
    int i,j;
    MatrizFloat m3=m1;
    m3.matriz=reservaMFloat(m3.d.renglon,m3.d.columna);

    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m3.matriz[j][i]=m1.matriz[i][j];
        }
    }
  return m3;  
}

void iniciarceroInt(MatrizInt m1)
{
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m1.matriz[i][j]=0;
        }
    }
}

void iniciarceroFloat(MatrizFloat m1)
{
    int i,j;
    for(i=0; i<m1.d.renglon; i++)
    {
        for(j=0; j<m1.d.columna; j++)
        {
            m1.matriz[i][j]=0;
        }
    }
}

MatrizInt multiplicarMatrizInt(MatrizInt m1, MatrizInt m2)
{
    int i,j,k;
    MatrizInt m3;
        m3.d.renglon=m2.d.columna;
        m3.d.columna=m1.d.renglon;
        m3.matriz=reservaMInt(m3.d.renglon,m3.d.columna);
        iniciarceroInt(m3);
    if(validacionMultiplicarInt(m1,m2)==1)
    {

            for(i=0; i<m1.d.renglon; i++)
            {
                for(j=0; j<m2.d.columna; j++)
                {
                    for(k=0; k<m1.d.columna; k++)
                    {
                        m3.matriz[i][j]+=m1.matriz[i][k]*m2.matriz[k][j];
                    }
                }
            }
    }
    else
    {
        printf("La matriz que ingreso no se puede multiplicar.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    
    return m3;
}   

MatrizFloat multiplicarMatrizFloat(MatrizFloat m1, MatrizFloat m2)
{
    int i,j,k;
    MatrizFloat m3;
        m3.d.renglon=m2.d.columna;
        m3.d.columna=m1.d.renglon;
        m3.matriz=reservaMFloat(m3.d.renglon,m3.d.columna);
        iniciarceroFloat(m3);
    if(validacionMultiplicarFloat(m1,m2)==1)
    {

            for(i=0; i<m1.d.renglon; i++)
            {
                for(j=0; j<m2.d.columna; j++)
                {
                    for(k=0; k<m1.d.columna; k++)
                    {
                        m3.matriz[i][j]+=m1.matriz[i][k]*m2.matriz[k][j];
                    }
                }
            }
    }
    else
    {
        printf("La matriz que ingreso no se puede multiplicar.\n");
        free(m3.matriz);
        m3.matriz=NULL;
        m3.d.columna=0;
        m3.d.renglon=0;
    }
    
    return m3;
}   

void mensaje(char mensaje[])
{
    printf("%s",mensaje);
    setbuf(stdin,NULL);
    getchar();
}