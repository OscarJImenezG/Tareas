package TableMVS2208;

public class Videojuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoEnGB;
    private String plataforma;
    private String desarrollador;

    public Videojuego() {
    }

    public Videojuego(int id, String nombre, String genero, double pesoEnGB, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoEnGB = pesoEnGB;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the pesoEnGB
     */
    public double getPesoEnGB() {
        return pesoEnGB;
    }

    /**
     * @param pesoEnGB the pesoEnGB to set
     */
    public void setPesoEnGB(double pesoEnGB) {
        this.pesoEnGB = pesoEnGB;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the desarrollador
     */
    public String getDesarrollador() {
        return desarrollador;
    }

    /**
     * @param desarrollador the desarrollador to set
     */
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    
    
}
