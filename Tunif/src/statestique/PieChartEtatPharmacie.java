/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statestique;

import PackageDAO.PharmacieDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class PieChartEtatPharmacie {

    private static final long serialVersionUID = 1L;

    public static PieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        PharmacieDAO phDAO = new PharmacieDAO();

        result.setValue("Service Ye7med Rabbi(3al 7it)", phDAO.EtatPharmacieNormale());
        result.setValue("Service Normale", phDAO.getEtatPharmacieMoyenne());
        result.setValue("Service Tayara", phDAO.getEtatPharmacieExecelon());

        return result;

    }

    /**
     * Creates a chart
     */
    public static JFreeChart createChart(String title) {


        JFreeChart chart = ChartFactory.createPieChart3D(title, // chart title
                createDataset(), // data
                true, // include legend
                true,
                false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }
}
