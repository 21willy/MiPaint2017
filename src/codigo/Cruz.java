/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 *
 * @author xp
 */
public class Cruz extends Forma{

    public Cruz (int _x, int _y, int _width,  Color _color, boolean _relleno){
        //Numero de puntos de la figura
       
        addPoint(_x-_width, _y+3*_width);
        addPoint(_x+_width, _y+3*_width);
        addPoint(_x+_width, _y+_width);
        addPoint(_x+3*_width, _y+_width);
        addPoint(_x+3*_width, _y-_width);
        addPoint(_x+_width, _y-_width);
        addPoint(_x+_width, _y-3*_width);
        addPoint(_x-_width, _y-3*_width);
        addPoint(_x-_width, _y-_width);
        addPoint(_x-3*_width, _y-_width);
        addPoint(_x-3*_width, _y+_width);
        addPoint(_x-_width, _y+_width);

        this.color = _color;
        this.relleno = _relleno;
        
    }

     public void dibujate(Graphics2D g2, int posX){
        int ancho = Math.abs((int) this.x - posX);
        this.width = ancho;
        this.height = ancho;
        
     AffineTransform saveTransform = g2.getTransform();
     try {
         AffineTransform scaleMatrix = new AffineTransform();
         scaleMatrix.scale(4, 4);
         //or whatever you want

         g2.setTransform(scaleMatrix);
         //g2.drawPolygon(this);
     } finally {
         g2.setTransform(saveTransform);
     }
     
        
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }    
    }
     

    
}
