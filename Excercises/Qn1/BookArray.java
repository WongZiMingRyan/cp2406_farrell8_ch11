import java.util.Scanner;

public class BookArray {

    static BookArray[] BookArray = new BookArray[10];

    public static void BuildArray() {
        Scanner scan = new Scanner(System.in);
        String title;
        for(int x = 0; x < BookArray.length; ++x)
        {
            System.out.println("");
            title = scan.nextLine();
            if(boatType =='r')
                boatArray[x] = new DebugRowboat();
            else
                boatArray[x] = new DebugOceanLiner();
        }

}
