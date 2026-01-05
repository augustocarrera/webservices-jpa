# Projeto Web Services com Spring Boot e JPA / Hibernate

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/seu-usuario/seu-repositorio/blob/main/LICENSE)

## Sobre o projeto

Este é um projeto de Web Services RESTful desenvolvido com **Java** e **Spring Boot**, utilizando **JPA** e **Hibernate** para mapeamento objeto-relacional.

O projeto consiste na implementação de um sistema de pedidos, onde é possível gerenciar usuários, pedidos, produtos e categorias. O objetivo principal foi explorar as melhores práticas de desenvolvimento em camadas (Resource, Service, Repository), tratamento de exceções e banco de dados.

O desenvolvimento foi guiado pelos seguintes objetivos:
* Criar um projeto Spring Boot Java
* Implementar modelo de domínio complexo
* Estruturar camadas lógicas: resource, service, repository
* Configurar banco de dados de teste (H2) e produção (PostgreSQL)
* Realizar operações de CRUD (Create, Retrieve, Update, Delete)
* Tratamento de exceções personalizado

## Modelo Conceitual

A aplicação segue o modelo de domínio abaixo, contemplando relacionamentos de um-para-muitos e muitos-para-muitos.

![Modelo de Domínio](https://github.com/augustocarrera/webservices-jpa/blob/main/assets/domain-model.png)

**Entidades principais:**
* **User**: Cliente que realiza pedidos.
* **Order**: O pedido em si, contendo momento e status.
* **Product**: Produtos disponíveis com nome, descrição e preço.
* **Category**: Categorias dos produtos.
* **OrderItem**: Item do pedido (tabela de associação com atributos extras).
* **Payment**: Pagamento do pedido (relacionamento um-para-um).

## Tecnologias utilizadas

### Back end
* Java 17
* Spring Boot
* JPA / Hibernate
* Maven
* H2 Database (Banco em memória para testes)

## Como executar o projeto

### Pré-requisitos
* Java 17

### Passos para execução
```bash
# Clone o repositório
git clone [https://github.com/seu-usuario/nome-do-projeto.git](https://github.com/seu-usuario/nome-do-projeto.git)

# Entre na pasta do projeto
cd nome-do-projeto

# Execute o projeto
./mvnw spring-boot:run

```
##  Créditos
Este projeto foi desenvolvido baseado no material do **Prof.Dr. Nelio Alves**.
