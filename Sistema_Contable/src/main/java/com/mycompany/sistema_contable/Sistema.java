package com.mycompany.sistema_contable;
import java.util.*;
import Clases.BalanceComprobacion.*;
import Clases.Estados_financieros.*;
public class Sistema {
    public static void Espera (){
        System.out.println("\n\n\n");
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
    public static void Head(String App){
        System.out.print("\n \t \t \t \t    -----Aplicación--"+App+"-----");
        System.out.print("\n \t \t \t \t \t  Bienvenido a la aplicacón");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n \t \t \t \t \t \t \t MENÚ");
    }
    public static void Menu(String o1, String o2, String o3, String o4, String o5, String o6){
        System.out.print("\nOpción 1: "+o1+
                         "\nOpción 2: "+o2+
                         "\nOpción 3: "+o3+
                         "\nOpción 4: "+o4+
                         "\nOpción 4: "+o5+
                         "\nOpción 4: "+o6);
        System.out.println(" ");
    }
    public static void Menu1(String o1, String o2, String o3){
        System.out.print("\n\tOpción 1: "+o1+
                         "\n\tOpción 2: "+o2+
                         "\n\tOpción 3: "+o3);
        System.out.println(" ");
    }
    public static void Error(){
        System.out.print("\n \t \t \t    Ha ingresado un valor inválido... Vuelva a intentarlo nuevamente.");
        System.out.print("\n");
        System.out.print("\n");
    }
    public static void Exit(String App){
        System.out.print("\n \t \t \t    -----SALIENDO-DE-LA-APP-"+App+"-----");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n \t \t \t    Esperamos que le vaya bien...¡Hasta pronto!");
        System.out.print("\n");
        System.out.print("\n");
    }
    public static int BuscarArray(ArrayList<ElementosEF> a, String cp){
        int ps=-1;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getCuenta().equals(cp)) {
                ps=i;
            }
        }
        return ps;
    }
    public static double SumaDeber(ArrayList<ElementoBalanceDeComprobacion> A, ArrayList<ElementoBalanceDeComprobacion> P, ArrayList<ElementoBalanceDeComprobacion> C, ArrayList<ElementoBalanceDeComprobacion> I, ArrayList<ElementoBalanceDeComprobacion> G){
        double SDA=0,SDP=0,SDC=0,SDI=0,SDG=0;
        double Deber=0;
        for (int i = 0; i < A.size(); i++) {
            SDA+=A.get(i).getSaldoDebe();
        }
        for (int i = 0; i < A.size(); i++) {
            SDP+=A.get(i).getSaldoDebe();
        }
        for (int i = 0; i < A.size(); i++) {
            SDC+=A.get(i).getSaldoDebe();
        }
        for (int i = 0; i < A.size(); i++) {
            SDI+=A.get(i).getSaldoDebe();
        }
        for (int i = 0; i < A.size(); i++) {
            SDG+=A.get(i).getSaldoDebe();
        }
        Deber=SDA+SDP+SDC+SDI+SDG;
        return Deber;
    }
    public static double SumaHaber(ArrayList<ElementoBalanceDeComprobacion> A, ArrayList<ElementoBalanceDeComprobacion> P, ArrayList<ElementoBalanceDeComprobacion> C, ArrayList<ElementoBalanceDeComprobacion> I, ArrayList<ElementoBalanceDeComprobacion> G){
        double SHA=0,SHP=0,SHC=0,SHI=0,SHG=0;
        double Haber=0;
        for (int i = 0; i < A.size(); i++) {
            SHA+=A.get(i).getSaldoHaber();
        }
        for (int i = 0; i < A.size(); i++) {
            SHP+=A.get(i).getSaldoHaber();
        }
        for (int i = 0; i < A.size(); i++) {
            SHC+=A.get(i).getSaldoHaber();
        }
        for (int i = 0; i < A.size(); i++) {
            SHI+=A.get(i).getSaldoHaber();
        }
        for (int i = 0; i < A.size(); i++) {
            SHG+=A.get(i).getSaldoHaber();
        }
        Haber=SHA+SHP+SHC+SHI+SHG;
        return Haber;
    }
    public static void DatosBalanceGeneral(String Ciclo, double Caja, double Cliente, double Empleados, double Inventario, double Mobiliario, double Maquinaria, double CapitalSocial, double UtilidadEjercicio){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tMostrando Balance General");
        System.out.println("\t\t--------------------------------------------");
        System.out.println(" ");
        System.out.println("\t\t\t      ABARROTES REYES");
        System.out.println("\t\t\t      Balance General");
        System.out.println("\t\t\t   Al "+Ciclo);
        System.out.println(" ");
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\t\tACTIVOS");
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tCaja \t"+Caja);
        System.out.println("\t\t\tClientes \t"+Cliente);
        System.out.println("\t\t\tEmpleados \t"+Empleados);
        System.out.println("\t\t\tInventario \t"+Inventario);
        System.out.println("\t\t\tMobiliario \t"+Mobiliario);
        System.out.println("\t\t\tMaquinaria \t"+Maquinaria);
        double TA=Caja+Cliente+Empleados+Inventario+Mobiliario+Maquinaria;
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tTOTAL ACTIVOS= \t"+TA);
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\t\tCAPITAL");
        System.out.println("\t\t\tCapital social \t"+CapitalSocial);
        System.out.println("\t\t\tUtilidad del ejercicio \t"+UtilidadEjercicio);
        double TC=CapitalSocial+UtilidadEjercicio;
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tTOTAL CAPITAL= \t"+TC);
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\tTOTAL ACTIVOS\t\t=\tCAPITAL");
        System.out.println("\t\t"+TA+"\t\t= \t"+TC);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void DatosEstadoResultado(String Ciclo, double Venta, double CostoVenta){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tMostrando Estado de Resultado");
        System.out.println("\t\t--------------------------------------------");
        System.out.println(" ");
        System.out.println("\t\t\t      ABARROTES REYES");
        System.out.println("\t\t\t    Estado de Resultado");
        System.out.println("\t\t\t   Al "+Ciclo);
        System.out.println(" ");
        System.out.println("\t\t\tVentas Netas\t"+Venta);
        System.out.println("\t\t\tCosto de Venta\t"+CostoVenta);
        double UtilidadEjercicio=Venta-CostoVenta;
        System.out.println("\t\tUtilidad del Ejercicio \t"+UtilidadEjercicio);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void DatosBalanzaComparacion(String Ciclo, double Debe, double Haber, ArrayList<ElementoBalanceDeComprobacion> A, ArrayList<ElementoBalanceDeComprobacion> P, ArrayList<ElementoBalanceDeComprobacion> C, ArrayList<ElementoBalanceDeComprobacion> I, ArrayList<ElementoBalanceDeComprobacion> G){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t--------------------------------------------");
        System.out.println("\t\t\t\t\t\tMostrando Balance de Comprobación");
        System.out.println("\t\t\t\t\t--------------------------------------------");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t\t      ABARROTES REYES");
        System.out.println("\t\t\t\t\t\t   Balance de Comprobación");
        System.out.println("\t\t\t\t\t\t   Al "+Ciclo);
        System.out.println(" ");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tCUENTAS\t\t\tMOVIMIENTO\t\t\t\t\t  SALDO");
        System.out.println("\t\t\t\tDebe\t\t\tHaber\t\t\tDebe\t\t\tHaber");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tACTIVOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
/*         System.out.println("\t\tCaja \t\t"+271866.05+"\t\t"+238523.1+"\t\t"+"-"+"\t\t\t"+"-");
        System.out.println("\t\tInventario \t"+332546.7+"\t\t"+212711.72+"\t\t"+119834.98+"\t\t"+"-");
        System.out.println("\t\tMobiliario \t"+35000+"\t\t\t"+"-"+"\t\t\t"+35000+"\t\t\t"+"-");
        System.out.println("\t\tMaquinario \t"+15000+"\t\t\t"+"-"+"\t\t\t"+15000+"\t\t\t"+"-"); */
        for (ElementoBalanceDeComprobacion c : A) {
            System.out.println("\t\t\t" + c.toString());
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tPASIVOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
/*         System.out.println("\t\tProveedores \t"+265889.65+"\t\t"+265889.65+"\t\t"+"-"+"\t\t"+"-"); */
        for (ElementoBalanceDeComprobacion c : P) {
            System.out.println("\t\t\t" + c.toString());
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tCAPITAL");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
/*         System.out.println("\t\tCapital social \t"+"-"+"\t\t\t"+150000+"\t\t\t"+"-"+"\t\t\t"+150000); */
        for (ElementoBalanceDeComprobacion c : C) {
            System.out.println("\t\t\t" + c.toString());
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tINGRESOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
/*         System.out.println("\t\tVENTAS  \t"+"-"+"\t\t\t"+265889.65+"\t\t"+"-"+"\t\t\t"+265889.65); */
        for (ElementoBalanceDeComprobacion c : I) {
            System.out.println("\t\t\t" + c.toString());
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tGASTOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
/*         System.out.println("\t\tCOSTO DE VENTA \t"+212711.72+"\t\t"+212711.72); */
        for (ElementoBalanceDeComprobacion c : G) {
            System.out.println("\t\t\t" + c.toString());
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        double MDebe=SumaDeber(A, P, C, I, G);
        double MHaber=SumaHaber(A, P, C, I, G);
        System.out.println("\t\tTOTALES \t"+MDebe+"\t\t"+MHaber+"\t\t"+Debe+"\t\t"+Haber);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        boolean salir=false, hp=false, exit=false;
        int op, o, cont=-1;
        String Ciclo;
        double HInventario=0, DInventario=0, CostoVenta=0, Venta=0, DCaja=0, HCaja=0, HProveedores=0, Caja=0, Cliente=0, Empleados=0, Inventario=0, PapeleriasYUtiles=0, Maquinaria=0, Mobiliario=0,
        Proveedores=0, CapitalSocial=0, DProveedores=0;
        ArrayList<ElementosEF> Activos=new ArrayList<>();
        ArrayList<ElementosEF> Pasivos=new ArrayList<>();
        ArrayList<ElementosEF> Capital=new ArrayList<>();
        ArrayList<ElementosEF> Ingreso=new ArrayList<>();
        ArrayList<ElementosEF> Gastos=new ArrayList<>();
        ArrayList<Asiento> Ventas=new ArrayList<>();
        ArrayList<Asiento> Compra=new ArrayList<>();
        ArrayList<ElementoBalanceDeComprobacion> Activo=new ArrayList<>();
        ArrayList<ElementoBalanceDeComprobacion> Pasivo=new ArrayList<>();
        ArrayList<ElementoBalanceDeComprobacion> Capita=new ArrayList<>();
        ArrayList<ElementoBalanceDeComprobacion> Ingres=new ArrayList<>();
        ArrayList<ElementoBalanceDeComprobacion> Gasto=new ArrayList<>();
        Activos.add(new ElementosEF("1.1.1.1", "Caja", 0));
        Activos.add(new ElementosEF("1.1.2.1", "Clientes", 0));
        Activos.add(new ElementosEF("1.1.2.2", "Empleados", 0));
        Activos.add(new ElementosEF("1.1.2.3", "Inventario", 0));
        Activos.add(new ElementosEF("1.1.2.4", "Papelerías y Utiles", 0));
        Activos.add(new ElementosEF("2.1.0.1", "Maquinaria", 0));
        Activos.add(new ElementosEF("2.1.0.2", "Mobiliario", 0));
        Pasivos.add(new ElementosEF("2.1.0.3", "Proveedores", 0));
        Capital.add(new ElementosEF("3.1.0.1", "Capital Social", 0));
        Capital.add(new ElementosEF("3.2.0.1", "Utilidad del Ejercicio", 0));
        Ingreso.add(new ElementosEF("4.0.0.1", "Ventas", 0));
        Gastos.add(new ElementosEF("5.0.0.1", "Costo de Venta", 0));

        do {
            Head("Sistema Contable");
            Menu("Ingresar los saldos iniciales","Realizar Asiento Diario", "Balanza de Comprobación", "Estado de Resultados", "Balance General", "Salir de la App");
            op=l.nextInt();
            switch (op) {
                case 1:
                System.out.print("\n---SALDOS--INICIALES---");
                System.out.print("\nIngrese la fecha del ciclo contable: ");
                Ciclo=l.nextLine();
                System.out.print("\nIngrese los saldos inicial");
                System.out.print("\nCaja: ");
                Caja=l.nextDouble();
                System.out.print("\nClientes: ");
                Cliente=l.nextDouble();
                System.out.print("\nEmpleados: ");
                Empleados=l.nextDouble();
                System.out.print("\nInventario: ");
                Inventario=l.nextDouble();
                System.out.print("\nPapelerías y Utiles: ");
                PapeleriasYUtiles=l.nextDouble();
                System.out.print("\nMaquinaria: ");
                Maquinaria=l.nextDouble();
                System.out.print("\nMobiliario: ");
                Mobiliario=l.nextDouble();
                System.out.print("\nProveedores: ");
                Proveedores=l.nextDouble();
                System.out.print("\nCapital Social: ");
                CapitalSocial=l.nextDouble();
                    break;
                case 2:
                hp=true;
                if(cont<10000){
                    cont++;
                    do{
                        Menu1("Asiento de venta", "Asiento de Compra","Salir de Asientos");
                        o=l.nextInt();
                        switch (o) {
                            case 1:
                                System.out.print("\n---ASIENTO DE VENTA---");
                                System.out.print("\n(Primera cuenta Debe)(Segunda Cuenta Haber)");
                                int p=BuscarArray(Activos, "Caja");
                                String cod=Activos.get(p).getCodigo();
                                int pi=BuscarArray(Activos, "Inventario");
                                String codi=Activos.get(pi).getCodigo();

                                System.out.print("\nRegistro N°: ");
                                int Registro=l.nextInt();
                                System.out.print("\nCuenta: Caja \t\tReferencia: "+cod+"\tCargo: ");
                                double Debe1=l.nextDouble();
                                System.out.print("\nCuenta: Inventario \tReferencia: "+codi+"\tAbono: ");
                                double Haber1=l.nextDouble();
                                System.out.println();
                                HInventario+=Haber1*0.8;
                                DCaja+=Debe1;
                                Ventas.add(new Asiento(DCaja, HInventario, "Caja", "Inventario", Registro, cod, codi));
                                CostoVenta+=HInventario; //Costo de Ventas (Gasto=Debe)
                                Venta+=Debe1; //Ventas (Ingreso=Haber)
                                Ventas.add(new Asiento(CostoVenta, Venta, "Costo de Venta", "Ventas", Registro, "5.0.0.1", "4.0.0.1"));
                                Espera();
                                break;
                            
                            case 2:
                                System.out.print("\n---ASIENTO DE COMPRA---");
                                System.out.print("\n(Primera cuenta Debe)(Segunda Cuenta Haber)");
                                int c=BuscarArray(Activos, "Inventario");
                                String codo=Activos.get(c).getCodigo();
                                int ce=BuscarArray(Pasivos, "Proveedores");
                                String codoo=Activos.get(ce).getCodigo();

                                System.out.print("\nRegistro N°: ");
                                int Regist=l.nextInt();
                                System.out.print("\nCuenta: Inventario \tReferencia: "+codo+"\tCargo: ");
                                double Debe2=l.nextDouble();
                                System.out.print("\nCuenta: Proveedores\tReferencia: "+codoo+"\tAbono: ");
                                double Haber2=l.nextDouble();
                                System.out.println();
                                HProveedores+=Haber2;
                                DProveedores = HProveedores;
                                DInventario+=Debe2;
                                HCaja+=Haber2;
                                Compra.add(new Asiento(DInventario, HProveedores, "Inventario", "Proveedores", Regist, codo, codoo));
                                Espera();
                                break;

                            case 3:
                                Exit("Asientos");
                                exit=true;
                                break;

                            default:
                                Error();
                                Espera();
                                break;
                            
                            
                        }
                    }while(!exit);
                }
                    Caja=DCaja-HCaja-HInventario;
                    Inventario=DInventario-HInventario;
                    Proveedores=DProveedores-HProveedores;
                    double Debe=Caja+Cliente+Empleados+Inventario+PapeleriasYUtiles+Maquinaria+Mobiliario+CostoVenta;
                    double Haber=Proveedores+CapitalSocial+Venta;
                    double UtilidadEjercicio=Venta-CostoVenta;
                    Activo.add(new ElementoBalanceDeComprobacion("1.1.1.1", "Caja", DCaja, HCaja, Caja, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("1.1.2.1", "Clientes", Cliente, 0, Cliente, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("1.1.2.2", "Empleados", Empleados, 0, Empleados, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("1.1.2.3", "Inventario", DInventario, HInventario, Inventario, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("1.1.2.4", "Papelerías y Utiles", PapeleriasYUtiles, 0, PapeleriasYUtiles, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("2.1.0.1", "Maquinaria", Maquinaria, 0, Maquinaria, 0));
                    Activo.add(new ElementoBalanceDeComprobacion("2.1.0.2", "Mobiliario", Mobiliario, 0, Mobiliario, 0));
                    Pasivo.add(new ElementoBalanceDeComprobacion("2.1.0.3", "Proveedores", DProveedores, HProveedores, 0, 0));
                    Capita.add(new ElementoBalanceDeComprobacion("3.1.0.1", "Capital Social", 0, CapitalSocial, 0, CapitalSocial));
                    Ingres.add(new ElementoBalanceDeComprobacion("4.0.0.1", "Ventas", 0, Venta, 0, Venta));
                    Gasto.add(new ElementoBalanceDeComprobacion("5.0.0.1", "Costo de Venta", CostoVenta, 0, CostoVenta, 0));
            
                    break;
                
                case 3:
                if (hp) {

                    System.out.print("\n---BALANZA DE COMPROBACIÓN---");
                    DatosBalanzaComparacion(Ciclo, Debe, Haber, Activo, Pasivo, Capita, Ingres, Gasto);
                } else {
                    System.out.print("\nNo puede ejecutar esta funcionalidad mientras no hayan transacciones registrados, favor registrar al menos uno");
                    System.out.println("\t");
                }
                    break;
                    
                case 4:
                if (hp) {
                    System.out.print("\n---ESTADO DE RESULTADO---");
                    DatosEstadoResultado(Ciclo, Venta, CostoVenta);
                } else {
                    System.out.print("\nNo puede ejecutar esta funcionalidad mientras no hayan transacciones registrados, favor registrar al menos uno");
                    System.out.println("\t");
                }
                    break;
                    
                case 5:
                if (hp) {
                    System.out.print("\n---BALANCE GENERAL---");
                    DatosBalanceGeneral(Ciclo, Caja, Cliente, Empleados, Inventario, Mobiliario, Maquinaria, CapitalSocial, UtilidadEjercicio);
                } else {
                    System.out.print("\nNo puede ejecutar esta funcionalidad mientras no hayan transacciones registrados, favor registrar al menos uno");
                System.out.println("\t");
                }
                    break;
            
                case 6:
                    Exit("Sistema Contable");
                    salir=true;
                    break;

                default:
                    Error();
                    Espera();
                    break;
            }
        } while (!salir);
    l.close();
    }
}