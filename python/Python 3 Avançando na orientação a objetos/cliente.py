class Cliente:
    def __init__(self,nome):
        self.__nome=nome
    
    @property #É como executar o código por de baixo dos panos; meu atributo precisa ser private
    def nome(self): #funciona como um getter
        print(self.__nome.title())

    @nome.setter
    def nome(self,nome): #funciona como um setter
        self.__nome=nome
    


x=Cliente("luiz")
x.get_nome