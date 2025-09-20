package mvc_traffic.repository;
import java.util.List;
import mvc_traffic.entity.Car;
public interface ICarRepository {
    List<Car>  findAll();
    boolean add(Car car);
    Car findById(int controlPlate);
    boolean update(int  controlPlate);
    boolean delete(int controlPlate);
}
