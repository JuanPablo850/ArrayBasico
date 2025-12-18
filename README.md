
# 📦 Arrays em Java – Guia Básico

Neste repositório você encontrará exemplos práticos e exercícios resolvidos sobre **Arrays em Java**, um dos conceitos mais importantes para quem está começando na programação.

---

## 📌 O que é um Array?

Um **array** é uma estrutura de dados que permite armazenar **vários valores do mesmo tipo** em uma única variável.

Exemplo:
```java
int[] numeros = {10, 20, 30, 40};
```
## 📏 Tamanho do Array

O tamanho de um array é fixo e pode ser acessado usando:
```java
numeros.length
```

Exemplo:
```java
System.out.println(numeros.length); // 4
```

## 🔢 Índices do Array

Os arrays em Java começam no índice 0.

Índice	Valor
  0      10
  1      20
  2	     30
  3	     40

```java
Exemplo:

System.out.println(numeros[0]); // 10
```

## 🔁 Percorrendo um Array com for

A forma mais comum de percorrer um array é usando o for.
```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

## 🔁 Percorrendo um Array com for-each

Também é possível usar o for-each, ideal quando você não precisa do índice.
```
for (int num : numeros) {
    System.out.println(num);
}
```

## ✍️ Preenchendo um Array com Scanner

Exemplo lendo valores digitados pelo usuário:
```java
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
int[] valores = new int[5];

for (int i = 0; i < valores.length; i++) {
    System.out.print("Digite um número: ");
    valores[i] = scan.nextInt();
}
```

## 📝 Exercícios para Praticar

## 1️⃣ Criando e exibindo um array

Crie um array de 5 números inteiros e imprima todos os valores.
📌 Dica: use for.

## 2️⃣ Soma dos elementos

Crie um array com 4 números e mostre a soma total dos valores.

## 3️⃣ Maior número do array

Crie um array com 6 números e mostre qual é o maior valor.

## 4️⃣ Média dos valores

Crie um array com 5 números e calcule a média.

## 📌 As respostas estão no código fixado.
