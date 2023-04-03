public class Tree<V extends Comparable<V>>{
    private Node root;

    public class Node {
        private V value;
        private Node leftChild;
        private Node rightChild;
    }

    public boolean contains(V value) {
        Node node = root;
        if (root != null) {
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                if (node.value.compareTo(value) > 0) {
                    node = node.leftChild;
                } else {
                    node = node.rightChild;
                }
            }
        }
        return false;
    }
}