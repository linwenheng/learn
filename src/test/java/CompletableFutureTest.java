public class CompletableFutureTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(10/0);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1/0);
            }
        });

        thread1.start();
        thread2.start();
    }
}
