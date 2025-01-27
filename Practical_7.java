public class Practical_7 {
    
    static void display_N(int size) {
        if(size<5){
          size=5;
          }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void display_I(int size) {
        if(size<5){
          size=5;
          }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size) {
                    System.out.print("*");
                } else if (j == size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void display_S(int size) {
      if(size<5){
          size=5;
          }
     for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
            if (i == 1 || i == size || i == (size / 2) + 1) {
                System.out.print("*");
            }
            else if (i < (size /2 +1) && j == 1) {
                System.out.print("*");
            }
            else if (i > (size / 2) && j == size) {
                System.out.print("*");
            }
            else if (i > (size / 2) && j == size) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


  static void display_H(int size) {
        if(size<5){
          size=5;
          }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size) {
                    System.out.print("*");
                } else if (i == (size / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    


   

static void display_A(int size){
        if(size<5){
            size=5;}
        for(int i=1;i<=size;i++){
           for(int j=1;j<=size;j++){
                   if(i==1 || i==(size/2)+1){
                   System.out.print("*");
                   }
                   else if(i!=1 && i!=((size/2)+1) && j==1 || j==size){
                    System.out.print("*");
                   }
                  else{
                    System.out.print(" ");
                  }
              }
              System.out.println();
          }
     }

  void display_K(int size) {
    // Check if the size is greater than or equal to 5
    if (size < 5) {
       size=5;
    }

    // Loop through the rows
    for (int i = 1; i <= size; i++) {
        // Loop through the columns
        for (int j = 1; j <= size; j++) {
            // Print left vertical line of K
            if (j == 1) {
                System.out.print("*");
            } 
            // Print the upper diagonal of K (i + j = size + 1)
            else if (i + j == size ) {
                System.out.print("*");
            }
            // Print the lower diagonal of K (i - j = size / 2)
            else if (i - j == 1) {
                System.out.print("*");
            } 
            // Otherwise, print a space
            else {
                System.out.print(" ");
            }
        }
        // Move to the next line after each row is printed
        System.out.println();
    }
}




    static void display_T(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    if (j == size / 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practical_7 obj = new Practical_7();
        obj.display_N(5);
        System.out.println("\n");
        obj.display_I(5);
        System.out.println("\n");
        obj.display_S(5);
        System.out.println("\n");
        obj.display_H(5);
        System.out.println("\n");
        obj.display_I(5);
        System.out.println("\n");
        obj.display_K(5);
        System.out.println("\n");
        obj.display_A(5);
        System.out.println("\n");
        obj.display_N(5);
        System.out.println("\n");
        obj.display_T(5);
    }
}
    
          
    

    
    

