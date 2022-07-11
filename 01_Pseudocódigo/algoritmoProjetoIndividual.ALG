Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
Var
clientes:  vetor[1..3, 1..5] de caractere
dados: vetor[1..5] de caractere
indexX: inteiro
indexY: inteiro
nome: caractere
procedimento consultaCliente(nomeParam: caractere)
 inicio
   para indexX de 1 ate 3 passo 1 faca
     se(nomeParam = clientes[indexX, 1]) entao
       para indexY de 1 ate 5 passo 1 faca
         escreval(dados[indexY], clientes[indexX, indexY])
       fimpara
     fimse
   fimpara
fimprocedimento
// 1-NOME, 2-SOBRENOME, 3-CPF
Inicio
dados[1] <- "Seu nome: "
dados[2] <- "Sobrenome: "
dados[3] <- "CPF: "
dados[4] <- "Origem: "
dados[5] <- "Destino: "

escreval("------------------------------------------------")
escreval("           Agência de Viagens Tripz             ")
escreval("------------------------------------------------")
escreval()
escreval("Olá, Insira seus dados para cadastro")
escreval()
para indexX de 1 ate 3 passo 1 faca
  para indexY de 1 ate 5 passo 1 faca
    escreva(dados[indexY])
    leia(clientes[indexX, indexY])
  fimpara
  escreval()
fimpara
para indexX de 1 ate 3 passo 1 faca
  para indexY de 1 ate 5 passo 1 faca
    escreval(clientes[indexX, indexY])
  fimpara
  escreval("===========================")
fimpara
escreval()
escreval("----- CONSULTA POR NOME -----")
escreva("Informe o NOME para buscar o cliente => ")
leia(nome)
consultaCliente(nome)
Fimalgoritmo