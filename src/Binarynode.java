class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(int data)
    {
        this.data=data;
    }
}
 class Test {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(10);
        BinaryNode rleft = new BinaryNode(5);
        BinaryNode rleft1 = new BinaryNode(3);
        BinaryNode rright1= new BinaryNode(6);
        BinaryNode rright = new BinaryNode(8);
        root.left = rleft;
        root.left.left=rleft1;
        root.right=rright1;
        root.right.right = rright;

        Print(root);
    }

    public static void Print(BinaryNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        Print(root.left);
        Print(root.right);

    }
}


