package Assignment1;

public class Q3 {

	public static void main(String[] args) {
		char a[]= {'c','a','r','b','o','n'};
		int i,j,k,l,m,n;
		for(i=0;i<a.length;i++)
	    for(j=0;j<a.length;j++)	
		for(k=0;k<a.length;k++)
		for(l=0;l<a.length;l++)
		for(m=0;m<a.length;m++)
	    for(n=0;n<a.length;n++)
	    {
	    	if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n) {
	    		int count=0;
	    		System.out.println(" "+a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[m]+" "+a[n]);
	    		count =1;
	    		System.out.println(count);
	    	    
	    		
	    	}
	    }
								
	}

}
