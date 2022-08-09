from abc import ABCMeta, abstractmethod

class Conta (metaclass=ABCMeta):
    def __init__(self, codigo):
        self._codigo=codigo
        self._saldo=0
    
    def deposita(self, valor):
        self._saldo+=valor
    
    """@abstractmethod #Força todas as classes filhas a terem esse método para funcionar.
    def passa_o_mes(self):
        pass"""

    def __str__(self):
        return (f"[Codigo : {self._codigo} ; Saldo : {self._saldo}]")


class ContaCorrente(Conta):
    def passa_o_mes(self):
        self._saldo-=2


class ContaPoupança(Conta):
    def passa_o_mes(self):
        self._saldo *= 1.01
        self._saldo -= 3

conta=Conta(10000)
print(conta)