package mvc_traffic.repository;

import mvc_traffic.entity.Car;
import mvc_traffic.util.ReadAndWriteFile;

import java.io.IOException;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final String CAR_FILE= "src/mvc_traffic/data/car.csv";

    @Override
    public List<Car> findAll() {
        List<Car> carList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readListStringFromCSV(CAR_FILE);
            String[] array = null;
            for(int i=0;i<stringList.size();i++){
                array = stringList.get(i).split(",");
                Car car = new Car(Integer.parseInt(array[0])
                        ,array[1],Integer.parseInt(array[2])
                        ,array[3],Integer.parseInt(array[4]),array[5]);
                carList.add(car);
            }

        } catch (IOException e) {
            System.err.println("Error reading car file");
        }
        return carList;
    }

    @Override
    public boolean add(Car car) {
        List<String> carList = new ArrayList<>();
        carList.add(car.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(CAR_FILE,carList,true);

        } catch (IOException e) {
            System.err.println("Error writing car file");
            return false;
        }
        return true;
    }

    @Override
    public Car findById(int controlPlate) {
       List<Car> carList = findAll();
       for (Car car : carList) {
           if(car.getControlPlate()==controlPlate){
               return car;
           }
       }
       return null;
    }

    @Override
    public boolean update(int controlPlate) {
        List<Car> carList = findAll();
        boolean result = false;
        for (int i = 0; i < carList.size(); i++) {
                if (carList.get(i).getControlPlate() == controlPlate) {
                    carList.set(i, carList.get(i));
                    result = true;
                    break;
                }
        }
        if (result) {
            List<String> stringList =new ArrayList<>();
            for (int i = 0; i < carList.size(); i++) {
                stringList.add(carList.get(i).getInfoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(CAR_FILE,stringList,false);
            } catch (IOException e) {
                System.err.println("Error writing car file");
            }
        }
        return result;
    }

    @Override
    public boolean delete(int controlPlate) {
        List<Car> carList = findAll();
        boolean result = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getControlPlate() == controlPlate) {
                carList.remove(i);
                result = true;
                break;
            }
        }
        List<String> stringList =new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            stringList.add(carList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(CAR_FILE,stringList,false);
        } catch (IOException e) {
            System.err.println("Error writing car file");
        }
        return result;
    }
}
