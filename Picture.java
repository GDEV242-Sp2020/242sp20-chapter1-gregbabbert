/**
 * This is a picture I made of an alien/robot next to a person.
 * 
 * @author  Greg Babbert
 * @version 2020.02.02
 */
public class Picture
{
    private Square body;
    private Square eyeOne;
    private Square pupilOne;
    private Square eyeTwo;
    private Square pupilTwo;
    private Triangle head;
    private Circle earOne;
    private Circle earTwo;
    private Circle sun;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        body = new Square();
        eyeOne = new Square();
        pupilOne = new Square();
        eyeTwo = new Square();
        pupilTwo = new Square();
        head = new Triangle();  
        sun = new Circle();
        earOne = new Circle();
        earTwo = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            body.moveHorizontal(-190);
            body.moveVertical(20);
            body.changeSize(100);
            body.changeColor("navy");
            body.makeVisible();
            
            eyeOne.moveHorizontal(-180);
            eyeOne.moveVertical(40);
            eyeOne.changeSize(30);
            eyeOne.changeColor("white");
            eyeOne.makeVisible();
            
            pupilOne.moveHorizontal(-180);
            pupilOne.moveVertical(47);
            pupilOne.changeSize(15);
            pupilOne.changeColor("black");
            pupilOne.makeVisible();
            
            eyeTwo.moveHorizontal(-130);
            eyeTwo.moveVertical(40);
            eyeTwo.changeSize(30);
            eyeTwo.changeColor("white");
            eyeTwo.makeVisible();
            
            pupilTwo.moveHorizontal(-130);
            pupilTwo.moveVertical(47);
            pupilTwo.changeSize(15);
            pupilTwo.changeColor("black");
            pupilTwo.makeVisible();
    
            head.changeSize(60, 100);
            head.moveHorizontal(-40);
            head.moveVertical(-60);
            head.makeVisible();
    
            sun.changeColor("yellow");
            sun.changeSize(60);
            sun.moveVertical(-15);
            sun.moveHorizontal(40);
            sun.makeVisible();
            
            earOne.changeColor("red");
            earOne.changeSize(80);
            earOne.moveHorizontal(-180);
            earOne.moveVertical(15);
            earOne.makeVisible();
            
            earTwo.changeColor("blue");
            earTwo.changeSize(80);
            earTwo.moveHorizontal(-300);
            earTwo.moveVertical(15);
            earTwo.makeVisible();
            
            person.changeColor("black");
            person.moveHorizontal(400);
            person.moveVertical(180);
            person.changeSize(80, 40);
            person.makeVisible();
            drawn = true;
        }
        
        
    }
    
    public void look() {
      pupilOne.slowMoveHorizontal(15);
      pupilTwo.slowMoveHorizontal(15);
      pupilOne.slowMoveVertical(2);
      pupilTwo.slowMoveVertical(2);
      pupilOne.changeColor("red");
      pupilTwo.changeColor("red");
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        body.changeColor("black");
        eyeOne.changeColor("white");
        eyeTwo.changeColor("white");
        head.changeColor("white");
        earOne.changeColor("black");
        earTwo.changeColor("black");
        pupilOne.changeColor("black");
        pupilTwo.changeColor("black");
        sun.changeColor("black");
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        body.changeColor("navy");
        eyeOne.changeColor("white");
        eyeTwo.changeColor("white");
        earOne.changeColor("red");
        pupilOne.changeColor("black");
        pupilTwo.changeColor("black");
        earTwo.changeColor("blue");
        head.changeColor("green");
        sun.changeColor("yellow");
        person.changeColor("black");
    }
}
