package practica7;

public abstract class Robot {
    private int nivelBateria;
    public String nombre;
    public int id;
    private String lastaccion;
    
    public Robot(){
        System.out.println("Configurando datos generales");
        setNombre(CapturarEntrada.capturarCadena("Nombre al robot"));
        setNivelBateria(CapturarEntrada.capturarEntero("Nivel de bateria"));
        setIdentificacion(CapturarEntrada.capturarEntero("Numero de identificacion"));
    }
    public void setNivelBateria(int nivel){
        nivelBateria = nivel;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdentificacion(int id){
        this.id = id;
    }
    public void setLastaccion(String accion){
        lastaccion = accion;
    }
    
    public int getNivelbateria(){
        return nivelBateria;
    }
    public String getNombre(){
        return nombre;
    }
    public int getid(){
        return id;
    }
    public String getAccion(){
        return lastaccion;
    }
    public void imprimirTodo(){
        System.out.println("Numero de identificacion de " + nombre + ": " + id);
        System.out.println("Nivel de bateria: " + nivelBateria);
        System.out.println("Ultima accion realizada: " + lastaccion);
    }
}
