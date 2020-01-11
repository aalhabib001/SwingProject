import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class mainClass {
    static int a = 0;
    static String data[][] = {{"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"}};
    public static void main(String[] args) {
        JFrame mainWindown = new JFrame("Pos Terminal");
        mainWindown.setSize(1920, 1080);
        mainWindown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindown.setLayout(null);


        String column[]={"ID","NAME","SALARY"};


//        JScrollPane sp = new JScrollPane(tab1);

        JList li1 = new JList();
        JList li2 = new JList();
        li1.setBounds(10, 100, 930, 150);

        JButton b1 = new JButton("Chicken Pizza");
        JButton b2 = new JButton("Beef Pizza");
        JButton b3 = new JButton("Fish Pizza");
        JButton b4 = new JButton("Veg Pizza");
        JButton b5 = new JButton("Special Pizza");
        JButton b6 = new JButton("Chicken Burger");
        JButton b7 = new JButton("Beef Burger");
        JButton b8 = new JButton("Veg Burger");
        JButton b9 = new JButton("Naga Burger");
        JButton b10 = new JButton("Fish Burger");
        JButton b11 = new JButton("");
        JButton b12 = new JButton("");
        JButton b13 = new JButton("");
        JButton b14 = new JButton("");
        JButton b15 = new JButton("");
        JButton b16 = new JButton("");
        JButton b17 = new JButton("");
        JButton b18 = new JButton("");
        JButton b19 = new JButton("");
        JButton b20 = new JButton("");
        JButton b21 = new JButton("");
        JButton b22 = new JButton("");
        JButton b23 = new JButton("");
        JButton b24 = new JButton("");
        JButton b25 = new JButton("");
        b1.setBounds(990, 100, 150, 150);
        b2.setBounds(1160, 100, 150, 150);
        b3.setBounds(1330, 100, 150, 150);
        b4.setBounds(1500, 100, 150, 150);
        b5.setBounds(1670, 100, 150, 150);
        b6.setBounds(990, 270, 150, 150);
        b7.setBounds(1160, 270, 150, 150);
        b8.setBounds(1330, 270, 150, 150);
        b9.setBounds(1500, 270, 150, 150);
        b10.setBounds(1670, 270, 150, 150);

        Vector items = new Vector();


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                data[a][0]=String.valueOf(a);
                data[a][1]="Pizza";
                JTable tab1 = new JTable(data,column);

                tab1.setBounds(10, 270, 930, 650);
                mainWindown.add(tab1);
            }
        });

        mainWindown.add(li1);

        mainWindown.add(b1);
        mainWindown.add(b2);
        mainWindown.add(b3);
        mainWindown.add(b4);
        mainWindown.add(b5);
        mainWindown.add(b6);
        mainWindown.add(b7);
        mainWindown.add(b8);
        mainWindown.add(b9);
        mainWindown.add(b10);

        mainWindown.setVisible(true);
    }
}
