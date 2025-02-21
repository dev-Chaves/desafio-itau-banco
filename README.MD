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

**Ver estátisticas: get /estatisticas
Mostrar estátisticas como:.**

- count	Quantidade de transações nos últimos 60 segundos	
- sum	Soma total do valor transacionado nos últimos 60 segundos	
- avg	Média do valor transacionado nos últimos 60 segundos	
- min	Menor valor transacionado nos últimos 60 segundos	
- max	Maior valor transacionado nos últimos 60 segundos	

Exemplo de Requisição:

    {
    "count": 10,
    "sum": 1234.56,
    "avg": 123.456,
    "min": 12.34,
    "max": 123.56
    }

## Melhorias Futuras (Checklist)
✅ Testes Automatizados

- Adicionar testes unitários e funcionais robustos, incluindo cenários de erro (ex: transações inválidas, timeout).

- Cobrir 100% dos caminhos críticos com JUnit 5 + Mockito.

✅ **Containerização**

- Criar Dockerfile para empacotar a aplicação.

- Configurar docker-compose.yml para ambiente de desenvolvimento.

✅ **Logs Estruturados**

- Implementar logs em formato JSON para análise em ferramentas como ELK Stack.

- Níveis configuráveis por ambiente (ex: DEBUG em dev, WARN em prod).

✅ Observabilidade

- Adicionar endpoint /health com Spring Boot Actuator para healthcheck.

- Incluir métricas de performance via /metrics (tempo de resposta, uso de memória).

✅ **Performance**

- Medir tempo de cálculo das estatísticas usando StopWatch ou Micrometer.

- Otimizar filtragem de transações com estruturas de dados eficientes (ex: TreeMap ordenado por timestamp).

✅ **Tratamento de Erros**

- Customizar respostas de erro com @ControllerAdvice e mensagens amigáveis (ex: { "erro": "Transação futura", "detalhes": "dataHora inválida" }).

✅ **Documentação da API**

- Integrar Swagger/OpenAPI com exemplos de requisições e respostas.

- Disponibilizar documentação interativa em /swagger-ui.html.

✅ **Documentação do Sistema**

- Detalhar passos para build (mvn clean install) e execução (java -jar ou docker-compose up).

**Incluir pré-requisitos (Java 21+, Docker, Maven).**

🌟 **Progresso:**

Testes Automatizados

Containerização

Logs Estruturados

Observabilidade

Performance

Tratamento de Erros

Documentação da API

Documentação do Sistema

Configurações Flexíveis

Atualizado em: 07/08/2024

Contribuições são bem-vindas!
🔗 Clone o repositório e abra um PR para colaborar. 😊


