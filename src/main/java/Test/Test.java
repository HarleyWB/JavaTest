package Test;

class Father {
    static int i = 0;

    public static void say() {
        System.out.println("father");
    }

    public static void say2() {

    }

    public void say3() {

    }
}

public class Test extends Father {

    public static void say() {
        System.out.println("test");
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Father f = new Test();
        Father father = new Father();

    }
}
