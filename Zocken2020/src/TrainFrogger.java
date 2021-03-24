import javax.swing.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.util.*;
public class TrainFrogger extends AnimationPanel{

  final static int TRACK_HEIGHT = 75;
  final static int TRACK_NUMBER = 5;

  double maxSpeed=5.5;
  double minSpeed=0.5;

  int minSpace=80;
  int maxSpace=80;

  GameObject frog;

  ImageIcon loadIcon(String fileName){
    return new ImageIcon(getClass().getClassLoader()
                                   .getResource(fileName));
  }
  ImageIcon[] trainIcons =
    {loadIcon("e120.png"),loadIcon("e140.png")
    ,loadIcon("e103.png"),loadIcon("e182.png")
    ,loadIcon("e110.png")};

  TrainFrogger(){
    super();
    this.setBackground(java.awt.Color.GREEN);
    preferredWidth=800;
    preferredHeight=(TRACK_NUMBER+2)*TRACK_HEIGHT;
    frog=new MovableImage
      ("frog.png",preferredWidth/2,preferredHeight-TRACK_HEIGHT);
    gos.add(frog);

    addKeyListener(new KeyAdapter(){
     public void keyPressed(KeyEvent e){
      switch (e.getKeyCode()){
       case VK_LEFT:
         frog.getDeltaPos().addMod(new Vertex(-1,0));break;
       case VK_RIGHT:
         frog.getDeltaPos().addMod(new Vertex(1,0));break;
       case VK_UP:
         frog.getPos().addMod(new Vertex(0,-TRACK_HEIGHT));break;
       case VK_DOWN:
          frog.getPos().addMod(new Vertex(0,TRACK_HEIGHT));break;
       case VK_SPACE: frog.setDeltaPos(new Vertex(0,0));break;
      }
     }
    });

    addTracks();

    setFocusable(true);
    requestFocusInWindow();
  }

  void addTracks(){
    for (int i=0;i<TRACK_NUMBER;i++) addTrains(i);
  }

  void addTrains(int trackNr){
    double speed = Math.random()*maxSpeed*2+minSpeed;
    if(speed>maxSpeed+minSpeed)
       speed = speed-(2*maxSpeed+minSpeed);

    int filled = 0;
    while (filled < preferredWidth+300){

      ImageIcon icon
        = trainIcons[(int)(Math.random()*trainIcons.length)];
      final int x = speed<0?filled:-filled;
      final GameObject train
       =new MovableImage(icon,filled
                         ,(1+trackNr)*TRACK_HEIGHT,speed ,0);
      gos.add(train);

      filled = filled+(int)train.getWidth()
                     +((int)(Math.random()*maxSpace))+minSpace;
    }

    fillings[trackNr]=filled;
  }
  int [] fillings = new int[TRACK_NUMBER];

  int getFill(double y){
    return fillings[(int)(y-TRACK_HEIGHT)/TRACK_HEIGHT];
  }

  void resetFrog(){
    frog.getPos().setX(preferredWidth/2);
    frog.getPos().setY(preferredHeight-TRACK_HEIGHT);
    frog.setDeltaPos(new Vertex(0,0));
  }

  void reset(){
    gos=new LinkedList<GameObject>();
    resetFrog();
    addTracks();
    gos.add(frog);
  }

  @Override public void doChecks(){
    for (GameObject go:gos)
      if (go!=frog){

        if (go.touches(frog)) resetFrog();

        if (   go.getDeltaPos().x>0
            && go.getPos().x>preferredWidth)
          go.getPos()
            .addMod(new Vertex(-getFill(go.getPos().y),0));
        else if (  go.getDeltaPos().x<0
                && go.getPos().x+go.getWidth()<0) 
          go.getPos()
            .addMod(new Vertex(getFill(go.getPos().y),0));
      }
  }

  public static void main(String [] args){
    new ControlledWindow(new TrainFrogger()).setResizable(false);
  }
}