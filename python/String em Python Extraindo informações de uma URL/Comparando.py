'''"O is compara a identidade do objeto, isto é, 
o valor de referência de seu endereço na memória, 
não o valor definido por nós."'''

print(bool('') is False) 
#Está correto pois o valor de bool('') 
# faz refrencia a mesma unidade de memória 
# na qual False está alocado.

x="LUIZ"
y="LUIZ"
print(x is y) 
# _string interning_. O computador busca não 
# armazenar mais de um valor igual de string 
# em epsaços diferentes da memoria. Ou seja 
# mesmo que uma string seja criada diversas vezes, 
#o computador vai agrantir que essa string seja 
# criada e armazenada apenas uma vez.
print(x==y)


a = float("nan")
print(type(a))
print("is -> {}".format(a is a))
print("== -> {}".format(a == a))