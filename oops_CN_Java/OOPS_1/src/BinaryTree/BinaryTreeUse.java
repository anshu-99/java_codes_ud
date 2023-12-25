package BinaryTree;
public class BinaryTreeUse {
    public static void printTree(CreateBinaryTree<Integer> root){
        if(root==null) return;
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        CreateBinaryTree<Integer> root=new CreateBinaryTree<Integer>(1);
        CreateBinaryTree<Integer> rootLeft=new CreateBinaryTree<Integer>(2);
        CreateBinaryTree<Integer> rootright=new CreateBinaryTree<Integer>(3);
        root.left=rootLeft;
        root.right=rootright;
        CreateBinaryTree<Integer> twoRight=new CreateBinaryTree<Integer>(4);
        CreateBinaryTree<Integer> threeLeft=new CreateBinaryTree<Integer>(5);
        rootright=twoRight;
        rootLeft=threeLeft;
        printTree(root);
    }
}
