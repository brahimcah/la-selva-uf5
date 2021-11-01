public class Aleatori {
    int num;



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //Clase que genera nº aleatori entra 1 fins el 5
    public int numAleatori() {
        this.num =  (int) (Math.random()*9);
        return this.num;
    }
}
