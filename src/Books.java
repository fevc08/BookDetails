
import java.util.Scanner;

public class Books {
    public static void main(String args[]){
        System.out.println("Proporciona el titulo");
        Scanner consola = new Scanner(System.in);
        var book = consola.nextLine();
        System.out.println("Porporciona el autor");
        var author = consola.nextLine();
        System.out.println(book + " fue escrito por " + author);
    }
}
