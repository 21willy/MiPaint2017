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
public class Pentagono extends Forma {
    
    public Pentagono(int _posX, int _posY , Color _color, boolean _relleno) {
        super(_posX, _posY, new int[5], new int[5], _color, _relleno, 5 );
    }
}
