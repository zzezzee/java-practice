import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TransactionsPanel extends JPanel {
    TransactionsPanel(Account account){
        this.setLayout(new GridLayout(1+account.transactionsSize(), 1));

        this.add(new JLabel("거래 내역"));

        for(String transaction : account.transactions()){
            this.add(new JLabel(transaction));
        }
    }
}
