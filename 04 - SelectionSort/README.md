# 4. SelectionSort

O SelectionSort é um algoritmo de ordenação simples que divide a lista em duas partes: a parte ordenada e a não ordenada. Em cada iteração, o menor elemento da parte não ordenada é selecionado e trocado com o primeiro elemento dessa parte, expandindo a porção ordenada.

## 4.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛^2)$, pois mesmo em uma lista já ordenada, o algoritmo realiza todas as comparações.
- **Pior caso (lista em ordem reversa):** $O(𝑛^2)$, ocorre em uma lista em ordem inversa, mas não há diferença no número de comparações.
- **Caso médio:** $O(𝑛^2)$, devido ao número fixo de comparações independentemente da ordem inicial.

## 4.2. Funcionamento

1. Divide a lista em parte ordenada (inicialmente vazia) e não ordenada.
2. Percorre a parte não ordenada, encontra o menor elemento e o troca com o primeiro elemento dessa parte.
3. Expande a parte ordenada e repete o processo até que toda a lista esteja ordenada.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

### Iteração 1

- Menor elemento na parte não ordenada: 5.
- Troca 5 com o primeiro elemento (10).

**Lista:** [5, 50, 10, 8, 20, 30]

### Iteração 2

- Menor elemento na parte não ordenada: 8.
- Troca 8 com o segundo elemento (50).

**Lista:** [5, 8, 10, 50, 20, 30]

### Iteração 3

- Menor elemento na parte não ordenada: 10.
- 10 já está na posição correta.

**Lista:** [5, 8, 10, 50, 20, 30]

### Iteração 4

- Menor elemento na parte não ordenada: 20.
- Troca 20 com o quarto elemento (50).

**Lista:** [5, 8, 10, 20, 50, 30]

### Iteração 5

- Menor elemento na parte não ordenada: 30.
- Troca 30 com o quinto elemento (50).

**Lista:** [5, 8, 10, 20, 30, 50]

**Resultado final:** [5, 8, 10, 20, 30, 50]

O SelectionSort é fácil de implementar, mas é ineficiente para listas grandes devido à complexidade $O(𝑛^2)$. Sua vantagem está em seu comportamento previsível, já que o número de trocas é sempre $O(𝑛^2)$, independentemente da ordem inicial da lista.