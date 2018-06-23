public class Vector{
    private final String datos[];
    
    public Vector(int elemento,String datos[]){
        this.datos=datos;
    }
  
    //Metodo que muestra los datos    
    public String getdatos(){
        String llenar=""; // Variable que acumulara los datos
        for (String dato : datos) {
            //ciclo que
            llenar = llenar+"\n" + dato;
        }
        return ("Los Datos son:" +llenar);
    }
}