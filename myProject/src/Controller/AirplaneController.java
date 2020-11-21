package Controller;

import com.company.Airplane;
import com.company.Airport;
import com.company.Meteorological;

public class AirplaneController extends AbstractFacade<Airplane> {

    public AirplaneController() {
        data = new Airplane[3];
    }

    //Own methods
    public boolean save(int id, String countryOfOrigin, int passengers, Meteorological meteorological){
        try{
            if(findOne(id) == null ){
                Airplane newAirplane = new Airport( id,countryOfOrigin,passengers, meteorological);
                data[id] = newAirplane;

            }else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String countryOfOrigin, int passengers, Meteorological meteorological){
        try {
            if(findOne(id) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            //Another option
            /*Owner currentOwner = findOne(id);
            currentOwner.setName(name);
            currentOwner.setNit(nit);
            owners[id] = currentOwner;*/

            //Optimal option
            data[id].setCountryOfOrigin(countryOfOrigin);
            data[id].setPassengers(passengers);
            data[id].setMeteorological(meteorological);

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}

