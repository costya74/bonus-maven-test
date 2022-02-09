public class BonusService {
    public int calculate(boolean isRegistered, int amount) {
        int percent = isRegistered ? 3 : 1;
        int bonus = amount * percent / 100;
        int limit =500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;

    }

}
