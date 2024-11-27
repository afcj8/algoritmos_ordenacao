# 2. BubbleSort

O BubbleSort é um algoritmo de ordenação simples que organiza uma lista comparando pares consecutivos de elementos e os trocando de lugar caso estejam fora de ordem. O processo é repetido até que a lista esteja totalmente ordenada. O nome "Bubble" refere-se ao modo como os elementos "maiores" gradualmente "flutuam" para o topo da lista.

## 2.1. Complexidade

- **Melhor caso (lista já ordenada):** $O(𝑛)$, quando implementado com uma verificação para evitar iterações desnecessárias.
- **Pior caso (lista em ordem reversa):** $O(n^2)$, pois cada elemento deve ser comparado e trocado em todas as iterações.
- **Caso médio:** $O(𝑛^2)$, devido ao número de comparações e trocas necessárias.

## 2.2. Funcionamento

1. Percorre a lista repetidamente.
2. Compara pares consecutivos de elementos.
3. Troca os elementos de lugar, se necessário.
4. Após cada iteração, o maior elemento "flutua" para o final da lista.
5. O processo é repetido para os elementos restantes até que não haja mais trocas.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

### Iteração 1

- Compara 10 e 50 (não troca).
- Compara 50 e 5 (50 > 5, troca).
- Compara 50 e 8 (50 > 8, troca).
- Compara 50 e 20 (50 > 20, troca).
- Compara 50 e 30 (50 > 30, troca).

**Lista:** [10, 5, 8, 20, 30, 50]

### Iteração 2

- Compara 10 e 5 (10 > 5, troca).
- Compara 10 e 8 (10 > 8, troca).
- Compara 10 e 20 (não troca).
- Compara 20 e 30 (não troca).

**Lista:** [5, 8, 10, 20, 30, 50]

### Iteração 3

- Compara 5 e 8 (não troca).
- Compara 8 e 10 (não troca).
- Compara 10 e 20 (não troca).

**Lista:** [5, 8, 10, 20, 30, 50]

### Iteração 4

- Compara 5 e 8 (não troca).
- Compara 8 e 10 (não troca).

**Lista:** [5, 8, 10, 20, 30, 50]

### Iteração 5

- Compara 5 e 8 (não troca).

**Lista:** [5, 8, 10, 20, 30, 50]

**Resultado final:** [5, 8, 10, 20, 30, 50]

O BubbleSort é fácil de entender e implementar, mas sua ineficiência em listas grandes o torna inadequado para aplicações práticas. É mais eficiente para listas pequenas ou já ordenadas, especialmente quando implementado com verificações para interromper o processo caso nenhuma troca seja necessária em uma iteração.