import java.util.*;

public class Adsub2D{
            // Method to add two matrices
            public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
                int rows = matrixA.length;
                int cols = matrixA[0].length;
                int[][] result = new int[rows][cols];
        
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrixA[i][j] + matrixB[i][j];
                    }
                }
        
                return result;
            }
        
            // Method to subtract two matrices
            public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
                int rows = matrixA.length;
                int cols = matrixA[0].length;
                int[][] result = new int[rows][cols];
        
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrixA[i][j] - matrixB[i][j];
                    }
                }
        
                return result;
            }
        
            // Method to print a matrix
            public static void printMatrix(int[][] matrix) {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }
        
            // Main method to demonstrate matrix addition and subtraction
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Input for matrix dimensions
                System.out.print("Enter the number of rows: ");
                int rows = scanner.nextInt();
                System.out.print("Enter the number of columns: ");
                int cols = scanner.nextInt();
        
                // Initialize matrices
                int[][] matrixA = new int[rows][cols];
                int[][] matrixB = new int[rows][cols];
        
                // Input for matrix A
                System.out.println("Enter elements of Matrix A:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrixA[i][j] = scanner.nextInt();
                    }
                }
        
                // Input for matrix B
                System.out.println("Enter elements of Matrix B:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrixB[i][j] = scanner.nextInt();
                    }
                }
        
                // Display matrices
                System.out.println("\nMatrix A:");
                printMatrix(matrixA);
        
                System.out.println("\nMatrix B:");
                printMatrix(matrixB);
        
                // Matrix Addition
                int[][] addedMatrix = addMatrices(matrixA, matrixB);
                System.out.println("\nAdded Matrix:");
                printMatrix(addedMatrix);
        
                // Matrix Subtraction
                int[][] subtractedMatrix = subtractMatrices(matrixA, matrixB);
                System.out.println("\nSubtracted Matrix:");
                printMatrix(subtractedMatrix);
        
                // Close the scanner
                scanner.close();
            }
        }

    

    
