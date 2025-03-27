import java.util.*;
public class main {
    public static void bfs(map<integer,List<Integer>>graph,int start) {
	set<Integer>visited=new Hashset<>();
	Queue<Integer>queue=new LinkedList<>()
	visited.add(start);
	queue.add(start);
	while(!queue.isEmpty()) {
	  int node=queue.poll();
	  system.out.print(node+"");
	  for(int neighbour:graph.getordefault(node,new ArrayList<>())){
	      if(!visited.contains(neighbour)) {
	         visited.add(neighbour);
	         queue.add(neighbour);
	      }
	  }
	}
     }
     public static void main(string[] args) {
        Map<Integer,List<Integer>>graph=new HashMap<>();
        graph.put(0,Arrays,as List(1,2));
        graph.put(0,Arrays,as List(0,3,4));
        graph.put(0,Arrays,as List(0,5,6));
        graph.put(0,Arrays,as List(1));
        graph.put(0,Arrays,as List(1));
        graph.put(0,Arrays,as List(1));
        graph.put(0,Arrays,as List(1));
        System.out println("BFS Traversal starting from node 0:");
    }
}
        

        
        