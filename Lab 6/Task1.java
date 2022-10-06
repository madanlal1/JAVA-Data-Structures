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

class Task1 {     	    
    // Root of Binary Tree     	    
    Node root;     	 

    // Constructors     	    
    Task1(int key) {     	        
        root = new Node(key);     
	}     
	      
    Task1() {     
        root = null;     
    }     
        
    // Methods  
    public void addData(int data) {  
        
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
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
            }
            else {
                curr.left = newNode;
            }
        }
    } 
        
    public boolean searchData(int data) {  

        Node curr = root;
        boolean found = false;
            
        // root is null
        if(curr == null) {
            return false;
        }

        // if root is equals to data ? else...
        if(curr.data == data) {
            
            return true;
        }
        else{
            
            while(curr.left != null || curr.right != null) {
                if(curr.data < data) {
                    curr = curr.right;
                }
                else {
                    curr = curr.left;
                }

                if(curr.data == data) {
                    found = true;
                    break;
                }
            }
            return found;
        }
    }  
        
    public static void main(String[] args) {     

        Task1 obj = new Task1();
        obj.addData(5);
        obj.addData(3);
        obj.addData(6);
        obj.addData(1);


        if(obj.searchData(1)) {
            System.out.println("Search Found...");
        }
        else {

            System.out.println("Search Not Found...");
        }

        
        if(obj.searchData(12)) {
            System.out.println("Search Found...");
        }
        else {

            System.out.println("Search Not Found...");
        }


    }     
}
