package Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class delete {
    public  static  void deletes(Connection connection)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            PreparedStatement preparedStatement = connection.prepareStatement(query.delete());
            System.out.println(" enter the for delete detailed ....");
            int account_number  =sc.nextInt();preparedStatement.setInt(1,account_number);
            int rowEffected =preparedStatement.executeUpdate();

            if (rowEffected>0) System.out.println(" delete the record ....");
            else System.out.println(" not deleted record ....");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
