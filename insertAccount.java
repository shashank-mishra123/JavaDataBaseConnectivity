package Bank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertAccount {
     public   void insert( Connection connection)
     {
          Scanner sc=new Scanner(System .in);
         try
         {
             PreparedStatement preparedStatement =connection.prepareStatement(query.insertquer());

                 System.out.print(" enter the id "+" ");
                 int account_number =sc.nextInt();preparedStatement.setInt(1,account_number);
                 System.out.print( " enter the name "+" ");
                 String account_holder_name=sc.next(); preparedStatement.setString(2,account_holder_name);
                 System.out.print(" enter the bank name "+" ");
                 String bank_name=sc.next(); preparedStatement.setString(3,bank_name);
                 System.out.print(" enter the bank location"+" ");
                 String bank_location=sc.next(); preparedStatement.setString(4,bank_location);
                 System.out.print(" enter the mobile number"+" ");
                 int mobile_number=sc.nextInt(); preparedStatement.setInt(5,mobile_number);
                 System.out.print(" enter the address"+" ");
                 String holder_adderess=sc.next(); preparedStatement.setString(6,holder_adderess);
                 System.out.print(" enter the account_type"+" ");
                 String  account_type=sc.next(); preparedStatement.setString(7,account_type);
                 System.out.print(" enter the amount "+" ");
                 int amount=sc.nextInt(); preparedStatement.setInt(8,amount);

                         int rowEffected= preparedStatement.executeUpdate();
                         if (rowEffected>0) System.out.println(" successfully added....");
                         else System.out.println(" unsuccessfully added....");

         }
         catch (SQLException sqlException)
         {
             System.out.println(sqlException.getMessage());
         }

     }
}
