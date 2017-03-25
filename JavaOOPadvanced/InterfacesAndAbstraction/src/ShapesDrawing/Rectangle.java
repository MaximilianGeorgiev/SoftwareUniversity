package ShapesDrawing;

import org.w3c.dom.css.Rect;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String draw() {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < this.getHeight(); i++) {
            if (i == 0 || i == this.getHeight() - 1) {
                for (int j = 0; j < this.getWidth(); j++) {
                    out.append("* ");
                }
            } else {
                out.append("* ");

                for (int j = 0; j < this.getWidth() - 2; j++) {
                    out.append("  ");
                }

                out.append("*");
            }
            out.append("\n");
        }

        return out.toString();
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
