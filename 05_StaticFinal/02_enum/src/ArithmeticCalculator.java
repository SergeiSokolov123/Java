public class ArithmeticCalculator {
    public int a = 0;
    public int b = 0;
    public final Operation type;
    public ArithmeticCalculator(int a, int b, Operation type) {
        this.a = a;
     this.b = b;
        this.type = type;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Operation getType() {
        return type;
    }
    public int calculate(Operation type) {
        if (type == Operation.ADD) {return a + b;
        }
        else if (type == Operation.SUBTRACT){return a-b;}
        else  {return a * b; }

    }
    }