import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
//        int [] vegPrice = new int[3];
//        vegPrice[0] = 100;
//        vegPrice[1] = 70;
//        vegPrice[2] = 50;
//
//        for (int i=0; i<3; i++){
//            System.out.println(vegPrice[i]);
//        }
//        int marks[]= {93,89,95};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

//        Scanner sc = new Scanner(System.in);
//        int nums[]=new int[5];
//        for (int i=0; i<5; i++){
//            nums[i]= sc.nextInt();
//        }
//        System.out.println("Search for a number");
//        int numSearch = sc.nextInt();
//        for(int i=0; i<5; i++){
//            if (nums[numSearch]==i){
//                System.out.println(nums[numSearch]);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
//        //input
//        //rows
//        for (int i = 0; i < rows; i++) {
//            //columns
//            for (int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row size");
//        int row = sc.nextInt();
//        System.out.println("Enter column size");
//        int column = sc.nextInt();
//
//        int [][] matrix = new int[row][column];
//
//        System.out.println("Enter Numbers");
//        for (int i=0; i<row; i++){
//            for (int j=0; j<column; j++){
//                matrix [i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Search for a number");
//        int x = sc.nextInt();
//        for (int i=0; i<row; i++){
//            for (int j=0; j<column; j++){
//                if (matrix[i][j]==x){
//                    System.out.println("(" + i + "," + j + ")");
//                }
//            }
//            }

        //---For a given matrix of N x M, print its transpose.---//

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row size");
//        int row = sc.nextInt();
//        System.out.println("Enter column size");
//        int column = sc.nextInt();
//
//        int [][] matrix = new int[row][column];
//
//        System.out.println("Enter Numbers");
//        for (int i=0; i<row; i++){
//            for (int j=0; j<column; j++){
//                matrix [i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------");
//        for (int i = 0; i < column; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.print(matrix[j][i] + " ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String name[] = new String[size];
//
//        int lengthSum=0;
//
//        for (int i=0; i<size; i++){
//            name[i]=sc.next();
//            lengthSum += name[i].length();
//        }
//        System.out.println(lengthSum);

//        Scanner sc = new Scanner (System.in);
//        String email = sc.next();
//        String userName = "";
//        userName= email.substring(0,email.indexOf("@"));
//        System.out.println(userName);

        String s="Saikat";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        }
    }
