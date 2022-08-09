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

'''x=Conta(123,"nico", 55.0, 1000.0)
y=x
r=Conta(1234,"luiz", 559.0, 1080.0)
print(x.saldo)
print(y.saldo)
x=r # ao receber um novo igual, apenas a referencvia mudou, mas os dadsoa naquela memoria não. Logo y permance igual, pois sua referencia não mudou.
#Para cortar uma referência a um pedaço da memoria, usar none.
x.extrato()
y.extrato()
x.deposita(200)
x.extrato()
y.extrato()'''
