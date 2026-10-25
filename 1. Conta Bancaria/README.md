## Exericio 1
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    - [PRONTO] Consultar saldo
    - [PRONTO] Consultar cheque especial
    - [PRONTO] Depositar dinheiro;
    - [PRONTO] Sacar dinheiro;
    - [PRONTO] Pagar um boleto.
    - [PRONTO] Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar
   - [PRONTO] A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
   - [PRONTO] O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação; 
   - [PRONTO] Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
   - [PRONTO] Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
   - [PRONTO] Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.