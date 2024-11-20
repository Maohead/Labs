import java.util.*

fun evaluateExpression(expression: String): Double {
    val tokens = tokenize(expression)

    val postfixTokens = infixToPostfix(tokens)

    return evalPostfix(postfixTokens)
}

private fun tokenize(expression: String): List<String> {
    val tokens = mutableListOf<String>()
    var currentToken = ""

    for (char in expression) {
        if (char.isDigit()) {
            currentToken += char
        } else if (!currentToken.isEmpty()) {
            tokens.add(currentToken)
            currentToken = ""
        }

        if ("+-*/()".contains(char)) {
            if (!currentToken.isEmpty()) {
                tokens.add(currentToken)
                currentToken = ""
            }
            tokens.add(char.toString())
        }
    }

    if (!currentToken.isEmpty()) {
        tokens.add(currentToken)
    }

    return tokens
}

private fun infixToPostfix(infixTokens: List<String>): List<String> {
    val outputQueue = ArrayDeque<String>()
    val operatorStack = Stack<Char>()

    for (token in infixTokens) {
        when {
            token == "(" -> operatorStack.push('(')
            token == ")" -> {
                while (operatorStack.peek() != '(') {
                    outputQueue.add(operatorStack.pop().toString())
                }
                operatorStack.pop()
            }
            "+-*/".contains(token) -> {
                while (
                    !operatorStack.empty() &&
                    hasHigherPrecedence(operatorStack.peek(), token.first())
                ) {
                    outputQueue.add(operatorStack.pop().toString())
                }
                operatorStack.push(token.first())
            }
            else -> outputQueue.add(token)
        }
    }

    while (!operatorStack.empty()) {
        outputQueue.add(operatorStack.pop().toString())
    }

    return outputQueue.toList()
}

private fun hasHigherPrecedence(topOperator: Char, nextOperator: Char): Boolean {
    val precedence = mapOf(
        '*' to 2,
        '/' to 2,
        '+' to 1,
        '-' to 1,
        '(' to 0
    )

    return precedence.getValue(topOperator) >= precedence.getValue(nextOperator)
}

private fun evalPostfix(postfixTokens: List<String>): Double {
    val stack = Stack<Double>()

    for (token in postfixTokens) {
        when {
            token == "+" -> stack.push(stack.pop() + stack.pop())
            token == "-" -> {
                val right = stack.pop()
                val left = stack.pop()
                stack.push(left - right)
            }
            token == "*" -> stack.push(stack.pop() * stack.pop())
            token == "/" -> {
                val right = stack.pop()
                val left = stack.pop()
                stack.push(left / right)
            }
            else -> stack.push(token.toDouble())
        }
    }

    return stack.pop()
}

fun main() {
    print("Введите уравнение: ")
    val expression = readln().toString()
    val result = evaluateExpression(expression)
    println("Ответ: $result")
}
