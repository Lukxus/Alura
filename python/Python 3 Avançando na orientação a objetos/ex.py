'''class Listinha:
    def __init__(self, items):
        self.items = items

    def __iter__(self):
        return self.items.__iter__()
    
    def __len__(self):
        return len(self.items)

meu_objeto = Listinha([1, 2, 4])

contador = 0
for item in meu_objeto:
    contador += 1 

if len(meu_objeto) == contador:
    print('São iguais!')
else:
    print('Não são iguais!')'''

from collections.abc import Sized

class MinhaListagem(Sized):
    def __init__(self, descricao):
        self.descricao = descricao

    def __str__(self):
        return self.descricao
    
    def __len__(self):
        return len(self.descricao)

lista = MinhaListagem('12345')
print(lista)
print(len(lista))