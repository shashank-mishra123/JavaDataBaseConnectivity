package Bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BankDatabaseSystem {
    public static void main(String[] args) {

       final String  url ="jdbc:mysql://localhost:3306/bank";
       final String name ="root";
       final  String password ="shashank@982120";
       Scanner sc=new Scanner(System .in);

        try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection= DriverManager .getConnection(url,name,password);
             while (true){
             choice.choic();
             int choice =sc.nextInt();
             switch (choice) {
                 case 1: {   // for insert new account holder
                     insertAccount insertAccounts = new insertAccount();
                     insertAccounts.insert(connection);
                     break;
                 }
                 case 2: {  //
                     update.updates(connection);// update detailed
                     break;
                 }
                 case 3: { //delete detailed
                     delete.deletes(connection);
                     break;
                 }
                 case 4: {  // show data
                     checkAccounts.check(connection);
                     break;
                 }
                 case 5: {
                     System.out.println(" thanks for visiting PlanetEcosystems...");
                     return;
                 }
                 default:
                     System.out.println(" enter the valid choice");
                     break;
             }
             }
         }
         catch (Exception e){
             System.out.println(e.getMessage());

         }

    }

}
