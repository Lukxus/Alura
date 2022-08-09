usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]

assistiram = usuarios_data_science.copy()
print(assistiram)

assistiram = usuarios_data_science.copy()
assistiram.extend(usuarios_machine_learning) # Fica meio ruim se eu não quero repetir valores
print(f"Listas extendidas = {assistiram}")

assistiram=set(assistiram) #tipo set; Não repete valores
#Os conjutnos não tem posição, para trabalhar com eles tenho que sacrificar a ordem das informações.
print(f"Lista extendida que virou conjunto = {assistiram}")

'''
conj={4,2,5,1,4} 
print(conj)
for x in conj: # Os conjutnos podem ser iterdaores, mas a ordem é imprevisivel.
    print(x)
'''

# Como posso juntar dois conjuntos
ou=set(usuarios_data_science)|set(usuarios_machine_learning)
print(f"União = {ou}")
# Intersecção
e=set(usuarios_data_science) & set(usuarios_machine_learning)
print(f"Intersecção = {e}")
#Complmento
c=set(usuarios_data_science)-set(usuarios_machine_learning)
print(c)
#Como modificar um conjunto?
#Como não tem ordem, os comandos de lista não funionam nele.

conjunto={2,34,66,1,1,2,3}
print("-"*10, " Segunda parte ", "-"*10)

#Adicionando
print("Add")
conjunto.add(3)
print(conjunto)
print(len(conjunto))
conjunto.add(1)
print(conjunto)# não vai mudar pois o conjunto já tem o elemento 1
print(len(conjunto))


#Como não permitir que um conjunto seja alterado?
#frozenset -- Imutável
congelado=frozenset(conjunto)
print(congelado)
#congelado.add(700) # Por ser um conjunto congelado, será levantado um erro
#print(congelado)

#Comopegar as palavras de um texto sem repeti-lás
meu_texto = "Bem vindo meu nome é Guilherme eu gosto muito de nomes e tenho o meu cachorro e gosto muito de cachorro"
print(meu_texto.split(' '))
palavras_conjunto = set(meu_texto.split())
print(palavras_conjunto)



