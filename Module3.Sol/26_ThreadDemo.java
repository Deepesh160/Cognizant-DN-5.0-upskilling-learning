class T extends Thread{public void run(){System.out.println("Running");}} public class ThreadDemo{public static void main(String[]a){new T().start();new T().start();}}
