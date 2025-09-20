package mvc_traffic.repository;

import mvc_traffic.entity.Truck;
import mvc_traffic.util.ReadAndWriteFile;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TruckRepository implements ITruckRepository {
    private final String TRUCK_FILE = "src/mvc_traffic/data/truck.csv";


    @Override
    public List<Truck> findAll() {
        List<Truck> truckList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readListStringFromCSV(TRUCK_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Truck truck = new Truck(Integer.parseInt(array[0])
                        , array[1], Integer.parseInt(array[2])
                        ,array[3],Integer.parseInt(array[4]));
                truckList.add(truck);
            }
        } catch (IOException e) {
            System.out.println("Error reading truck file");
        }
        return truckList;
    }

    @Override
    public boolean add(Truck truck) {
      List<String> truckList = new ArrayList<>();
      truckList.add(truck.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(TRUCK_FILE,truckList,true);
        } catch (IOException e) {
            System.out.println("Error writing truck file");
            return false;
        }
        return true;
    }

    @Override
    public Truck findById(int controlPlate) {
        List<Truck> truckList = this.findAll();
        for (Truck truck : truckList) {
            if (truck.getControlPlate() == controlPlate) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public boolean update(int controlPlate) {
        List<Truck> truckList = this.findAll();
        boolean result = false;
        for(int i = 0; i < truckList.size(); i++) {
            if(truckList.get(i).getControlPlate() == controlPlate) {
                truckList.set(i, truckList.get(i));
                result = true;
                break;
            }
        }
        if(result) {
            List<String> stringList = new ArrayList<>();
            for(int i = 0; i < truckList.size(); i++) {
                stringList.add(truckList.get(i).getInfoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(TRUCK_FILE,stringList,false);
            } catch (IOException e) {
                System.out.println("Error writing truck file");
            }
        }
        return result;
    }

    @Override
    public boolean delete(int controlPlate) {
        List<Truck> truckList = this.findAll();
        boolean result = false;
        for(int i = 0; i < truckList.size(); i++) {
            if(truckList.get(i).getControlPlate() == controlPlate) {
                truckList.remove(i);
                result = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < truckList.size(); i++) {
            stringList.add(truckList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(TRUCK_FILE,stringList,false);
        } catch (IOException e) {
            System.out.println("Error writing truck file");
        }
        return result;
    }
}
