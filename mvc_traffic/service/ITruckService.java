package mvc_traffic.service;
import java.util.List;
import mvc_traffic.entity.Truck;
public interface ITruckService {
    List<Truck> findAll();
    boolean add(Truck truck);
    Truck findById(int controlPlate);
    boolean update(int controlPlate);
    boolean delete(int controlPlate);

}
