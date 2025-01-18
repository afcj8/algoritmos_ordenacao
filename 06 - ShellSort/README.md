# 6. ShellSort

O ShellSort é uma variação do InsertionSort que melhora sua eficiência ao reduzir o número de movimentos. Ele utiliza uma técnica de divisão da lista em grupos baseados em um intervalo (gap), ordenando os elementos dentro desses grupos. Com a diminuição progressiva do gap, o algoritmo finaliza com uma ordenação do tipo InsertionSort.

## 6.1. Complexidade

- **Melhor caso:** $O(𝑛 log 𝑛)$, dependendo da sequência de gaps escolhida.
- **Pior caso:** $O(𝑛^2)$, ocorre com sequências de gaps mal escolhidas.
- **Caso médio:** $O(𝑛^{3/2})$, para uma sequência de gaps comum, como 𝑛/2, 𝑛/4,...

## 6.2. Funcionamento

1. Define uma sequência de gaps, geralmente iniciando com 𝑛/2 (onde 𝑛 é o tamanho da lista).
2. Para cada gap, divide a lista em sublistas cujos elementos estão separados por essa distância.
3. Ordena cada sublista usando o InsertionSort.
4. Reduz o gap e repete até que o gap seja 1, quando ocorre uma última ordenação completa.

### Exemplo

**Lista inicial:** [10, 50, 5, 8, 20, 30]

Usa-se a sequência de gaps: 𝑛/2 = 3 → 1.

### Gap = 3

- Divide a lista em sublistas:

[10, 8], [50, 20], [5, 30].

- Ordena cada sublista:

[10, 8] → [8, 10], [50, 20] → [20, 50], [5, 30] → [5, 30].

- Lista após o primeiro gap: 

[8, 20, 5, 10, 50, 30].

### Gap = 1 (última iteração)

- Aplica o InsertionSort na lista

[8, 20, 5, 10, 50, 30] → [8, 5, 20, 10, 50, 30] → [5, 8, 20, 10, 50, 30] → [5, 8, 10, 20, 50, 30] → [5, 8, 10, 20, 30, 50].

**Resultado final:** [5, 8, 10, 20, 30, 50]

O ShellSort é mais eficiente que o InsertionSort para listas maiores, pois reduz a necessidade de movimentações longas. Contudo, sua eficiência depende da escolha da sequência de gaps, e não é tão utilizado em contextos onde algoritmos mais rápidos, como o MergeSort ou QuickSort, são preferidos.