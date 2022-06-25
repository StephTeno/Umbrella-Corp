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
    public static void DatosBalanceGeneral(String Ciclo, double SC, double SCL, double SE, double SI, double SM, double SMa, double CS, double UE){
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
        System.out.println("\t\t\tCaja \t"+SC);
        System.out.println("\t\t\tClientes \t"+SCL);
        System.out.println("\t\t\tEmpleados \t"+SE);
        System.out.println("\t\t\tInventario \t"+SI);
        System.out.println("\t\t\tMobiliario \t"+SM);
        System.out.println("\t\t\tMaquinario \t"+SMa);
        double TA=SC+SCL+SE+SI+SM+SMa;
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tTOTAL ACTIVOS= \t"+TA);
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\t\tCAPITAL");
        System.out.println("\t\t\tCapital social \t"+CS);
        System.out.println("\t\t\tUtilidad del ejercicio \t"+UE);
        double TC=CS+UE;
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t\tTOTAL CAPITAL= \t"+TC);
        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\tTOTAL ACTIVOS\t\t=\tCAPITAL");
        System.out.println("\t\t"+TA+"\t\t= \t"+TC);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void DatosEstadoResultado(String Ciclo, double VN, double CV){
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
        System.out.println("\t\t\tVentas Netas\t"+VN);
        System.out.println("\t\t\tCosto de Venta\t"+CV);
        double UE=VN-CV;
        System.out.println("\t\tUtilidad del Ejercicio \t"+UE);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void DatosBalanzaComparacion(String Ciclo, double TC, double TCL, double TE, double TI, double TM, double TMa,double TP, double TIR, double TCS, double TUE, double TV, double TCV){
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
        System.out.println("\t\tCaja \t\t"+271866.05+"\t\t"+238523.1+"\t\t"+"-"+"\t\t\t"+"-");
        System.out.println("\t\tInventario \t"+332546.7+"\t\t"+212711.72+"\t\t"+119834.98+"\t\t"+"-");
        System.out.println("\t\tMobiliario \t"+35000+"\t\t\t"+"-"+"\t\t\t"+35000+"\t\t\t"+"-");
        System.out.println("\t\tMaquinario \t"+15000+"\t\t\t"+"-"+"\t\t\t"+15000+"\t\t\t"+"-");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tPASIVOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tProveedores \t"+265889.65+"\t\t"+265889.65+"\t\t"+"-"+"\t\t"+"-");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tCAPITAL");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tCapital social \t"+"-"+"\t\t\t"+150000+"\t\t\t"+"-"+"\t\t\t"+150000);
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tINGRESOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tVENTAS  \t"+"-"+"\t\t\t"+265889.65+"\t\t"+"-"+"\t\t\t"+265889.65);
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tGASTOS");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tCOSTO DE VENTA \t"+212711.72+"\t\t"+212711.72);
        System.out.println("\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tTOTALES \t"+1133014.12+"\t\t"+1133014.12+"\t\t"+415889.65+"\t\t"+415889.65);
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        boolean salir=false, hp=false, exit=false;
        int op, o, cont=-1;
        String Ciclo;
        double HInv=0, DInv=0, cV=0, V=0, DC=0, HC=0, Prov=0, Caja=0, Cliente=0, Empleados=0, Inventario=0, PapeleriasYUtiles=0, Maquinaria=0, Mobiliario=0,
        Proveedores=0, CapitalSocial=0;
        ArrayList<ElementosEF> Activos=new ArrayList<>();
        ArrayList<ElementosEF> Pasivos=new ArrayList<>();
        ArrayList<ElementosEF> Capital=new ArrayList<>();
        ArrayList<ElementosEF> Ingreso=new ArrayList<>();
        ArrayList<ElementosEF> Gastos=new ArrayList<>();
        ArrayList<Asiento> Venta=new ArrayList<>();
        ArrayList<Asiento> Compra=new ArrayList<>();
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
                                double Debe=l.nextDouble();
                                System.out.print("\nCuenta: Inventario \tReferencia: "+codi+"\tAbono: ");
                                double Haber=l.nextDouble();
                                System.out.println();
                                HInventario+=Haber*0.8;
                                DCaja+=Debe;
                                Venta.add(new Asiento(DC, HInv, "Caja", "Inventario", Registro, cod, codi));
                                CostoVenta+=HInv; //Costo de Ventas (Gasto=Debe)
                                Venta+=Debe; //Ventas (Ingreso=Haber)
                                Venta.add(new Asiento(cV, V, "Costo de Venta", "Ventas", Registro, "5.0.0.1", "4.0.0.1"));
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
                                double Debe1=l.nextDouble();
                                System.out.print("\nCuenta: Proveedores\tReferencia: "+codoo+"\tAbono: ");
                                double Haber1=l.nextDouble();
                                System.out.println();
                                Prov+=Haber1;
                                DInv+=Debe1;
                                HC+=Haber1;
                                Compra.add(new Asiento(DInv, Prov, "Inventario", "Proveedores", Regist, codo, codoo));
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

                    Caja=
                    break;
                
                case 3:
                if (hp) {
                    System.out.print("\n---BALANZA DE COMPROBACIÓN---");
                } else {
                    System.out.print("\nNo puede ejecutar esta funcionalidad mientras no hayan transacciones registrados, favor registrar al menos uno");
                    System.out.println("\t");
                }
                    break;
                    
                case 4:
                if (hp) {
                    System.out.print("\n---ESTADO DE RESULTADO---");
                } else {
                    System.out.print("\nNo puede ejecutar esta funcionalidad mientras no hayan transacciones registrados, favor registrar al menos uno");
                    System.out.println("\t");
                }
                    break;
                    
                case 5:
                if (hp) {
                    System.out.print("\n---BALANCE GENERAL---");
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