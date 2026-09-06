public class Race {

    private String winner;
    private int distance;

    private static final int RACE_DURATION_HOURS = 24;


    public void calculateRaceLeader(Car car) {
        int currentDistance = RACE_DURATION_HOURS * car.getSpeed();
        if (currentDistance > distance) {
            winner = car.getName();
            distance = currentDistance;
        }
    }

    public String getWinner() {
        return winner;
    }
}
