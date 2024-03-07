package control.control;

public class controlcarrera {

    private control.modelo.CarreraHIlos Checo;
    private control.modelo.CarreraHIlos Max;
    private control.modelo.CarreraHIlos Hamilton;
    private control.vista.main vistaMain;

    public void setCheco(control.modelo.CarreraHIlos Checo){
    this.Checo = Checo;
}

public void setMax(control.modelo.CarreraHIlos Max){
    this.Max = Max;}

public void setHamilton(control.modelo.CarreraHIlos Hamilton){
    this.Hamilton = Hamilton;}

public void setVistaMain(control.vista.main vistaMain){
    this.vistaMain = vistaMain;}

public void iniciarCarrera(){
    Checo.start();
    Max.start();
    Hamilton.start();

    
    vistaMain.addIcon("checo.jpg", 100);
}
}
