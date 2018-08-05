package Test;


import java.util.Scanner;

class Test {
    public static void main(String[] args) throws InterruptedException {
        //  String s="abcdefghijklmnop";
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.length() % 4 != 0 || s == null || s.length() < 4)
            return;
        int n = s.length() / 4 + 1;

        System.out.println(s.substring(0, n));
        String s2 = s.substring(n, s.length());


        for (int i = 0; i < n - 2; i++) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(s2.charAt(i));
            for (int j = 0; j < n - 2; j++) {
                buffer.append(" ");
            }
            buffer.append(s2.charAt(s2.length() - i - 1));
            System.out.println(buffer.reverse().toString());
        }
        StringBuffer buffer1 = new StringBuffer(s.substring(2 * n - 2, 3 * n - 2));

        System.out.println(buffer1.reverse().toString());
    }

    public static class MyTask implements Runnable {

        public String name;

        public MyTask(String name) {
            this.name = name;

        }

        @Override
        public synchronized void run() {
            System.out.println("Thread ID " + Thread.currentThread().getId() + " " + name);

        }
    }
}