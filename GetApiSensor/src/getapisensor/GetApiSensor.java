/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getapisensor;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;



/**
 *
 * @author sergio
 */
public class GetApiSensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Sensor> sensor1 = RestApi.consultarWebServiceSensor(1,0);        
        List<Sensor> sensor2 = RestApi.consultarWebServiceSensor(2,0);
        List<Sensor> sensor3 = RestApi.consultarWebServiceSensor(2,0);
        
        for(int i = 0; i< sensor1.size(); i++){
            String []arreglo = {
                                sensor1.get(i).getId_wasp(),
                                sensor1.get(i).getSensor(),
                                sensor1.get(i).getValue(),
                                sensor1.get(i).getTimestamp()
                               };
            
            
            System.out.println(arreglo[0]);
            System.out.println(arreglo[1]);
            System.out.println(arreglo[2]);
            System.out.println(arreglo[3]);
            
            break;
        }
        
        
        
        // insertar valor predicho
        
        if(RestApi.insertarPrediccion("O3", "324.2", "MALA", "30/JUNIO/2016", "1")){
            System.out.println("Insertado");
        }
        else{
            System.err.println("error");
        }
    }
    
}
