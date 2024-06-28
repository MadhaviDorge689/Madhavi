package project1;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=0;i<=100; i++) {
			System.out.println("value of i:"+i);
			
		}
		  int i=11;
		  do {
			  System.out.println(i);
			  i++;
		  }while(i<=1);*/
		  
		  //for each loop is used remove data from array
		  int a[]= {10,20,30,40,50};
		  //for integer array
		  for(int i:a) {
			  System.out.println(i);
		  }
		  
		  char ch[]= {'j','a','v','a'};
		  for(char c:ch ) {
			  System.out.println(c);
		  
		  }
		  
		 

	}

}
