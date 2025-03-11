# Vagas - Sistema de Aplicação para Vagas de Emprego

## Descrição
Este projeto é uma aplicação backend desenvolvida em Spring Boot para gerenciar vagas de emprego e candidaturas. A aplicação permite que pessoas se inscrevam em vagas e avalia as melhores candidaturas com base em distância geográfica e nível de experiência.

## Funcionalidades
- **Cadastro de vagas**: Permite o cadastro de vagas de emprego com informações como título, descrição, empresa, localização e nível de experiência exigido.
- **Cadastro de candidatos**: Permite o cadastro de pessoas que se inscrevem nas vagas, com informações como nome, profissão, localização e nível de experiência.
- **Cálculo de pontuação para candidaturas**: Avalia e ordena as candidaturas para uma vaga com base na pontuação, levando em consideração a distância geográfica entre a localização da vaga e a localização da pessoa, além do nível de experiência.
- **Associação de candidaturas a vagas**: As pessoas podem se inscrever nas vagas, criando uma associação entre o candidato e a vaga escolhida.

## Tecnologias Utilizadas
- **Spring Boot**: Framework Java para desenvolvimento de aplicações web.
- **JPA/Hibernate**: Utilizado para persistência de dados em um banco de dados relacional.
- **DTOs (Data Transfer Objects)**: Para a troca de dados entre as camadas da aplicação.
- **Lombok**: Biblioteca Java para reduzir o boilerplate de código (getters, setters, construtores, etc.).
- **H2 Database**: Banco de dados em memória para testes e desenvolvimento.
- **JUnit**: Framework para testes unitários.

## Estrutura do Projeto
### Pacotes:
- **models**: Contém as entidades principais, como Person, Job, Application, DistanceCoordenates.
- **repositories**: Contém as interfaces dos repositórios para acessar e persistir os dados das entidades.
- **services**: Contém a lógica de negócios da aplicação, como a inserção de candidatos e vagas, além do cálculo de pontuação para as candidaturas.
- **dto**: Contém objetos de transferência de dados (DTOs), usados para representar as informações que são enviadas e recebidas pela aplicação.

### Entidades:
- **Job**: Representa uma vaga de emprego.
- **Person**: Representa uma pessoa candidata à vaga.
- **Application**: Representa uma inscrição de um candidato para uma vaga.
- **DistanceCoordenates**: Classe utilitária que contém a lógica para calcular as distâncias entre localidades e a pontuação baseada na distância.

### Repositórios:
- **JobRepository**: Interface para interação com o banco de dados de vagas.
- **PersonRepository**: Interface para interação com o banco de dados de pessoas.
- **ApplicationRepository**: Interface para interação com o banco de dados de inscrições.

### Serviços:
- **ApplicationService**: Lógica de negócios relacionada à criação e persistência de candidaturas.
- **JobService**: Lógica de negócios relacionada ao cadastro de vagas e cálculo de pontuação dos candidatos.
- **PersonService**: Lógica de negócios relacionada ao cadastro de pessoas.

## Como Rodar o Projeto
### Pré-requisitos
- Java 17 ou superior
- Maven para gerenciamento de dependências
- IDE de sua preferência (como IntelliJ IDEA, Eclipse ou VSCode)

### Passos para rodar
1. Clone o repositório para sua máquina local:
    ```bash
    git clone https://github.com/ogustavodias/vagas.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd vagas
    ```
3. Execute o comando Maven para construir o projeto:
    ```bash
    mvn clean install
    ```
4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```
    A aplicação estará rodando em [http://localhost:8081](http://localhost:8081).

## Testes
Por hora o projeto não conta com cobertura de testes, e este débito técnico será sanado em breve.

## Endpoints da API
1. **Cadastro de Vaga**
    - **POST /v1/jobs**
    - Body (exemplo):
    ```json
    {
      "company": "Tech Corp",
      "title": "Desenvolvedor Backend",
      "description": "Desenvolver sistemas backend para a empresa",
      "location": "A",
      "expLevel": "PLENO"
    }
    ```

2. **Cadastro de Pessoa**
    - **POST /v1/persons**
    - Body (exemplo):
    ```json
    {
      "name": "João Silva",
      "profession": "Desenvolvedor Java",
      "location": "B",
      "expLevel": "PLENO"
    }
    ```

3. **Inscrição em Vaga**
    - **POST /v1/applications**
    - Body (exemplo):
    ```json
    {
      "personId": 1,
      "jobId": 1
    }
    ```

4. **Obter Pessoas Inscritas por Vaga e Ordenadas por Pontuação**
    - **GET /v1/jobs/{jobId}/applications/ranking**
    - Retorna uma lista de pessoas inscritas em uma vaga, ordenadas pela pontuação.

## Contribuições
1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b minha-feature`).
3. Faça as alterações necessárias.
4. Comite suas mudanças (`git commit -am 'Adiciona minha feature'`).
5. Envie para o repositório remoto (`git push origin minha-feature`).
6. Abra um Pull Request.

## Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para mais detalhes.