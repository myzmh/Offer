package Daily;

public class D_1603_ParkingSystem {
    int big,medium,samll;

    public D_1603_ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.samll = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (carType == 3 && samll > 0) {
            samll--;
            return true;
        }
        return false;
    }
}
