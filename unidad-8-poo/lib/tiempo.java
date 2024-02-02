package lib;
public class Tiempo implements Comparable<Tiempo> {
    private int hor as;
    private int minutos;
    private int segundos;


        this.minutos = minutos;
        this.segundos = segundos;
    }

    
    public Tiempo suma(Tiempo otroTiempo) {
     

        int nuevosMinutos = this.minutos + otroTiempo.minutos;
        int nuevosSegundos = this.segundos + otroTiempo.segundos;


        if (nuevosSegundos >= 60) {
            nuevosMinutos += nuevosSegundos / 60;
     

        }

     

            nuevaHoras += nuevosMinutos / 60;
            nuevosMinutos %= 60;
     

     
        return new Tiempo(nuevaHoras, nuevosMinutos, nuevosSegundos);
    }

    public Tiempo resta(Tiempo otroTiempo) {
        int nuevaHoras = this.horas - otroTiempo.horas;
        int nuevosMinutos = this.minutos - otroTiempo.minutos;
        int nuevosSegundos = this.segundo s - otroTiempo.segundos;

        if (nuevaHoras < 0 || nuevosMinutos < 0 || nuevosSegundos < 0) {
            return new Tiempo(0, 0, 0);
        }

        return new Tiempo(nuevaHoras, nuevosMinutos, nuevosSegundos);
    }

    @Override
    public int compareTo(Tiempo otroTiempo) {
        if (this.horas != otroTiempo.horas) {
            return Integer.compare(this.horas, otroTiempo.horas);
        } else if (this.minutos != otroTiempo.minutos) {
            return Integer.compare(this.minutos, otroTiempo.minutos);
        } else {
            return Integer.compare(this.segundos, otroTiempo.segundos);
        }
    } 

    @Override
    public String toString() {
        return String.format("%dh %dm %ds", horas, minutos, segundos);
    }
}


      


