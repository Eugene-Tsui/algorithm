package Java;

import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class TTestCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            if(n==0) System.out.println("list is empty");
            ListNode dummyNode = new ListNode(0);
            ListNode pre = dummyNode;
            while(n-- > 0) {
                int num = sc.nextInt();
                pre.next = new ListNode(num);
                pre = pre.next;
            }
            show(dummyNode.next);
            ListNode tail = verseList(dummyNode.next);
            show(tail);
        }
        sc.close();
    }
    public static ListNode verseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void show(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val);
            if(cur.next != null) {
                System.out.print(" ");
            }
            cur = cur.next;
        }
        System.out.println();
    }
}

