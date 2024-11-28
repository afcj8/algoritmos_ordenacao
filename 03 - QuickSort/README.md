# 3. QuickSort

O QuickSort é um algoritmo de ordenação eficiente e amplamente utilizado, que emprega a técnica de divisão e conquista. Ele seleciona um elemento como pivô e reorganiza os elementos da lista, de modo que os menores que o pivô fiquem à esquerda e os maiores à direita. O processo é então repetido recursivamente para as sublistas.

## 3.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛 log 𝑛)$, quando o pivô divide a lista de forma equilibrada.
- **Pior caso (lista em ordem reversa):** $O(𝑛^2)$, ocorre quando o pivô é sempre o menor ou o maior elemento, resultando em sublistas muito desbalanceadas.
- **Caso médio:** $O(𝑛 log 𝑛)$, em cenários gerais.

## 3.2. Funcionamento

1. Seleciona um pivô (geralmente o primeiro, último ou elemento central da lista).
2. Reorganiza os elementos: menores que o pivô à esquerda, maiores à direita.
3. Aplica o mesmo procedimento recursivamente às sublistas geradas.
4. O processo termina quando todas as sublistas tiverem tamanho 0 ou 1, indicando que estão ordenadas.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

### Primeira iteração

- Escolhe o pivô: 10.
- Divide a lista:
    - Menores que 10: [5, 8]
    - Maiores que 10: [50, 20, 30]

**Lista:** [5, 8, 10, 50, 20, 30]

### Sublista esquerda ([5, 8])

- Escolhe o pivô: 5.
- Divide a lista:
    - Menores que 5: []
    - Maiores que 5: [8]

**Lista:** [5, 8]

### Sublista direita ([50, 20, 30])

- Escolhe o pivô: 50.
- Divide a lista:
    - Menores que 50: [20, 30]
    - Maiores que 50: []

**Lista:** [20, 30, 50]

### Sublista [20, 30]

- Escolhe o pivô: 20.
- Divide a lista:
    - Menores que 20: []
    - Maiores que 20: [30]

**Lista:** [20, 30]

**Resultado final:** [5, 8, 10, 20, 30, 50]

O QuickSort é preferido em muitos casos devido à sua eficiência e uso otimizado de memória, especialmente em listas grandes. No entanto, sua eficiência depende da escolha do pivô, e técnicas como o uso do pivô mediano ou aleatório podem ajudar a evitar o pior caso.