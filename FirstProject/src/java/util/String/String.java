package java.util.String;

	public class String implements Runnable
	{     @Override
	    public void run() {

	        for(int x=1;x<=5;x++)
	        {
	            System.out.println(x);
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	    }
	public static void main(String[] args) {
	        String t=new String();
	        t.run();
	}
	}