#Código do professor

class Programa:
    def __init__(self, nome, ano):
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0

    @property
    def likes(self):
        return self._likes

    def dar_likes(self):
        self._likes += 1

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    def __str__(self):
        return f'Nome: {self.nome} Likes: {self.likes}'

class Filme(Programa):
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.duracao = duracao
    
    def __str__(self):
        return f'Nome: {self.nome} - {self.duracao} min - Likes: {self.likes}'

class Serie(Programa):
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome, ano)
        self.temporadas = temporadas

    def __str__(self):
        return f'Nome: {self.nome} - {self.temporadas} temporadas - Likes: {self.likes}'


class Playlist:
    def __init__(self, nome, programas):
        self.nome = nome
        self._programas = programas

    def __getitem__(self, item): #__getitem__ representa o comportamento de uma sequencia iterável. # pensar como se fosse um for bem reduzido
        return self._programas[item]

    @property
    def listagem(self):
        return self._programas

    
    def __len__(self): #sem isso o len do python não funciona
        return len(self._programas)



vingadores = Filme('vingadores - guerra infinita', 2018, 160)
atlanta = Serie('atlanta', 2018, 2)
tmep=Filme("Todo mundo em panico", 1999,100)
demolidor=Serie("Demolidor",2016,2)

vingadores.dar_likes()
vingadores.dar_likes()
vingadores.dar_likes()
tmep.dar_likes()
tmep.dar_likes()
demolidor.dar_likes()
atlanta.dar_likes()
atlanta.dar_likes()

listinha = [atlanta, vingadores, tmep, demolidor]
playlist_fim_de_semana=Playlist("Fim de semana", listinha)

print(f'Tamanho do playlist: {len(playlist_fim_de_semana.listagem)}')

for programa in playlist_fim_de_semana:
    print(programa)