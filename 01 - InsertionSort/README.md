# 1. InsertionSort

O InsertionSort é um algoritmo de ordenação simples, inspirado na forma como se organiza cartas em um jogo. Ele constrói a lista ordenada uma posição de cada vez, inserindo elementos na posição correta. O algoritmo é eficaz para conjuntos pequenos de dados ou listas quase ordenadas.

## 1.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛)$, pois realiza apenas comparações sem movimentações.
- **Pior caso (lista em ordem reversa):** $O(n^2)$, devido à necessidade de comparar e mover todos os elementos para suas posições corretas.
- **Caso médio:** $𝑂(𝑛^2)$, já que, em geral, a ordenação exige movimentar aproximadamente metade dos elementos para inserir um novo.

## 1.2. Funcionamento

1. Percorre a lista da segunda posição (índice 1) até o final.
2. Compara o elemento atual com os anteriores.
3. Move os elementos maiores para a direita.
4. Insere o elemento atual na posição correta.
5. Repete o processo até que todos os elementos estejam ordenados.