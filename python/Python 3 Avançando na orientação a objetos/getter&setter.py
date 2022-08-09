class Conta:
    def __init__(self,numero, titular, saldo, limite):
        #print(" Construindo objeto em ... {}".format(self))
        self.__numero=numero
        self.__titular=titular
        self.__saldo=saldo
        self.__limite=limite
    
    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo, self.__titular))
    
    def deposita(self, valor):
        self.__saldo +=valor

    def saca(self, valor):
        self.__saldo-= valor

    def tranfere(self, valor, destino):
        self.saca(valor)
        destino.deposita(valor)

    def get_titular(self):
        return self.__titular

    def get_limite(self):
        return self.__limite

    def get_saldo(self):
        return self.__saldo
    
    def set_limite(self,limite):
        self.__limite=limite
    

x=Conta(123,"nico", 55.0, 1000.0)
r=Conta(1234,"luiz", 559.0, 1080.0)
r.tranfere(10,x)
x.extrato()
r.extrato()

#Versão melhorada
class Conta:

    def __init__(self, numero, titular, saldo, limite):
        print("Construindo objeto ... {}".format(self))
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor

    def saca(self, valor):
        self.__saldo -= valor

    def transfere(self, valor, destino):
        self.saca(valor)
        destino.deposita(valor)

    @property
    def saldo(self):
        return self.__saldo

    @property
    def titular(self):
        return self.__titular

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, limite):
        self.__limite = limite


x=Conta(123,"nico", 55.0, 1000.0)
print(x.saldo)