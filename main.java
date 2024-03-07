package control;
public class main {

    public static void main(String[] args) {
        control.vista.main vistaMain;
        control.modelo.CarreraHIlos ChecoPerez = new control.modelo.CarreraHIlos("Checo Perez",1);
        control.modelo.CarreraHIlos MaxVerstappen = new control.modelo.CarreraHIlos("Max Verstappen",2);
        control.modelo.CarreraHIlos LewisHamilton = new control.modelo.CarreraHIlos("Lewis Hamilton",3);

        control.control.controlcarrera controlCarrera = new control.control.controlcarrera();
        vistaMain = new control.vista.main();
        controlCarrera.setCheco(ChecoPerez);
        controlCarrera.setMax(MaxVerstappen);
        controlCarrera.setHamilton(LewisHamilton);
        controlCarrera.setVistaMain(vistaMain);
        controlCarrera.iniciarCarrera();
    }



}
