public class Car {
    public int speed;
    public int gear;

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public int upGear() {
        if (gear < 6 && gear >= 0) {
            speed += 40;
            return gear += 1;
        } else if (gear == 6) {
            return speed += 20;
        }
        return speed;
    }

    public int downGear() {
        if (gear > 0) {
            speed -= 40;
            return gear -= 1;
        } else if (gear == 0) {
            return speed -= 20;
        }
        return speed;
    }

    public void showStatus(String str) {
        if (str.equals("up")) {
            upGear();
            System.out.println("fast" + gear + "\n" + speed);
        } else if (str.equals("down")) {
            downGear();
            System.out.println("slow" + gear + "\n" + speed);
        } else
            System.err.println("Not thing");
    }
}
