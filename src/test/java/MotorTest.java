import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by lenovo on 8/24/2023.
 */
public class MotorTest {
    @Test
    void Motor_bayad_harekat_konad_vaqti_roshan_ast() {
        //given
        Motor motor = new Motor("beneli");

        //when
        motor.Roshan();
        boolean AyaHarekatMikonad = motor.Aya_dar_hale_harekat_ast();

        //then
        assertTrue(AyaHarekatMikonad);

    }
}
