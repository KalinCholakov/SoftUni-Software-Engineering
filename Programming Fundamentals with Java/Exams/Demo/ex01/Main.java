package Demo.ex01;

class Minimum {
    static int count;
    int min(int num1, int num2) {
        Minimum.count++;
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
}

class DoubleOfMinimum extends Minimum {
    static {
        Minimum.count++;
    }
    int min(int num1, int num2) {
        Minimum.count--;
        return 2 * super.min(num1, num2);
    }
}

class SpecialMinimum extends DoubleOfMinimum {
    private int specialNum1, specialNum2;
    public SpecialMinimum(int specialNum1, int specialNum2) {
        Minimum.count++;
        this.specialNum1 = specialNum1 + Minimum.count;
        this.specialNum2 = specialNum2;
    }
    int min(int num1, int num2) {
        return super.min(this.specialNum2 * num1, this.specialNum1 * num2);
    }
}

public class Main {

    public static void main(String[] args) {

        DoubleOfMinimum objSpecialMinimum = new SpecialMinimum(5, 10);
        System.out.println(objSpecialMinimum.min(20, 20));
        System.out.println(Minimum.count);
    }
}
