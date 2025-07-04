public class Temperaturesensor  implements Sensor{
    private float temeperature;
    public Temperaturesensor(float atemperature){

        temeperature =atemperature;
    }
    @Override
    public float getReading(){
        return temeperature;
    }
    

}
