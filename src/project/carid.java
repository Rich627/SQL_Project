package project;

public class carid {
	public static void main(String[] args){
		
		int min = 0;
		int max = 9;
        int[] arr=new int[121];
		
        for(int i=1;i<121;i++){
            arr[i]=min + (int) (Math.random() * (max-min+1));
        }
        
        for (int i=1;i<121;i++) {
        	System.out.print(arr[i]);
        	if (i%4==0) {
        		System.out.println('\n');
        	}
        }
        
        String chars = "ABCDEFGHIZKLMNOPQRSTUVWXYZ";
		char[] arr1=new char[91];
  
        for (int j=1; j<91;j++) {
        	arr1[j]=chars.charAt((int) (Math.random() * 26));
        }
        for (int j=1;j<91;j++) {
        	System.out.print(arr1[j]);
        	if (j%3==0) {
        		System.out.println('\n');
        	}
        }
        
 
    }
}
