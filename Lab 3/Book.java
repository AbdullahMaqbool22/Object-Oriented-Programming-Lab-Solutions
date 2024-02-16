class Book  {
    private String Author;
    private String chname[] = new String [5];
    
    public void setAuthor(String auth){
        Author = auth;
    }
    public void setChapter(String [] chap){
        for(int i =0; i<chap.length;i++){
            chname[i]=chap[i];
        }
    }
    public String getAuthor(){
        return Author;
    }
    public String [] getChapter(){
        return chname;
    }
    public Book(){

    }
    public Book(String a, String [] b){
        Author = a;
        for(int i= 0; i<b.length; i++){
            chname[i] = b[i];
        }
    }
    public void Display(){
        System.out.println("The author name is: " + Author);
         System.out.println("Chapter names are: ");
        for(int i = 0; i<chname.length; i++){
            System.out.println(chname[i]);
           
        }

    }
    public void setValue(String a, String [] b){
        Author = a;
        for(int i= 0; i<b.length; i++){
            chname[i] = b[i];
        }

    }
    public boolean check(){
        if(Author.charAt(0)=='A'){
            return true;
        }
        else
             return false;
    }
    public boolean search(String a){
        boolean flag = false;
        for (int i = 0; i<chname.length; i++) {
            if(chname[i].equals(a)){
                flag = true;
            }
           
        }
         return flag;
    }
    public Book(Book b1){
        Author = b1.Author;
         for(int i = 0; i<chname.length; i++){
            chname[i] = b1.chname[i];
        }

    }
    public boolean equals(Book b1){
        if(!this.Author.equalsIgnoreCase(b1.Author)){
            return false;
        }
        for(int i = 0; i<chname.length; i++){
            if(!this.chname[i].equalsIgnoreCase(b1.chname[i])){
            return false;
        }
        }
        return true;
    }
    public boolean compare(Book b1){
        if(this.Author.equalsIgnoreCase(b1.Author)){
            return true; 
        }
        return false;
    }
    public boolean compChap(Book b1){
        for(int i = 0; i<chname.length; i++){
            if(this.chname[i].equalsIgnoreCase(b1.chname[i])){
                return true;
            }
        }
        return false;
    }

}
