import java.util.Scanner;
public class App12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so hang: ");
        int n = sc.nextInt();
        System.out.println("nhap so cot: ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
        int max=arr[0][0];
        
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu thu "+"arr["+i+"]["+j+"]"+":");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
                if(max<=arr[i][j]){
                    max=arr[i][j];
                }
			}
		}
        System.out.println("phan tu max trong mang 2 chieu la: " + max);
        sc.close();

    }
}