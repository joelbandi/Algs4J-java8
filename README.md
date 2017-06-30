This static java library of standard functions used with trees and graph algorithms

## Usage:
```java

public class Guide {
  public static void main(String[] args) {
    
    //Binary Tree
    BTree.Node<Integer> n = new BTree.Node<Integer>(5);
    n.left = new BTree.Node<Integer>(1);
    n.right = new BTree.Node<Integer>(9);
    
    //to print the trees in certain orders:
    BTree.inOrderTraversal(n, (node) -> System.out.println(node.value));
    BTree.preOrderTraversal(n, (node) -> System.out.println(node.value));
    BTree.postOrderTraversal(n, (node) -> System.out.println(node.value));
    

    //Graphs
    Graph.Node<Integer> g = new Graph.Node<Integer>(5);
    //various ways of building the graph
    g.addNeighbor(new Graph.Node<Integer>(10));
    g.addNeighbor(7);
    g.addNeighboursFromArray(new int[]{8,9,6,5,4,1})
    Graph.Node<Integer> neighbor = new Graph.Node<Integer>(75);
    g.addNeighbor(neighbor);
    neighbor.addNeighboursFromArray(new int[]{100,200,300,400,500});


    // easily perform bfs and dfs with the graph
    Graph.dfs(g,(node) -> System.out.println(node.value));
    Graph.bfs(g,(node) -> System.out.println(node.value));
    
  }
}


```
