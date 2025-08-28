package mvc_traffic.repository;

import mvc_traffic.entity.Motor;

import java.util.List;
import java.util.ArrayList;

public class MotorRepository implements IMotorRepository {
    private static List<Motor> motors = new ArrayList<>();

    static {
        motors.add(new Motor(1234, "Honda", 2025, "Nam", 125));
        motors.add(new Motor(5678, "Yamaha", 2020, "Vi", 110));
    }

    @Override
    public List<Motor> findAll() {
        return motors;
    }

    @Override
    public boolean add(Motor motor) {
       motors.add(motor);
       return true;
    }


    @Override
    public Motor findById(int controlPlate) {
        for (Motor motor : motors) {
            if (motor.getControlPlate() == controlPlate) {
                return  motor;
            }
        }
        return null;
    }

    @Override
    public boolean update(int  controlPlate, Motor motor) {
        for (int i = 0; i < motors.size(); i++) {
            if (motors.get(i) == null) {
                if (motors.get(i).getControlPlate() == motor.getControlPlate()) {
                    motors.set(i, motor);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Motor delete(int controlPlate) {
        for (int i = 0; i < motors.size(); i++) {
            if (controlPlate == motors.get(i).getControlPlate()) {
                motors.remove(i);
                return motors.get(i);
            }
        }
        return null;
    }
}
