idades = [20, 39 , 18 , 27 , 19]
novas_idades=[idade+1 for idade in idades]
print(novas_idades)
maiores_idade=[idade for idade in idades if idade>21]
print(maiores_idade)

def faz_processamento_de_visualizacao(lista=None):
    if lista==None: #Assim sempre criamos uma nova lista
        lista=list()
    print(len(lista))
    print(lista)
    lista.append(13)