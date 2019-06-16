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
        mascota = new Mascota();
    }
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        boolean respuesta = dao.guardarMascota(mascota);
        if(respuesta){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "asdsd", "qweqwe"));
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
    
    public String limpiar(){
        return "/RegistroMascota";
    }
    
    public String eliminar(){
        
        return "/RegistroMascota";
    }
    
    public void refrescar(){
        
    }
}
