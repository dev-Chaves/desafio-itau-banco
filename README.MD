# Desafio Itaú Unibanco - Backend

## Índice

- [Introdução](#introdução)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação e Configuração](#instalação-e-configuração)
- [Endpoints da API](#endpoints-da-api)
    - [Receber Transações: POST /transacao](#receber-transações-post-transacao)
    - [Limpar Transações: DELETE /transacao](#limpar-transações-delete-transacao)
    - [Calcular Estatísticas: GET /estatistica](#calcular-estatísticas-get-estatistica)
- [Regras de Negócio](#regras-de-negócio)
- [Testes](#testes)
- [Considerações Finais](#considerações-finais)

## Introdução

Este projeto é parte do **Desafio de Programação** proposto pelo Itaú Unibanco. O objetivo é desenvolver uma API REST em Java ou Kotlin utilizando Spring Boot, que receba transações financeiras e forneça estatísticas baseadas nessas transações.

## Tecnologias Utilizadas

- Java 21+
- Spring Boot 3.4.2
- Maven
- JUnit 5 para testes

## Instalação e Configuração

1. **Clonar o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/desafio-itau-backend.git
   cd desafio-itau-backend

## Endpoints da API

**Receber Transações: POST /transacao
Recebe uma transação com valor e dataHora.**

Exemplo de Requisição:
    
    {
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
    }

Respostas Possíveis:

- 201 Created: Transação aceita.
- 422 Unprocessable Entity: Transação inválida.
- 400 Bad Request: Requisição malformada.

**Receber Transações: GET /transacoes/listar**

**Lista transações**

Exemplo de Requisição:

    {
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
    }

Respostas Possíveis:

- 200 OK.
- 400 Bad Request: Requisição malformada.


