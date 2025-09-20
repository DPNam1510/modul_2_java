package mvc_traffic.service;

import mvc_traffic.entity.Motor;
import mvc_traffic.repository.IMotorRepository;
import mvc_traffic.repository.MotorRepository;

import java.util.List;

public class MotorService implements IMotorService {
    private IMotorRepository motorRepository = new MotorRepository();

    @Override
    public List<Motor> findAll() {
        return motorRepository.findAll();
    }

    @Override
    public boolean add(Motor motor) {
        List<Motor> motorList = motorRepository.findAll();
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i) != null) {
                if (motorList.get(i).getControlPlate() == motor.getControlPlate()) {
                    System.out.println("Motor already exists");
                    return false;
                }
            } else {
                break;
            }
        }
        return motorRepository.add(motor);
    }

    @Override
    public Motor findById(int controlPlate) {
        return motorRepository.findById(controlPlate);
    }

    @Override
    public boolean update(int controlPlate) {
        return motorRepository.update(controlPlate);
    }

    @Override
    public boolean delete(int controlPlate) {
        return motorRepository.delete(controlPlate);
    }

}
