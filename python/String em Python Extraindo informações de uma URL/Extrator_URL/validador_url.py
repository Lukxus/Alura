import re

url = 'https://www.bytebank.com.br/cambio'
padrao_url=re.compile('(http(s)?://)?(www.)?bytebank.com(.br)?/cambio') 
#Ao usar () ao invés de [], especificamos que queremos exattemnto 
#aquele padrão e não um digito naquele intervalo
match=padrao_url.match(url)
print(match)
if not match:
    raise ValueError("A URL NÃO É VÁLIDA.")

print("URL VÁLIDA")

#A diferença entre search e match é que
# o search procura pelo padrão dentro da string, 
# já o match verifica se a string inteira etsa de acorod com o padrão

'''O search() vai buscar dentro de uma string se aquele padrão foi encontrado. 
Só que no nosso caso, eu não quero verificar se a minha string inteira possui 
uma URL dentro dela ou não, eu quero verificar se ela é exatamente aquele padrão, 
se ela bate exatamente com aquilo. E para isso, ao invés de usar o método search() 
do meu objeto de padrão, o pattern, eu tenho que utilizar o método .match(), padrao_url.match (' ').'''
