package Model.DAO;

import Model.DTO.InstructorDTO;

import java.util.ArrayList;

public class InstructorDAO {
    public ArrayList<InstructorDTO> instructorList;

    public InstructorDAO() {
        instructorList = new ArrayList<>();
    }

    public void saveInstance(Object o)
    {
        instructorList.add((InstructorDTO) o);

    }
    /**
     *Método para borrar un objeto
     * @param o
     */
    public void deleteInstance(Object o)
    {
        instructorList.remove((int) o);
    }
    /**
     *Método para actualizar un objeto
     * @param o
     */
    public void updateInstance(Object o) {
        InstructorDTO aux = (InstructorDTO) o;

        // Verificar si la lista está vacía
        if (instructorList.isEmpty()) {
            instructorList.add(aux);
        } else {
            // Iterar sobre la lista para encontrar el instructor con el mismo ID
            for (int i = 0; i < instructorList.size(); i++) {
                if (instructorList.get(i).getId() == aux.getId()) {
                    // Actualizar el instructor y salir del bucle
                    instructorList.set(i, aux);
                    break;
                }
            }
        }
    }
    public String showList() {
            StringBuilder salida = new StringBuilder();
            salida.append("Lista de instructores registrados: ");
            for (int i = 0; i < instructorList.size(); i++) {
                salida.append(instructorList.get(i).toString());
            }
            return salida.toString();
    }
}
