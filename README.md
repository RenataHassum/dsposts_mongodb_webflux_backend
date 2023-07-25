













### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSPosts | WebFlux [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dsposts_mongodb_webflux_backend/blob/main/LICENSE)

A aplicação DSPosts é uma mini rede social com recursos completos de CRUD, incluindo busca, criação, atualização e exclusão de conteúdos. Utilizando o MongoDB em conjunto com o Spring WebFlux, é possível realizar consultas eficientes nos posts por título, comentário e data. O projeto foi desenvolvido no Workshop Spring WebFlux MongoDB, promovido pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

O projeto destaca a adoção do MongoDB, um banco de dados NoSQL que oferece flexibilidade no esquema dos dados e um desempenho escalável para lidar com grandes volumes de informações. Além disso, a aplicação utiliza o Spring WebFlux, uma abordagem reativa e assíncrona que trabalha de forma não bloqueante, aproveitando os recursos do sistema de maneira otimizada e possibilitando a construção de aplicações altamente responsivas. Essa combinação permite uma escalabilidade eficiente tanto no gerenciamento de dados quanto no processamento de requisições, sendo capaz de lidar com fluxos contínuos de dados de forma eficiente.

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dsposts_mongodb_webflux_backend.git

# entrar na pasta do projeto back end
cd dsposts_mongodb_webflux_backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-51b4bb04-a36a-4fc0-b519-2f77c6cd8857?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-51b4bb04-a36a-4fc0-b519-2f77c6cd8857%26entityType%3Dcollection%26workspaceId%3D6fa37535-0872-4582-aa55-845bdd5da9b3)

#### Não é necessário realizar a configuração de ambiente do projeto

## User endpoints
`GET List users / User by ID`
- Retorna uma lista de usuários
- Retorna informações de um usuário específico

`POST New user / PUT Update user / DELETE Delete user`
- Permite criar um novo usuário
- Permite atualizar um usuário específico
- Permite deletar um usuário específico

## Posts endpoints
`GET Posts by user / Post by ID / Title search / Full search`
- Retorna uma lista de posts de um usuário específico
- Retorna informações de um post específico
- Retorna uma lista de posts que atendem aos critérios informados:
  - Trecho do texto título (opcional): Se não informado, será considerado o texto vazio
    
- Retorna uma lista de posts que atendem aos critérios informados:
  - Data inicial (opcional): Se não informada, serão considerados os posts a partir da data mais antiga disponível na aplicação
  - Data final (opcional): Se não informada, será considerada a data atual do sistema
  - Trecho do texto podendo ser título ou comentário (opcional): Se não informado, será considerado o texto vazio

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Data MongoDB, Spring WebFlux, API REST, Maven, Git
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem
- Implantação banco de dados: MongoDB

# Técnicas | Competências
- Programação Orientada a Documentos: Permite o desenvolvimento eficiente de sistemas utilizando a abordagem de modelagem de dados orientada a documentos. O MongoDB, como banco de dados NoSQL, proporciona flexibilidade no esquema dos dados e desempenho escalável para lidar com grandes volumes de informações.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Consultas com Mongo Query Language (MQL): Realiza consultas no banco de dados MongoDB NoSQL, utilizando a linguagem de consulta MQL.

## Spring WebFlux
![Spring WebFlux](https://github.com/RenataHassum/assets/blob/main/dsposts_mongodb_webflux/springWebFlux.jpg?raw=true)

## Programação Reativa - Assíncrona - Não bloqueante
Stream representa um conjunto de dados (eventos)
![Spring WebFlux](https://github.com/RenataHassum/assets/blob/main/dsposts_mongodb_webflux/programacaoReativa2.jpg?raw=true)

## Arquitetura da aplicação
![Arquitetura da aplicação](https://github.com/RenataHassum/assets/blob/main/dsposts_mongodb_webflux/arquiteturaAplicacao.jpg?raw=true)

## Modelo Conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dsposts_mongodb_assets/modelo%20conceitual.jpg)

## Modelo de Agregados - NoSQL
![Modelo de Agregados](https://github.com/RenataHassum/assets/blob/main/dsposts_mongodb_assets/modelo%20de%20agregacao2b.jpg)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
