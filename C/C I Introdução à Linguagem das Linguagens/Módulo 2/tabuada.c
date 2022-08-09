#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int tabuada(numero){
    int res;
    for (int i=0; i<=10; i++){
        res=numero*i;
        printf("%d\n",res);
    }
}

int main(){
    int numero;
    printf("Qual tabuada voce quer? ");
    scanf("%d", &numero);
    tabuada(numero);
}