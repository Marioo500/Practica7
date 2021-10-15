package practica7;

public class Practica7 {

    public static void main(String[] args) {
        Magnum_Opus opus = new Magnum_Opus();
        MiniRobot_Cuchillos r1 = new MiniRobot_Cuchillos();
        MiniRobot_ManosCalientes r2 = new MiniRobot_ManosCalientes();
        int op;
        int i = 0;
        int accion;
        do{
        op = 0;
        accion = 0;
            do{
                System.out.println("Elige robot: ");
                System.out.println("1) " + opus.getNombre());
                System.out.println("2) " + r1.getNombre());
                System.out.println("3) " + r2.getNombre());
                op = CapturarEntrada.capturarEntero("Robot");
                if(op == 2 && r1.accionrealizada||(op == 3 && r2.accionrealizada)){
                    System.out.println("Mini robot solo puede realizar una tarea, la cual ya realizo, por favor elige otro");
                    op = CapturarEntrada.capturarEntero("Robot");
                }
                System.out.println();
            }while(op<=0||op>=5);
            do{
                System.out.println("Elige accion: ");
                System.out.println("1) Preparar ingredientes");
                System.out.println("2) Cocinar");
                System.out.println("3) Servir");
                accion = CapturarEntrada.capturarEntero("Accion");
                if(!(accion == (i+1))){
                    System.out.println("Accion anterior no realizada");
                    accion = 0;
                }
                System.out.println();
            }while(accion>=4||accion<=0);
            if((op == 2 && accion == 2)||(op==2 && accion == 3)){
                String continuar = CapturarEntrada.capturarCadena("Robot con cuchillos no apto para realizar la accion dada, desea continuar? [S/N]");
                if(continuar.toLowerCase().equals("n"))
                {
                    System.out.println("Regresando");
                    op = 0;
                    accion = 0;
                }
            }
            if((op == 3 && accion ==1)||(op==3 && accion ==3)){
                String continuar = CapturarEntrada.capturarCadena("Robot para calentar no apto para realizar la accion dada, desea continuar? [S/N]");
                if(!continuar.toLowerCase().equals("s"))
                {
                    System.out.println("Regresando");
                    op = 0;
                    accion = 0;
                }
            }
            switch(op){
                case 1:{
                    switch(accion){
                        case 1: {
                            System.out.println(opus.cortarCarne());
                            System.out.println(opus.picarVerduras());
                            opus.setLastaccion("Preparar ingredientes");
                            break;
                        }
                        case 2:{
                            System.out.println(opus.cocinar());
                            opus.setLastaccion("Cocinar");
                            break;
                        }
                        case 3:{
                            System.out.println(opus.servirComida());
                            opus.setLastaccion("Servir");
                            break;
                        }
                    }
                }
                break;
                case 2:{
                    switch(accion){
                        case 1: {
                            System.out.println(r1.cortarCarne());
                            System.out.println(r1.picarVerduras());
                            r1.accionEspecial = true;
                            r1.setLastaccion("Preparar ingredientes");
                            r1.accionrealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(r1.cocinar());
                            r1.accionEspecial = false;
                            r1.setLastaccion("Cocinar");
                            r1.accionrealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(r1.servirComida());
                            r1.accionEspecial = false;
                            r1.setLastaccion("Servir");
                            r1.accionrealizada = true;
                            break;
                        }
                    }
                break;
                }
                case 3:{
                    switch(accion){
                        case 1: {
                            System.out.println(r2.cortarCarne());
                            System.out.println(r2.picarVerduras());
                            r2.accionEspecial = false;
                            r2.setLastaccion("Preparar ingredientes");
                            r2.accionrealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(r2.cocinar());
                            r2.accionEspecial = true;
                            r2.setLastaccion("Cocinar");
                            r2.accionrealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(r2.servirComida());
                            r2.accionEspecial = false;
                            r2.setLastaccion("Servir");
                            r2.accionrealizada = true;
                            break;
                        }
                    }
                break;    
                }
            }
        i++;
        }while(accion!=3);
        
        if(r1.getAccion() == null && r2.getAccion() == null){
            System.out.println("Magnus Opus hizo todo y quedo rico");
        }
        else if(r1.getAccion() != null && r2.getAccion() == null){
            if(r1.accionEspecial == true){
                System.out.println("El plato quedo riquísimo\nBuen trabajo");
            }
            else{
                System.out.println("El plato pudo haber quedado mejor");
            }
        }
        else if(r1.getAccion() == null && r2.getAccion() != null){
            if(r2.accionEspecial == true){
                System.out.println("El plato quedo riquísimo\nBuen trabajo");
            }
            else{
                System.out.println("El plato pudo haber quedado mejor");
            }
        }
        else if(r1.accionEspecial == true && r2.accionEspecial == true){
            System.out.println("El plato quedo riquísimo\nBuen trabajo");
        }
        else if((r1.accionEspecial == false && r2.accionEspecial == true)||(r1.accionEspecial == true && r2.accionEspecial == false)){
            System.out.println("El plato pudo haber quedado mejor");
        }
        else if(r1.accionEspecial == false && r2.accionEspecial == false){
            System.out.println("El plato no salio como se esperaba :(");
        }
        opus.imprimirTodo();
        r1.imprimirTodo();
        r2.imprimirTodo();
    }
}
