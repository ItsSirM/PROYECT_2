/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class call_png_fichas {

    private static final Map<String, ImageIcon> colorFicha = new HashMap<>();

    static {
        colorFicha.put("AZUL", new ImageIcon("src/tokens/azulToken.png"));
        colorFicha.put("AMARILLO", new ImageIcon("src/tokens/amarilloToken.png"));
        colorFicha.put("VERDE", new ImageIcon("src/tokens/verdeToken.png"));
        colorFicha.put("ROJO", new ImageIcon("src/tokens/rojoToken.png"));
        colorFicha.put("MORADO", new ImageIcon("src/tokens/moradoToken.png"));
        colorFicha.put("NARANJA", new ImageIcon("src/tokens/naranja.png"));
        colorFicha.put("CAFE", new ImageIcon("src/tokens/cafeToken.png"));
        colorFicha.put("NEGRO", new ImageIcon("src/tokens/negroToken.png"));

    }

    public static ImageIcon getToken(String nombreColor) {
        ImageIcon icono = colorFicha.get(nombreColor.toUpperCase());
        if (icono == null) {
            icono = colorFicha.get("AZUL");
        }
        return icono;
    }

    public static ImageIcon cartaCardBack() {
        ImageIcon icono = new ImageIcon("src/imagenes/cardBack.png");
        return icono;
    }
}
