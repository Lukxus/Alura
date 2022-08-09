#include <stdio.h>

#define NUMERO_DE_TENTATIVAS 5 //Constante - Por convencao declaramos constantes com todas as letras maiusculas

int main(){
	int numerosecreto=45;
	int chute;
	
	for(int i = 1; i <= NUMERO_DE_TENTATIVAS; i++) {
        printf("Qual eh o seu chute? ");
        scanf("%d", &chute);
        printf("Seu chute foi %d\n", chute);
		
		if (chute<0){
			printf("Voce não pode chutar numero negativos!\n");
			i--;
			continue;
		}

        int acertou = (chute == numerosecreto);
        int maior = chute > numerosecreto;
        int menor = chute < numerosecreto;

        if(acertou) {
            printf("Parabens! Voce acertou!\n");
            printf("Jogue de novo, voce eh um bom jogador!\n");
            break;
        }

        else if(maior) {
            printf("Seu chute foi maior que o numero secreto\n");
        }

        else {
            printf("Seu chute foi menor que o numero secreto\n");
        }
    }
}
//Em C os escopos são bem definidos pelas chaves. Se uma varivel for definida dentro de 
//duas chaves ela so podera ser usada naquelas chaves e nos grupos inferiores englobados por elas

// %d quer dizer inteiro
//printf("O numero secreto eh %d\n", numerosecreto);

// Em C, # significa que o que ser adigitado a diante é uma diretiva

//else if é tipo o elif do python

//continue serve para termeinar aquela etapa do loop e ir direto para a proxima sem acaba de executar aquele bloco.