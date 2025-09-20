package mvc_traffic.service;

import mvc_traffic.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    boolean add(Car car);
    Car findById(int controlPlate);
    boolean update(int  controlPlate);
    boolean delete(int controlPlate);
}

