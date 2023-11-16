import java.lang.Math;
import java.util.ArrayList;

public class Main {
//    static class Shape {
//        String name = "Michal";
//        int age = 45;
//        public void area() {
//            System.out.println("Displays Area of Shape");
//        }
//        public void area(String name) {
//            System.out.println(name);
//        }
//        public void area(int age) {
//            System.out.println(age);
//        }
//        public void area(String name, int age) {
//            System.out.println(name + " is " + age + " year old");
//        }
//    }
//    static class Triangle extends Shape {
//        public void area(int h, int b) {
//            System.out.println(0.5*b*h);
//        }
//    }
//    static class Circle extends Shape {
//        public void area(int r) {
//            System.out.println((3.14)*r*r);
//        }
//    }

    public static ArrayList<Integer> largestandsecondlargest(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int largest = 0;
        int secLargest = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        int largestNum = arr[largest];
        al.add(largestNum);
        arr[largest]=-1;
        for(int i=1; i<n; i++){
            if(arr[i]!=largestNum) {
                if (arr[i] > arr[secLargest]) {
                    secLargest = i;
                }
            }
        }
        if(largestNum == arr[secLargest]){
            al.add(-1);
        }
        else al.add(arr[secLargest]);
        return al;
    }

    public static void main(String[] args) {
        int arr[] = {3,3,3,3,3};
        System.out.println(largestandsecondlargest(arr));
//        Shape s1 = new Shape();
//        s1.area();
//        s1.area(s1.name);
//        s1.area(s1.age);
//        s1.area(s1.name, s1.age);
    }
}