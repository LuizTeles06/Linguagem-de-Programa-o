#include <stdio.h>
#include <stdlib.h>


// Headers

// Exercicios

int Exercicio1(int* lista, int n);
int Exercicio2(int** matriz, int linhas, int colunas);
int Exercicio3(int numero);
char* Exercicio4(char* palavra, int n);
int* Exercicio5Array(int* lista, int n, int crescente);
int** Exercicio5Matriz(int** lista, int linha, int coluna);



// Funcoes auxiliares
void ImprimiArrayChar(char* lista, int n);
void ImprimiArrayInt(int* lista, int n);






int main()
{
    int lista[] = {1,-12,3,44,-5,10,230};
    int media = Exercicio1(lista, 7);


    char palavra[] ={'n','i','c','o','l','a','s'};
    int n = 7;

    char* saida = Exercicio4(palavra, n);

    ImprimiArrayChar(palavra, n);
    ImprimiArrayChar(saida, n);

    int* ordenado = Exercicio5Array(lista,n, 0);
    ImprimiArrayInt(ordenado, n);
    free(saida);

    return 1;

}



// Exercicios

int Exercicio1(int* lista, int n)
{
    int i;
    int saida;

    for (i = 0; i < n; i++)
       saida += lista[i];

    return saida / n;
}



// Funcoes auxiliares

void ImprimiArrayChar(char* lista, int n)
{
    int i;

    printf("\nArray: ");
    for (i = 0; i < n; i++)
        printf("%c", lista[i]);

}

void ImprimiArrayInt(int* lista, int n)
{
      int i;

    printf("\nArray: ");
    for (i = 0; i < n; i++)
        printf("%d, ", lista[i]);
}

int Exercicio2(int** matriz, int linhas, int colunas)
{
    int maiorIdLinha = 0;
    int maiorIdColuna = 0;
    int i,j;

    for (i = 0; i < linhas; i++)
    {
      for (j = 0; j < colunas; j++)
      {
          if (matriz[i][j] > matriz[maiorIdLinha][maiorIdColuna])
          {
              maiorIdLinha = i;
              maiorIdColuna = j;
          }
      }

    return matriz[i][j];

    }
}

int Exercicio3(int numero)
{
    int i;

    for (i = 2; i< numero; i++)
    {
        if (numero % i == 0)
            return 0;
    }

    return 1;
}

char* Exercicio4(char* palavra, int n)
{
    char* saida = (char*) malloc (n * sizeof(char));
    int i;
    int index = 0;
    for (i = n-1; i>=0; i--)
        saida[index++] = palavra[i];

    return saida;
}

int* Exercicio5Array(int* lista, int n, int crescente)
{
    int i, j;
    int* saida = (int*) malloc (n * sizeof(int));

    for (i = 0; i< n; i++)
        saida[i] = lista[i];

    for (i = 0; i< n; i++)
    {
        for (j = i; j < n; j++)
        {
            if (crescente > 0)
            {
                if (saida[i] > saida[j])
                {
                    int aux = saida[i];
                    saida[i] = saida[j];
                    saida[j] = aux;
                }
            }else
            {
                if (saida[i] < saida[j])
                {
                    int aux = saida[i];
                    saida[i] = saida[j];
                    saida[j] = aux;
                }
            }


        }
    }
    return saida;
}

int** Exercicio5Matriz(int** matriz, int linha, int coluna)
{

    int* arrayMatriz = (int*) malloc (linha * coluna * sizeof(int));
    int i, j;
    int index = 0;
    int** matrizSaida = (int*) malloc (linhas * sizeof(int));

    for (i = 0; i < linhas; i++))
        matrizSaida[i] = int(*) malloc (colunas * sizeof(int));


    // Converter matriz para array
    for (i = 0; i < linha; i++)
        for (j = 0; j < coluna; j++)
            arrayMatriz[index++] = matriz[i][j];

    // Ordenar array
    int* arrayMatrizOrdenado = Exercicio5Array(arrayMatriz, linha*coluna, 1);

    // Converter array para matriz
    index = 0;
    for (i = 0; i < linha; i++)
        for (j = 0; j < coluna; j++)
            matrizSaida[i][j] = arrayMatrizOrdenado[index++];

    return NULL;

}

