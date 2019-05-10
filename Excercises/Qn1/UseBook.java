public class UseBook {
    public static void main(String[] args){
        Fiction FicTest = new Fiction();
        NonFiction NFicTest = new NonFiction();

        FicTest.FicBuild("Totally Real Title (FICTION)");

        NFicTest.NFicBuild("Totally Real title(N-Fiction)");
    }
}
