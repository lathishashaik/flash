
public class TwoDArray {
   //for-each loop
	public static void main(String[] args) {
        int a1[]= {1,2,3,4};
        for(int k:a1)
        {
        	System.out.print(" "+k);   //for-each loop
        }
        System.out.println();
        int a[]= {1,2,3,4};
        int b[]= {2,4,8};
        int c[]= {5,6,7,8,9};
        int d[][]= {
        		      {1,2,3,4}, 
        		      {2,4,8},        //jaggered array
        		      {5,6,7,8,9}
                    };
        for(int i=0;i<d.length;i++) {
        	for(int j=0;j<d[i].length;j++) {     //for loop
        		System.out.print(" "+d[i][j]);
        	}
        	System.out.println();
        }
        for(int k[]:d) {
        	for(int l:k) {
        		System.out.print(" "+ l);      //for-each loop
        	}
        	System.out.println();
        }
	}

}
