import java.awt.*;

class panel{
    public static void main(String[] args) {
        Frame fr=new Frame("Panels");
        fr.setLayout(new FlowLayout());

        Panel p =new Panel();
        Label l = new Label("Panel with green background");
        Button b =new Button("1");
        l.setForeground(Color.RED);
        p.setBackground(Color.GREEN);
        p.add(l);
        p.add(b);

        Panel p1 =new Panel();
        Label l1 = new Label("Panel with pink background");
        Button b1 =new Button("2");
        l1.setForeground(Color.BLACK);
        p1.setBackground(Color.PINK);
        p1.add(l1);
        p1.add(b1);

        fr.add(p);
        fr.add(p1);

        fr.setBackground(Color.YELLOW);
        fr.setSize(600,600);
        fr.setVisible(true);

    }
}