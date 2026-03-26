# 📚 Books Tracker (Minha Biblioteca Inteligente)

Um sistema Full-Stack desenvolvido para gerenciar leituras de forma automatizada e visual. A aplicação permite buscar obras diretamente na internet, salvando informações detalhadas e capas para organizar sua estante virtual, seja para livros técnicos de programação, romances ou seus Manhwas favoritos.

## ✨ Funcionalidades Atuais

* **Integração com Google Books API:** Busca automática de título, autor, número de páginas e capa do livro digitando apenas o nome.
* **Organização por Status:** Filtros dinâmicos na interface para separar as leituras em "Quero Ler", "Lendo" e "Já Lido".
* **Gerenciamento Completo:** Cadastro e exclusão de obras da estante virtual com atualização em tempo real na tela.
* **Interface Responsiva e Moderna:** Layout escuro (Dark Mode) desenhado para melhor usabilidade e conforto visual.

## 🛠️ Tecnologias Utilizadas

**Front-end:**
* React (Vite)
* JavaScript
* CSS3
* Axios (para consumo da API REST)

**Back-end:**
* Java
* Spring Boot
* JPA / Hibernate
* Consumo de API Externa (Google Books API)
* H2 Database (Banco de dados em memória para desenvolvimento)

## 🚀 Próximos Passos (Evolução do Projeto)

Este projeto está em constante evolução. As próximas atualizações focam em transformar a aplicação em um sistema multiusuário (SaaS):

1. **Migração de Banco de Dados:** Substituir o H2 Database por um banco de dados relacional definitivo (como MySQL ou PostgreSQL) para persistência permanente dos dados.
2. **Sistema de Autenticação (Login):** Implementar o Spring Security no Back-end para criar rotas protegidas e senhas criptografadas.
3. **Sessões Multiusuário:** Vincular os livros cadastrados ao ID do usuário logado, permitindo que várias pessoas tenham suas próprias bibliotecas privadas no mesmo sistema.

## ⚙️ Como rodar o projeto localmente

1. Clone este repositório.
2. Na pasta do Back-end (`books-tracker`), inicie a aplicação Spring Boot na porta `8080`.
3. Na pasta do Front-end (`front-library`), instale as dependências com `npm install` e inicie o servidor com `npm run dev`.
4. Acesse `http://localhost:5173` no seu navegador.
