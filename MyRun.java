import java.util.*;
import java.io.*;
import java.lang.*;

public class MyRun implements Runnable{
	
	Thread mythread;
public void	count()
	{
		mythread = new Thread(this, "My runnable thread");
		System.out.println("My thread started" + mythread);
		mythread.run();
	}
public void run()
{
int num, i, count=0;
    Scanner scan = new Scanner(System.in);
	
    System.out.print("Enter a Number : ");
    num = scan.nextInt();
	
    for(i=2; i<num; i++)
    {
        if(num%i == 0)
        {
            count++;
            break;
        }
    }
    if(count == 0)
    {
        System.out.print("This is a Prime Number");
    }
    else
    {
        System.out.print("This is not a Prime Number");
    }
    
}
	public static void main(String[] args) {
		MyRun mr=new MyRun();
		System.out.print("My program started");
		mr.count();

	}

}
