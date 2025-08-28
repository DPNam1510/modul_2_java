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
        motorRepository.add(motor);
        return true;
    }

    @Override
    public Motor findById(int controlPlate) {
        return motorRepository.findById(controlPlate);
    }

    @Override
    public boolean update(int  controlPlate, Motor motor) {
        return motorRepository.update(controlPlate, motor);
    }

    @Override
    public Motor delete(int controlPlate) {
        return motorRepository.delete(controlPlate);
    }

}
