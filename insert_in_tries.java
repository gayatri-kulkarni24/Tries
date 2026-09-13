public static Node root=new Node();
public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }//for prefix problem
            //else{
            //    curr.children[idx].freq++;
            //}
            curr=curr.children[idx];
        }
        curr.eow=true;
}
