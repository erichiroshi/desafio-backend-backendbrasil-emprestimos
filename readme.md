<p align="center">
  <img width="30%" src="images/backendbr-logo.png" alt="Backend Brasil Logo">
</p>

<h3 align="center">Desafio Backend - Empréstimos</h3>

<p align="center">
  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-Java%2025-blue">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">
</p>

---

## 🧭 Visão Geral

Este projeto foi desenvolvido como parte do **desafio técnico Backend Brasil** e implementa um serviço que determina quais modalidades de empréstimo uma pessoa tem acesso..  

---

## 📚 Sumário

- [🧭 Visão Geral](#-visão-geral)
- [📚 Sumário](#-sumário)
- [⚙️ Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [🏗️ Arquitetura da Solução](#️-arquitetura-da-solução)
- [🚀 Execução do Projeto](#-execução-do-projeto)
  - [✅ Pré-requisitos](#-pré-requisitos)
  - [📥 Clonar o repositório](#-clonar-o-repositório)
  - [▶️ Rodar a aplicação](#️-rodar-a-aplicação)
  - [🧩 Acessar a documentação Swagger](#-acessar-a-documentação-swagger)
- [💬 Interagindo com a API](#-interagindo-com-a-api)
- [📬 Endpoints e Exemplos](#-endpoints-e-exemplos)
  - [1️⃣ Listar modalidades de empréstimo que uma pessoa tem acesso — `POST /customer-loans`](#1️⃣-listar-modalidades-de-empréstimo-que-uma-pessoa-tem-acesso--post-customer-loans)
- [🤝 Contribuições](#-contribuições)
- [🔗 Referências e Créditos](#-referências-e-créditos)

---

## ⚙️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|-------------|-------------|
| ☕ **Java 25** | Linguagem principal |
| 🍃 **Spring Boot 3.5.7** | Framework de aplicação |
| 🩺 **Spring Boot Actuator** | Monitoramento e métricas da aplicação |
| ⚡ **Spring Boot DevTools** | Hot reload e ferramentas de desenvolvimento |
| ✅ **Spring Boot Validation (Jakarta)** | Validação de dados de entrada via anotações (`@NotNull`, `@Blank`, etc.) |
| 🌐 **Spring Web (Spring MVC)** | Criação de endpoints RESTful |
| ※ **RFC 9457 Problem Details** | Tratamento de erros |
| 📘 **Springdoc OpenAPI (Swagger UI)** | Documentação interativa da API |
| 🧰 **Lombok** | Redução de boilerplate |

---

## 🏗️ Arquitetura da Solução

```
[Cliente / Postman / Swagger UI]
        ↓
  REST API (Spring Boot)
        ↓
 [PointsController]
   ├── POST /customer-loans → modalidades de empréstimo
        ↓
 [Service Layer]
   └── LoanService (regras de modalidades de empréstimo)
```

---

## 🚀 Execução do Projeto

### ✅ Pré-requisitos
- **Java 25+**
- **Maven 3.9+**

### 📥 Clonar o repositório

```bash
git clone https://github.com/erichiroshi/desafio-backend-backendbrasil-emprestimos.git
cd desafio-backend-backendbrasil-emprestimos
```

### ▶️ Rodar a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:  
👉 [http://localhost:8080](http://localhost:8080)


### 🧩 Acessar a documentação Swagger

👉 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 💬 Interagindo com a API

As requisições podem ser testadas via **Postman**, **Insomnia** ou **Swagger UI**.

---

## 📬 Endpoints e Exemplos

### 1️⃣ Listar modalidades de empréstimo que uma pessoa tem acesso — `POST /customer-loans`

**Request Body**
```json
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```

**Response**
```json
{
    "customer": "Vuxaywua Zukiagou",
    "loans": [
        {
            "type": "CONSIGNMENT",
            "interestRate": 2.0
        }
    ]
}
```

---

## 🤝 Contribuições

Contribuições são sempre bem-vindas!  
Para contribuir:

1. Crie um fork do repositório.  
2. Crie uma branch de feature:  
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Commit suas mudanças:  
   ```bash
   git commit -m "feat: nova funcionalidade"
   ```
4. Envie um Pull Request.  

📜 **Boas práticas**
- Adicione testes unitários.  
- Documente suas alterações no código.  
- Use mensagens de commit seguindo o padrão **Conventional Commits**.

---

## 🔗 Referências e Créditos

- Desafio original: [Backend Brasil - Empréstimos](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md)
- Baseado no conteúdo do canal [Build & Run](https://www.youtube.com/watch?v=B-JSGLDwS1c)
- Repositório: [desafio-backend-backendbrasil-emprestimos](https://github.com/erichiroshi/desafio-backend-backendbrasil-emprestimos)
- Desenvolvido por [**Eric Hiroshi**](https://github.com/erichiroshi)
- Licença: [MIT](LICENSE)

---

<p align="center">
  <em>“Código limpo é aquele que expressa a intenção com simplicidade e precisão.”</em>
</p>
