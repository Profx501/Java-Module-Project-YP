public class Race {

    private String winner;
    private int distance;


    public void calculateRaceLeader(Car car) {
        int currentDistance = 24 * car.getSpeed();
        if (currentDistance > distance) {
            winner = car.getName();
            distance = currentDistance;
        }
    }

    public String getWinner() {
        return winner;
    }
}
