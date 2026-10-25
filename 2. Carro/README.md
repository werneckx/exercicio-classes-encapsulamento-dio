## Exercicio 2
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
   - [PRONTO] Ligar o carro;
   - [PRONTO] Desligar o carro;
   - [PRONTO] Acelerar;
   - [PRONTO] diminuir velocidade;
   - virar para esquerda/direita
   - [PRONTO] verificar velocidade;
   - [PRONTO] trocar a marcha

Siga as seguintes regras na implementação
  - [PRONTO] Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
  - [PRONTO] O carro desligado não pode realizar nenhuma função;
  - [PRONTO] Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
  - [PRONTO] Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
  - [PRONTO] o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
  - [PRONTO] A velocidade do carro deve respeitar os seguintes limites para cada velocidade
     - se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
     - se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
     - se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
     - se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
     - se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
     - se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
     - se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
   - [PRONTO] O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
   - O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;