package Lesson100524;
import static java.lang.System.out;
/* 
 * class MyRunnable implements Runnable {
 * public void run(){
 *   // код, который будет выполняться в новом потоке
 * }
 * 
 */

public class ThreadAndOthers1 
{
    public static void main(String[] args)
    {
        /* 
         * можно запускать потоки из мейн функции, 
         * а можно тела потоков делать отдельно (приоритетнее)
         */

        Thread b1 = new B01("Thread 1"), 
            b2 = new B01("Thread 2"), 
            b3 = new B01("Thread 3");
        
       /*  b1.setPriority(Thread.MIN_PRIORITY); // устанавливает приоритет потока, больше - лучше (приоритетней)
        b2.setPriority(Thread.NORM_PRIORITY);
        b3.setPriority(Thread.MAX_PRIORITY); */

        b1.start(); // запускает поток
        b2.start();
        b3.start();;

    
    }
}

class B01 extends Thread
{
    /* 
     * метод run() - это метод, который будет выполняться в новом потоке
     * внутри метода run() мы пишем код, который будет выполняться в новом потоке
     */
    public B01(String name)
    {
        super(name);
    }

    public void run() 
    {
        Thread runnableThread = Thread.currentThread(); // возвращает ссылку на текущий поток
        for (int i = 0; i < 5; i++)
        {
            out.println(runnableThread.getName() + " == " + i);
        }
        out.println("obj.getName() = " + runnableThread.getName()); // выводит имя текущего потока
        out.println("obj.getPriority() = " + runnableThread.getPriority()); // выводит приоритет текущего потока
        out.println("obj.getState() = " + runnableThread.getState()); // выводит состояние текущего потока
    }
}
