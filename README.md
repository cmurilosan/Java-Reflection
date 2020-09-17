# Estudo sobre Reflection parte 1 - Entendendo a Metaprogramaço

- Bibliotecas como Hibernate, Spring ou CDI usam por trás dos panos
- Como a linguagem e seu programa funciona em tempo de execução
- Código usando Class, Constructor, Method, Field e muito mais
- Criar a própria biblioteca código
- Código mais dinâmico com a metaprogramação e reflection

## 01 - Começando com Reflection
- O que é metaprogramação e sua implementação no Java.
- Para que serve e como criar objetos da classe Class<T>.
- O que é a sintaxe class literal no Java.
- Como criar objetos da classe inferida por um objeto da classe Class<T>.
- Possibilidades no uso de uma instância da classe Class<T>.
 
 ## 02 - Criação de objetos com Constructor
 - Criando objetos corretamente
 - A vantagem do Constructor.newInstance()
 - Criação de objetos na prática
 - Resumo:
   - Por que o newInstance() da classe Class<T> foi descontinuado a partir do JDK 9.
   - Para que serve e como criar objetos da classe Constructor<T>.
   - As vantagens do newInstance() da classe Constructor<T>.
   - Possibilidades no uso de uma instância da classe Constructor<T>.

## 03 - Executando métodos e boas práticas
- Mantendo a legibilidade do código
- Invocação de métodos sem parâmetros
- Invocação de métodos sem parâmetros na prática
- Resumo:
  - Para que serve e como criar objetos da classe Method.
  - Como invocar um método sem parâmetro representado por um objeto da classe Method.
  - Possibilidades no uso de uma instância da classe Method.
  - Boas prática no desenvolvimento com a API de Reflection.
  - Criação de uma DSL (Linguagem de Domínio Específico, ou do tempo em inglês Domain-Specific Language) para do design e legibilidade ao trabalhar com a API de    Reflection.
  
## 04 - Executando métodos com parâmetros
- Invocação de métodos com parâmetros
- Invocação de métodos com parâmetros na prática
- Filtrando métodos
- Finalizando a invocação de métodos com parâmetros
- Resumo:
  - Filtrar um método de acordo com seu nome e tipo de parâmetros que recebe.
  - Como invocar um método com parâmetro representado por um objeto da classe Method.
  - Verificar a quantidade de parâmetros que um método recebe.
  - Obter o nome de um método.
  - Obter e manipular um array de parâmetros que um método recebe.
  - Habilitar o Java a ler o nome original dos parâmetros de métodos utilizando Reflection, a partir do JDK 8.
  
## 05 - Lidando com Excessões
- Lidando com exceções e boas práticas
- Resumo:
  - Utilidade das exceções na API de Reflection.
  - Utilidade da importante exceção InvocationTargetException.
  - Como obter a exceção original lançada ao executar um método ou construtor.
  - Tratamento customizado de exceções importantes.
  
# Estudo sobre Reflection parte 2: Anotações e Injeção de Dependências
- A tecnologia que bibliotecas como Hibernate, Spring ou CDI usam por trás dos panos
- Como a linguagem e seu programa funciona em tempo de execução
- Código usando Class, Constructor, Method, Field e muito mais
- Como criar a própria biblioteca código
- Código mais dinâmico com a metaprogramação
- O que são metadados e anotações
- Inversão de controle e injeção de dependência

## 06 - Avançando com Reflection
- Manipulação de atributos
- Manipulação de atributos na prática
- Resumo:
  - Formas de obter e listar atributos de uma classe.
  - Diferença entre os métodos getFields(), getDeclaredFields(), getField(String nome) e getDeclaredField(String nome).
  - Como obter o nome de um determinado atributo de classe.
  - Obter o valor de um atributo.
  - Atribuir valor a um atributo.
  - Obter os modificadores de acesso de um atributo.
  
## 07 - Anotações, metadados no Java
- Criando anotações
- Criando anotações na prática
- Resumo:
  - O que são metadados.
  - O que são anotações.
  - Como criar anotações.
  - O que são meta anotações.
  - Definir o momento em que a anotação deverá ser levada em consideração.
  - Definir em quais partes do código pode-se utilizar as anotações criadas.

## 08 - Reflection e anotações
- Anotações e Reflexão
- Anotaçes e Reflexão na prática
- Resumo:
  - As classes `Class<T>`, `Constructor<T>`, `Method` e `Field` e outras da *API de Reflection* disponibilizam métodos para verificar se determinada parte do código Java utiliza alguma anotação.
  - Como obter as anotações utilizadas no código Java a partir da API de Reflection.
  - Obter os valores das anotações a partir de API de Reflection.
  
## 09 - Injeção de dependências
- Inversão de controle e injeção de dependências na prática
- Resumo:
  - O que vem a ser inversão de controle e sua utilidade.
  - Sobre injeção de dependência e sua utilidade.
  - O que é e como implementar um container de inversão de controle.
