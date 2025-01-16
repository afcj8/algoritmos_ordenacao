# 6. ShellSort

O ShellSort é uma variação do InsertionSort que melhora sua eficiência ao reduzir o número de movimentos. Ele utiliza uma técnica de divisão da lista em grupos baseados em um intervalo (gap), ordenando os elementos dentro desses grupos. Com a diminuição progressiva do gap, o algoritmo finaliza com uma ordenação do tipo InsertionSort.

## 6.1. Complexidade

- **Melhor caso:** $O(𝑛 log 𝑛)$, dependendo da sequência de gaps escolhida.
- **Pior caso:** $O(𝑛^2)$, ocorre com sequências de gaps mal escolhidas.
- **Caso médio:** $O(𝑛^{3/2})$, para uma sequência de gaps comum, como 𝑛/2, n/4,...