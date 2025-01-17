import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int rows = 3, cols = 3; // Dimensions for the matrices (3x3)

        // Create random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        // Display the matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Perform matrix addition
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("\nSum of matrices:");
        displayMatrix(sum);

        // Perform matrix subtraction
        int[][] difference = subtractMatrices(matrix1, matrix2);
        System.out.println("\nDifference of matrices:");
        displayMatrix(difference);

        // Perform matrix multiplication
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nProduct of matrices:");
        displayMatrix(product);

        // Transpose of matrix 1
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transpose1);
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        // Generate random values for the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t"); // Print each element with a tab space
            }
            System.out.println(); // Move to the next row
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        // Add corresponding elements from both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];

        // Subtract corresponding elements from both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        int[][] product = new int[rows][cols];

        // Perform matrix multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        // Swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
