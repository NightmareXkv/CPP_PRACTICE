import java.util.*;

public class MatrixBinarySearch {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = (n * m) - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int n = sc.nextInt();
    System.out.println("Enter number of cols : ");
    int m = sc.nextInt();

    int[][] matrix = new int[n][m];

    System.out.println("enter the matrix values in sorted order");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    System.out.println("Enter the target value");
    int target = sc.nextInt();

    boolean found = searchMatrix(matrix, target);

    if (!found) {
        System.out.println("target not  found");
    } else {
        System.out.println("target found");
    }
sc.close();
}}
