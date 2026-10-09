import java.awt.*;
public class dialog {
    public static void main(String[] args) {
    Frame f = new Frame("Dialog");
    Dialog d = new Dialog(f,"Dialog Box",true);
    d.setLayout(new FlowLayout());
    Label l =new Label("Do you want to continue?");
    Button B = new Button("OK");
    d.add(l);
    d.add(B);
    d.setSize(600,400);
    d.setVisible(true);

    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(null);
    f.add(d);

}}
