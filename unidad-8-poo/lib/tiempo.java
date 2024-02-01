package lib;

public class tiempo{
    private int horas;
    private int minutos;
    private int segundos;


    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public tiempo suma(tiempo otroTiempo){
        int totalHoras = this.horas + otroTiempo.horas;
        int totalMinutos = this.minutos + otroTiempo.minutos;
        int totalSegundos = this.segundos + otroTiempo.segundos;

        if (totalSegundos >= 60) {
            totalMinutos += totalSegundos / 60;
            totalSegundos %= 60;
        }

        if (totalMinutos >= 60) {
            totalHoras += totalMinutos / 60;
            totalMinutos %= 60;
        }

        return new tiempo(totalHoras, totalMinutos, totalSegundos);
    }

    public tiempo resta(tiempo otroTiempo){
        int totalHoras = this.horas - otroTiempo.horas;
        int totalMinutos = this.minutos - otroTiempo.minutos;
        int totalSegundos = this.segundos - otroTiempo.segundos;

        if (totalHoras < 0 || totalMinutos < 0 || totalSegundos < 0) {
            return new tiempo(0, 0, 0);
        }

        return new tiempo(totalHoras, totalMinutos, totalSegundos);
    }
    public int compare(tiempo otroTiempo){
        if (this.horas != otroTiempo.horas){
            return Integer.compare(this.horas, otroTiempo.horas);

        } else if (this.minutos != otroTiempo.minutos) {
            return Integer.compare(this.minutos, otroTiempo.minutos);

        } else {
            return Integer.compare(this.segundos, otroTiempo.segundos);
        }
    }
    


    

    }   





    



