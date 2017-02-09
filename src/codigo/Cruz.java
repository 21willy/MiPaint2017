/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author xp
 */
public class Cruz extends Forma {

    public Cruz(int _x, int _y, int _width, Color _color, boolean _relleno) {
        //Numero de puntos de la figura

        addPoint(_x - _width, _y + 3 * _width);
        addPoint(_x + _width, _y + 3 * _width);
        addPoint(_x + _width, _y + _width);
        addPoint(_x + 3 * _width, _y + _width);
        addPoint(_x + 3 * _width, _y - _width);
        addPoint(_x + _width, _y - _width);
        addPoint(_x + _width, _y - 3 * _width);
        addPoint(_x - _width, _y - 3 * _width);
        addPoint(_x - _width, _y - _width);
        addPoint(_x - 3 * _width, _y - _width);
        addPoint(_x - 3 * _width, _y + _width);
        addPoint(_x - _width, _y + _width);

        this.color = _color;
        this.relleno = _relleno;

    }

    public void dibujate(Graphics2D g2, int posX, int posY) {
        Rectangle2D bounds=this.getBounds2D();
        
        int ancho = Math.abs((int) this.x - posX);
        int alto = Math.abs((int) this.y - posY);
        
        AffineTransform saveTransform = g2.getTransform();
        try {
            AffineTransform scaleMatrix = new AffineTransform();
            scaleMatrix.scale(ancho/10, alto/10);
            scaleMatrix.getTranslateInstance(- posX/ancho,- posY/alto);
            g2.setTransform(scaleMatrix);
            g2.setColor(color);
            if (relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
        } finally {

            g2.setTransform(saveTransform);
        }

    }

}
