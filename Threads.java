import java.security.spec.ECField;

public class Threads extends Thread
{
    public static void main(String[] args)
    {
        // getting reference to Main thread
        Thread t = Thread.currentThread();

        // getting name of Main thread
        //System.out.println("Current thread: " + t.getName());

        // changing the name of Main thread
        t.setName("one");

        t.setPriority(MIN_PRIORITY);

        //System.out.println("Main thread new priority: "+ t.getPriority());

        // Main thread creating a child thread
        ChildThread ct = new ChildThread();
        ct.setName("two");
        // getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "+ ct.getPriority());

        // setting priority of Main thread to MIN(1)
        ct.setPriority(MAX_PRIORITY);

        System.out.println("Child thread new priority: "+ ct.getPriority());

        for (int i = 0; i < 10; i++)
        {
            try {
                t.sleep(1000);
            }catch (Exception e){}
            System.out.println("one "+i);
        }
        // starting child thread
        ct.start();
    }
}

// Child Thread class
class ChildThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try {
                Thread.sleep(700);
            }catch (Exception e){}
            System.out.println("two "+i);
        }
    }
}