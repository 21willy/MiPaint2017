/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Jorge Cisneros
 */
public class Hexagono extends Forma {

    public Hexagono(int _posX, int _posY , Color _color, boolean _relleno) {
        super(_posX, _posY, new int[6], new int[6], _color, _relleno, 6 );
    }

}
