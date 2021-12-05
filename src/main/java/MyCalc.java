import java.awt.*;
import java.awt.event.*;

class MyCalc extends WindowAdapter implements ActionListener {
    Frame f;
    Label l1;
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0;
    Button badd, bsub, bmult, bdiv, bcalc, bclr, dot, bneg, bback;
    double xd;
    double num1, num2, check;

    MyCalc() {
        f = new Frame("Калькулятор");
        l1 = new Label();
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(50, 50, 260, 60);
        Font myFont = new Font("Courier New", 2, 19);
        l1.setFont(myFont);


        but1 = new Button("1");
        but1.setBounds(50, 340, 50, 50);
        but2 = new Button("2");
        but2.setBounds(120, 340, 50, 50);
        but3 = new Button("3");
        but3.setBounds(190, 340, 50, 50);
        but4 = new Button("4");
        but4.setBounds(50, 270, 50, 50);
        but5 = new Button("5");
        but5.setBounds(120, 270, 50, 50);
        but6 = new Button("6");
        but6.setBounds(190, 270, 50, 50);
        but7 = new Button("7");
        but7.setBounds(50, 200, 50, 50);
        but8 = new Button("8");
        but8.setBounds(120, 200, 50, 50);
        but9 = new Button("9");
        but9.setBounds(190, 200, 50, 50);
        but0 = new Button("0");
        but0.setBounds(120, 410, 50, 50);

        dot = new Button(".");
        dot.setBounds(190, 410, 50, 50);
        bback = new Button("back");
        bback.setBounds(120, 130, 50, 50);

        badd = new Button("+");
        badd.setBounds(260, 340, 50, 50);
        bsub = new Button("-");
        bsub.setBounds(260, 270, 50, 50);
        bmult = new Button("*");
        bmult.setBounds(260, 200, 50, 50);
        bdiv = new Button("/");
        bdiv.setBounds(260, 130, 50, 50);

        bcalc = new Button("=");
        bcalc.setBounds(245, 410, 65, 50);
        bclr = new Button("CE");
        bclr.setBounds(50, 130, 65, 50);


        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but0.addActionListener(this);

        dot.addActionListener(this);

        bback.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);

        f.addWindowListener(this);

        f.add(l1);
        f.add(but1);
        f.add(but2);
        f.add(but3);
        f.add(but4);
        f.add(but5);
        f.add(but6);
        f.add(but7);
        f.add(but8);
        f.add(but9);
        f.add(but0);

        f.add(badd);
        f.add(bsub);
        f.add(bmult);
        f.add(bdiv);
        f.add(bcalc);
        f.add(bclr);
        f.add(dot);
        f.add(bback);


        f.setBounds(400, 200, 340, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String z, zt;
        //цифры
        if (e.getSource() == but1) { //1
            zt = l1.getText();
            z = zt + "1";
            l1.setText(z);
        }
        if (e.getSource() == but2) {   //2
            zt = l1.getText();
            z = zt + "2";
            l1.setText(z);
        }
        if (e.getSource() == but3) {  //3
            zt = l1.getText();
            z = zt + "3";
            l1.setText(z);
        }
        if (e.getSource() == but4) {  //3
            zt = l1.getText();
            z = zt + "4";
            l1.setText(z);
        }
        if (e.getSource() == but5) {
            zt = l1.getText();
            z = zt + "5";
            l1.setText(z);
        }
        if (e.getSource() == but6) {
            zt = l1.getText();
            z = zt + "6";
            l1.setText(z);
        }
        if (e.getSource() == but7) {
            zt = l1.getText();
            z = zt + "7";
            l1.setText(z);
        }
        if (e.getSource() == but8) {
            zt = l1.getText();
            z = zt + "8";
            l1.setText(z);
        }
        if (e.getSource() == but9) {
            zt = l1.getText();
            z = zt + "9";
            l1.setText(z);
        }
        if (e.getSource() == but0) { //ноль
            zt = l1.getText();
            z = zt + "0";
            l1.setText(z);
        }

        if (e.getSource() == dot) {  //точка
            zt = l1.getText();
            z = zt + ".";
            l1.setText(z);
        }
        if (e.getSource() == bneg) { //минсус
            zt = l1.getText();
            z = "-" + zt;
            l1.setText(z);
        }

        if (e.getSource() == bback) {  // удаление
            zt = l1.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            } catch (StringIndexOutOfBoundsException f) {
                return;
            }
            l1.setText(z);
        }

        if (e.getSource() == badd) {
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 1;
        }
        if (e.getSource() == bsub) {
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 2;
        }
        if (e.getSource() == bmult) {                   //умножение
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 3;
        }
        if (e.getSource() == bdiv) {
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 4;
        }

        // итого
        if (e.getSource() == bcalc) {
            try {
                num2 = Double.parseDouble(l1.getText());
            } catch (Exception f) {
                l1.setText(" ");
                return;
            }
            if (check == 1)
                xd = num1 + num2;
            if (check == 2)
                xd = num1 - num2;
            if (check == 3)
                xd = num1 * num2;
            if (check == 4)
                xd = num1 / num2;
            if (check == 5)
                xd = num1 % num2;
            l1.setText(String.valueOf(xd));
        }
        // ресет
        if (e.getSource() == bclr) {
            num1 = 0;
            num2 = 0;
            check = 0;
            xd = 0;
            z = "";
            l1.setText(z);
        }

    }

    public static void main(String args[]) {
        new MyCalc();
    }
} 