package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int i;
        int ns = 10;
        int ch = 0;
        int qntdt = 0;
while(ch != 10 && qntdt < 16){
    
            ch = InOut.leInt("chute algum numero: ");
            qntdt = qntdt + 1;
            if(qntdt >= 2 && qntdt <= 4){
                 InOut.MsgDeAviso("dica", "chute entre 1 e 10");
                

            if (ch == ns) {

                InOut.MsgDeInformacao("R", "você acertou o numero");
                InOut.MsgDeAviso("qnt de tentativas", qntdt + " tentativas" );
             
            } else {

                InOut.MsgDeErro("resultado", "você errou o numero");
            }
        }
    }
}
}