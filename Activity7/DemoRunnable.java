
public class DemoRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1=()->{for(int i=1;i<6;i++){System.out.println("Child Thread"+i);}};
		Thread th1=new Thread(t1);
		th1.start();
		for(int i=1;i<6;i++){
		System.out.println("Main Thread"+i);
		}
		}
	}


