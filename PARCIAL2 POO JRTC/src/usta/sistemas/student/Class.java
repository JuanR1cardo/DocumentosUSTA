package usta.sistemas.student;

public class Class {
    private Integer id;
    private Integer codigo;
    private String nombre;
    private String apellido;
    private Integer cumpleaños;
    private String fechaentrada;
    private Integer semestre;
    private String facultad;

    public Class () {}

    public Class (Integer id, Integer codigo, String nombre, String apellido, Integer cumpleaños, String fechaentrada,
                  Integer semestre, String facultad) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleaños = cumpleaños;
        this.fechaentrada = fechaentrada;
        this.semestre = semestre;
        this.facultad = facultad;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setCumpleaños(Integer cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    public Integer getCumpleaños() {
        return cumpleaños;
    }
    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }
    public String getFechaentrada() {
        return fechaentrada;
    }
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    public Integer getSemestre() {
        return semestre;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getFacultad() {
        return facultad;
    }

    private Integer getEdad () {
        return 2020 - getCumpleaños();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cumpleaños='" + cumpleaños + '\'' +
                ", fechaentrada='" + fechaentrada + '\'' +
                ", semestre=" + semestre +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}
