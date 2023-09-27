
package universidadgrupo37.imagen;

//ESTA CLASE REPRESENTA A JInternalFrame

import javax.swing.JInternalFrame;

public class InternalFrameImagen extends JInternalFrame {
    private PanelImagen pi= new PanelImagen();//usamos el constructor vacío porque la imagen lo ponemos en c/internalframen

    public InternalFrameImagen() {
        setContentPane(pi);
    }
     public void setImagen(String nombreImagen){
         pi.setImagen( nombreImagen );
     }
    
    
}
