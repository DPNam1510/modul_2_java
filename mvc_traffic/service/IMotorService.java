package mvc_traffic.service;
import mvc_traffic.entity.Motor;

import java.util.List;

public interface IMotorService {
    List<Motor> findAll();
    boolean add(Motor motor);
    Motor findById(int controlPlate);
    boolean update(int  controlPlate);
    boolean delete(int  controlPlate);
}
