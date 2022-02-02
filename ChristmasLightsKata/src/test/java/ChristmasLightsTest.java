import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class ChristmasLightsTest {

    ChristmasLights christmasLights = new ChristmasLights();

    @AfterEach
    void afterEach() {
        System.out.println(christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_on_lights_from_0_0_to_2_2() {
        christmasLights.turnOnLights(0,0,2,2);
        assertEquals(expectedLightsAfterTurnOn(0,0,2,2),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_on_lights_from_0_0_to_999_999() {
        christmasLights.turnOnLights(0,0,999,999);
        assertEquals(expectedLightsAfterTurnOn(0,0,999,999),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_toggle_lights_from_0_0_to_999_0() {
        christmasLights.turnOnAllLights();
        christmasLights.toggleLights(0,0,999,0);
        assertEquals(expectedLightsAfterTurnOn(0,0,999,0),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_off_lights_from_499_499_to_500_500() {
        christmasLights.turnOnAllLights();
        christmasLights.turnOffLights(499,499,500,500);
        assertEquals(expectedLightsAfterTurnOff(499,499,500,500),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_on_lights_from_887_9_to_959_629() {
        christmasLights.turnOnLights(887,9,959,629);
        assertEquals(expectedLightsAfterTurnOn(887,9,959,629),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_on_lights_from_454_398_to_844_448() {
        christmasLights.turnOnLights(454,398,844,448);
        assertEquals(expectedLightsAfterTurnOn(454,398,844,448),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_off_lights_from_539_243_to_559_965() {
        christmasLights.turnOnAllLights();
        christmasLights.turnOffLights(539, 243, 559,965);
        assertEquals(expectedLightsAfterTurnOff(539, 243, 559,965),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_off_lights_from_370_819_to_676_868() {
        christmasLights.turnOnAllLights();
        christmasLights.turnOffLights(370,819 , 676,868);
        assertEquals(expectedLightsAfterTurnOff(370,819 , 676,868),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_off_lights_from_145_40_to_370_997() {
        christmasLights.turnOnAllLights();
        christmasLights.turnOffLights(145,40,370,997);
        assertEquals(expectedLightsAfterTurnOff(145,40,370,997),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_off_lights_from_301_3_to_808_453() {
        christmasLights.turnOnAllLights();
        christmasLights.turnOffLights(301,3,808,453);
        assertEquals(expectedLightsAfterTurnOff(301,3,808,453),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_turn_on_lights_from_351_678_to_951_908() {
        christmasLights.turnOnLights(351,678,951,908);
        assertEquals(expectedLightsAfterTurnOn(351,678,951,908),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_toggle_lights_from_720_196_to_897_994() {
        christmasLights.turnOnAllLights();
        christmasLights.toggleLights(720,196,897,994);
        assertEquals(expectedLightsAfterTurnOn(720,196,897,994),
                christmasLights.calculateLittedLights());
    }

    @Test
    void test_toggle_lights_from_831_394_to_904_860() {
        christmasLights.turnOnAllLights();
        christmasLights.toggleLights(831,394, 904,860);
        assertEquals(expectedLightsAfterTurnOn(831,394, 904,860),
                christmasLights.calculateLittedLights());
    }

    int expectedLightsAfterTurnOn(int x1, int y1, int x2, int y2) {
        return (x2 + 1 - x1) * (y2 + 1 - y1);
    }

    int expectedLightsAfterTurnOff(int x1, int y1, int x2, int y2) {
        return (int) Math.pow(1000, 2) - (x2 + 1 - x1) * (y2 + 1 - y1);
    }
}
