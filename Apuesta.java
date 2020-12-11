public class Apuesta {

    private int apuesta;
    private char apostado;
    private int idApuesta;
    private static int contApuesta; //static porq es compartida
    private int ganado; //-1 es ha perdido, 0 empate, 1 ganado 2 no se sabe



    public Apuesta(){
        contApuesta++;
        this.apuesta=0;
        this.apostado=' ';
        idApuesta=contApuesta;
        ganado=2;


    }

    public Apuesta(int apuesta, char apostado) {
        contApuesta++;
        this.apuesta=apuesta;
        this.apostado=apostado;
        idApuesta=contApuesta;
        ganado=2;



    }



    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public char getApostado() {
        return apostado;
    }

    public void setApostado(char apostado) {
        this.apostado = apostado;
    }

    public int getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(int idApuesta) {
        this.idApuesta = idApuesta;
    }

    public int getContApuesta() {
        return contApuesta;
    }

    public void setContApuesta(int contApuesta) {
        this.contApuesta = contApuesta;
    }

    public int isGanado() {
        return ganado;
    }

    public void setGanado(int  ganado) {
        this.ganado = ganado;
    }



}



