#  TDE 3 – Ordenação 

##  Algoritmos Implementados
- Bubble Sort (com flag de parada)  
- Selection Sort  
- Cocktail Sort  
- Comb Sort  
- Gnome Sort  
- Bucket Sort  

---

##  Objetivo
Comparar o desempenho de diferentes algoritmos de ordenação, analisando:
- **Tempo de execução (ms)**
- **Número de trocas realizadas**
- **Número de iterações (passagens pelos laços)**

Foram utilizados três vetores de teste:

- **Vetor 1 (aleatório):** `{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}`  
- **Vetor 2 (ordenado):** `{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}`  
- **Vetor 3 (invertido):** `{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}`  

---

##  Resultados Obtidos

| Algoritmo | Vetor 1 – Aleatório (Tempo / Trocas / Iterações) | Vetor 2 – Ordenado (Tempo / Trocas / Iterações) | Vetor 3 – Invertido (Tempo / Trocas / Iterações) |
|------------|--------------------------------------------------|--------------------------------------------------|--------------------------------------------------|
| **Bubble Sort (flag)** | 0.0057 ms / 78 / 195 | 0.0009 ms / 0 / 20 | 0.0064 ms / 190 / 210 |
| **Selection Sort** | 0.0045 ms / 18 / 190 | 0.0048 ms / 0 / 190 | 0.0042 ms / 10 / 190 |
| **Cocktail Sort** | 0.0068 ms / 78 / 154 | 0.0008 ms / 0 / 19 | 0.0085 ms / 190 / 190 |
| **Comb Sort** | 0.0043 ms / 22 / 129 | 0.0025 ms / 0 / 110 | 0.0034 ms / 18 / 129 |
| **Gnome Sort** | 0.0051 ms / 78 / 176 | 0.0008 ms / 0 / 20 | 0.0121 ms / 190 / 400 |
| **Bucket Sort** | 0.6864 ms / 20 / 40 | 0.0467 ms / 0 / 40 | 0.0238 ms / 20 / 40 |

---

##  Vetor 1 – Aleatório
Neste caso, todos os algoritmos realizaram um número razoável de trocas e iterações.  
- **Comb Sort** teve o **melhor desempenho em tempo**, graças ao uso de gaps que aceleram a movimentação dos elementos.  
- **Selection Sort** realizou **menos trocas**, já que só troca quando encontra o menor valor.  
- **Bubble**, **Cocktail** e **Gnome Sort** tiveram comportamento similar, com muitas trocas e iterações.  
- **Bucket Sort** foi eficiente, mas teve tempo mais alto por causa da criação de listas intermediárias.

 **Melhor em desempenho geral:** *Comb Sort*  
 **Menos trocas:** *Selection Sort*

---

##  Vetor 2 – Já Ordenado
Quando o vetor já está em ordem:
- **Bubble Sort (com flag)** se destaca, pois para logo na primeira passagem (0 trocas).  
- **Selection**, **Comb**, **Cocktail**, **Gnome** e **Bucket** também não precisaram trocar elementos, mas o Bubble foi o mais rápido pela flag de parada.  

 **Mais rápido:** *Bubble Sort com flag*  
 **Todos tiveram 0 trocas**, mostrando eficiência com dados já ordenados.

---

##  Vetor 3 – Invertido
É o pior caso para os algoritmos baseados em comparações adjacentes.
- **Bubble**, **Cocktail** e **Gnome Sort** fizeram o **maior número de trocas e iterações**, como esperado.  
- **Comb Sort** manteve bom desempenho mesmo nesse cenário, sendo o **mais eficiente em tempo**.  
- **Selection Sort** também teve **poucas trocas**, pois sempre posiciona o menor valor a cada iteração.  
- **Bucket Sort** teve desempenho regular, mas sem grande vantagem em vetores pequenos.

 **Mais rápido:** *Comb Sort*  
 **Menos trocas:** *Selection Sort*

---

##  Conclusão Geral

| Critério | Melhor algoritmo |
|-----------|------------------|
| **Menor tempo médio** | Comb Sort |
| **Menos trocas** | Selection Sort |
| **Melhor em vetor já ordenado** | Bubble Sort (com flag) |
| **Mais simples de implementar** | Gnome Sort |
| **Depende da distribuição dos dados** | Bucket Sort |

O **Comb Sort** apresentou o **melhor equilíbrio geral** entre velocidade e estabilidade, sendo o mais eficiente para vetores de tamanhos e distribuições variadas.  
O **Selection Sort** se destacou por realizar o menor número de trocas, e o **Bubble Sort com flag** mostrou excelente desempenho em vetores já ordenados.  
O **Gnome Sort** é simples e funcional, mas ineficiente em grandes volumes.  
O **Bucket Sort**, embora rápido em alguns casos, depende da uniformidade dos dados para mostrar vantagens reais.
