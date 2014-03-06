package src;

import src.beans.ExpensesBean;
import src.beans.ReceiverBean;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        String dbURL = "jdbc:mysql://localhost:3306/ListExpenses";
        String username = "root";
        String password = "0000";
        SqlConnectSingleton SqlConnect = SqlConnectSingleton.setSqlConnect(dbURL, username, password);

        ReceiverBean Receiver = new ReceiverBean();
        Receiver.setNum(5);
        Receiver.setName("Кабельное телевидение \"Cosmos-TV\"");

        ExpensesBean Expenses = new ExpensesBean();
        Expenses.setNum(0);
        Expenses.setPayDate("2014-2-26");
        Expenses.setReceiver("5");
        Expenses.setValue(6300.40);

        SqlConnect.addReceiver(Receiver);
        SqlConnect.addExpense(Expenses);

        ReceiverBean TakeReceiver = SqlConnect.getReceiver(1);
        System.out.println(TakeReceiver);
        ExpensesBean TakeExpense = SqlConnect.getExpense(2);
        System.out.println(TakeExpense);

        ArrayList<ReceiverBean> ReceiversArray = SqlConnect.getReceivers();
        System.out.println(ReceiversArray);

        ArrayList<ExpensesBean> ExpensesArray = SqlConnect.getExpenses();
        System.out.println(ExpensesArray);

        String query = "delete from expenses where value = 6300.40 or value = 4200";
        SqlConnect.update_Query(query);
        ExpensesArray = SqlConnect.getExpenses();
        System.out.println(SqlConnect.getExpenses());

        query = "select expenses.num, paydate, value, name from expenses, receivers where receiver=receivers.num and value > 10000";
        ArrayList<String> stringArrayList = SqlConnect.execute_Query(query);
        System.out.println(stringArrayList);

        query = "select name, sum(value) from expenses, receivers where receiver=receivers.num group by name";
        stringArrayList = SqlConnect.execute_Query(query);
        System.out.println(stringArrayList);


    }
}
