# 1. InsertionSort

O InsertionSort é um algoritmo de ordenação simples, inspirado na forma como se organiza cartas em um jogo. Ele constrói a lista ordenada uma posição de cada vez, inserindo elementos na posição correta. O algoritmo é eficaz para conjuntos pequenos de dados ou listas quase ordenadas.

## 1.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛)$, pois realiza apenas comparações sem movimentações.
- **Pior caso (lista em ordem reversa):** $O(n^2)$, devido à necessidade de comparar e mover todos os elementos para suas posições corretas.
- **Caso médio:** $O(𝑛^2)$, já que, em geral, a ordenação exige movimentar aproximadamente metade dos elementos para inserir um novo.

## 1.2. Funcionamento

1. Percorre a lista da segunda posição (índice 1) até o final.
2. Compara o elemento atual com os anteriores.
3. Move os elementos maiores para a direita.
4. Insere o elemento atual na posição correta.
5. Repete o processo até que todos os elementos estejam ordenados.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

### Iteração 1 (índice 1, elemento 50)
- O elemento 50 já está no lugar certo, já que é maior do que o elemento do índice 0 (10).
- **Lista:** [10, 50, 5, 8, 20, 30]

### Iteração 2 (índice 2, elemento 5)
- Compara 5 com 50 (50 > 5, move 50 para a direita).
- Compara 5 com 10 (10 > 5, move 10 para a direita).
- Insere 5 na posição correta.
- **Lista:** [5, 10, 50, 8, 20, 30]

### Iteração 3 (índice 3, elemento 8)
- Compara 8 com 50 (50 > 8, move 50 para a direita).
- Compara 8 com 10 (10 > 8, move 10 para a direita).
- Insere 8 na posição correta.
- **Lista:** [5, 8, 10, 50, 20, 30]

### Iteração 4 (índice 4, elemento 20)
- Compara 20 com 50 (50 > 20, move 50 para a direita).
- Compara 20 com 10 (10 < 20, insere 20 após 10).
- **Lista:** [5, 8, 10, 20, 50, 30]

### Iteração 5 (índice 5, elemento 30)
- Compara 30 com 50 (50 > 30, move 50 para a direita).
- Compara 30 com 20 (20 < 30, insere 30 após 20).
- **Lista:** [5, 8, 10, 20, 30, 50]

**Resultado final:** [5, 8, 10, 20, 30, 50]

O InsertionSort é intuitivo, mas sua eficiência reduz-se em listas grandes devido à complexidade $O(𝑛^2)$. É, no entanto, muito eficiente em listas pequenas ou quase ordenadas.