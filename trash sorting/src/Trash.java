enum Transparency{ TRANSPARENT, TRANSLUCENT, OPAQUE };
enum Color1 { WHITE, BLACK, GREEN, BROWN, NONE, YELLOW, SILVER, OTHER};
enum Shape{CYLINDER, RECTANGULAR, OTHER}
enum Smoothness{SMOOTH, WRINKLY}

public class Trash {
    private Transparency trans;
    private Color1 col;
    private Shape shape;
    private Color1 col2;
    private Smoothness smoo;


    Trash(Transparency t, Color1 c, Shape s, Smoothness smoo) {
        col = c;
        trans = t;
        shape = s;
        this.smoo = smoo;
    }

    Trash(Transparency t, Color1 c, Color1 c2, Shape s, Smoothness smoo) {
        trans = t;
        shape = s;
        col = c;
        col2 = c2;
        this.smoo = smoo;
    }

    public Color1 getCol2() {
        return col2;
    }

    public Transparency getTrans() {
        return this.trans;
    }

    public void setTrans(Transparency trans) {
        this.trans = trans;
    }

    public Color1 getCol() {
        return this.col;
    }

    public Shape getShape() {
        return shape;
    }

    public void setCol(Color1 col) {
        this.col = col;
    }

    public Smoothness getSmoo() {
        return smoo;
    }

    public void printVals() {
        System.out.println("Transparency: " + this.getTrans());
        System.out.println("Color: " + this.getCol());
    }
}
