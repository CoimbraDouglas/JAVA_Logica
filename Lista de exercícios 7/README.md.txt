# 📘 Exercícios de Programação em Java

**Disciplina:** Linguagens de Programação
**Professor:** Fabrício Rodrigues Inácio

---

## 📂 Estrutura do Projeto

O projeto contém **dois programas independentes**, cada um implementando um conceito matemático em Java:

1. **Produto entre Vetor e Matriz (v × A)** → `ex01.java`
2. **Cálculo da Sequência de Collatz** → `ex03.java`

---

## 📝 Descrição dos Exercícios

### 🔹 Exercício 1 — Produto Vetor × Matriz

* O programa gera:

  * Um vetor `v` de tamanho `n`, com valores aleatórios entre `0` e `10`.
  * Uma matriz quadrada `A (n × n)`, também com valores aleatórios no mesmo intervalo.
* Em seguida, calcula o produto **v × A**, resultando em um **novo vetor**.
* Fórmula aplicada:

$$
resultado[i] = \sum_{j=0}^{n-1} (v[j] \times A[j][i])
$$

* O programa exibe a matriz, o vetor original e o resultado da multiplicação.

---

### 🔹 Exercício 2 — Sequência de Collatz

* Dado um número inteiro `n`:

  * Se for **par**, divide-se por `2`.
  * Se for **ímpar**, multiplica-se por `3` e soma `1`.

* Esse processo se repete até que `n` seja igual a `1`.

* O programa retorna:

  * O **resultado final** (sempre `1`).
  * O **número de passos** necessários para alcançar esse resultado.

* Exemplo:

  * Entrada: `n = 6`
  * Sequência: `6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1`
  * Total de passos: `8`.


