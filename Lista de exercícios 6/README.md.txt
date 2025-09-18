# 📘 Algoritmos de Ordenação e Estrutura de Heap

**Disciplina:** Linguagens de Programação
**Professor:** Fabrício Rodrigues Inácio

---

## 📂 Estrutura do Projeto

Este programa, no arquivo `insercao.java`, implementa dois algoritmos fundamentais em estruturas de dados e ordenação:

* **Ordenação por Inserção (Insertion Sort)**
* **Construção de Heap Máximo (Max Heap)**

---

## 📝 Descrição dos Algoritmos

### 1. **Ordenação por Inserção (Insertion Sort)**

* Percorre o vetor a partir da segunda posição.
* Para cada elemento, desloca os maiores valores à direita até encontrar a posição correta.
* Insere o valor na posição adequada.
* Resultado: vetor ordenado em ordem crescente.

### 2. **Construção de Heap Máximo (Max Heap)**

* `aplicarHeap`: garante que o nó pai seja maior que seus filhos, trocando-os quando necessário.
* `construirHeap`: percorre o vetor da metade para o início, ajustando cada subárvore para manter a estrutura de heap máximo.
* O resultado é um vetor transformado em **heap binário máximo**, usado como base para o algoritmo **HeapSort**.

---

## ⚠️ Observações Importantes

* O código possui pequenos ajustes necessários:

  * Dentro de `construirHeap`, não é necessário redeclarar `int n = vetor.length;` se já for passado como parâmetro.
  * Na chamada `aplicarHeap((vetor, n, i));`, os parênteses extras devem ser removidos.
  * No `main`, ao imprimir o vetor original, deve-se usar `VET1[i]` em vez de `VET1`.

Esses ajustes permitem que o programa rode corretamente tanto para a ordenação por inserção quanto para a construção do heap.

---

## 🔑 Conceitos Reforçados

* Ordenação incremental (**inserção**).
* Estruturas baseadas em **árvores binárias** (heap).
* Manipulação de índices em vetores.
* Correção de erros comuns em implementação de algoritmos em Java.

---
