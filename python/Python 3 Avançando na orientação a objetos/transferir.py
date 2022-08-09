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

x=Conta(123,"nico", 55.0, 1000.0)
r=Conta(1234,"luiz", 559.0, 1080.0)
r.tranfere(10,x)
x.extrato()
r.extrato()