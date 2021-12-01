package champollion;

public class ServicePrevu {
	
    private int volumeCM;
    private int volumeTD;
    private int volumeTP;
    private UE ue;
    double getVolumeTP;
    Enseignant e;
    
        public ServicePrevu ( UE ue, Enseignant e, int volumeCM, int volumeTD, int volumeTP) {
            this.ue = ue;
            this.e = e;
            this.volumeCM = volumeCM;
            this.volumeTD = volumeTD;
            this.volumeTP = volumeTP;
        }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUe() {
        return ue;
    }

   
    }
    

     }
