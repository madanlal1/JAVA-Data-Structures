class Node {

    Node right;
    Node left;
    int data;

    Node(int data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }   
}	

class Task2 {     	    
    // Root of Binary Tree     	    
    Node root;     	    
	      
    Task2() {     
        root = null;     
    }     
        
    // Insert node in tree
    public int addData(int data) {  
        
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return 0;
        }         
        if(root.left == null && data < root.data) {
            root.left = newNode;
            return 0;
        }
        if(root.right == null && data>root.data) {
            root.right = newNode;
            return 0;
        }
        else {
            
            Node curr = root;

            while(curr.left != null && curr.right != null) {

                if(data < curr.data) {
                    curr = curr.left;
                }
                else {
                    curr = curr.right;
                }
            }

            if(curr.data < data ) {
                curr.right = newNode;
                return 0;
            }
            else {
                curr.left = newNode;
                return 0;
            }
        }
    } 

    // PreOrder Traversal
    public void PreOrder(Node root) {
        if(root == null) {
            return;
        }
            
        // traverse the root
        System.out.print(root.data + " ");

        // traverse the left
        PreOrder(root.left);
        // traverse the right
        PreOrder(root.right);
        
    }

    // InOrder Traversal
    public void InOrder(Node root) {
        if(root == null) {
            return;
        }

        // traverse left tree
        InOrder(root.left);

        // traverse root
        System.out.print(root.data + " ");

        // traverse right
        InOrder(root.right);
    }
        
    // PostOrder Traversal
    public void PostOrder(Node root) {
        
        if(root  == null) {
            return;
        }

        // traverse left 
        PostOrder(root.left);

        // traverse right 
        PostOrder(root.right);

        // traverse root
        System.out.print(root.data+ " ");
    }

    int leftHeigt = 0;
    int rightHeight = 0;

    // height of the tree
    public int treeHeight(Node root) {

        if(root == null) {
            return 0;
        }
        
        if(root.left != null) {

           leftHeigt++;
           treeHeight(root.left);
        }

        if(root.right != null) {

            rightHeight++;
            treeHeight(root.right);
        }

        int max = (leftHeigt > rightHeight) ? leftHeigt : rightHeight;

        return (max+1);
        
    }
        
    public static void main(String[] args) {     

        Task2 obj = new Task2();
        obj.addData(5);
        obj.addData(3);
        obj.addData(4);
        obj.addData(6);
        obj.addData(8);
        obj.addData(10);


        System.out.print("PreOrder : ");
        obj.PreOrder(obj.root);
        System.out.print("\nInOrder : ");
        obj.InOrder(obj.root);
        System.out.print("\nPostOrder : ");
        obj.PostOrder(obj.root);


        System.out.print("\nHeight of tree : "+obj.treeHeight(obj.root));


    }     
}

