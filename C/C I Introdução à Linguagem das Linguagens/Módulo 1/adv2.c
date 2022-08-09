#include <stdio.h>

int main(){
	int numerosecreto=45;
	int chute;
	int ganhou=0;
	int tentativas=1;
	
	
	while(1) {

        printf("Tentativa %d\n", tentativas);
        printf("Qual eh o seu chute? ");

        scanf("%d", &chute);
        printf("Seu chute foi %d\n", chute);

        if(chute < 0) {
            printf("Voce nao pode chutar numeros negativos!\n");
            continue;
        }

		int acertou = (chute == numerosecreto);
		int maior = chute > numerosecreto;
        
        if(acertou) {
            printf("Parabens! Voce acertou!\n");
            printf("Jogue de novo, você eh um bom jogador!\n");
			break;
        }

        else if(maior) {
            printf("Seu chute foi maior que o numero secreto\n");
        }
		else {
            printf("Seu chute foi menor que o numero secreto\n");
        }
        tentativas = tentativas + 1;
    }

    printf("Fim de jogo!\n");
	printf("Voce acertou em %d tentativas!\n", tentativas);
}
//Em C os escopos são bem definidos pelas chaves. Se uma varivel for definida dentro de 
//duas chaves ela so podera ser usada naquelas chaves e nos grupos inferiores englobados por aquelas chaves

// %d quer dizer inteiro
//printf("O numero secreto eh %d\n", numerosecreto);

// Em C, # significa que o que ser adigitado a diante é uma diretiva

//else if é tipo o elif do python

//continue serve para termeinar aquela etapa do loop e ir direto para a proxima sem acaba de executar aquele bloco.