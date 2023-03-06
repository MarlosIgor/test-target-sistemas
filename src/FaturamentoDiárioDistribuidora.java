import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

import static java.util.stream.StreamSupport.stream;

public class FaturamentoDiárioDistribuidora {

    public static void main(String[] args) {

        JSONArray faturamentoDiario = null;
        try {
            JSONParser parser = new JSONParser();
            faturamentoDiario = (JSONArray) parser.parse(new FileReader("dados.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return;
        }

        double minFaturamento = stream(faturamentoDiario.spliterator(), false)
                .mapToDouble(obj -> (double) ((JSONObject) obj).get("valor"))
                .filter(valor -> valor > 0)
                .min()
                .orElse(Double.POSITIVE_INFINITY);

        double maxFaturamento = stream(faturamentoDiario.spliterator(), false)
                .mapToDouble(obj -> (double) ((JSONObject) obj).get("valor"))
                .max().getAsDouble();

        double mediaMensal = stream(faturamentoDiario.spliterator(), false)
                .mapToDouble(obj -> (double) ((JSONObject) obj).get("valor"))
                .filter(faturamento -> faturamento > 0)
                .average().getAsDouble();

        long numDiasAcimaDaMedia = stream(faturamentoDiario.spliterator(), false)
                .filter(obj -> (double) ((JSONObject) obj).get("valor") > 0)
                .mapToDouble(obj -> (double) ((JSONObject) obj).get("valor"))
                .filter(faturamento -> faturamento > mediaMensal)
                .count();

        System.out.println("Menor valor de faturamento diário: " + minFaturamento);
        System.out.println("Maior valor de faturamento diário: " + maxFaturamento);
        System.out.println("Número de dias com faturamento superior à média mensal: " + numDiasAcimaDaMedia);
    }
}
