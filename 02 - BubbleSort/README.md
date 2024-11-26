# 2. BubbleSort

O BubbleSort é um algoritmo de ordenação simples que organiza uma lista comparando pares consecutivos de elementos e os trocando de lugar caso estejam fora de ordem. O processo é repetido até que a lista esteja totalmente ordenada. O nome "Bubble" refere-se ao modo como os elementos "maiores" gradualmente "flutuam" para o topo da lista.

## 2.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛)$, quando implementado com uma verificação para evitar iterações desnecessárias.
- **Pior caso (lista em ordem reversa):** $O(n^2)$, pois cada elemento deve ser comparado e trocado em todas as iterações.
- **Caso médio:** $O(𝑛^2)$, devido ao número de comparações e trocas necessárias.