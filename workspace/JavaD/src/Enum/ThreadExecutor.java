class ThreadSample extends Thread
{
    int n ;
    ThreadSample(int n )
    {
        this.n = n;
    }
    public void run()
    {
        System.out.println("Thread " + n + " !");
    }
}

public class ThreadExecutor 
{
    public static void main(String[] args)
    {
        ThreadSample t1 = new ThreadSample(1);
        ThreadSample t2 = new ThreadSample(2);
        ThreadSample t3 = new ThreadSample(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
