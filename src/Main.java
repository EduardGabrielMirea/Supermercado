import clase.Cereal;
import clase.Detergente;
import clase.Vino;
import interfaces.IAlimento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Detergente detergenteAriel = new Detergente("Fairy", 5.95f);
        detergenteAriel.setVolumen(1.5f);
        detergenteAriel.setTipoEnvase("Botella");
        detergenteAriel.setDescuento(0.1f);

        Cereal cerealesKellogg = new Cereal("Kellogg's Special K", 3.65f, "espelta");
        try {
            cerealesKellogg.setCaducidad(new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Vino vinoRioja = new Vino("Rioja Viña Ardanza", "Tinto", 12.5f, 15.95f);
        vinoRioja.setVolumen(1.5f);
        vinoRioja.setTipoEnvase("Botella");
        vinoRioja.setDescuento(0.05f);

        System.out.println(detergenteAriel);
        System.out.println(cerealesKellogg);
        System.out.println(vinoRioja);

        List<IAlimento> productosAlimenticios = new ArrayList<>();
        productosAlimenticios.add(cerealesKellogg);
        productosAlimenticios.add(vinoRioja);

        int totalCalorias = 0;
        for (IAlimento producto : productosAlimenticios) {
            totalCalorias += producto.getCalorias();
        }
        System.out.println("\nSuma de calorías de los productos alimenticios: " + totalCalorias);
    }
}



