package Bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class serverconnectin {
    public static void main(String[] args) {
        final String  url ="jdbc:mysql://localhost:3306/bank";
        final String name ="root";
        final  String password ="shashank@982120";
        Scanner sc=new Scanner(System .in);
       // String query ="select * from bank";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager .getConnection(url,name ,password);
            System.out.println(" enter the query to select databases");
           String query =sc.next();
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.execute();
            ResultSet resultSet=preparedStatement.getResultSet();
            while (resultSet.next())
            {
                int id =resultSet.getInt(1);
                System.out.println(id);
                String  names =resultSet.getString(2);
                System.out.println(names);
                String bank_name =resultSet.getString(3);
                System.out.println(bank_name);
                String location =resultSet.getString(4);
                System.out.println(location);
                int number =resultSet.getInt(5);
                System.out.println(number);
                String adderess =resultSet.getString(6);
                System.out.println(adderess);
                String  accounttype =resultSet.getString(7);
                System.out.println(accounttype);

                String amount =resultSet.getString(8);
                System.out.println(amount);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}

