# 3. QuickSort

O QuickSort é um algoritmo de ordenação eficiente e amplamente utilizado, que emprega a técnica de divisão e conquista. Ele seleciona um elemento como pivô e reorganiza os elementos da lista, de modo que os menores que o pivô fiquem à esquerda e os maiores à direita. O processo é então repetido recursivamente para as sublistas.

## 3.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛 log 𝑛)$, quando o pivô divide a lista de forma equilibrada.
- **Pior caso (lista em ordem reversa):** $O(𝑛^2)$, ocorre quando o pivô é sempre o menor ou o maior elemento, resultando em sublistas muito desbalanceadas.
- **Caso médio:** $O(𝑛 log 𝑛)$, em cenários gerais.