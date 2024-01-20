

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
	double a = Double.parseDouble(e.substring(i, i+10)); 
	if(isPrime(a) == true){ 
		System.out.println(a); break; 
	}
	

	//Finish this function
	public static boolean isPrime(double d){
		    if (d <= 1) {
            return false;
    }
        for (int i = 2; i <= Math.sqrt(d); i++) {
            if (d % i == 0) {
                return false;
            }
        }
        return true;
	}

}
for(int i = 2; i < (e.length() - 10); i++){ 
	double a = Double.parseDouble(e.substring(i, i+10)); 
	if(isPrime(a) == true){ 
		System.out.println(a); break; 
	} 
} 

