import javax.swing.*;
import java.awt.event.*;
import util.*;

class ButtonAnimation extends JPanel{
  JButton b = new JButton("push to move");
  MovablePanel mp = new MovablePanel();

  ButtonAnimation(){
    add(mp);
    add(b);

    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){mp.doOnTick();}
    }); 
  }

  public static void main(String [] args){
    ButtonAnimation p = new ButtonAnimation();
    p.mp.gos.add(new MovableImage("hexe.png",0,0,1,1));
    p.mp.gos.add(new MovableImage("biene.png",200,200,-1,-1));
    ShowInFrame.show(p); 
  }
}
