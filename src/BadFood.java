import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class BadFood
{
    private BufferedImage core;
    public int x, y;
    public static final int GRAVITY = 3, GRAVITY2 = 4, GRAVITY3 = 6, WIDTH = 50, HEIGHT = 110;
    public BadFood()
    {
        x = (int)(Math.random() * (AppleCatcher.WIDTH - WIDTH));
        y = -HEIGHT;
        try
        {
            core = ImageIO.read(new File("./res/Apple Core.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g)
    {
        if(core != null)
        {
            g.drawImage(core, x, y, null);
        }
    }

    public void disappear()
    {
        core = null;
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
    
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}