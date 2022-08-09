import re

endereco="Rua das Flores 72, apartamento 1002, Laranjeiras, Rio de Janeiro, RJ, 23440-120"
padrao=re.compile("[0-9][0-9][0-9][0-9][0-9][-]?[0-9][0-9][0-9]")
busca=padrao.search(endereco)
print(busca)
if busca:
    cep=busca.group()
    print(cep)

#outra forma de escrever

endereco="Rua das Flores 72, apartamento 1002, Laranjeiras, Rio de Janeiro, RJ, 23440-120"
padrao=re.compile("[0-9]{5}[-]{0,1}[0-9]{3}")
busca=padrao.search(endereco)
print(busca)
if busca:
    cep=busca.group()
    print(cep)