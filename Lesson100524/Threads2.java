package Lesson100524;
import static java.lang.System.out;
/* 
 * class MyRunnable implements Runnable {
 * public void run(){
 *   // код, который будет выполняться в новом потоке
 * }
 * 
 */

public class Threads2 
{
    public static void main(String[] args)
    {
        /* 
         * второй способ создавать потоки
         * это создать объект класса, который реализует интерфейс Runnable (B02)
         * и передать этот объект в конструктор класса Thread
         * предварительно создав объекты в классе Thread
         */

        B02 b1 = new B02(), b2 = new B02(), b3 = new B02();

        Thread t1 = new Thread(b1, "Thread 1"),
            t2 = new Thread(b2, "Thread 2"),
            t3 = new Thread(b3, "Thread 3");

        t1.start(); 
        t2.start();
        t3.start();;

    }
}

class B02 implements Runnable
{
    /* 
     * метод run() - это метод, который будет выполняться в новом потоке
     * внутри метода run() мы пишем код, который будет выполняться в новом потоке
     */

    public void run() 
    {
        Thread runnableThread = Thread.currentThread(); // возвращает ссылку на текущий поток
        for (int i = 0; i < 5; i++)
        {
            out.println(runnableThread.getName() + " == " + i);
        }
    }
}
