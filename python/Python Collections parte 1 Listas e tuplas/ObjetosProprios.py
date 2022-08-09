class ContaCorrente:
    def __init__(self, codigo):
        self.codigo=codigo
        self.saldo=0
    
    def deposita(self, valor):
        self.saldo+=valor

    def __str__(self):#É o que faz eu ter uma saída entendível ao invés da posição na memória. Isso no print()
        return (f"[Codigo : {self.codigo} ; Saldo : {self.saldo}]")

Luiz=ContaCorrente(56667)
print(Luiz)
#print(Luiz.__str__) #Com isso vou acessar a posição na memoria. 