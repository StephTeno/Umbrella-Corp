package Clases.Estados_financieros;
import java.util.*;

public class BalanceGeneral {
        private ArrayList<ElementosEF> mActivos;
        private ArrayList<ElementosEF> mPasivos;
        private ArrayList<ElementosEF> mPatrimonio;
        private double mTotalActivoCirculante;
        private double mTotalActivoNoCirculante;
        private double mTotalPasivoCirculante;
        private double mTotalPasivoNoCirculante;
        private double mTotalPatrimonio;
        private double mTotalPasivoPatrimonio;
    
        public BalanceGeneral(ArrayList<ElementosEF> activos, ArrayList<ElementosEF> pasivos, ArrayList<ElementosEF> patrimonio, double totalActivoCorriente,double totalActivoNoCorriente, double totalPasivoCorriente, double totalPasivoNoCorriente, double totalPatrimonio, double totalPasivoPatrimonio) {
            mActivos = activos;
            mPasivos = pasivos;
            mPatrimonio = patrimonio;
            mTotalActivoCirculante = totalActivoCorriente;
            mTotalActivoNoCirculante = totalActivoNoCorriente;
            mTotalPasivoCirculante = totalPasivoCorriente;
            mTotalPasivoNoCirculante = totalPasivoNoCorriente;
            mTotalPatrimonio = totalPatrimonio;
            mTotalPasivoPatrimonio = totalPasivoPatrimonio;
        }
    
        public List<ElementosEF> getActivos() {
            return mActivos;
        }
    
        public void setActivos(ArrayList<ElementosEF> activos) {
            mActivos = activos;
        }
    
        public List<ElementosEF> getPasivos() {
            return mPasivos;
        }
    
        public void setPasivos(ArrayList<ElementosEF> pasivos) {
            mPasivos = pasivos;
        }
    
        public List<ElementosEF> getPatrimonio() {
            return mPatrimonio;
        }
    
        public void setPatrimonio(ArrayList<ElementosEF> patrimonio) {
            mPatrimonio = patrimonio;
        }
    
        public double getTotalActivoCorriente() {
            return mTotalActivoCirculante;
        }
    
        public void setTotalActivoCorriente(double totalActivoCorriente) {
            mTotalActivoCirculante = totalActivoCorriente;
        }
    
        public double getTotalActivoNoCirculante() {
            return mTotalActivoNoCirculante;
        }
    
        public void setTotalActivoNoCirculante(double totalActivoNoCorriente) {
            mTotalActivoNoCirculante = totalActivoNoCorriente;
        }
    
        public double getTotalPasivoCirculante() {
            return mTotalPasivoCirculante;
        }
    
        public void setTotalPasivoCirculante(double totalPasivoCorriente) {
            mTotalPasivoCirculante = totalPasivoCorriente;
        }
    
        public double getTotalPasivoNoCorriente() {
            return mTotalPasivoNoCirculante;
        }
    
        public void setTotalPasivoNoCorriente(double totalPasivoNoCorriente) {
            mTotalPasivoNoCirculante = totalPasivoNoCorriente;
        }
    
        public double getTotalPatrimonio() {
            return mTotalPatrimonio;
        }
    
        public void setTotalPatrimonio(double totalPatrimonio) {
            mTotalPatrimonio = totalPatrimonio;
        }
    
        public double getTotalPasivoPatrimonio() {
            return mTotalPasivoPatrimonio;
        }
    
        public void setTotalPasivoPatrimonio(double totalPasivoPatrimonio) {
            mTotalPasivoPatrimonio = totalPasivoPatrimonio;
        }
}
