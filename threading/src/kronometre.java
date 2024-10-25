public class kronometre implements Runnable {
    private Thread t;
    private String threadname;

    public kronometre(String threadname) {
        this.threadname = threadname;
        System.out.println("Oluşturuluyor... " + threadname);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor... " + threadname);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadname + " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Kesildi : "+threadname);
        }
        System.out.println("Bitti...");
    }
    public void basla(){
        System.out.println("Thread oluşuyor.");
        if (t==null){
            t = new Thread(this,threadname);
            t.start();
        }
    }
}
