/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utilitarios.HibernateUtil;
import entidades.Mascota;
import interfaces.IMascota;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juan Carlos
 */
public class MascotaDao implements IMascota{

    @Override
    public boolean guardarMascota(Mascota mascota) {
        boolean respuesta = true;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        try {
            sesion.save(mascota);
            transaccion.commit();
        } catch (Exception e) {
            respuesta = false;
        }
        
        sesion.close();
        return respuesta;
    }

    @Override
    public ArrayList<Mascota> listarMascota() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Mascota> milista = new ArrayList<>();
        Query query = sesion.createQuery("from Mascota");
        milista = (ArrayList<Mascota>)query.list();
        return milista;
    }
    
    
}
