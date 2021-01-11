package com.examples;

public class SuperPatterns{

	int noOfLines;
	String design;

	
	public void trianglePattern(int noOfLines){
		for(int i=1;i<=noOfLines;i++)
			{
				for(int j=1;j<=i;j++)
                  {
                  	System.out.print(j);
                   }
			}
	      System.out.println( );
            
    }         
             
    public void trianglePattern(String design, int noOfLines){
         
         for(int i=1;i<=noOfLines;i++)
			{
				for(int j=1;j<=i;j++)
                  {
                  	System.out.print(design);
                   }
			}
	      System.out.println( );
	 } 

    public void pyramidPattern(int noOfLines){

    	for (int i=1;i<=noOfLines;i++){
			
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			System.out.println( );
		}
    }
   
    public void pyramidPattern(String design, int noOfLines){


         for (int i=1;i<=noOfLines;i++){
			
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(" "+design);
			}
			System.out.println( );
		}
    }



}