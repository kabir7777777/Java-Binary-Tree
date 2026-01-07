
public class Main {
    public static void main(String[] args) {

        StudentInfo student1 = new StudentInfo(101, "John", "Doe");
        StudentInfo student2 = new StudentInfo(102, "Jane", "Smith");
        StudentInfo student3 = new StudentInfo(103, "Michael", "Johnson");
        StudentInfo student4 = new StudentInfo(104, "Emily", "Davis");
        StudentInfo student5 = new StudentInfo(105, "Chris", "Brown");
        StudentInfo student6 = new StudentInfo(106, "Sarah", "Miller");
        StudentInfo student7 = new StudentInfo(107, "David", "Wilson");
        StudentInfo student8 = new StudentInfo(108, "Jessica", "Moore");
        StudentInfo student9 = new StudentInfo(109, "James", "Taylor");
        StudentInfo student10 = new StudentInfo(110, "Anna", "Anderson");

		MyBinaryTree myTree = new MyBinaryTree();
	
	    myTree.addToTree(myTree.root, student5);
	    myTree.addToTree(myTree.root, student2);
	    myTree.addToTree(myTree.root, student4);
	    myTree.addToTree(myTree.root, student3);
	    myTree.addToTree(myTree.root, student1);
	    myTree.addToTree(myTree.root, student9);
	    myTree.addToTree(myTree.root, student7);
	    myTree.addToTree(myTree.root, student10);
	    myTree.addToTree(myTree.root, student6);
	    myTree.addToTree(myTree.root, student8);
	    
	    myTree.postorder(myTree.root);
}
}