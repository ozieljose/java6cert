package examples.cap3;

class ArrayMain{
	public static void main(String[]args){
		int[] test = null;
		test = new int[7];
		
		/*for(int i = 0; i<test.length; i++){
			System.out.println(i+":"+test[i]);
		}*/
		
		int[][] matrix = new int [1][2];
		//System.out.println(matrix[0][0]);
		
		int[][] arr = {{1},{2},{0}};
		
		test(new int[]{1,2});
		
		int[][][] myMatrix = new int[3][][];
		myMatrix[0] = new int[5][];
		myMatrix[1] = new int[2][];
		myMatrix[2] = new int[1][];
		for(int i = 0; i<myMatrix.length; i++){	
			for(int j = 0; j<myMatrix[i].length; j++){
				/*for(int m = 0; m<myMatrix[i][j].length; m++){
					System.out.println("["+i+","+j+","+m+"]="+myMatrix[i][j][m]);
				}*/				
			}		
		}
		
		int [][] ages = new int[][]{{19, 42}, {92, 33}};
		int [] agesd = new int[]{19, 42};
		
		int[] a = {1, 2, 3, 4, 5};
		char c = '0';
		System.out.println(a[c]);

	}
	
	static void test(int[] arr){
	}
}