import java.awt.*;

public class list {
    public static void main(String[] args) {
     Frame f =new Frame("List");
     List l =new List(4,true);
     l.setBounds(200,100,200,45);

     l.add("c++");
     l.add("java");
     l.add("python");
     l.add("php");
     l.add(".NET");
     f.add(l);

     f.setSize(600,600);
     f.setLayout(null);
     f.setVisible(true);
    } 

}
