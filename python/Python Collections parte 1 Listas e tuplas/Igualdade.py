class ContaSalario:
    def __init__(self, codigo):
        self._codigo=codigo
        self._saldo=0
    
    def deposita(self, valor):
        self._saldo+=valor

    def __eq__(self, outro): # Assim posso compara os objetos
        if type(outro)!= ContaSalario:
            return False
        return self._codigo==outro._codigo and self._saldo==outro._saldo

    def __str__(self):
        return (f"[Codigo : {self._codigo} ; Saldo : {self._saldo}]")

class ContaMes(ContaSalario):
    pass

conta1=ContaSalario(12345)
conta2=ContaMes(12345)
print(conta1==conta2) # True pois conta2 é uma filha de ContaSalario
