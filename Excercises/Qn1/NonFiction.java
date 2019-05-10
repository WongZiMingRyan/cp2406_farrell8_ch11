public class NonFiction extends Book {

    public void NFicBuild(String title){
        setPrice();
        BookBuild(title);
    }

    public void setPrice() {
        price = 37.99;
    }
}
