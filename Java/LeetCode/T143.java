package Java.LeetCode;

import java.util.Stack;

public class T143 {
    public static class ListNode {
        int val;

        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode nextNode = head;
        for (int i = 2; i < 6; i++) {
            ListNode node = new ListNode();
            node.val = i;
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        reorderList(head);

    }
    public static void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();

        while(head.next !=null){
            stack.add(head);
            head = head.next;
        }
        ListNode back_list  = stack.pop();
        ListNode next_back = back_list;
        while(!stack.isEmpty()){
            next_back = stack.pop();
            ListNode node = new ListNode();
            next_back.next = node;
            next_back = next_back.next;

        }
        for (int i = 0; i < 4; i++) {
            System.out.println(back_list.val);
        }

    }
}
