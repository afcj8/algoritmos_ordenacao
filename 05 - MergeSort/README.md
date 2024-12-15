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