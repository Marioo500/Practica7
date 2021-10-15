package practica7;

public class Magnum_Opus extends Robot implements Acciones{
    
    public Magnum_Opus(){
        super();
        System.out.println("Terminando de configurar Magnum Opus");
    }
    @Override
    public String cortarCarne(){
        return ("Soy Magum Opus " + nombre + " y puedo cortar carne");
    }
    @Override
    public String picarVerduras(){
        return ("Soy Magum Opus " + nombre + " y puedo picar verduras");
    }
    @Override
    public String cocinar(){
        return ("Soy Magum Opus " + nombre +" y puedo cocinar");
    }
    @Override
    public String servirComida(){
        return ("Soy Magum Opus " + nombre +" y puedo servir la comida");
    }
}
