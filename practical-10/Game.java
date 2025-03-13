class Game{
    static String[][] arr;
    static void init_array(int size){
        arr = new String[size][size];
		int solution = (int)((System.nanoTime()/100)%size);
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				Integer number = ((i+j+solution)%size +1);
                arr[i][j] = number.toString();
			}
		}
    }

    static void rmv_elements(int size){
        for(int delete = 1 ;delete <=(size*size)/3 ; delete++){
            int i =(int) ((System.nanoTime()/100)%size);
            int j =(int) ((System.nanoTime()/100)%size);
            arr[i][j] = " ";
        }
    }
	static void sudoku(int size){
		init_array(size);
        rmv_elements(size);

		for(int row = 1 ;row<=(size*2)+1;row++){
            for(int column = 1 ; column<=(size*2)+1; column ++){
                if(row%2==1){
                    if(column%2==1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("__");
                    }
                }
                else {
                    if (column % 2 == 1) {
                        System.out.print("|");
                    }
                    else {
                        if((arr[(row/2)-1][(column/2)-1]).length()==1){
                            System.out.print(" ");
                        }
                        System.out.print(arr[(row/2)-1][(column/2)-1]);
                    }
                } 
            }
            System.out.println();
        }
    }
		
	public static void main(String[] args){
		sudoku(Integer.parseInt(args[0]));
	}
}
