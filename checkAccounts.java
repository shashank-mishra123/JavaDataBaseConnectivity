package Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class checkAccounts {
    public static  void check(Connection connection)
    {
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(query.select());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int account_number =resultSet.getInt(1);
                System.out.println("account_ number  "+" " +account_number);
                String name =resultSet.getString(2);
                System.out.println(" account_holder_name "+" " +name);
                String bank_name=resultSet.getString(3);
                System.out.println("bank_name "+" " +bank_name);
                String bank_location=resultSet.getString(4);
                System.out.println(" bank_location "+" "+ bank_location);

                int mobile_number=resultSet.getInt(5);
                System.out.println(" mobile_number "+" "+ mobile_number);
                String holder_adderess =resultSet.getString(6);
                System.out.println(" holder_adderess "+" "+ holder_adderess);
                String account_type =resultSet.getString(7);
                System.out.println(" account_type "+" "+ account_type);

                int amount =resultSet.getInt(8);
                System.out.println(" account_type "+ " "+ account_type);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
