
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {
    @Test
    void Mashin_bayad_harekat_konad_vaqti_dar_baste_ast_va_mashin_roshan_ast() {
        //given
        Mashin benz = new Mashin("Benz");

        //when
        boolean AyaHarekatMikonad = benz.Aya_dar_hale_harekat_ast();

        //then
        Assertions.assertFalse(AyaHarekatMikonad);
        System.out.println("-------------------------------");
        //given
        Mashin volvo = new Mashin("Volvo");

        //when
        volvo.Roshan();
        boolean AyaVolvoHarekatmikonad = volvo.Aya_dar_hale_harekat_ast();

        //then
        Assertions.assertTrue(AyaVolvoHarekatmikonad);


    }
}


