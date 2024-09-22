/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040482311010
 */
public class Ponto {
    protected double X, Y;

    //GETTERS
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
    
    //SETTERS   
    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    
    //CONSTRUTOR PADRÃO
    public Ponto()
    {
        X = 0;
        Y = 0;
    }

    //CONSTRUTOR PARAMETRIZADO
    public Ponto(double vX, double vY) {
        X = vX;
        Y = vY;
    }
    
    //COPY CONSTRUTOR
    public Ponto(Ponto pt)
    {
        X = pt.X;
        Y = pt.Y;
    }
    
    public void setXY(double newX, double newY)
    {
        newX = X;
        newY = Y;
    }
    
    public void assign(Ponto pt)
    {
        X = pt.X;
        Y = pt.Y;
    }
    
    public double deltaX(double vX)
    {
        return vX - X;
    }
    
    public double deltaY(double vY)
    {
        return vY - Y;
    }
    
    public double distance(double posX, double posY)
    {
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public void desloc(double dx, double dy)
    {
        X += dx;
        Y += dy;
    }
    
    public void escale(double factor)
    {
        X *= factor;
        Y *= factor;
    }
}
