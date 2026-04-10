package BinaryTrees;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.left=null;
		this.right=null;
		this.val=val;
	}
}

class Trees{
	public void InOrderTraversal(TreeNode node) {
		if(node ==null ) return;
		
		InOrderTraversal(node.left);
		System.out.println(node.val);
		InOrderTraversal(node.right);
	}
	
	public void preOrderTraversal(TreeNode node) {
		if( node==null) return;
		System.out.println(node.val); 
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public void postOrderTraversal(TreeNode node) {
		if(node==null) return;
		
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.val);
		
	}
	
	public void LevelOrderTraversal(TreeNode node) {
		if(node ==null ) return ;
		Queue<TreeNode> qu=new LinkedList<TreeNode>();
		List<List<Integer>>ls=new ArrayList<>();
		
		qu.offer(node);
		
		while(!qu.isEmpty()) {
			int size=qu.size();
			List<Integer>sublist=new ArrayList<>();
			for(int i=0;i<size;i++) {
				TreeNode curr=qu.poll();
				sublist.add(curr.val);
				
				if(curr.left !=null) {
					qu.offer(curr.left);
				}
				if(curr.right !=null) {
					qu.offer(curr.right);
				}
			}
			ls.add(sublist);
			System.out.println(ls);
		}
	}
}
public class Tree {
	public static void main(String[] args) {
	Trees trees=new Trees();
	
	TreeNode tr=new TreeNode(10);
	tr.left=new TreeNode(12);
	tr.right=new TreeNode(14);
	tr.left.right=new TreeNode(16);
	tr.right.right=new TreeNode(16);
	tr.left.right.right=new TreeNode(15);
	
	trees.LevelOrderTraversal(tr);
	
	System.out.println();
	trees.InOrderTraversal(tr);
	System.out.println();
	trees.preOrderTraversal(tr);
	System.out.println();trees.postOrderTraversal(tr);
	}
}
