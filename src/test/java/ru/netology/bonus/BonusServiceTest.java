package ru.netology.bonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusOverOverLimitForIsRegistered() {
        BonusService service = new BonusService();

        long expected = 500;

        long result = service.calculate(1_000_000_60, true);
        assertEquals(expected, result);

    }

    @Test
    void bonusBeLowLimitForIsRegistered() {
        BonusService service = new BonusService();

        long expected = 30;

        long result = service.calculate(1000_60, true);
        assertEquals(expected, result);

    }

    @Test
    void bonusOverOverLimitForUnRegistered() {
        BonusService service = new BonusService();

        long expected = 500;

        long result = service.calculate(1_000_000_60, false);
        assertEquals(expected, result);

    }

    @Test
    void bonusBeLowLimitForUnRegistered() {
        BonusService service = new BonusService();

        long expected = 10;

        long result = service.calculate(1000_60, false);
        assertEquals(expected, result);

    }
}

