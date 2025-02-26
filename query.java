package Bank;

public class query {
  public static  String insertquer()
    {

        return "insert into bank(account_number,account_holder_name,bank_name ,bank_location,mobile_number ,holder_adderess,account_type,amount) values (?,?,?,?,?,?,?,?)";
    }
    public  static String select()
    {
        return " select * from bank ";
    }
    public  static  String  delete()
    {
        return " delete from bank where account_number =? ";
    }
    public static String  updateId ()
    {
        return " update  bank set account_number = ?  where account_number = ?";
    }
}
