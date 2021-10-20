/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programs;

/**
 *
 * @author admin
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Fib" width="500" height="1000></applet>*/
public class armstrong extends Applet implements ActionListener
{
TextField t1,t2,t3;
Button b,b1;

public void init()
{
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b=new Button("factorial");
b1=new Button("amstrong");
add(t1);
add(t2);
add(t3);
add(b);
add(b1);
b.addActionListener(this);
b1.addActionListener(this);
}
public void ActionPerformed(ActionEvent e)
{
int a= Integer.parseInt(t1.getText());
int y= Integer.parseInt(t2.getText());
String str;
if(e.getSource()==b)
{
int fact=1;
while(a>0)
{
fact=fact*a;
a--;
}
str=fact + " ";
t3.setText(str);
}
else if(e.getSource()==b1)
{
int x,d,s=0;
x=y;
while(y>0)
{
d=y%10;
s+=d*d*d;
y=y/10;
}
if(s==x)
{
    str=s+ " ";
    t3.setText(str);
}
else 
    t3.setText("NOT AMSTRONG");
}
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
