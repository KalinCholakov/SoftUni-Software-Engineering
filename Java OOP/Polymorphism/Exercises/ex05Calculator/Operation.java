package polymorphism.exercises.ex05Calculator;

public interface Operation {
    void addOperand(int operand);

    int getResult();

    boolean isCompleted();
}
