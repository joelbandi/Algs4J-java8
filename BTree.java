import java.util.function.Consumer;

public class BTree {
  public static class Node<K> {
    K value;
    Node<K> left;
    Node<K> right;

    Node(K k) {
      this.value = k;
      this.left = null;
      this.right = null;
    }
  }

  public static void inOrderTraversal(Node node, Consumer<Node> consumer) {
    if(node != null) {
      inOrderTraversal(node.left, consumer);
      consumer.accept(node);
      inOrderTraversal(node.right, consumer);
    }
  }

  public static void preOrderTraversal(Node node, Consumer<Node> consumer) {
    if(node != null) {
      consumer.accept(node);
      preOrderTraversal(node.left, consumer);
      preOrderTraversal(node.right, consumer);
    }
  }

  public static void postOrderTraversal(Node node, Consumer<Node> consumer) {
    if(node != null) {
      postOrderTraversal(node.left, consumer);
      postOrderTraversal(node.right, consumer);
      consumer.accept(node);
      
    }
  }
}
