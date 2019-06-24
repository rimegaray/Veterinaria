/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author Juan Carlos
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota ;

    public MascotaBean() {
        this.mascota = new Mascota();
    }
    
    public   Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        boolean respuesta = dao.guardarMascota(mascota);
        if(respuesta){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "qweqwe"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo registrar"));
        }
        return "/RegistroMascota";
    }
    
    public ArrayList<Mascota> listar(){
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascota();
        return milista;
    }
    
    public String eliminar(){
        MascotaDao dao = new MascotaDao();
        boolean respuesta = dao.eliminarMascota(mascota);
        if(respuesta){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "asdaaaa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo eliminar"));
        }
        return "/RegistroMascota";
    }
    
    public String actualizar(){
        MascotaDao dao = new MascotaDao();
        boolean respuesta = dao.actualizarMascota(mascota);
        System.out.println(respuesta);
        if(respuesta){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "eee"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo actualizar"));
        }
        return "/RegistroMascota";
    }
    
    public String limpiar(){
        return "/RegistroMascota";
    }
    
    
    
    public void refrescar(){
        
    }
}
