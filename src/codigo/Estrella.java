/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author XP
 */

import java.awt.*;

public class Estrella extends Forma {
    
    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
        super(_posX, _posY,new int[6], new int[6], _color, _relleno, 6);
    }
    
    @Override
    public void calculaVertices(int _radio, double _giro) {
        for (int i = 0; i < numLados; i++) {
            this.xpoints[i] = (int) (this.x + _radio * Math.cos((2 * Math.PI * i + _giro) / numLados));
            this.xpoints[i+1] = (int) (this.x + (_radio/2) * Math.cos((2 * Math.PI * i + _giro/2) / numLados));
            this.ypoints[i] = (int) (this.y + _radio * Math.sin((2 * Math.PI * i + _giro)/ numLados));
            this.ypoints[i+1] = (int) (this.y + (_radio/2) * Math.sin((2 * Math.PI * i + _giro/2)/ numLados));
            i++;
        }

    }    
        
}