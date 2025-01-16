# 6. ShellSort

O ShellSort é uma variação do InsertionSort que melhora sua eficiência ao reduzir o número de movimentos. Ele utiliza uma técnica de divisão da lista em grupos baseados em um intervalo (gap), ordenando os elementos dentro desses grupos. Com a diminuição progressiva do gap, o algoritmo finaliza com uma ordenação do tipo InsertionSort.

## 6.1. Complexidade

- **Melhor caso:** $O(𝑛 log 𝑛)$, dependendo da sequência de gaps escolhida.
- **Pior caso:** $O(𝑛^2)$, ocorre com sequências de gaps mal escolhidas.
- **Caso médio:** $O(𝑛^{3/2})$, para uma sequência de gaps comum, como 𝑛/2, n/4,...

## 6.2. Funcionamento

1. Define uma sequência de gaps, geralmente iniciando com 𝑛/2 (onde 𝑛 é o tamanho da lista).
2. Para cada gap, divide a lista em sublistas cujos elementos estão separados por essa distância.
3. Ordena cada sublista usando o InsertionSort.
4. Reduz o gap e repete até que o gap seja 1, quando ocorre uma última ordenação completa.