    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
           insert(words[i]);
        }
        System.out.println(search("thehkhj"));
        System.out.println(wordBreak("thereanyfkjfd"));
        String arr[]={"zebra","dog","dove","duck"};
        for(int i=0;i<arr.length;i++){
           insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root,"");
        String words[]={"apple","app","mango","man","woman"};
        for(int i=0;i<words.length;i++){
           insert(words[i]);
        }
        System.out.println(startsWith("app"));
        String str="ababa";
        for(int i=0;i<str.length();i++){
           String suffix=str.substring(i);//ababa baba aba ba a
           insert(suffix);
        }
        System.out.println(countNodes(root));
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
