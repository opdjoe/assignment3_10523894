public class FindingPrimeNumbers{
	public static void main(String[]args){
		for (int x = 2;x<=100;x++){
			//System.out.println(x);
			if (isPrime(x)==true)
				System.out.println(x);
		}
	}
	public static boolean isPrime(int n){
	if (n==2){
    	return true;
	}
    else if (n==3){
      	return true;
    }
    else if  ( n==2 || n==3 ){ 
      	return true;
      }
    else if ( n%2 == 0 || n%3 == 0 ){
        return false;
    }
    else {
        return true;
    }
      
	}
}