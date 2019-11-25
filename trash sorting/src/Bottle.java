enum Transparency{ TRANSPARENT, TRANSLUCENT, OPAQUE };
enum Color{ WHITE, BLACK, GREEN, BROWN, NONE };

public class Bottle {
    private Transparency trans;
    private Color col;
    Bottle (Transparency t, Color c) {
        col = c;
        trans = t;
    }

    public Transparency getTrans() {
        return this.trans;
    }

    public void setTrans(Transparency trans) {
        this.trans = trans;
    }

    public Color getCol() {
        return this.col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    private void printVals() {
        System.out.println("Transparency: " + this.getTrans());
        System.out.println("Color: " + this.getCol());
    }
}
