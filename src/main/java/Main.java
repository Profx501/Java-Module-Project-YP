import java.util.Scanner;

public class Main {

    private static final Race RACE = new Race();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MIN_SPEED = 0;
    private static final int MAX_SPEED = 250;
    private static final int COUNT_CAR = 4;

    public static void main(String[] args) {
        addCar();
        System.out.printf("— Самая быстрая машина: %s", RACE.getWinner());
        SCANNER.close();
    }

    private static void addCar() {
        for (int i = 1; i < COUNT_CAR; i++) {
            String carName = getInputCarName(i);
            int carSpeed = getInputCarSpeed(i);
            RACE.calculateRaceLeader(new Car(carName, carSpeed));
        }
    }


    private static String getInputCarName(int carNumber) {
        System.out.printf("— Введите название машины №%d:\n", carNumber);
        return SCANNER.next();
    }

    private static int getInputCarSpeed(int carNumber) {
        int carSpeed;
        while (true) {
            System.out.printf("— Введите скорость машины №%d:\n", carNumber);
            if (SCANNER.hasNextInt()) {
                carSpeed = SCANNER.nextInt();
                if (isValidSpeed(carSpeed)) {
                    return carSpeed;
                } else {
                    System.out.println("— Скрость должна быть в диапазоне от 0 до 250!");
                }
            } else {
                System.out.println("— Скрость должна быть целым числом!");
                SCANNER.next();
            }
        }
    }


    private static boolean isValidSpeed(int carSpeed) {
        return carSpeed > MIN_SPEED && carSpeed <= MAX_SPEED;
    }
}