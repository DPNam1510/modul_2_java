package mvc_traffic.service;

import java.util.List;

import mvc_traffic.entity.Truck;
import mvc_traffic.repository.TruckRepository;
import mvc_traffic.repository.ITruckRepository;

public class TruckService implements ITruckService {
    private  ITruckRepository truckRepository=new TruckRepository();
    @Override
    public List<Truck> findAll() {
        return truckRepository.findAll();
    }
    @Override
    public boolean add(Truck truck) {
        List<Truck> truckList=truckRepository.findAll();
        for(int i=0;i<truckList.size();i++){
            if(truckList.get(i)!= null){
                if(truckList.get(i).getControlPlate()==truck.getControlPlate()){
                    System.out.println("Truck already exist");
                    return false;
                }
            }
        }
        return truckRepository.add(truck);
    }
    @Override
    public Truck findById(int controlPlate) {
        return truckRepository.findById(controlPlate);
    }
    @Override
    public boolean update(int controlPlate) {
        return truckRepository.update(controlPlate);
    }
    @Override
    public boolean delete(int controlPlate) {
        return truckRepository.delete(controlPlate);
    }

}

