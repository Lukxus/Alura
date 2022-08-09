class funcionario:
    prefixo=11

    @classmethod
    def teste(cls):
        return (f"Esse é o prefixo {cls.prefixo}")

print(funcionario.teste())

#Difetente do metodo estatico, esse pode acessar outros atributos da classe