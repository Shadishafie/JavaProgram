import static java.lang.System.out;

/**
 * Created by lenovo on 8/22/2023.
 */
public class MashinTest {

    class Mashin {
   //Dade

        boolean AyaDarMashinbazAst;
        boolean AyaMashinRoshanAst;
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

        void HarekatKon() {
            //Mashin daresh bayad baste bashe va roshan bashe
            if (!AyaDarMashinbazAst && AyaMashinRoshanAst) {
                out.println("HarekatKon");

            } else {
                out.println("HarekatNakon");
            }

        }

    }
}

