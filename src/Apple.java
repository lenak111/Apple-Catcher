import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class Apple
{
    private BufferedImage apple;
    public int x, y;
    public static final int GRAVITY = 3, GRAVITY2 = 4, GRAVITY3 = 6, GRAVITY4 = 7, WIDTH = 100, HEIGHT = 100;
    public Apple()
    {
        x = (int)(Math.random() * (AppleCatcher.WIDTH - WIDTH));
        y = 10;
        try
        {
            apple = ImageIO.read(new File("./res/Apple.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void paint(Graphics g)
    {
        if(apple != null)
        {
            g.drawImage(apple, x, y, null);
        }
    }
    
    public void disappear()
    {
        apple = null;
    }
    
    public void update()
    {
        y += GRAVITY;
    }
    public void update2()
    {
        y += GRAVITY2;
    }
    public void update3()
    {
        y += GRAVITY3;
    }
    public void update4()
    {
       y += GRAVITY4;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
