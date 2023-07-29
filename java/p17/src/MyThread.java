public class MyThread extends Thread {
  @Override
  public void run() {
    if (this.isAlive()) {
      System.out.println(this.getName() + " thread is running");
    } else {
      System.out.println("Thread is not running");
    }
  }
}