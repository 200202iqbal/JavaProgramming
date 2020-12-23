public class ThreadExample extends Thread
{
    public static int amount = 0;

    public static void main (String[] args)
    {
        ThreadExample thread = new ThreadExample();
        thread.start();
        //wait for the thread to finish
        while(thread.isAlive())
        {
            System.out.println("Waiting...");
        }

        //update amount and print its value
        System.out.println("Main : " + amount);
        amount++;
        System.out.println("Main : " + amount);

    }

    public void run()
    {
        amount++;
    }
}