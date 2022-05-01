package examenpractico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Examenpractico {
    public static void main(String[] args) {
        int pos, n, cont = 0;
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        String patch = buscador.getSelectedFile().getAbsolutePath(), menu,busc = "";
        inventario producto = new inventario();
        Scanner sc = new Scanner(System.in);
        File file = new File(patch);
        String archivo[] = null;
        FileReader filereader = null;
        BufferedReader bufferedreader;
        try {
            if (file.exists() && file.isFile()) {
                String nLine;
                filereader = new FileReader(patch);
                bufferedreader = new BufferedReader(filereader);
                while ((nLine = bufferedreader.readLine()) != null) {
                    if (cont == 0) {
                        n = Integer.parseInt(nLine);
                        archivo = new String[n];
                    }
                    if (cont > 0) {
                        archivo[cont - 1] = nLine;
                    }
                    cont++;
                }
                bufferedreader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (filereader != null) {
                try {
                    filereader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        for (int i = 0; i < cont - 1; i++) {
            System.out.println(archivo[i]);
        }
        inventario[] objetos = new inventario[cont - 1];
        for (int i = 0; i < cont - 1; i++) {
            pos = archivo[i].indexOf(",");
            producto.PRODUCTO = archivo[i].substring(0, pos);
            producto.CANTIDAD = Integer.parseInt(archivo[i].substring(pos + 2, archivo[i].length()));
            objetos[i] = producto;
            producto = null;
            producto = new inventario();
        }
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("Ordenar");
            System.out.println("Buscar");
            System.out.println("Salir");
            menu = sc.nextLine().toUpperCase();
            switch (menu) {
                case "ORDENAR":
                    System.out.println("Escoja un modo de ordenar la Información:");
                    System.out.println("Burbuja");
                    System.out.println("Shell");
                    String orden = sc.nextLine().toUpperCase();
                    System.out.println("Elija la forma de Ordenamiento");
                    System.out.println("Nombre");
                    System.out.println("Cantidad");
                    String dato = sc.nextLine().toUpperCase();
                    switch (orden) {
                        case "BURBUJA":
                            System.out.println("ASCENDENTE");
                            System.out.println("DESCENDENTE");
                            String ascdesc = sc.nextLine().toUpperCase();
                            switch (ascdesc) {
                                case "ASCENDENTE":
                                    burbujaasc(objetos, dato, producto);
                                    break;
                                case "DESCENDENTE":
                                    burbujadesc(objetos, dato, producto);
                            }
                            break;
                        case "SHELL":
                            System.out.println("ASCENDENTE");
                            System.out.println("DESCENDENTE");
                            ascdesc = sc.nextLine().toUpperCase();
                            switch (ascdesc) {
                                case "ASCENDENTE":
                                    shellasc(objetos, dato, producto);
                                    break;
                                case "DESCENDENTE":
                                    shelldesc(objetos, dato, producto);
                                    break;
                            }
                            break;
                    }
                    break;
                case "BUSCAR":
                    System.out.println("Cual Metodo de Busqueda Quieres usar?");
                    System.out.println("Secuencial");
                    System.out.println("Binaria");
                    String busq = sc.nextLine().toUpperCase();
                    System.out.println("En que cual propiedad quieres buscar?");
                    System.out.println("Nombre");
                    System.out.println("Cantidad");
                    dato = sc.nextLine().toUpperCase();
                    switch (busq) {
                        case "SECUENCIAL":
                            System.out.println("Cual dato esta buscando");
                            busc = sc.nextLine().toUpperCase();
                            secuencial(objetos, dato, busc);

                            break;
                        case "BINARIA":
                            System.out.println("Cual dato esta buscando");
                            busc = sc.nextLine().toUpperCase();
                            burbujaasc(objetos, dato, producto);
                            switch (dato) {
                                case "NOMBRE":
                                    binarianombre(objetos, busc);
                                    break;
                                case "CANTIDAD":
                                    binariacantidad(objetos, busc);
                                    break;
                            }

                            break;
                    }
                    break;
            }
        } while (!"ORDENAR".equals(menu) && !"BUSCAR".equals(menu));
    }
    static void burbujaasc(inventario[] array, String dato, inventario producto) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ("PRODUCTO".equals(dato)) {
                    int valor;
                    valor = array[i].PRODUCTO.compareTo(array[j].PRODUCTO);
                    if (valor > 0) {
                        producto = array[i];
                        array[i] = array[j];
                        array[j] = producto;
                        producto = null;
                        producto = new inventario();
                    }
                }
                if ("CANTIDAD".equals(dato)) {
                    if (array[i].CANTIDAD > array[j].CANTIDAD) {
                        producto = array[i];
                        array[i] = array[j];
                        array[j] = producto;
                        producto = null;
                        producto = new inventario();
                    }
                }
            }
        }
        System.out.println("Inventario Ordenando...");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nombre del producto " + array[i].PRODUCTO + " cantidad disponible " + array[i].CANTIDAD);
        }
    }
    static void burbujadesc(inventario[] array, String dato, inventario producto) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ("PRODUCTO".equals(dato)) {
                    int valor;
                    valor = array[i].PRODUCTO.compareTo(array[j].PRODUCTO);
                    if (valor < 0) {
                        producto = array[i];
                        array[i] = array[j];
                        array[j] = producto;
                        producto = null;
                        producto = new inventario();
                    }
                }
                if ("CANTIDAD".equals(dato)) {
                    if (array[i].CANTIDAD < array[j].CANTIDAD) {
                        producto = array[i];
                        array[i] = array[j];
                        array[j] = producto;
                        producto = null;
                        producto = new inventario();
                    }
                }
            }
        }
        System.out.println("Inventario Ordenando...");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nombre del producto " + array[i].PRODUCTO + " cantidad disponible " + array[i].CANTIDAD);
        }
    }
    static void shellasc(inventario[] array, String dato, inventario producto) {

        int i, j, incremento;
        boolean cambio = false;
        for (incremento = array.length / 2; incremento != 0; incremento /= 2.2) {
            cambio = true;
            while (cambio) {
                cambio = false;
                for (i = incremento; i < array.length; i++) {
                    int valor = 0;
                    if ("PRODUCTO".equals(dato)) {
                        valor = array[i - incremento].PRODUCTO.compareTo(array[i].PRODUCTO);
                    } else if ("CANTIDAD".equals(dato)) {
                        valor = array[i - incremento].CANTIDAD - array[i].CANTIDAD;
                    }
                    if (valor > 0) {
                        producto = array[i];
                        array[i] = array[i - incremento];
                        array[i - incremento] = producto;
                        cambio = true;
                        producto = null;
                        producto = new inventario();
                    }
                }
            }
        }
        System.out.println("Inventario Ordenando...");
        for (i = 0; i < array.length; i++) {
            System.out.println("nombre del producto " + array[i].PRODUCTO + " cantidad disponible " + array[i].CANTIDAD);
        }
    }
    static void shelldesc(inventario[] array, String dato, inventario producto) {
        int i, j, incremento;
        boolean cambio = false;
        for (incremento = array.length / 2; incremento != 0; incremento /= 2.2) {
            cambio = true;
            while (cambio) {
                cambio = false;
                for (i = incremento; i < array.length; i++) {
                    int valor = 0;
                    if ("PRODUCTO".equals(dato)) {
                        valor = array[i - incremento].PRODUCTO.compareTo(array[i].PRODUCTO);
                    } else if ("CANTIDAD".equals(dato)) {
                        valor = array[i - incremento].CANTIDAD - array[i].CANTIDAD;
                    }
                    if (valor < 0) {
                        producto = array[i];
                        array[i] = array[i - incremento];
                        array[i - incremento] = producto;
                        cambio = true;
                        producto = null;
                        producto = new inventario();
                    }
                }
            }
        }
        System.out.println("Inventario Ordenando...");
        for (i = 0; i < array.length; i++) {
            System.out.println("nombre del producto " + array[i].PRODUCTO + " cantidad disponible " + array[i].CANTIDAD);
        }
    }
    static void secuencial(inventario[] array, String dato, String busq) {
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].PRODUCTO.equals(busq) && "PRODUCTO".equals(dato)) {
                System.out.println("NOMBRE DEL PRODUCTO: " + array[i].PRODUCTO + " cantidad en existencia " + array[i].CANTIDAD);
                flag = 1;
            } else if ("CANTIDAD".equals(dato) && array[i].CANTIDAD == Integer.parseInt(busq)) {
                System.out.println("NOMBRE DEL PRODUCTO: " + array[i].PRODUCTO + " cantidad en existencia " + array[i].CANTIDAD);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("no se encontro la información solicitada");
        }
    }
    static void binarianombre(inventario[] array, String busq) {
        int inf = 0, sup = array.length, valor, centro, flag = 0;
        while (inf <= sup && flag == 0) {
            centro = (inf + sup) / 2;
            if (array[centro].PRODUCTO.equals(busq)) {
                flag = 1;
                System.out.println("se encontro la informacion buscada");
                System.out.println("nombre del producto" + array[centro].PRODUCTO + " cantidad disponible " + array[centro].CANTIDAD);
            } else {
                valor = array[centro].PRODUCTO.compareTo(busq);
                if (valor > 0) {
                    sup = centro;
                } else {
                    inf = centro;
                }
            }
        }
        if (flag == 1) {
            System.out.println("no se encontro ninguna información");
        }
    }
    static void binariacantidad(inventario[] array, String busq) {
        int inf = 0, sup = array.length, centro, flag = 0;
        while (inf <= sup && flag == 0) {
            centro = (inf + sup) / 2;
            if (array[centro].CANTIDAD == Integer.parseInt(busq)) {
                flag = 1;
                System.out.println("se encontro la informacion buscada");
                System.out.println("nombre del producto " + array[centro].PRODUCTO + " cantidad disponible " + array[centro].CANTIDAD);
            } else {

                if (array[centro].CANTIDAD > Integer.parseInt(busq)) {
                    sup = centro;
                } else {
                    inf = centro;
                }
            }
        }
        if (flag == 0) {
            System.out.println("no se encontro ninguna información");
        }
    }
}
