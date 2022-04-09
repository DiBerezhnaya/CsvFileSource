package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    private String testName;

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String testName, long amount, boolean registered, long expected) {
       this.testName = testName;
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}