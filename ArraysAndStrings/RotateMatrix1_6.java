package ArraysAndStrings;

//Rotate a matrix clockwise

public class RotateMatrix1_6 {
	
	private static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//1. Transpose and then reverse every row - GeeksForGeeks
	
	public static void transpose(int[][] matrix){
		
		//take transpose
		for(int i = 0; i < matrix.length; i++){
			for(int j = i; j < matrix[0].length; j++){
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		
		//take reverse of each column
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0, k = matrix[0].length - 1; j < k; j++, k--){
				int temp = matrix[i][k];
				matrix[i][k] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		
	}
	
	//2. In-place - CTCI
	public static void inPlace(int[][] mat){
		int N = mat.length;
		for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in 
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];
      
                // move values from right to top
                mat[x][y] = mat[N-1-y][x]; 
      
                // move values from bottom to right
                mat[N-1-y][x] = mat[N-1-x][N-1-y];
      
                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[y][N-1-x];
      
                // assign temp to left
                mat[y][N-1-x] = temp;
            }
        }
	}
	
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
						{12,13,14,5},
						{11,16,15,6},
						{10,9,8,7}};
		
		
		//1. Rotation using transpose method
		transpose(matrix);
		printMatrix(matrix);
		
		
		//2. Rotate in-place
		inPlace(matrix);
		printMatrix(matrix);
	}

}
