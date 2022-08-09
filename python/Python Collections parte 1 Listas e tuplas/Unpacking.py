lista=[("guilherme", 37, 1981), ("Daniela", 31, 1987), ("Paulo", 39, 1979)]

for nome, idade, ano in (lista):
    print(nome, "-", idade, "-", ano)

# E se eu quisesse só o nome?

for nome, _, _ in (lista):
     print(nome)