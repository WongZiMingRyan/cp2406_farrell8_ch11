public class Fiction extends Book {

    public void FicBuild(String title){
        setPrice();
        BookBuild(title);
    }

    public void setPrice() {
        super.price = 24.99;
    }
}
