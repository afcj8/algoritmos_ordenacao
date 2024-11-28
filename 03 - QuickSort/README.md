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