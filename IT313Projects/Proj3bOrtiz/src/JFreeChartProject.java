/**
 * Armando Ortiz
 * Project 3b
 * 10/19/19
 */
// All the import statements needed to make the class work
import java.io.*;
import java.net.URL;
import java.util.Scanner;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtilities;

public class JFreeChartProject {
   //key=2ddbaca3e282084015b2606b3845a9bc My key code
    /**
     * Currencies that are chosen for the project
     * Turkish Lira
     * Japanese Yen
     * Korean Won
     * Russian Ruble
     * South African Rand
     */
    public static void main(String[] args) throws IOException {
        // Main method that runs the class
        Scanner s = getScanner();
        DefaultCategoryDataset barChartDataset = getDefaultCategoryDataset(s);
        getFreeChart(s, barChartDataset);
    }

    private static void getFreeChart(Scanner s, DefaultCategoryDataset barChartDataset) throws IOException {
        // getFreeChart method that makes a bar chart
        JFreeChart barChartObject = ChartFactory.createBarChart(
                "Currency values in Euros", "Currencies", "Numeric value in euros", barChartDataset,
                PlotOrientation.VERTICAL,
                false,  // Include legend.
                false,  // Include tooltips.
                false); // Include URLs.
        // Write line chart to a file.
        int imageWidth = 640;
        int imageHeight = 480;
        File barChart = new File("currency.png");
        ChartUtilities.saveChartAsPNG(
                barChart, barChartObject, imageWidth, imageHeight);
        s.close();
    }

    private static DefaultCategoryDataset getDefaultCategoryDataset(Scanner s) throws IOException {
        // getDefaultCategoryDataset method that gets the values of the currencies
        DefaultCategoryDataset barChartDataset = new DefaultCategoryDataset();
        s.useDelimiter(",");
        while(s.hasNext()){
        String money = s.next(); // reads next line in currency.txt
        String prefix = "http://data.fixer.io/api/latest";
        String accessKey = "?access_key=2ddbaca3e282084015b2606b3845a9bc";
        String insert = "&symbols=";
        String targetCurrency = money;
        String urlString = prefix + accessKey + insert + targetCurrency;
        URL url = new URL(urlString); // Url obj created that is the source url
        Scanner s2 = new Scanner(url.openStream( )); // reads through the url
        String jsonString = s2.nextLine( );
        int start = jsonString.indexOf(targetCurrency) + 5;
        int end = jsonString.length( ) - 2;
        barChartDataset.addValue(Double.parseDouble(jsonString.substring(start, end)),"Currency", money);
        // adds the currency value to the barChartDataset with rows money
        s2.close( );
        }
        return barChartDataset;
    }

    private static Scanner getScanner() throws FileNotFoundException {
        // getScanner that has scanner object that reads currency.txt
        File fileObj = new File("src\\currency.txt");
        return new Scanner(fileObj);
    }
}
