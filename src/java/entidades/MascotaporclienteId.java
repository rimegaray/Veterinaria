package entidades;
// Generated 24/06/2019 09:48:14 AM by Hibernate Tools 4.3.1



/**
 * MascotaporclienteId generated by hbm2java
 */
public class MascotaporclienteId  implements java.io.Serializable {


     private int mascotaIdMascota;
     private int clienteIdCliente;

    public MascotaporclienteId() {
    }

    public MascotaporclienteId(int mascotaIdMascota, int clienteIdCliente) {
       this.mascotaIdMascota = mascotaIdMascota;
       this.clienteIdCliente = clienteIdCliente;
    }
   
    public int getMascotaIdMascota() {
        return this.mascotaIdMascota;
    }
    
    public void setMascotaIdMascota(int mascotaIdMascota) {
        this.mascotaIdMascota = mascotaIdMascota;
    }
    public int getClienteIdCliente() {
        return this.clienteIdCliente;
    }
    
    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MascotaporclienteId) ) return false;
		 MascotaporclienteId castOther = ( MascotaporclienteId ) other; 
         
		 return (this.getMascotaIdMascota()==castOther.getMascotaIdMascota())
 && (this.getClienteIdCliente()==castOther.getClienteIdCliente());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMascotaIdMascota();
         result = 37 * result + this.getClienteIdCliente();
         return result;
   }   


}


