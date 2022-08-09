class Conta:
    def __init__(self,numero, titular, saldo, limite):
        #print(" Construindo objeto em ... {}".format(self))
        self.__numero=numero #O __ é para falar que é private
        self.__titular=titular
        self.__saldo=saldo
        self.__limite=limite
    
    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo, self.__titular))
    
    def deposita(self, valor):
        self.__saldo +=valor

    def saca(self, valor):
        self.__saldo-= valor

conta=Conta(12345,"lucas",150,10000)
print(conta._Conta__saldo) 
print(conta.saldo)
# é assim que tenho que acessar meu atributo caso ele seja private. 
# O python não tire meu poder de alterar, mas muda a nomencaltura 
# para avisar que aquela atributo não foi pensando para ser acessado daquela forma.
