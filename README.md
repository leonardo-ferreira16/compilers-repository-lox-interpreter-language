##🚀 Lox Language Interpreter ##


Um interpretador completo para a linguagem Lox, desenvolvido como projeto acadêmico da disciplina de Compiladores. Implementa todos os recursos fundamentais de uma linguagem de programação moderna, incluindo variáveis, funções, classes e controle de fluxo.

📋 Sobre a Linguagem Lox

Lox é uma linguagem de script dinâmica, orientada a objetos, inspirada em JavaScript e Python. Este projeto implementa um interpretador completo seguindo a arquitetura descrita no livro "Crafting Interpreters" de Robert Nystrom.

✨ Funcionalidades Implementadas

✅ Expressões e Operadores

Aritméticas: +, -, *, /

Comparação: ==, !=, <, <=, >, >=

Lógicos: and, or, !

Concatenação de strings

✅ Declarações e Controle de Fluxo

Variáveis: var

Blocos: { }

Condicionais: if-else

Loops: while, for

Saída: print

✅ Funções

Declaração: fun nome(parametros) { ... }

Retorno: return valor

Recursão

Funções aninhadas

Funções nativas (ex: clock())

✅ Programação Orientada a Objetos

Classes: class Nome { ... }

Métodos e propriedades

Inicializadores: init()

Referência: this

Instanciação: Classe()

✅ Gerenciamento de Escopos

Variáveis locais e globais

Resolução estática de escopos

Encadeamento de ambientes

🏗️ Arquitetura do Projeto

📦 com.craftinginterpreters.lox
├── 🎯 Lox.java              # Ponto de entrada

├── 🔍 Scanner.java          # Análise léxica → Tokens

├── 📐 Parser.java           # Análise sintática → AST

├── 🧠 Interpreter.java      # Execução

├── 🎯 Resolver.java         # Resolução de escopos

├── 📊 Expr.java             # Expressões (AST)

├── 📝 Stmt.java             # Declarações (AST)

├── 🔧 Environment.java      # Gerenciamento de variáveis

├── 🏛️ LoxClass.java         # Classes

├── 📦 LoxInstance.java      # Instâncias

├── 🔌 LoxFunction.java      # Funções

├── 🔌 LoxCallable.java      # Interface para chamáveis

├── ⚠️ RuntimeError.java     # Erros em tempo de execução

├── 🔣 Token.java            # Representação de tokens

├── 🔡 TokenType.java        # Tipos de tokens

└── 🖨️ AstPrinter.java       # Impressão da AST (debug)

🚀 Como Compilar e Executar


Pré-requisitos


Java JDK 8 ou superior


Terminal/Command Prompt


📦 Passo 1: Clonar/Download do Projeto


git clone [repositório](https://github.com/leonardo-ferreira16/compilers-repository-lox-interpreter-language)

cd compilers-repository-lox-interpreter-language


🔧 Passo 2: Compilar o Projeto


javac com/craftinginterpreters/lox/*.java


▶️ Passo 3: Executar Programas Lox


Nesse caso, a nossa instrução é de rodar o código direto no método main da classe Lox.java. Após isso, um terminal será aberto para programação em prompt


Exemplo de uso:
> var x = 10;

> print x + 5;

15

> fun soma(a, b) { return a + b; }

> print soma(3, 4);

7


📚 Exemplos de Programas Lox


1️⃣ Cálculo Fatorial (fatorial.lox)


fun fatorial(n) {
    if (n <= 1) {
        return 1;
    }
    return n * fatorial(n - 1);
}

 Testar a função
print "Calculando fatorais de 1 a 10:";
for (var i = 1; i <= 10; i = i + 1) {
    print i + "! = " + fatorial(i);
}

2️⃣ Classe Retângulo (retangulo.lox)

Classe Retangulo
class Retangulo {
    init(largura, altura) {
        this.largura = largura;
        this.altura = altura;
    }

    area() {
        return this.largura * this.altura;
    }

    perimetro() {
        return 2 * (this.largura + this.altura);
    }
}

var r1 = Retangulo(5, 3);
var r2 = Retangulo(7.5, 2.5);

print "Retângulo 1 (5x3):";
print "  Área: " + r1.area();
print "  Perímetro: " + r1.perimetro();

print "\nRetângulo 2 (7.5x2.5):";
print "  Área: " + r2.area();
print "  Perímetro: " + r2.perimetro();

📊 Resultados Esperados

Execução do fatorial.lox

Calculando fatorais de 1 a 10:

1! = 1

2! = 2

3! = 6

4! = 24

5! = 120

6! = 720

7! = 5040

8! = 40320

9! = 362880

10! = 3628800


Execução do retangulo.lox


Retângulo 1 (5x3):

  Área: 15
  
  Perímetro: 16
  

Retângulo 2 (7.5x2.5):

  Área: 18.75
  
  Perímetro: 20
  



  👥 Discentes
  
Leonardo Abreu Ferreira - [GitHub](https://github.com/leonardo-ferreira16)

Pedro Arthur Da Silva Guimarães - [GitHub](https://github.com/ArthurKodart)

📖 Referências

Nystrom, R. (2021). Crafting Interpreters. Genever Benning.

Documentação oficial Java: https://docs.oracle.com/javase/

Repositório oficial do Lox: https://github.com/munificent/craftinginterpreters

📄 Licença
Este projeto é para fins educacionais. Desenvolvido como parte da disciplina de Compiladores.