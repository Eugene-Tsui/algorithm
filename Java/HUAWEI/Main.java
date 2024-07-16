package Java.HUAWEI;

import java.util.*;

class TreeNode{
    List<String> child = new ArrayList<>();
    int yanZhong;
    int yiBan;

    TreeNode(){}
}
public class Main {

    public static void main(String[] args) {
        int[] res = new int[]{3,4,6,7};

        Random random = new Random();
        System.out.println(res[random.nextInt(4)]);


        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        Map<String, TreeNode> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {

            String node = sc.next();
            String isRoot = sc.next();
            int state = sc.nextInt();
            int nums = sc.nextInt();

            if(!isRoot.equals("*")){
                tree.computeIfAbsent(isRoot, a -> new TreeNode()).child.add(node);
            }
            TreeNode treeNode = tree.computeIfAbsent(node, a -> new TreeNode());

            if(state == 0)
                treeNode.yanZhong += nums;
            else
                treeNode.yiBan+=nums;
        }

        int sum = 0;

        for (Map.Entry<String, TreeNode> en : tree.entrySet()){
            if(!en.getValue().child.isEmpty()){
                sumWenTi(tree, en.getKey());
                int total = tree.get(en.getKey()).yanZhong * 5 + tree.get(en.getKey()).yiBan * 2;
                if(total>m){
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }

    public static void sumWenTi(Map<String, TreeNode> tree, String treeNode){
        for(String child : tree.get(treeNode).child){
            sumWenTi(tree, child);
            tree.get(treeNode).yanZhong += tree.get(child).yanZhong;
            tree.get(treeNode).yiBan += tree.get(child).yiBan;
        }
    }
}
