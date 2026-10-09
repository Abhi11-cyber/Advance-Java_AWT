import java.awt.*;

public class checkbox {
    public static void main(String[] args) {
        
     Frame f=new Frame("CheckBox");
     CheckboxGroup cbg = new CheckboxGroup();
     Checkbox c1 =new Checkbox("c++",cbg,true);
     Checkbox c2 =new Checkbox("java",cbg,true);
     c1.setBounds(50, 100, 200, 40);
     c2.setBounds(50, 140, 200, 40);

     f.add(c1);
     f.add(c2);
 
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
