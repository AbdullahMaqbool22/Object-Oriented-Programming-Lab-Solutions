public class botest {
    public static void main(String[] args) {
    
        String arr [] = {"cat", "dog", "sheep", "camel", "bat"};
        Book b1 = new Book();
        Book b2 = new Book("Ahmad", arr);
        b1.setValue("Ali", arr);
        b1.Display();
        System.out.println("Is author name starting with A: " + b1.check());
        System.out.println("Which chapter do you want to search: ");
        String ch = "dog";
        System.out.println("Is it here: " + b1.search(ch));
        System.out.println("Does two book have same author: ");
        boolean e = b1.compare(b2);
        System.out.println(e);
        System.out.println("Does both have same chapter: ");
        boolean d = b1.compChap(b2);
        System.out.println(d);
        Book b3 = new Book(b1);
        b3.Display();
        System.out.println("is it same: ");
        boolean bb = b1.equals(b2);
        System.out.println(bb);
    }
    

    
}
