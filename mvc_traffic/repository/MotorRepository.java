package mvc_traffic.repository;

import mvc_traffic.entity.Motor;
import mvc_traffic.util.ReadAndWriteFile;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class MotorRepository implements IMotorRepository {

    private final String MOTOR_FILE = "src/mvc_traffic/data/motor.csv";

    @Override
    public List<Motor> findAll() {
//        code đọc file
        List<Motor> motorList = new LinkedList<>();
        try {
           List<String> stringList = ReadAndWriteFile.readListStringFromCSV(MOTOR_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Motor motor = new Motor(Integer.parseInt(array[0])
                        , array[1], Integer.parseInt(array[2])
                        , array[3], Integer.parseInt(array[4]));
                motorList.add(motor);
            }
        } catch (IOException e) {
            System.err.println("Error reading motor file");
        }
        return motorList;
    }

    @Override
    public boolean add(Motor motor) {

        List<String> motorList = new ArrayList<>();
        motorList.add(motor.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(MOTOR_FILE, motorList, true);
        } catch (IOException e) {
            System.out.println("Write error!");
            return false;
        }
        return true;
    }


    @Override
    public Motor findById(int controlPlate) {
        List<Motor> motorList = findAll();
        for (Motor motor : motorList) {
            if (motor.getControlPlate() == controlPlate) {
                return motor;
            }
        }
        return null;
    }

    @Override
    public boolean update(int controlPlate) {
        List<Motor> motorList = findAll();
        boolean result = false;
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getControlPlate() == controlPlate) {
                motorList.set(i, motorList.get(i));
                result = true;
                break;
            }
        }
        if (result) {
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < motorList.size(); i++) {
                stringList.add(motorList.get(i).getInfoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(MOTOR_FILE, stringList, false);
            } catch (IOException e) {
                System.out.println("Write error!");
            }
        }
        return result;
    }

    @Override
    public boolean delete(int controlPlate) {
        boolean result = false;
        List<Motor> motorList = findAll();
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getControlPlate() == controlPlate) {
                motorList.remove(i);
                result = true;
                break;

            }
        }
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < motorList.size(); i++) {
            stringList.add(motorList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(MOTOR_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Write error!");
        }
        return result;
    }
}
