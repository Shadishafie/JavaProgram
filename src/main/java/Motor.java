/**
 * Created by lenovo on 8/24/2023.
 */
public class Motor {
    //variables
    boolean ayaRoshanAst;
    String mark;

    //methods

    void Roshan (){
        ayaRoshanAst=true;
    }
    void Xamoosh (){
        ayaRoshanAst=false;
    }

    public boolean Aya_dar_hale_harekat_ast () {

            return ayaRoshanAst;
        }


    //constructors
   Motor (String mark){
    this.mark=mark;
    }


}

