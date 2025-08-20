class max_width {
    int getMaxWidth(Node root) {     
      int ans=Integer.MIN_VALUE;
      Queue<Node> q=new LinkedList<>();    
      if(root==null) return 0;
      
      q.offer(root);
      
      while(!q.isEmpty()){
           int size=q.size();
          ans=Math.max(ans,size);
          
          while(size>0){
              Node node=q.poll();
            if(node.left!=null) q.offer(node.left);
              if(node.right!=null) q.offer(node.right);
              size--;
          }
      }
      
      return ans;
    }
}