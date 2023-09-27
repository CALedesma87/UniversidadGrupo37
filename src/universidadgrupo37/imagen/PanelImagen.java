package universidadgrupo37.imagen;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//ESTE PANEL ES EL QUE CONTIENE LA IMAGEN PERO NO HACE NADA HASTA QUE SE LO PONGAMOS AL JInternalFrame
public class PanelImagen extends JPanel {

    private Image imagen; //objeto que contiene a la imagen

    public PanelImagen() {
        imagen = null; //creamos al objeto sin ningun argumento establecido
    }

    public PanelImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }
    }

    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        } else {
            imagen = null;
        }
        repaint();//para que pinte el contenedor con la imagen
    }

    @Override
    public void paintComponent(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//pintamos al panel con la imagen
            this.setOpaque(false);
        }else{//en caso que la imagen sea null o no se encuentre
           this.setOpaque(true); 
        }
        super.paint(g);
    }
}
