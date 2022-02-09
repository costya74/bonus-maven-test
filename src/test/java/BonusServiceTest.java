import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusOverOverLimitForIsRegistered() {
        BonusService service = new BonusService();

        long expected = 500;

        int result = service.calculate(true, 1_000_000);
        assertEquals(expected, result);

    }

    @Test
    void bonusBeLowLimitForIsRegistered() {
        BonusService service = new BonusService();

        long expected = 30;

        long result = service.calculate(true, 1000);
        assertEquals(expected, result);

    }

    @Test
    void bonusOverOverLimitForUnRegistered() {
        BonusService service = new BonusService();

        long expected = 500;

        int result = service.calculate(false, 1_000_000);
        assertEquals(expected, result);

    }

    @Test
    void bonusBeLowLimitForUnRegistered() {
        BonusService service = new BonusService();

        long expected = 10;

        long result = service.calculate(false, 1000);
        assertEquals(expected, result);

    }
}
