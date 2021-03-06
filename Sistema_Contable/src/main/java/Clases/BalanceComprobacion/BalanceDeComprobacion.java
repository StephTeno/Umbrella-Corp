package Clases.BalanceComprobacion;

import java.util.ArrayList;
import java.util.List;
public class BalanceDeComprobacion {
    private ArrayList<ElementoBalanceDeComprobacion> mElementosBalance;
    private double mTotalSumasDebe;
    private double mTotalSumasHaber;
    private double mTotalSaldosDebe;
    private double mTotalSaldosHaber;

    public BalanceDeComprobacion(ArrayList<ElementoBalanceDeComprobacion> elementosBalance, double totalSumasDebe, double totalSumasHaber, double totalSaldosDebe, double totalSaldosHaber) {
        mElementosBalance = new ArrayList<>(elementosBalance);
        mTotalSumasDebe = totalSumasDebe;
        mTotalSumasHaber = totalSumasHaber;
        mTotalSaldosDebe = totalSaldosDebe;
        mTotalSaldosHaber = totalSaldosHaber;
    }

    public BalanceDeComprobacion() {
        mElementosBalance = new ArrayList<>();
    }

    public List<ElementoBalanceDeComprobacion> getElementosBalance() {
        return mElementosBalance;
    }

/*     public void setElementosBalance(List<ElementoBalanceDeComprobacion> elementosBalance) {
        mElementosBalance = elementosBalance;
    } */

    public double getTotalSumasDebe() {
        return mTotalSumasDebe;
    }

    public void setTotalSumasDebe(double totalSumasDebe) {
        mTotalSumasDebe = totalSumasDebe;
    }

    public double getTotalSumasHaber() {
        return mTotalSumasHaber;
    }

    public void setTotalSumasHaber(double totalSumasHaber) {
        mTotalSumasHaber = totalSumasHaber;
    }

    public double getTotalSaldosDebe() {
        return mTotalSaldosDebe;
    }

    public void setTotalSaldosDebe(double totalSaldosDebe) {
        mTotalSaldosDebe = totalSaldosDebe;
    }

    public double getTotalSaldosHaber() {
        return mTotalSaldosHaber;
    }

    public void setTotalSaldosHaber(double totalSaldosHaber) {
        mTotalSaldosHaber = totalSaldosHaber;
    }
}
