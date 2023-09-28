package Controller;

import Model.DAO.InstructorDAO;
import Model.DTO.InstructorDTO;
import View.Console;

import java.util.InputMismatchException;

public class Controller {
    private Console view;
    private InstructorDAO model;

    public Controller() {
        view = new Console();
        model = new InstructorDAO();
        init();
    }

    public void init() {
        try {
            int option = 0;
            do {
                option = view.readInt("Grupo de instructores - Corporación Universitaria El Vergel" +
                                            "\n Ingrese el número de la opción que quiera ejecutar" +
                                            "\n 1. Registrar instructor" +
                                            "\n 2. Actualizar intructor" +
                                            "\n 3. Eliminar instructor" +
                                            "\n 4. Mostrar lista de instructores" +
                                            "\n 5. Salir");;
                switch (option) {
                    case 1:
                        int id = view.readInt("Ingrese el número de identificación, sin puntos, ni espacios, ni comas.");
                        String name = view.readString("Ingrese el nombre completo del instructor, recuerda no usar números");
                        int phone = view.readInt("Ingrese el número de teléfono del instructor, sin puntos, ni espacios, ni comas");
                        String birth_date = view.readString("Ingresa la fecha de nacimiento del instructor. Formato (DD/MM/AAAA)");
                        String address = view.readString("Ingrese la dirección del instructor");
                        String email = view.readString("Ingrese el correo electrónico del instructor");
                        if (id <= 0 || phone <= 0 ) {
                            view.showInfo("Datos ingresados no válidos. Verifique y vuelva a intentarlo.");
                            return;
                        }
                        InstructorDTO i = new InstructorDTO(id, name, phone, birth_date, address, email);
                        model.saveInstance(i);
                        view.showInfo("Instructor agregado con éxito");
                        break;
                    case 2:
                        id = view.readInt("Ingrese el número de identificación, sin puntos, ni espacios, ni comas.");
                        name = view.readString("Ingrese el nombre completo del instructor, recuerda no usar números");
                        phone = view.readInt("Ingrese el número de teléfono del instructor, sin puntos, ni espacios, ni comas");
                        birth_date = view.readString("Ingresa la fecha de nacimiento del instructor. Formato (DD/MM/AAAA)");
                        address = view.readString("Ingrese la dirección del instructor");
                        email = view.readString("Ingrese el correo electrónico del instructor");
                        if (id <= 0 || phone <= 0 ) {
                            view.showInfo("Datos ingresados no válidos. Verifique y vuelva a intentarlo.");
                            return;
                        }
                        i = new InstructorDTO(id, name, phone, birth_date, address, email);
                        model.updateInstance(i);
                        view.showInfo("Instructor actualizado con éxito");
                        break;
                    case 3:
                        id = view.readInt("Ingrese el número de identificación del usuario");
                        int n = new InstructorDTO().getId();
                        model.deleteInstance(n);
                        view.showInfo("Instructor eliminado con éxito");
                        break;
                    case 4:
                        view.showInfo(model.showList());
                        break;
                    case 5:
                        view.showInfo("Tenga un lindo día. Vuelva pronto");
                        System.exit(0);
                }
            }
            while (option != 0);
        } catch (InputMismatchException e) {
            view.showInfo("No puedes ingresar letras, solo números");
        }

    }
}
