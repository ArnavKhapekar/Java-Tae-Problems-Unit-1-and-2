class ThreadPrioritySystem extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadPrioritySystem();
        Thread t2 = new ThreadPrioritySystem();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
