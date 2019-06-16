/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Mascota;
import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public interface IMascota {
    
    public abstract boolean guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascota();
    
}
