import usta.sistemas.student.Class;

import java.util.Arrays;

public class Controller {
    public Class[] classes;
    private int id;

    public boolean save(Integer id, Integer codigo, String nombre, String apellido, Integer cumpleaños, String fechaentrada,
                        Integer semestre, String facultad) {
        try {
            if (findOne(id) == null) {
                return true;
            } else {
                System.out.printf("La llave primaria (índice) tiene valor");
                return false;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("No se puede guardar el estudiante porque no hay estructura");
            return false;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No se puede guardar el estudiante porque el máximo permitido es de " +
                    classes.length + " estudiantes");
            return false;
        }
        catch (Exception e) {
            System.err.println("Error al guardar estudiante");
            return false;
        }
    }

    public boolean update(Integer id, Integer codigo, String nombre, String apellido, Integer cumpleaños, String fechaentrada,
                          Integer semestre, String facultad) {
        try {
            if (findOne(id) == null) {
                System.out.printf("La llave primaria (índice) no existe");
                return false;
            } else {
                classes[id].setId(id);
                classes[id].setCodigo(codigo);
                classes[id].setNombre(nombre);
                classes[id].setApellido(apellido);
                classes[id].setCumpleaños(cumpleaños);
                classes[id].setFechaentrada(fechaentrada);
                classes[id].setSemestre(semestre);
                classes[id].setFacultad(facultad);
                return true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("No se puede actualizar el estudiante porque no hay estructura");
            return false;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No se puede actualizar el estudiante porque el máximo permitido es de " +
                    classes.length + " estudiantes");
            return false;
        }
        catch (Exception e) {
            System.err.println("Error al actualizar el estudiante");
            return false;
        }
    }

    public boolean delete(int id) {
        try {
            if (findOne(id) == null) {
                System.out.printf("La llave primaria (índice) no existe");
                return false;
            } else {
                classes[id].setId(null);
                classes[id].setCodigo(null);
                classes[id].setNombre(null);
                classes[id].setApellido(null);
                classes[id].setCumpleaños(null);
                classes[id].setFechaentrada(null);
                classes[id].setSemestre(null);
                classes[id].setFacultad(null);
                return true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("No se puede borrar el estudiante porque no hay estructura");
            return false;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No se puede borrar el estudiante porque el máximo permitido es de " +
                    classes.length + " estudiantes");
            return false;
        }
        catch (Exception e) {
            System.err.println("Error al borrar estudiante");
            return false;
        }
    }

    public Class findOne(int id) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null && id == classes[i].getId()) {
                return classes[i];
            }
        }
        return null;
    }

    public boolean list() {
        try {
            System.out.println(Arrays.toString(classes));
            return true;
        } catch (Exception e) {
            System.err.println("Error al listar");
            return false;
        }
    }
}
