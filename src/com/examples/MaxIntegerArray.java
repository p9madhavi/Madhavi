package	com.examples;

public	class MaxIntegerArray{

	int [] anArrayOfInteger = new int[10];

	int max = anArrayOfInteger[0];

	 public	void findMaxInteger(){

	 	anArrayOfInteger[0] = 5;
	 	anArrayOfInteger[1] = 23;
	 	anArrayOfInteger[2] = 500;
	 	anArrayOfInteger[3] = 15;
	 	anArrayOfInteger[4] = 79;
	 	anArrayOfInteger[5] = 112;
	 	anArrayOfInteger[6] = 57;
	 	anArrayOfInteger[7] = 6;
	 	anArrayOfInteger[8] = 89;
	 	anArrayOfInteger[9] = 151;

        for(int i=1; i<anArrayOfInteger.length; i++){

        	 if(max < anArrayOfInteger[i]){

        	       max = anArrayOfInteger[i];
        	   }
        	}
        	   
        	System.out.println("The maximum Integer	is--------" + max);
        

	 	


	 }
}