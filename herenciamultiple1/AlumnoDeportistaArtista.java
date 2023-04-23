package mx.unam.Poo.herenciamultiple1;

public class AlumnoDeportistaArtista extends Alumno implements Deportista, Artista {

    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(int idActividadesExtra, String deporte, String arte) {
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public AlumnoDeportistaArtista(int idActividadesExtra, String deporte, String arte, String nombre, int edad) {
        super(nombre, edad);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public AlumnoDeportistaArtista(int idActividadesExtra, String deporte, String arte, int numeroCuenta, String carrera, double promedio, String nombre, int edad) {
        super(numeroCuenta, carrera, promedio, nombre, edad);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString()
                + " AlumnoDeportistaArtista{" + "idActividadesExtra=" + idActividadesExtra + ", deporte=" + deporte + ", arte=" + arte + '}';
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando " + this.deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en competencia del deporte " + this.deporte);
        return true;
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println(getNombre() + " esta ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " esta presentando su obra");
        return true;
    }

    public static void main(String args[]) {
        AlumnoDeportistaArtista Alumno1 = new AlumnoDeportistaArtista(20456, "Basquetbol", "Oleo", 71012108, "ICO", 8.0, "Oscar", 18);
        System.out.println(Alumno1);
        Alumno1.ensayar("Acuarela");
        Alumno1.entrenar();
        Alumno1.presentarCompetencia("Naucalli");
        AlumnoDeportistaArtista Alumno2 = new AlumnoDeportistaArtista(20559, "Futbol", "Escultura", 72012109, "ICI", 9, "Juan", 22);
        Alumno2.entrenar();
        Alumno2.presentarCompetencia("CU");
        System.out.println(Alumno2);
    }
}
