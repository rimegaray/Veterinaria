/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utilitarios.HibernateUtil;
import entidades.Mascota;
import interfaces.IMascota;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juan Carlos
 */
public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        sesion.save(mascota);
        transaccion.commit();
        
        sesion.close();
    }
    
}
