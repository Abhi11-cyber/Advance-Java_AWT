import java.awt.*;

public class TF {
    public static void main(String[] args) {
        Frame f = new Frame("TextFeild");
        Label l = new Label("Enter your name");
        TextField Tf = new TextField("Abhishek Dattatray Nawale");
        Label l2 = new Label("Enter your branch");
        TextField TF = new TextField("Computer Engineering");
        l.setBounds(50, 100, 130, 30);
        l2.setBounds(50, 140, 130, 30);
        Tf.setBounds(200, 100, 200, 30);
        TF.setBounds(200, 140, 200, 30);

        Tf.setForeground(Color.BLUE);
        TF.setForeground(Color.BLUE);
        l.setBackground(Color.GRAY);
        l2.setBackground(Color.GRAY);



        f.add(Tf);
        f.add(l);        
        f.add(l2);        
        f.add(TF);        

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.GRAY);
    }
}
