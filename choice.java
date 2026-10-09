import java.awt.*;
public class choice {

    public static void main(String[] args) {
     Frame f =new Frame("Choice");
     Choice c =new Choice();
     c.setBounds(200,100,200,60);
     c.add("item 1");
     c.add("item 2");
     c.add("item 3");
     c.add("item 4");
     c.add("item 5");
     c.add("item 6");
     c.add("item 7");
     c.add("item 8");
     f.add(c);

     f.setSize(600,600);
     f.setLayout(null);
     f.setVisible(true);
    }

}
