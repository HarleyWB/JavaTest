package JdkThread;

public class TransferRunable implements Runnable {

    private Bank bank = null;

    public TransferRunable() {

    }

    public TransferRunable(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            bank.add();
            try {

                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
