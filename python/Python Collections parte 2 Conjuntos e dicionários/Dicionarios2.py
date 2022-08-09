from collections import defaultdict
from collections import Counter


meu_texto = "Bem vindo meu nome é Guilherme eu gosto muito de nomes e tenho o meu cachorro e gosto muito de cachorro"
meu_texto = meu_texto.lower()

aparicoes = {}

for palavra in meu_texto.split():
  ate_agora = aparicoes.get(palavra, 0)
  aparicoes[palavra] = ate_agora + 1

print(aparicoes)


print('-'*10)


aparicoes = defaultdict(int)
for palavra in meu_texto.split():
  ate_agora = aparicoes.get(palavra, 0)
  aparicoes[palavra] = ate_agora + 1

print(aparicoes)


print('-'*10)


aparicoes = defaultdict(int)
for palavra in meu_texto.split():
    aparicoes[palavra] += 1

print(aparicoes)


print('-'*10)


aparicoes = Counter(meu_texto.split()) #O contador CONTA! Nos retorna um dicionario do que foi contado

print(aparicoes)


#O defalutdict é util pois se uma nova key aparecer no dicionario, ja setamos um valor inicial para ela. 
#Podemos controlar qual sera esse valor incial.

class Conta:
  def __init__(self):
    print("Criando uma conta")

contas = defaultdict(Conta)
contas[15]