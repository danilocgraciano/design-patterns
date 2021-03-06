# design-patterns

Este repositório representa uma revisão de conceitos sobre Design Patterns.

Toda a implementação foi feita em Java, mas os conceitos independem da linguagem utilizada.

Foi utilizado um artigo de referência, disponível em https://medium.com/xp-inc/desing-patterns-parte-2-2a61878846d, e também outras fontes disponíveis na internet.

## O que são Design Patterns?

Padrões de projeto são alternativas para que o desenvolvedor consiga escrever código com responsabilidades mais bem definidas, com um baixo acoplamento, e que evolua de maneira natural. 

Características essas que não são encontrados em sistemas procedurais, que tipicamente apresentam código complexo, cheio de ifs, e que fazem muita coisa, tornando a manutenção custosa.

Códigos que fazem bom uso de Orientação a Objetos evoluem geralmente não pela adição de mais um if, mas sim pela criação de mais uma estratégia, mais um observador, mais um estado, e assim por diante.

Padrões de projeto no fim apenas fazem bom uso da orientação a objetos, e seus conceitos e mecanismos, como encapsulamento, abstrações, interfaces, polimorfismo, e etc.

Neste projeto a separação dos tipos de padrões se dá pelo nome dos pacotes:

* C - Criacionais
* S - Estruturais
* B - Comportamentais

## Padrões Criacionais

* Factory mode : é um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objeto que será criado.

* Abstract Factory : é um padrão de design criacional que permite produzir famílias de objetos relacionados sem especificar suas classes concretas.

* Builder : é um padrão de design criacional que permite construir objetos complexos passo a passo. O padrão permite produzir diferentes tipos e representações de um objeto usando o mesmo código de construção.

* Singleton : é um padrão de design criacional que permite garantir que uma classe tenha apenas uma instância, enquanto fornece um ponto de acesso global a essa instância.

* Prototype : é um padrão de design criacional que permite copiar objetos existentes sem tornar seu código dependente de suas classes.

## Padrões Estruturais

* Adapter : é um padrão de design estrutural que permite a colaboração de objetos com interfaces incompatíveis.

* Bridge : é um padrão de design estrutural que permite dividir uma classe grande ou um conjunto de classes estreitamente relacionadas em duas hierarquias separadas — abstração e implementação — que podem ser desenvolvidas independentemente uma da outra.

* Composite : é um padrão de design estrutural que permite compor objetos em estruturas de árvores e trabalhar com essas estruturas como se fossem objetos individuais.

* Decorator : é um padrão de design estrutural que permite anexar novos comportamentos aos objetos, colocando-os dentro de objetos especiais do invólucro que contêm os comportamentos.

* Facade : é um padrão de design estrutural que fornece uma interface simplificada para uma biblioteca, uma estrutura ou qualquer outro conjunto complexo de classes.