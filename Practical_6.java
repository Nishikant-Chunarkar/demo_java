public class Practical_6{
   // 1st pattern 
   static void displayPattern1(int size){
	for(int i = 1; i <= size; i++){
		for(int j = 1; j <= size-i; j++){
		    System.out.print(" ");
		}
		for(int k = 1; k <= i; k++){
		    System.out.print("+ ");
		}
		System.out.println(" ");
	}
	for(int i = size-1; i >= 1; i--){
		for(int j = size-i; j >= 1; j--){
			System.out.print(" ");
		}
		for(int k = i; k >= 1; k--){
			System.out.print("* ");
		}
		System.out.println(" ");
	}
    }
	
    // 2nd pattern 
    static void displayPattern2(int size){
	for(int i = 1; i <= size; i++){
		for(int j = 1; j <= size-i; j++){
			System.out.print(" ");
		}
		for(int k = 1; k <= (2*i-1); k++){
			System.out.print("+");
		}
		System.out.println(" ");
	}
	for(int i = size-1; i >= 1; i--){
		for(int j = size-i; j >= 1; j--){
			System.out.print(" ");
		}
		for(int k = (2*i-1); k >= 1; k--){
			System.out.print("+");
		}
		System.out.println(" ");
	}
     }
     
     // 3rd pattern 
     static void displayPattern3(int size){
        for(int i=1; i<=size;i++){
            for(int j=1;j<=size-i;j++){
                System.out.print(" ");
            }
            for(int pattern=1;pattern<=2*i-1;pattern++){
                if(((i+pattern)%2==0)){
                    System.out.print("+");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int pattern=((size*2)-1);pattern>=((i*2)-1);pattern--){
                if(pattern%2==0){
                    System.out.print("+");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
	Practical_6 pattern = new Practical_6();
	System.out.print("Pattern 1:\n");
	pattern.displayPattern1(5);
	System.out.print("Pattern 2:\n");
	pattern.displayPattern2(5);
	System.out.print("Pattern 3:\n");
	pattern.displayPattern3(5);
    }
 }
