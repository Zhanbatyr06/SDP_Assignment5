interface Strategy {
    int doOperation(int num1, int num2);
}
class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
class Context2{
    private Strategy strategy;
    public Context2(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
