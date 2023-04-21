# Desafio 03
## Análise das aplicações
#### Etapa 1 - 500 VU
Com 500 UV, é possivel simular uma carga moderada.
- Tempo de resposta: O Wwebflux apresenta vantagem em relação ao MVC, com tempo médio de resposta de 100ms e o MVC de 500ms
- Taxa de erro: ambas apresentaram uma taxa de erro baixa.
- Uso de recursos: o WebFlux apresentou consumo em média 50% menos memória e processamento.

#### Etapa 2 - 1000 VU
Com 1000 VU, é possível simular uma carga ainda mais intensa na aplicação.
- Tempo de resposta: WebFlux continua apresentando vantagem (150ms) em relação do MVC (800ms).
- Taxa de erro: taxa de erro mais elava em ambas aplicações,com cerca de 2% das requisições resultando em erro.
- Uso de recursos: o WebFlux apresentou consumo em média 60% menos memória e processamento.
#### Etapa 3 - 2000 VU
Com 2000 VU, é possível simular uma carga ainda mais intensa na aplicação.
- Tempo de resposta: WebFlux continua apresentando vantagem em relação do MVC.
- Taxa de erro: taxa de erro mais elava em ambas aplicações.
- Uso de recursos: o WebFlux apresentou consumo em média 70% menos memória e processamento.
