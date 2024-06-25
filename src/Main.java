import clase.Cereal;
import clase.Detergente;
import clase.Vino;
import interfaces.IAlimento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*
     * Tengo intención de poner una opción que te lleve a un main, donde ya estén creados todos los articulos.
     *
     */
    private static int currentScreen = 0;

    public static void main(String[] args) {
        int opcion;
        while (true){
            imprimirMenu();
            opcion = obtenerOpcion();
            if (opcion == 0) break;
            if (currentScreen == 0){
                switch (opcion){
                    case 1:
                        crearDetergente();
                        break;
                    case 2:
                        crearCereal();
                        break;
                    case 3:
                        crearVino();
                        break;
                    case 4:
                        calcularCalorias();
                        break;
                }
            }
        }


    }

    private static void imprimirMenu(){
        System.out.println("------------------------------------------");
        System.out.println(" 0- Salir | 1- Crea un detergente | 2- Crea un cereal | 3- Crea un vino | 4- Calcula calorias (Se crean automaticamente 2 productos)");
        System.out.println("------------------------------------------");

    }

    private static int obtenerOpcion(){
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        try {
            opcion = Integer.parseInt(sc.next());
            if (currentScreen == 0 && opcion < 1 || opcion > 6) {
            }
        }catch (NumberFormatException nfe){
            System.out.println("Opcion incorrecta");
        }
        return opcion;
    }

    private static void crearDetergente(){
        System.out.println("Intoduce la marca, el precio, el volumen, el tipo de envase y el descuento. (Fairy 10 2 Botella 0.2)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Volumen: ");
        String volumen = sc.next();
        System.out.println("Tipo de envase: ");
        String tipoEnvase = sc.next();
        System.out.println("Descuento: ");
        String descuento = sc.next();

        Detergente detergente = new Detergente(marca, Float.parseFloat(precio));
        detergente.setVolumen(Float.parseFloat(volumen));
        detergente.setTipoEnvase(tipoEnvase);
        detergente.setDescuento(Float.parseFloat(descuento));

        System.out.println("Se ha creado correctamente el detergente: "+ detergente);
    }
    private static void crearVino(){
        System.out.println("Intoduce la marca, el precio , el volumen, el tipo de envase, el descuento, grados de alcohol.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Volumen: ");
        String volumen = sc.next();
        System.out.println("Tipo de envase: ");
        String tipoEnvase = sc.next();
        System.out.println("Descuento: ");
        String descuento = sc.next();
        System.out.println("Grados alcohol: ");
        String grados = sc.next();

        Vino vino = new Vino(marca, Float.parseFloat(precio), Double.parseDouble(grados));
        vino.setVolumen(Float.parseFloat(volumen));
        vino.setTipoEnvase(tipoEnvase);
        vino.setDescuento(Float.parseFloat(descuento));


        System.out.println("Se ha creado correctamente el vino: "+ vino);
    }

    private static void crearCereal(){
        System.out.println("Intoduce la marca, el precio, tipo de cereal y la fecha de caducidad.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Tipo de cereal: (espelta, maíz o trigo)");
        String tipCereal = sc.next();
        System.out.println("Fecha de caducidad:(dd/MM/yyyy)");
        String fecha = sc.next();

        Cereal cereal = new Cereal(marca, Float.parseFloat(precio));
        cereal.setTipoCereal(tipCereal);
        try {
            cereal.setCaducidad(new SimpleDateFormat("dd/MM/yyyy").parse(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Se ha creado correctamente el cereal: "+ cereal);
    }

    private static void calcularCalorias(){
        List<IAlimento> productosAlimenticios = new ArrayList<>();

        Vino vinoRioja = new Vino("Rioja Viña Ardanza", "Tinto", 12.5f, 15.95f);
        vinoRioja.setVolumen(1.5f);
        vinoRioja.setTipoEnvase("Botella");
        vinoRioja.setDescuento(0.05f);

        Cereal cerealesKellogg = new Cereal("Kellogg's Special K", 3.65f);
        cerealesKellogg.setTipoCereal("espelta");

        productosAlimenticios.add(cerealesKellogg);
        productosAlimenticios.add(vinoRioja);

        System.out.println(cerealesKellogg+" \n "+vinoRioja);
        int totalCalorias = 0;
        for (IAlimento producto : productosAlimenticios) {
            totalCalorias += producto.getCalorias();
        }
        System.out.println("\nSuma de calorías de los productos alimenticios: " + totalCalorias);
    }
}



