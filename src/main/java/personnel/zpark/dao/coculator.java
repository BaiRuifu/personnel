package personnel.zpark.dao;



import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;

/**
 * @Author BaiRuifu
 * @Date 2020/1/12 18:31
 * @Version 1.0
 */
public class coculator {
   // public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long[] s= new long[n+1];
//        s[1] = 1;
//        s[2] = 1;
//        for (int i=3;i<=n;i++){
//            s[i] = s[i-1]+ s[i-2];
//        }
//        System.out.println(s[n]/7);
//        System.out.println((int)'A');
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i + "\t" + (char) i);
//
//        }
//    }

    /*    public int[] kClosest(int[] array, int target,int k) {
            if (array == null || array.length <= 0) {
                return array;
            }
            if (k == 0) {
                return new int[0];
            }}

            private int largesSmaller(int[]array,int target) {
                int left = 0;
                int right = array.length - 1;
                while (left < right - 1) {
                    int mid = left + (right - left) / 2;
                    if (array[mid] <= target) {
                        left = mid;
                    } else {
                        right = mid;

                    }
                }

    target*/
    public int dedup(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int end = 0;//最后一个要保留的index
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[end++] = array[i];
            }
        }

        return end;


    }

    // Deque<Integer> deque = new LinkedList<>();
    //Deque<Integer> stack = new LinkedList<>();
    class ListNode {
        int value;
        ListNode next;

        public void listNode(int value) {
            this.value = value;
        }
    }

    class Queue {

//class  Stack{
//        ListNode head;
//        public Stack(){
//           head = new ListNode(1);
//           head.next = null;
//
//        }
        //List<Integer> myList;

        public class Simple {
            public int value;

            public Simple(int v) {
                value = 'v';

            }
        }

        public class MergeSort {
            public ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
                if (array == null) {
                    return array;
                }
                return mergeSort(array, 0, array.size() - 1);
            }

            public ArrayList<Integer> mergeSort(ArrayList<Integer> array, int left, int right) {
                ArrayList<Integer> result = new ArrayList<>();
                if (left > right) {
                    return result;
                }
                if (left == right) {
                    result.add(array.get(left));
                    return result;

                }
                int mid = left + (right - left) / 2;
                ArrayList<Integer> reLeft = mergeSort(array, left, mid);
                ArrayList<Integer> reRight = mergeSort(array, mid + 1, right);
                merge(reLeft, reRight, result);
                return result;

            }

            private void merge(ArrayList<Integer> reLeft, ArrayList<Integer> reRight, ArrayList<Integer> result) {
                int i = 0;
                int r = 0;


            }
//public class KSmallest{
//                public int[] kSmallest(int[]array, int k) {
//                    if (array.length == 0 || k == 0) {
//                        return array;
//                    }
//                    PriorityQueue<Integer> miniHeap = new PriorityQueue<Integer>();
//                    for (int i = 0; i < array.length; i++) {
//                        miniHeap.offer(array[i]);
//                    }}


        }

        //        void SelectionSort(int a[] ,int n ){
//            int global, temp;
//            for (int i = 0;i<n-1; i++){
//                global = i;
//                for (int j = i+1;j<n;j++);
//                if (a[j] <a[global]){
//                    global = j;
//
//                }
//
//            }
//            temp = a[i];
//            a[i] = a[global];
//            a[global] = temp;
//        }
//斐波那契数列
        int fibo(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
            return fibo(n - 1) + fibo(n - 2);

        }

        //二分搜索
        public int binary_search(int[] a, int target) {
            if (a == null)
                return -1;
            int left = 0;
            int right = a.length - 1;//boundary

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (a[mid] == target) {
                    return mid;
                } else if (a[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;


                }
            }
            return -1;
        }

        //二分搜索 矩阵
        public boolean ifFind(int[][] matrix, int target) {
            if (matrix.length == 0 || matrix[0].length == 0)
                return false;
            int row = matrix.length;
            int col = matrix[0].length;
            int i = 0;
            int j = row * col - 1;
            while (i < j) {
                int mid = i + (j - i) / 2;
                int r = mid / col;    //只有在这里不同
                int c = mid % col;
                if (matrix[r][c] == target)
                    return true;
                else if (matrix[r][c] > target)
                    j = mid - 1;
                else
                    i = mid + 1;

            }
            return false;
        }

        //找到邻近的数
        int BinarySearch(int a[], int left, int right, int target) {
            int mid;
            while (left < right - 1) {//如果左边与右边相邻 终止操作
                mid = left + (right - left) / 2;
                if (a[mid] == target) {
                    return mid;
                } else if (a[mid] < target) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return -1;
        }

        //逆转链表 递归
        public ListNode reverseLinkedlist(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode prev = null;
            ListNode cur = head;
            ListNode next = head.next;

            while (cur != null) {
                ListNode nextNode = head.next;
                cur.next = prev;
                cur = next;

            }
            return prev;
        }

        //反转链表 直接
        public ListNode reverseLinkedKist(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode new_head = reverseLinkedlist(head.next);
            head.next.next = head;
            head.next = null;
            return new_head;
        }

        //找链表的中间元素 快慢指针
        public ListNode FindMiddle(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        //public int getHight (TreeNode root) {
//    if (root == null) {
//
//        return 0;// basecase
//    }
//    int left = getHight(root.left);
//    int right = getHight(root.right);
//    return 1 + Math.max(left, right);
//}
//public boolean isBalanced(TreeNode root){
//            if (root == null){
//                return true;
//            }
//            int left = getHight(root.left);
//            int right = getHight(root.right);
//            if (Math.abs(left-right)> 1){
//                return false;
//
//            }
//            return isBalanced(root.left) && isBalanced(root.right);
//
//}
        public boolean IsSymmetric(TreeNode one, TreeNode two) {
            if (one == null && two == null) {
                return true;
            } else if (one == null || two == null) {
                return false;
            } else if (one != two) {
                return false;
            }
            return false;
        }

        class GraphNode {
            int value;
            String name;
        }


//     public   void  eat (int n){
//                for (int i = 0; i < n; i++) ;{
//                    System.out.println("等待1分钟");
//                    System.out.println("等待1分钟");
//                    System.out.println("吃1cm面包");
//                }
//            }

        public int[] array;
        public int size;

        public void MyArray(int capacity) {
            this.array = new int[capacity];
            size = 0;
        }//数组插入元素

        public void insert(int element, int index) throws Exception {
            //判断下包是否超出范围
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("超出数组实际元素范围");
            }
            //从右往左循环 将元素逐个向右挪一位
            for (int i = size - 1; i >= index; i--) {

                array[i + 1] = array[i];
            }
            //腾出的位置放入新元素
            array[index] = element;
            size++;
        }//输出数组

        public void output() {
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);


            }
        }

//public static TreeNode createBinaryTree(LinkedList<Integer>inputList){
//          TreeNode node = null;
//          if (inputList ==null || inputList.isEmpty()){
//              return null;
//          }
//          Integer data = inputList.removeFirst();
//          if (data !=null){
//              node = new TreeNode(data) {


    }

    public int fibN(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibN(n - 1) + fibN(n - 2);

    }

    public static void bubbleSort(int[] data) {//冒泡排序
        int arrayLength = data.length;
        for (int i = 1; i < arrayLength; i++) {//第i次排序
            for (int j = 0; j < arrayLength - 1; j++) {
                if (data[j] > data[j + 1]) {//相邻元素两两对比
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
            System.out.println(i + java.util.Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
int[] data ={3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 4};
        System.out.println(java.util.Arrays.toString(data));
        bubbleSort(data);
    }


}
