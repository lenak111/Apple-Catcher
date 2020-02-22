import java.awt.*;

public class Basket
{
    private int x;
    private int y;
    private int velX;
    private int width;
    private int height;
    private Rectangle basket;

    public Color brown = new Color(153, 102, 0);
    
    public Basket()
    {
        x = AppleCatcher.WIDTH / 2 - 30;
        y = AppleCatcher.HEIGHT - 130;
        velX = 0;
        width = 20;
        height = 20;
        basket = new Rectangle(x, y, 120, 100);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(brown);
        g.fillRoundRect(x, y, basket.width, basket.height, 40, 40);
        g.setColor(Color.white);
        g.fillRect(x, y - 60, basket.width, basket.height);
    }
    
    public void update()
    {   
        if(x < 0)
        {
            velX = 0;
            x = 0;
        }
        if(x > AppleCatcher.WIDTH - basket.width)
        {
            velX = 0;
            x = AppleCatcher.WIDTH - basket.width;
        }
        x += velX;
    }
    
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getW()
    {
        return width;
    }
    public int getH()
    {
        return height;
    }
    public void changeVelX(int x)
    {
        velX = x;
    }
   
    public void moveLeft()
    {
        velX = -6;
    }
    
    public void moveRight()
    {
        velX = 6;
    }
    
    
}
