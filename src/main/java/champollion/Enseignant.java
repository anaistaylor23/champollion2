package champollion;

import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personne {

    private List <ServicePrevu> sp = new ArrayList<ServicePrevu>();

    public Enseignant(String nom, String email) {
        super(nom, email);
       
    }

  
    public int heuresPrevues() {
        int heuretot = 0;
        for (ServicePrevu sp : sp ) {
            heuretot = (int)(heuretot + 1.5 * sp.getVolumeCm() + sp.getVolumeTD()+ sp.getVolumeTP*0.75);
        }
        return heuretot;
        
    }


   
    public int heuresPrevuesPourUE(UE ue) {
        int heureptot = 0;
        for (ServicePrevu sp : sp ){
            if(ue == sp.getUe())
            heureptot = (int) (heureptot + 1.5 * sp.getVolumeCM() + sp.getVolumeTD()+ sp.getVolumeTP*0.75);
        }
        return heureptot;
    }

   
    
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        
        ServicePrevu s = new ServicePrevu(ue, this, volumeCM, volumeTD, volumeTP);
        sp.add(s);
    }

}
