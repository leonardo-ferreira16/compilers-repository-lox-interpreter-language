// [file name]: RuntimeError.java
package main.java.com.craftinginterpreters.lox;

class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}