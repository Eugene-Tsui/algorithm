package Java.interviewCode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key,value;
        Node pre,next;
        Node(int k, int v){
            this.key = k;
            this.value = v;
        }
    }
    Node head,tail;
    private void add(Node node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void remove(Node node){
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    private void update(Node node){
        remove(node);
        add(node);
    }

    private int count,capacity;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        count = 0;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        update(node);
        return node.value;
    }

    public void put(int key, int value){
        Node node = map.get(key);
        if(node == null){
            node = new Node(key, value);
            add(node);
            map.put(key, node);
            count++;
        }else{
            node.value = value;
            update(node);
        }
        if(count > capacity){
            Node toDelete = tail.pre;
            remove(toDelete);
            map.remove(toDelete.key);
            count--;
        }
    }
}
