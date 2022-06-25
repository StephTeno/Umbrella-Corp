package Clases.Estados_financieros;
import java.util.*;
public class EstadoResultado {
    private ArrayList<ElementosEF> mIngresos;
    private ArrayList<ElementosEF> mGastos;
    private double mTotalIngresos;
    private double mTotalGastos;
    private double mUtilidad;

    public EstadoResultado(ArrayList<ElementosEF> ingresos, ArrayList<ElementosEF> gastos, double totalIngresos, double totalGastos, double utilidad) {
        mIngresos = ingresos;
        mGastos = gastos;
        mTotalIngresos = totalIngresos;
        mTotalGastos = totalGastos;
        mUtilidad = utilidad;
    }

    public List<ElementosEF> getIngresos() {
        return mIngresos;
    }

    public void setIngresos(ArrayList<ElementosEF> ingresos) {
        mIngresos = ingresos;
    }

    public List<ElementosEF> getGastos() {
        return mGastos;
    }

    public void setGastos(ArrayList<ElementosEF> gastos) {
        mGastos = gastos;
    }

    public double getTotalIngresos() {
        return mTotalIngresos;
    }

    public void setTotalIngresos(double totalIngresos) {
        mTotalIngresos = totalIngresos;
    }

    public double getTotalGastos() {
        return mTotalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        mTotalGastos = totalGastos;
    }

    public double getUtilidad() {
        return mUtilidad;
    }

    public void setUtilidad(double utilidad) {
        mUtilidad = utilidad;
    }
}
