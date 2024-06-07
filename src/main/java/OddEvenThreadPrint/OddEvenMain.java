package OddEvenThreadPrint;

public class OddEvenMain {
	int count=1;
	
	static int NUM;
	int time = 1000;
	
	public void displayOddNUmber() throws InterruptedException {
		synchronized (this) {
			while(count<NUM) {
				while(count%2==0) {
					try {
						wait();
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println(count + " "+Thread.currentThread().getName());
				count+=1;
				Thread.sleep(time);
				notify();
			}
		}
	}
	
	public void displayEvenNUmber() throws InterruptedException {
		synchronized (this) {
			while(count<NUM) {
				while(count%2==1) {
					try {
						wait();
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println(count + " "+ Thread.currentThread().getName());
				count+=1;
				Thread.sleep(time);
				notify();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NUM =20;
		OddEvenMain o1 = new OddEvenMain();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					o1.displayEvenNUmber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					o1.displayOddNUmber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
