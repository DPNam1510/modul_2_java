package mvc_traffic.service;

import mvc_traffic.entity.Car;
import mvc_traffic.repository.ICarRepository;
import mvc_traffic.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    private final ICarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
       List<Car> carList = carRepository.findAll();
       for (int i = 0; i < carList.size(); i++){
           if(carList.get(i)!=null){
               if(carList.get(i).getControlPlate()==car.getControlPlate()){
                   System.out.println("Car already exists");
                   return false;
               }
           }else {
               break;
           }
       }
       return carRepository.add(car);
    }

    @Override
    public Car findById(int controlPlate) {
        return carRepository.findById(controlPlate);
    }
    @Override
    public boolean update(int  controlPlate) {
        return carRepository.update(controlPlate);
    }

    @Override
    public boolean delete(int controlPlate) {
        return carRepository.delete(controlPlate);
    }
}
