/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author xp
 */
public class Circulo extends Ellipse2D.Double {
    
    Color color = null;
    
    boolean relleno = false;
    
    public Circulo (int _posX, int _posY, int _radio, Color _color, boolean _relleno){
        super();
        x = _posX;
        y = _posY;
        width = _radio;
        height = _radio;
        color = _color;
        relleno = _relleno;
    }
    
    
    public void dibujate(Graphics2D g2, int posX){
        int radio = Math.abs((int) this.x - posX);
        this.width = radio;
        this.height = radio;
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }    
    }
}
