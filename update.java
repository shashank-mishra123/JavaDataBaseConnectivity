package Bank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update {
    public  static  void updates(Connection connection)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            PreparedStatement preparedStatement =connection.prepareStatement(query.updateId());
            System.out.println("enter the account_number for set ....");
            int account_number =sc.nextInt();  preparedStatement.setInt(1,account_number);
            System.out.println(" enter the account_number to set ....");
            int account_numb=sc.nextInt(); preparedStatement.setInt(2,account_numb);
            int row_effected = preparedStatement.executeUpdate();
            if (row_effected>0) System.out.println(" update your successfully .....");
            else System.out.println(" unsuccessfully .....");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
