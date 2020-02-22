import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class Life
{
    private BufferedImage life, life2, life3;
    public int x, y;
    public static final int WIDTH = 56, HEIGHT = 57;
    public Life()
    {
        x = AppleCatcher.WIDTH - WIDTH * 3 - 10;
        y = AppleCatcher.HEIGHT - HEIGHT;
        try
        {
            life = ImageIO.read(new File("./res/Life.png"));
            life2 = ImageIO.read(new File("./res/Life2.png"));
            life3 = ImageIO.read(new File("./res/Life3.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g)
    {
        if(life != null)
        {
            g.drawImage(life, x, y, null);
        }
    }
    public void paint2(Graphics g)
    {
        if(life2 != null)
        {
            g.drawImage(life2, x, y, null);
        }
    }
    public void paint3(Graphics g)
    {
        if(life3 != null)
        {
            g.drawImage(life3, x, y, null);
        }
    }
    public void disappear()
    {
        life = null;
    }
}