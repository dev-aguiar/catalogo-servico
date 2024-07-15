# Catálogo de Serviços

O Catálogo de Serviços é um sistema que permite gerenciar profissionais de diferentes áreas de serviço. Com ele, é possível adicionar novos profissionais, consultar a lista de profissionais cadastrados, e procurar profissionais por tipo de serviço ou cidade. O sistema possui um menu interativo que facilita a navegação.


### Linguagem utilizada

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Funcionalidades

- **Adicionar novo profissional**

- **Consultar profissionais cadastrados**

- **Procurar profissional por tipo de serviço**

- **Procurar profissional por cidade**


## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

**Main.java**: Ponto de entrada da aplicação.

**MenuPrincipal.java**: Esta classe é responsável por exibir o menu principal e lidar com as entradas do usuário. Dependendo da escolha do usuário, chama os métodos apropriados da classe ListaProfissional.

**ListaProfissional.java**: Esta classe gerencia a lista de profissionais. Inclui métodos para adicionar um novo profissional, listar todos os profissionais cadastrados, procurar profissionais por tipo de serviço e procurar profissionais por cidade.

**Profissional.java**: Esta classe representa um profissional com seus atributos: nome, cidade, estado, serviço, Instagram e contato.



## Como usar

 - Clone o repositório para sua máquina local:

`git clone https://github.com/dev-aguiar/catalogo-servico.git`

`cd erp-java-project`

 - Abra o projeto em sua IDE (Utilizei o VSCode)

 - Compile e execute o projeto a partir da classe `Main.java`.

-------------------------------------------------

Ao iniciar o programa, o menu principal será exibido:

```
>>> Catálogo de Serviços:**

O que deseja fazer?

- 1 - Adicionar novo profissional
- 2 - Consultar profissionais cadastrados
- 3 - Procurar profissional por tipo de serviço
- 4 - Procurar profissional por cidade
Digite sua escolha:
```

Se o usuário escolher adicionar um novo profissional (opção 1), será solicitado a fornecer os detalhes do profissional:

```
Para adicionar um novo profissional preencha as informações abaixo:
Digite o nome do profissional:
...
```


## Autores

- [@dev-aguiar](https://www.github.com/dev-aguiar)


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/dev-aguiar)

[![WhatsApp](https://img.shields.io/badge/WhatsApp-green?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/5511975158913)

[![Gmail](https://img.shields.io/badge/Gmail-red?style=for-the-badge&logo=gmail&logoColor=white)](mailto:andre.aguiar522@gmail.com)


