package src.Task1;

public class Flows {

    public void methodA(String start) {
        System.out.print("j");
        if (start.equals("start")) {
            methodB(1);
        } else {
            System.out.print("o");
            methodC(12);
        }
    }

    public void methodB(int length) {
        System.out.print("a");
        if (length == 1) {
            methodC(2);
        } else {
            System.out.print(" e");
            methodD();
        }
    }

    public void methodC(int length) {
        System.out.print("v");
        if (length == 2) {
            methodB(3);
        } else {
            System.out.print("t");
        }
    }

    public void methodD() {
        System.out.print("r");
        methodE();
    }

    public void methodE() {
        System.out.print(" s");
        methodA("java er s");
    }
}
