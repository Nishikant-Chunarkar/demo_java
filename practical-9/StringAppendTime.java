public class StringAppendTime{
	public static void main(String[] args){
		
		long start_time1, start_time2,start_time3, end_time1, end_time2, end_time3, time_required1 = 0, time_required2 = 0, time_required3 = 0;
		
		int size = (int) (System.nanoTime()/100%20 + 1);
		int[] array = new int [size];
		for(int i = 0; i < size; i++){
			array[i] = (int) (System.nanoTime()/100%20);
		}

		String s1 = "";
		StringBuffer s2 = new StringBuffer();
		StringBuilder s3 = new StringBuilder();

		for(int a = 0; a < size; a++){
			start_time1 = System.nanoTime();
			s1 += array[a];
			end_time1 = System.nanoTime();
			time_required1 += end_time1-start_time1;
		}

		for(int b = 0; b < size; b++){
			start_time2 = System.nanoTime();
			s2.append(array[b]);
			end_time2 = System.nanoTime();
			time_required2 += end_time2-start_time2;
		}

		for(int c = 0; c < size; c++){
			start_time3 = System.nanoTime();
			s3.append(array[c]);
			end_time3 = System.nanoTime();
			time_required3 += end_time3-start_time3;
		}
		
		long avg_time1 = time_required1 / size;
		long avg_time2 = time_required2 / size;
		long avg_time3 = time_required3 / size;

		System.out.println("Time to append String: " + avg_time1 + " nanosec");
		System.out.println("Time to append StringBuffer: " + avg_time2 + " nanosec");
		System.out.println("Time to append StringBuilder: " + avg_time3 + " nanosec");
	}

}
