import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Rectangle;
import java.awt.Font;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class AppleCatcher implements ActionListener, KeyListener
{   public static AppleCatcher appleCatcher;

    public int score, lives;

    public static final int WIDTH = 600, HEIGHT = 600;

    public Renderer renderer;

    public boolean gameOver;

    public Basket basket;

    public Apple apple;

    public Life life;

    public ArrayList<Apple> list;

    public ArrayList<Apple> list2;

    public ArrayList<BadFood> badList;

    public BadFood core;

    public AppleCatcher()
    {
        basket = new Basket();
        apple = new Apple();
        core = new BadFood();
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();
        list = new ArrayList<Apple>();
        list2 = new ArrayList<Apple>();
        badList = new ArrayList<BadFood>();

        life = new Life();
        lives = 3;

        jframe.add(renderer);
        jframe.setTitle("Apple Catcher");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH + 20, HEIGHT + 30);
        jframe.addKeyListener(this);
        //jframe.setResizable(false);
        jframe.setVisible(true);

        list.add(new Apple());
        list2.add(new Apple());
        badList.add(new BadFood());

        timer.start();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        basket.update();
        if(lives > 0)
        {
            gameOver = false;
            if(score < 50)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    list.get(i).update();
                    if(list.get(i).getX() > basket.getX() - 60 && list.get(i).getX() < basket.getX() + basket.getW() + 60 && 
                    list.get(i).getY() + Apple.HEIGHT > 510)
                    {
                        score += 10;
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                    }
                    if(list.get(i).getY() + Apple.HEIGHT > HEIGHT)
                    {
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                        lives--;
                    }
                }
            }
            else if(score < 150)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    list.get(i).update2();
                    badList.get(i).update();
                    if(list.get(i).getX() > basket.getX() - 60 && list.get(i).getX() < basket.getX() + basket.getW() + 60 && 
                    list.get(i).getY() + Apple.HEIGHT > 510)
                    {
                        score += 10;
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                    }
                    if(badList.get(i).getX() > basket.getX() - 30 && badList.get(i).getX() < basket.getX() + basket.getW() + 30 && 
                    badList.get(i).getY() + BadFood.HEIGHT > 510)
                    {
                        lives--;
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                    if(list.get(i).getY() + Apple.HEIGHT > HEIGHT)
                    {
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                        lives--;
                    }
                    if(badList.get(i).getY() + BadFood.HEIGHT > HEIGHT)
                    {
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                }
            }
            else if(score < 300)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    list.get(i).update3();
                    badList.get(i).update2();
                    if(list.get(i).getX() > basket.getX() - 60 && list.get(i).getX() < basket.getX() + basket.getW() + 60 && 
                    list.get(i).getY() + Apple.HEIGHT > 510)
                    {
                        score += 10;
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                    }
                    if(badList.get(i).getX() > basket.getX() - 30 && badList.get(i).getX() < basket.getX() + basket.getW() + 30 && 
                    badList.get(i).getY() + BadFood.HEIGHT > 510)
                    {
                        lives--;
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                    if(list.get(i).getY() + Apple.HEIGHT > HEIGHT)
                    {
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                        lives--;
                    }
                    if(badList.get(i).getY() + BadFood.HEIGHT > HEIGHT)
                    {
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                }
            }
            else
            {
                for(int i = 0; i < list.size(); i++)
                {
                    list.get(i).update4();
                    badList.get(i).update3();
                    if(list.get(i).getX() > basket.getX() - 60 && list.get(i).getX() < basket.getX() + basket.getW() + 60 && 
                    list.get(i).getY() + Apple.HEIGHT > 510)
                    {
                        score += 10;
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                    }
                    if(badList.get(i).getX() > basket.getX() - 30 && badList.get(i).getX() < basket.getX() + basket.getW() + 30 && 
                    badList.get(i).getY() + BadFood.HEIGHT > 510)
                    {
                        lives--;
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                    if(list.get(i).getY() + Apple.HEIGHT > HEIGHT)
                    {
                        list.get(i).disappear();
                        list.remove(i);
                        list.add(new Apple());
                        lives--;
                    }
                    if(badList.get(i).getY() + BadFood.HEIGHT > HEIGHT)
                    {
                        badList.get(i).disappear();
                        badList.remove(i);
                        badList.add(new BadFood());
                    }
                }
            }
        }
        else 
        {
            gameOver = true;
        }
        renderer.repaint();
    }

    public void repaint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        basket.paint(g);
        for(int i = 0; i < list.size(); i++)
        {
            list.get(i).paint(g);
        }
        for(int i = 0; i < badList.size(); i++)
        {
            badList.get(i).paint(g);
        }
        g.setColor(Color.black);
        g.setFont(new Font("Arial", 1, 35));
        g.drawString(String.valueOf(score), AppleCatcher.WIDTH / 2 - 30, 30);
        if(gameOver)
        {
            g.setColor(Color.black);
            g.setFont(new Font("Arial", 1, 50));
            g.drawString("GAME OVER", AppleCatcher.WIDTH / 2 - 150, AppleCatcher.HEIGHT / 2);
            for(int i = 0; i < list.size(); i++)
            {
                list.get(i).disappear();
            }
        }
        if(lives == 3)
        {
            life.paint3(g);
        }
        if(lives == 2)
        {
            life.paint2(g);
        }
        if(lives == 1)
        {
            life.paint(g);
        }
    }

    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        if(c == KeyEvent.VK_LEFT)
        {
            basket.moveLeft();
        }
        if(c == KeyEvent.VK_RIGHT)
        {
            basket.moveRight();
        }
    }

    public void keyTyped(KeyEvent e){}

    public void keyReleased(KeyEvent e)
    {
        basket.changeVelX(0);
    }

    public static void main(String[] args)
    {
        appleCatcher = new AppleCatcher();
    }
}
