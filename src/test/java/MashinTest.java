import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static java.lang.System.setOut;

/**
 * Created by lenovo on 8/22/2023.
 */
public class MashinTest {
    @Test
    void Mashin_bayad_harekat_konad_vaqti_dar_baste_ast_va_mashin_roshan_ast() {
        //given
        Mashin benz = new Mashin("Benz");

        //when
        boolean AyaHarekatMikonad = benz.Aya_Mashin_dar_hale_harekat_ast();

        //then
        Assertions.assertFalse(AyaHarekatMikonad);
        System.out.println("-------------------------------");
        //given
        Mashin volvo = new Mashin("Volvo");

        //when
        volvo.Roshan();
        boolean AyaVolvoHarekatmikonad = volvo.Aya_Mashin_dar_hale_harekat_ast();

        //then
        Assertions.assertTrue(AyaVolvoHarekatmikonad);






    }
        //object mashin bedoone esm
//        Mashin mashin = new Mashin();
//        mashin.BazKardaneDar();
//        mashin.BastaneDar();
//        System.out.println("Aya dar e mashin baz ast? " + mashin.AyaDarMashinbazAst);
//        mashin.HarekatKon();
//        System.out.println("-----------------------------------");
//        //2 aval cons saxt baad object ezafe kard
//        Mashin pride = new Mashin("Pride");
//        pride.BazKardaneDar();
//        pride.Roshan();
//        pride.HarekatKon();
//    }

        class Mashin {
            //Dade

            boolean AyaDarMashinbazAst;
            boolean AyaMashinRoshanAst;
            String mark;

            //constructor
            Mashin() {
                System.out.println("yek mashin bedoone dade saxte shod");
            }

            //1
            Mashin(String mark) {
                this.mark = mark;
                System.out.println("yek Mashin " + this.mark + " saxte shod");
            }

            //method
            void Roshan() {
                out.println("Mashin Roshan Ast");
                AyaMashinRoshanAst = true;
            }

            void Xamoosh() {
                out.println("Mashin Xamoosh Ast");
                AyaMashinRoshanAst = false;
            }

            void BazKardaneDar() {
                out.println("Dar baz Ast");
                AyaDarMashinbazAst = true;
            }


            void BastaneDar() {
                out.println("Dar Baste  Ast");
                AyaDarMashinbazAst = false;
            }

            boolean Aya_Mashin_dar_hale_harekat_ast() {
                //Mashin daresh bayad baste bashe va roshan bashe
                if (!AyaDarMashinbazAst && AyaMashinRoshanAst) {
                    out.println("HarekatKon");
                    return true;
                } else {
                    out.println("HarekatNakon");
                    return false;
                }

            }

        }
    }

