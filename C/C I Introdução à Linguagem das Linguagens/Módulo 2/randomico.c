#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {

    int segundos = time(0);
    //devolve exatamente o número de segundos passados desde 01 de janeiro de 1970 até a data atual
    srand(segundos); 
    //mudamdos a semente da função matematica rand

    int n1 = rand();
    int n2 = rand();

    printf("%d %d\n", n1, n2);
}