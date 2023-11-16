class Stack4 {
    int capacity;
    int top1;
    int top2;
    int arr[];

    public Stack4(int capacity) {
        this.capacity = capacity;
        top1 = -1;
        top2 = capacity;
        arr = new int[capacity];
    }

    public boolean push1(int data) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = data;
            System.out.println("Data added to stack1 at postion " + top1);
            return true;
        }
        System.out.println("Stack1 overflow");
        return false;
    }

    public boolean push2(int data) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = data;
            System.out.println("Data added to stack2 at postion " + top2);
            return true;
        }
        System.out.println("Stack2 overflow");
        return false;
    }

    public int pop1() {
        if (top1 >= 0) {
            int res = arr[top1];
            top1--;
            return res;
        }
        return -1;
    }

    public int pop2() {
        if (top2 < capacity) {
            int res = arr[top2];
            top2++;
            return res;
        }
        return -1;
    }
}

public class TwoStacksInAnArray {
    public static void main(String[] args) {
        Stack4 s = new Stack4(7);
        s.push1(1);
        s.push1(2);
        s.push1(3);
        s.push1(4);
        s.push1(5);
        s.push2(7);
        s.push2(6);
        s.push1(5);
        s.push2(7);
    }
}
