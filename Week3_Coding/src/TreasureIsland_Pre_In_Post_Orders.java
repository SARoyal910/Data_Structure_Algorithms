public class TreasureIsland_Pre_In_Post_Orders {
    /*
     *                Gate
     *    Forest                Lake
     * Hens   Firs          Boat    Fish
     *
     * */
    public static void main(String[] args) {
        /// /build from the bottom to the top
        Stop hens = new Stop("Hens", null, null);
        Stop firs = new Stop("Firs", null, null);
        Stop boat = new Stop("Boat", null, null);
        Stop fish = new Stop("Fish", null, null);
        Stop forest = new Stop("Forest", hens, firs);
        Stop lake = new Stop("Lake", boat, fish);
        Stop gate = new Stop("Gate", forest, lake);
        System.out.println("Pre-order traversal...");
        treasureHuntPreOrder(gate);
        System.out.println();
        System.out.println("In-order traversal...");
        treasureHuntInOrder(gate);
        System.out.println();
        System.out.println("Post-order traversal...");
        treasureHuntPostOrder(gate);
    }
    private static void treasureHuntPreOrder(Stop entry) {
        if (entry == null) {
            return;
        }
        System.out.print(entry.getName().toUpperCase() + " -> ");
        treasureHuntPreOrder(entry.getLeftChild());
        treasureHuntPreOrder(entry.getRightChild());
    }

    private static void treasureHuntInOrder(Stop entry) {
        if (entry == null) {
            return;
        }
        treasureHuntInOrder(entry.getLeftChild());
        System.out.print(entry.getName().toUpperCase() + " -> ");
        treasureHuntInOrder(entry.getRightChild());
    }
    private static void treasureHuntPostOrder(Stop entry) {
        if (entry == null)
            return;

        treasureHuntPostOrder(entry.getLeftChild());
        treasureHuntPostOrder(entry.getRightChild());
        System.out.print(entry.getName().toUpperCase() + " -> ");
    }
}

class Stop {
    private String name;
    private Stop leftchild;
    private Stop rightChild;

    //Constructor that builds Nodes for BST
    public Stop (String name, Stop left, Stop right){
        this.name = name;
        this.leftchild = left;
        this.rightChild = right;
    }
    public String getName() {
        return name;
    }
    public Stop getLeftChild() {
        return leftchild;
    }
    public Stop getRightChild() {
        return rightChild;
    }
}

//A Binary Tree (BT) is a data structure in which each node has at most two children
// (commonly called the left and right child). There is no inherent ordering imposed on the nodes.
//
// In contrast, a Binary Search Tree (BST) is a special kind of binary tree that maintains
// that for every node, all values in its left subtree are less than the node’s value
// and all values in its right subtree are greater.