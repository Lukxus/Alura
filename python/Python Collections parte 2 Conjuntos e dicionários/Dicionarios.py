aparicoes = {
  "Guilherme" : 1,
  "cachorro" : 2,
  "nome" : 2,
  "vindo" : 1
}

print(aparicoes["Guilherme"])

#método get(). Falar que eu quero pegar a chave "xpto", 
#se não estiver lá dentro a chave "xpto", devolva zero

print(aparicoes.get("xpto", 0))

aparicoes["Carlos"]=5
print(aparicoes)
del aparicoes["Carlos"]
print(aparicoes)

print("cachorro" in aparicoes) #procura nas chaves do dicionario
print("-"*10)
for elemento in aparicoes:
  print(elemento)
print("-"*10)
for elemento in aparicoes.keys():
  print(elemento)
print("-"*10)
for elemento in aparicoes.values():
  print(elemento)
print("-"*10)
for elemento in aparicoes.keys():
  print(elemento, aparicoes[elemento])
print("-"*10)
for elemento in aparicoes.items():
  print(elemento)
print("-"*10)
for chave, valor in aparicoes.items():
  print(chave, "=", valor)
print("-"*10)
[print("palavra {}".format(chave)) for chave in aparicoes.keys()]