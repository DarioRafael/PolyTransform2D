package PaginaPrincipalFolder;

import PaginaPrincipalFolder.Transformaciones.PaginasImport.PortadaTransformaciones;

public class TransGeo {
    PortadaTransformaciones portadaTransformaciones = new PortadaTransformaciones();

    public TransGeo() {
        ejecutarPrograma();
    }

    public void ejecutarPrograma(){
        portadaTransformaciones.setVisible(true);
    }
    public static void main(String[] args) {
        new TransGeo();
    }
}
