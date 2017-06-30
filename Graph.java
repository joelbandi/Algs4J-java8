import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Graph {
  public static class Node<K> {
    K value;
    boolean marked;
    LinkedList<Node> neighbors;
    
    Node(K k) {
      this.value = k;
      this.marked = false;
      this.neighbors = new LinkedList<Node>();
    }

    public Node addNeighbor(Node node) {
      this.neighbors.add(node);
      return this;
    }

    public Node addNeighbor(K k) {
      this.neighbors.add(new Node(k));
      return this;
    }

    public Node addNeighboursFromArray(K[] k) {
      for(K item: k) {
        this.neighbors.add(new Node(item));
      }
      return this;
    }

  }

  public static void dfs(Node node, Consumer<Node> consumer) {
    if(node == null) return;
    consumer.accept(node);
    node.marked = true;
    for(Node n: node.neighbors) {
      if(n.marked == false) {
        dfs(n,consumer);
      }
    }
  }

  public static void bfs(Node node, Consumer<Node> consumer) {
    ArrayDeque<Node> q = new ArrayDeque<Node>();
    consumer.accept(node);
    node.marked = true;
    q.addLast(node);
    while(q.size() != 0) {
      Node r = q.removeFirst();
      for(Node n: r.neighbors) {
        consumer.accept(n);
        n.marked = true;
        q.addLast(n);
      }
    }

  }

}