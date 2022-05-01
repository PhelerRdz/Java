package plantilla;

public class Ordenamientos {

    void Burbuja(Nodo Raiz) {
        Nodo listaI = new Nodo();
        Nodo listaJ = new Nodo();
        Nodo listaAux = new Nodo();
        listaI = Raiz;
        while (listaI.Der != null) {
            listaJ = listaI.Der;
            while (listaJ != null) {
                if (listaI.Nombre.compareTo(listaJ.Nombre) > 0) {
                    listaAux.Nombre = listaI.Nombre;
                    listaAux.Direccion = listaI.Direccion;
                    listaI.Nombre = listaJ.Nombre;
                    listaI.Direccion = listaJ.Direccion;
                    listaJ.Nombre = listaAux.Nombre;
                    listaJ.Direccion = listaAux.Direccion;
                }
                listaJ = listaJ.Der;
            }
            listaI = listaI.Der;
        }
    }

    void QuickSort(Nodo Raiz, Nodo izq, Nodo der) {
        Nodo listaI = new Nodo();
        Nodo listaJ = new Nodo();
        Nodo listaAux = new Nodo();
        Nodo listAuxI = new Nodo();
        Nodo listaAuxJ = new Nodo();
        listaI = izq;
        listaJ = der;
        String frenoNombre = izq.Nombre;
        String frrenoDireccion = izq.Direccion;
        boolean band = false;
        do {
            band = false;
            listAuxI = listaI;
            while (listAuxI.Der != null && band == false) {
                if (listAuxI.Der == listaJ) {
                    band = true;
                }
                listAuxI = listAuxI.Der;
            }
            if (band) {
                while (listaI.Nombre.compareTo(frenoNombre) <= 0 && listaI.Der != null) {
                    listaI = listaI.Der;
                }
                while (listaJ.Nombre.compareTo(frenoNombre) > 0 && listaJ.Izq != null) {
                    listaJ = listaJ.Izq;
                }
                band = false;
                listAuxI = listaI;
                while (listAuxI.Der != null && band == false) {
                    if (listAuxI.Der == listaJ) {
                        band = true;
                    }
                    listAuxI = listAuxI.Der;
                }
                if (band) {
                    listaAux.Nombre = listaI.Nombre;
                    listaAux.Direccion = listaI.Direccion;
                    listaI.Nombre = listaJ.Nombre;
                    listaI.Direccion = listaJ.Direccion;
                    listaJ.Nombre = listaAux.Nombre;
                    listaJ.Direccion = listaAux.Direccion;
                }
            }
        } while (band);
        izq.Nombre = listaJ.Nombre;
        izq.Direccion = listaJ.Direccion;
        listaJ.Nombre = frenoNombre;
        listaJ.Direccion = frrenoDireccion;
        band = false;
        listAuxI = izq;
        while (listAuxI != null && band == false) {
            if (listAuxI.Der.Der == listaJ) {
                band = true;
            }
            if (listAuxI.Der == listaJ) {
                break;
            }
            if (listAuxI == listaJ) {
                break;
            }
            listAuxI = listAuxI.Der;
        }
        if (band) {
            QuickSort(Raiz, izq, listaJ.Izq);
        }
        band = false;
        listaAuxJ = listaJ.Der;
        while (listaAuxJ != null && band == false) {
            if (listaAuxJ.Der == der) {
                band = true;
            }
            listaAuxJ = listaAuxJ.Der;
        }
        if (band) {
            QuickSort(Raiz, listaJ.Der, der);
        }
    }
}
