#include <stdio.h>

int main() {
    /*
    double pontos = 3 / 2; //Assim a casa decimal não aparece. primerio ele faz a operação e depois ve o tipo e onde vai guardar.
    //Como a operação entre inteiros o resultado é dito como inteiro, dai foi passdao para double; O fato de ter sido inteiro, omitiu a parte flutuante da divisão
    printf("%f\n", pontos);

    double pontos = 3 / 2.0; 
    printf("%f\n", pontos);
    */
    int a = 3;
    int b = 2;
    double pontos = a/(double)b; //Casting - so muda pro momento da conta
    printf("%f\n", pontos);
    printf("%d",b);

}