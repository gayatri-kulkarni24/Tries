static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int freq; //for prefix problem
        public Node(){
            for (int i=0;i<26;i++){
                children[i]=null;
            }
            freq=1;//for prefix problem
        }
}
