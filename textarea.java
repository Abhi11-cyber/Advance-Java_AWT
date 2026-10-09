import java.awt.*;

public class textarea {
    public static void main(String[] args) {

     TextArea Ta=new TextArea("Enter Feedback about Awt",12,7);

        Frame f=new Frame("TextArea");
       // TextArea Ta = new TextArea();
        Label l = new Label("Enter Address");
        Ta.setBounds(100, 30, 200, 100);
        l.setBounds(20, 50, 80, 30);
        f.add(Ta);
        f.add(l);

        //methods of TextArea class.
        /*Ta.setText("");
        Ta.getText();
        Ta.getRows();
        Ta.getColumns();*/
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
