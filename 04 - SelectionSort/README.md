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