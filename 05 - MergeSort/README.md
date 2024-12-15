# 5. MergeSort

O MergeSort é um algoritmo de ordenação baseado na técnica de divisão e conquista. Ele divide a lista em partes menores até que cada sublista tenha apenas um elemento (naturalmente ordenado), e em seguida as combina (merge) de forma ordenada para formar a lista final.

## 5.1. Complexidade

- **Melhor caso:** $O(𝑛 log 𝑛)$, devido à divisão contínua da lista e ao processo eficiente de mesclagem.
- **Pior caso:** $O(𝑛 log 𝑛)$, pois o número de comparações realizadas é o mesmo para qualquer ordem inicial.
- **Caso médio:** $O(𝑛 log 𝑛)$, com comportamento consistente para listas de tamanhos variados.

## 5.2. Funcionamento

1. Divide recursivamente a lista ao meio até que cada sublista contenha um único elemento.
2. Combina (merge) as sublistas menores em sublistas ordenadas, comparando os elementos.
3. Continua o processo até que todas as sublistas sejam mescladas em uma única lista ordenada.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

### Divisão da lista

- Divide a lista em duas partes: [10, 50, 5] e [8, 20, 30].
- Continua dividindo:
    - [10, 50, 5] → [10] e [50, 5] → [50] e [5].
    - [8, 20, 30] → [8] e [20, 30] → [20] e [30].

### Mesclagem das sublistas

- Combina os elementos menores em sublistas ordenadas:
    - [50] e [5] → [5, 50].
    - [20] e [30] → [20, 30].
- Continua mesclando:
    - [10] e [5, 50] → [5, 10, 50].
    - [8] e [20, 30] → [8, 20, 30].

### Mesclagem final

- Combina as duas metades:
    - [5, 10, 50] e [8, 20, 30] → [5, 8, 10, 20, 30, 50].

**Resultado final:** [5, 8, 10, 20, 30, 50]

O MergeSort é eficiente para listas grandes devido à sua complexidade $O(𝑛 log 𝑛)$, mas requer memória adicional para armazenar as sublistas durante o processo de mesclagem. É particularmente útil em situações que exigem estabilidade, já que mantém a ordem relativa dos elementos iguais.