import static java.lang.System.out;

/**
 * Created by lenovo on 8/23/2023.
 */
public class Mashin {

        //Dade

        boolean AyaDarbazAst;
        boolean AyaRoshanAst;
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
            AyaRoshanAst = true;
        }

        void Xamoosh() {

            AyaRoshanAst = false;
        }

        void BazKardaneDar() {
            AyaDarbazAst = true;
        }


        void BastaneDar() {
            AyaDarbazAst = false;
        }


        boolean Aya_dar_hale_harekat_ast() {
            //Mashin daresh bayad baste bashe va roshan bashe
            if (!AyaDarbazAst && AyaRoshanAst) {
                return true;
            } else {
                return false;
            }

        }
    }



