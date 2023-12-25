package BinaryTree;
public class CreateBinaryTree<T> {
    public T data;
    public CreateBinaryTree<T> left;
    public CreateBinaryTree<T> right;

    public CreateBinaryTree(T data){
        this.data=data;
    }
}
