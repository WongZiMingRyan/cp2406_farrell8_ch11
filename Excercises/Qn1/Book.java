public abstract class Book {
    String title;
    Double price;


    public void BookBuild(String title){
        System.out.println("Book title is " + title);
        System.out.println("Book price is " + price);
    }

    public abstract void setPrice();
    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
}
