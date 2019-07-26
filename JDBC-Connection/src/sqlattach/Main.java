package sqlattach;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int salary;
        queries q = new queries();
//        for(int i=0;i<10;i++){
//            Scanner scan = new Scanner(System.in);
//            name = scan.nextLine();
//            salary = scan.nextInt();
//            q.insert(name,salary);
//        }

        q.printall();

//        q.printonly();
//         q.updaterichfellows();

//        q.printall();
//        q.deleterichfellows();
    }
}
