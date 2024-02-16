class Book {
    String author;
    String title;
    int pages;

    public void showData() {
        System.out.println("The title of the book is: " + title);
        System.out.println("The Author of the book is: " + author);
        System.out.println("The pages of the book are: " + pages);

    }

    public void check() {
        if (author.charAt(0) == 'A') {
            System.out.println("Starts with A");
        } else
            System.out.println("No");
    }

    public void setData(String a, String b, int c) {
        author = a;
        title = b;
        pages = c;
    }

}
