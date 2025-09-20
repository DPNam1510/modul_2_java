package mvc_traffic.repository;

import mvc_traffic.entity.Motor;
import java.util.List;

public interface IMotorRepository {
    List<Motor> findAll();
    boolean add(Motor motor);
    Motor findById(int controlPlate);
    boolean update(int controlPlate);
    boolean delete(int controlPlate);

}
