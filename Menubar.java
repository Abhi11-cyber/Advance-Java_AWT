import java.awt.*;

public class Menubar {
    public static void main(String[] args) {
        
     Frame f=new Frame("Menubar");

     MenuBar Mb =new MenuBar();
     Menu m1 =new Menu("File");     
     Menu m2 =new Menu("Edit");          
     Menu m3 =new Menu("View");  
     
     MenuItem i1 =new MenuItem("New Textfile");
     Menu i2 =new Menu("New file");

     MenuItem s =new MenuItem(".C++");
     MenuItem s1 =new MenuItem(".Java");
     MenuItem s2 =new MenuItem(".Python");

     MenuItem i3 =new MenuItem("open file");
     MenuItem i4 =new MenuItem("open folder");

     MenuItem i5 =new MenuItem("Cut");
     MenuItem i6 =new MenuItem("Copy");
     MenuItem i7 =new MenuItem("Paste");

     MenuItem i8 =new MenuItem("Open view");
     MenuItem i9 =new MenuItem("editor Layout");
     
     Mb.add(m1);
     Mb.add(m2);
     Mb.add(m3);

     m1.add(i1);
     m1.add(i2);

     i2.add(s);
     i2.add(s1);
     i2.add(s2);

     m1.add(i3);
     m1.add(i4);

     m2.add(i5);
     m2.add(i6);
     m2.add(i7);

     m3.add(i8);
     m3.add(i9);

     f.setMenuBar(Mb);
 
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
  