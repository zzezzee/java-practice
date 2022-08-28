import java.util.ArrayList;
import java.util.List;

public class Account {

    private String nubmer = "123-123123-123";
    private long amount = 1000;
    private List<String> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Account account = new Account();

        System.out.println("Amount: " + account.getAmount());
        account.transfer(100);
        System.out.println("Amount: " + account.getAmount());
        account.transfer(50);
        System.out.println("Amount: " + account.getAmount());
        for(String transaction : account.transactions()){
            System.out.println(transaction);
        }
    }

    public String getNubmer() {
        return nubmer;
    }

    public long getAmount() {
        return amount;
    }

    public List<String> transactions() {
        return new ArrayList<>(transactions);
    }

    public void transfer(long transferAmount) {
        amount -= transferAmount;

        transactions.add("송금: " + transferAmount + "원");
    }

    public int transactionsSize() {
        return transactions.size();
    }
}
