package practica7;
public class MiniRobot_ManosCalientes extends Robot implements Acciones{
    public boolean accionrealizada = false;
    public boolean accionEspecial;
    public MiniRobot_ManosCalientes(){
        super();
        System.out.println("Terminando de configurar Mini Robot");
    }
    @Override
    public String cortarCarne(){
        accionrealizada = true;
        return ("Soy Mini Robot " + nombre + " e intente cortar carne");
    }
    @Override
    public String picarVerduras(){
        accionrealizada = true;
        return ("Soy Mini Robot " + nombre + " e intente verduras");
    }
    @Override
    public String cocinar(){
        accionrealizada = true;
        return ("Soy Mini Robot " + nombre +" y puedo cocinar");
    }
    @Override
    public String servirComida(){
        accionrealizada = true;
        return ("Soy Mini Robot " + nombre +" e intenté servir la comida");
    }
}
