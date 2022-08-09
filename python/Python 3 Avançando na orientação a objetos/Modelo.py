class Programa:
    def __init__(self, nome, ano):
        self._nome = nome.title() # um _ é a convenção para não deixar a sintaxe complicada.
        self.ano = ano
        self._like = 0

        @property
        def likes(self):
            return self._likes

        def dar_likes(self):
            self._likes += 1

        @property
        def nome(self):
            return self._nome

        @nome.setter
        def nome(self, novo_nome):
            self._nome = novo_nome.title()

#O super chama a classe mãe, logo eu estou chamando o consturtor da classe mãe. 
#Não preciso falar self, pois o python ja sabe de qual classe estamos falando.
        
class Filme(Programa):
    def __init__(self, nome, ano, duracao):
        super().__init__(nome,ano) 
        self.duracao = duracao
        

class Série(Programa):
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome,ano)
        self.temporadas = temporadas
           

x=Filme("Luiz",2002, 19)
print(x)
print(x.ano)
print(x._nome)
print(x.duracao)