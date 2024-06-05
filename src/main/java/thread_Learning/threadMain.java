package thread_Learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadMain extends Thread{

    public void run(){    
	 for(int i=1;i<5;i++){   
	     // the thread will sleep for the 500 milli seconds   
	       try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}    
	       System.out.println(i + " "+ this.getName());    
	     }    
	    }    
    public static void main(String args[]) throws InterruptedException{    
    	threadMain t1=new threadMain();
    	t1.setName("T1 thread");
    	threadMain t2=new threadMain();
    	t2.setName("T2 thread");
        
     t1.start();
     System.out.println("start t2 after sometime");
     Thread.sleep(5000);
     t2.start();    
//     t1.run();
//     t2.run();
    }   

}

//public class threadMain {  
//    public static void main(String[] args) {  
//       ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
//       for (int i = 0; i < 10; i++) {  
//           Runnable worker = new WorkerThread("" + i);  
//           executor.execute(worker);//calling execute method of ExecutorService  
//         }  
//       executor.shutdown();  
//       while (!executor.isTerminated()) {   }  
// 
//       System.out.println("Finished all threads");  
//   }  
//} 