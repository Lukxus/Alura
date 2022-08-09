from operator import attrgetter

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

    def __lt__(self, outro):
        return self._saldo<outro._saldo
x=ContaSalario(1)
x.deposita(200)
y=ContaSalario(2)
y.deposita(100)
z=ContaSalario(3)
z.deposita(50)
contas=[x,y , z]
for conta in sorted(contas, key=attrgetter('_saldo')):
    print(conta)

# O attrgetter não é muito bom caso o meu atributo em questão seja privado. Para resolver isso, usamos o __lt__ ; less than
# O attrgetter tem um funcionamento de comparação com desempates.
x=ContaSalario(1)
x.deposita(100)
y=ContaSalario(2)
y.deposita(100)
z=ContaSalario(3)
z.deposita(100)
contas=[x,y , z]
for conta in sorted(contas, key=attrgetter('_saldo', "_codigo")):
    print(conta)

#Como implemntar isso de forma natural?

class ContaSalario:
    def __init__(self, codigo):
        self._codigo=codigo
        self._saldo=0
    
    def deposita(self, valor):
        self._saldo+=valor

    def __eq__(self, outro): 
        if type(outro)!= ContaSalario:
            return False
        return self._codigo==outro._codigo and self._saldo==outro._saldo

    def __str__(self):
        return (f"[Codigo : {self._codigo} ; Saldo : {self._saldo}]")

    def __lt__(self, outro):
        if self._saldo!=outro._saldo:
            return self._saldo<outro._saldo
        return self._codigo<outro._codigo

x=ContaSalario(1)
x.deposita(100)
y=ContaSalario(2)
y.deposita(100)
z=ContaSalario(3)
z.deposita(100)
contas=[x,y , z]
for conta in sorted(contas):
    print(conta)

#Agora como posso implementar o <= ou >=

from functools import total_ordering

@total_ordering 
#total_ordering, 
#dá para uma classe várias outras comparações, 
# tudo que você tem que fazer é definir o igual e o menor.
class ContaSalario:
    def __init__(self, codigo):
        self._codigo=codigo
        self._saldo=0
    
    def deposita(self, valor):
        self._saldo+=valor

    def __eq__(self, outro): 
        if type(outro)!= ContaSalario:
            return False
        return self._codigo==outro._codigo and self._saldo==outro._saldo

    def __str__(self):
        return (f"[Codigo : {self._codigo} ; Saldo : {self._saldo}]")

    def __lt__(self, outro):
        if self._saldo!=outro._saldo:
            return self._saldo<outro._saldo
        return self._codigo<outro._codigo

x=ContaSalario(1)
x.deposita(100)
y=ContaSalario(2)
y.deposita(100)
z=ContaSalario(3)
z.deposita(100)
print(x>=z)
