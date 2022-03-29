## Capgimini

## Rodar o projeto 🚴🏻‍♂️
#### On your machine:

```bash
# Clone the repository
$ git clone https://github.com/GabrielMedradoS/Capgimini.git

# Access the project folder at the command prompt
$ cd Capgimini/src/br/com/questoescapgimini/Main.class
```
#### O arquivo das questoes se encontra na pasta src <br>
##### Rodar primeiramente o main onde ira aparacer um menu de opçoes para qual questao o usuario quer ir 
- Digite 1 - para Questao 1 <br>
- Digite 2 - para Questao 2 <br>
- Digite 3 - para Questao 3 <br>
- Digite 0 - para sair do programa 

### Questão 01

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

Exemplo:
Entrada:
arr = [9, 2, 1, 4, 6]


Saída:
4

### Questão 02
Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

Exemplo:

Entrada:

n = [1, 5, 3, 4, 2]


Saída:
3

Explicação:
Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

### Questão 03

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

<=linha<=coluna<=

Considere T, como o tamanho do texto.
Se certifique de que linhas x colunas >= .
Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:
Exemplo 1)

Entrada:

s = tenha um bom dia


Saída:
taoa eum nmd hbi


Explicação:
Depois de remover os espaços, a string tem 13 caracteres.  está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

tenh
aumb
omdi
a

O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.


Exemplo 2)
Entrada:

s = ola mundo


Saída:
omd luo an


Explicação:
Depois de remover os espaços a string tem 8 caracteres.  está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:

ola

mun

do
