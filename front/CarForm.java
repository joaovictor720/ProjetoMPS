package front;

import control.*;
import model.*;
import java.util.Scanner;
import exceptions.*;

public class CarForm {
    private CarController carController = carController.getInstance();
    private Car car = new Car();
    private String string;
    private Scanner read = new Scanner(System.in);

    public void registrationMenu() {
        System.out.println("Modelo: ");
        string = read.nextLine();
        car.setModel(string);

        System.out.println("Cor: ");
        string = read.nextLine();
        car.setColor(string);

        System.out.println("Placa: ");
        string = read.nextLine();
        car.setPlate(string);

        System.out.println("Renavam: ");
        string = read.nextLine();
        car.setRenavam(string);

        try {
            carController.addCar(car);
        } catch (CarDataException exc) {
            exc.warning();
        }

    }

    public void deleteMenu() {
        System.out.println("Login: ");
        string = read.nextLine();
        carController.deleteCar(string);
    }

    public void menu() {
        int action;

        System.out.println("1 - Add Car");
        System.out.println("2 - Delete Car");

        action = read.nextInt();

        switch (action) {
            case 1:
                registrationMenu();
                break;

            case 2:
                deleteMenu();
                break;
        }
    }

}
