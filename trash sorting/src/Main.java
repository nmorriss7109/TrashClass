import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;

    private RadioButton radioButton11;
    private RadioButton radioButton22;
    private RadioButton radioButton33;
    private RadioButton radioButton44;
    private RadioButton radioButton55;
    private RadioButton radioButton66;
    private RadioButton radioButton77;

    private RadioButton cylinder;
    private RadioButton rectangular;
    private RadioButton other;

    private RadioButton transparent;
    private RadioButton translucent;
    private RadioButton opaque;

    private RadioButton smooth;
    private RadioButton wrinkly;


    private Color1 color;
    private Color1 color2;
    private Shape shape;
    private Smoothness smoothness;
    private Transparency transparency;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Waste Classifier");
        BorderPane main = new BorderPane();
        Text t = new Text("Welcome! Let's clean the world one trash at a time!");
        t.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
        t.setFill(Color.GREEN);
        main.setTop(t);

        Scene scene = new Scene(main, 1000,900);
        primaryStage.setScene(scene);
        t.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        t.setFill(Color.GREEN);



        radioButton1 = new RadioButton("White");
        radioButton2 = new RadioButton("Black");
        radioButton3 = new RadioButton("Green");
        radioButton4 = new RadioButton("Brown");
        radioButton5 = new RadioButton("Silver");
        radioButton6 = new RadioButton("None");
        radioButton7 = new RadioButton("Other");

        final ToggleGroup color1togglegroup = new ToggleGroup();

        radioButton1.setToggleGroup(color1togglegroup);
        radioButton2.setToggleGroup(color1togglegroup);
        radioButton3.setToggleGroup(color1togglegroup);
        radioButton4.setToggleGroup(color1togglegroup);
        radioButton5.setToggleGroup(color1togglegroup);
        radioButton6.setToggleGroup(color1togglegroup);
        radioButton7.setToggleGroup(color1togglegroup);
        color1togglegroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (radioButton1.isSelected()) {
                    color = Color1.WHITE;
                } else if (radioButton2.isSelected()) {
                    color = Color1.BLACK;
                } else if (radioButton3.isSelected()) {
                    color = Color1.GREEN;
                } else if (radioButton4.isSelected()) {
                    color = Color1.BROWN;
                } else if (radioButton5.isSelected()) {
                    color = Color1.SILVER;
                } else if (radioButton6.isSelected()) {
                    color = Color1.NONE;
                } else if (radioButton7.isSelected()) {
                    color = Color1.OTHER;
                }
            }
        });

        HBox color1 = new HBox(radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7);
        color1.setSpacing(20);
        color1.setAlignment(Pos.CENTER);

        Label labelColor1 = new Label("Primary Color");
        labelColor1.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        VBox firstProperty = new VBox(labelColor1, color1);
        firstProperty.setSpacing(10);
        firstProperty.setAlignment(Pos.CENTER);



        //Second color

        radioButton11 = new RadioButton("White");
        radioButton22 = new RadioButton("Black");
        radioButton33 = new RadioButton("Green");
        radioButton44 = new RadioButton("Brown");
        radioButton55 = new RadioButton("Silver");
        radioButton66 = new RadioButton("None");
        radioButton77 = new RadioButton("Other");

        ToggleGroup color2togglegroup = new ToggleGroup();

        radioButton11.setToggleGroup(color2togglegroup);
        radioButton22.setToggleGroup(color2togglegroup);
        radioButton33.setToggleGroup(color2togglegroup);
        radioButton44.setToggleGroup(color2togglegroup);
        radioButton55.setToggleGroup(color2togglegroup);
        radioButton66.setToggleGroup(color2togglegroup);
        radioButton77.setToggleGroup(color2togglegroup);
        color2togglegroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (radioButton1.isSelected()) {
                    color2 = Color1.WHITE;
                } else if (radioButton2.isSelected()) {
                    color2 = Color1.BLACK;
                } else if (radioButton3.isSelected()) {
                    color2 = Color1.GREEN;
                } else if (radioButton4.isSelected()) {
                    color2 = Color1.BROWN;
                } else if (radioButton5.isSelected()) {
                    color2 = Color1.SILVER;
                } else if (radioButton6.isSelected()) {
                    color2 = Color1.NONE;
                } else if (radioButton7.isSelected()) {
                    color2 = Color1.OTHER;
                }
            }
        });

        HBox color2box = new HBox(radioButton11, radioButton22, radioButton33, radioButton44, radioButton55, radioButton66, radioButton77);
        color2box.setSpacing(20);
        color2box.setAlignment(Pos.CENTER);
        Label labelColor2 = new Label("Secondary Color");
        labelColor2.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        VBox secondProperty = new VBox(labelColor2, color2box);
        secondProperty.setSpacing(10);
        secondProperty.setAlignment(Pos.CENTER);

        //shape
        cylinder = new RadioButton("Cylinder");
        rectangular = new RadioButton("Rectangular");
        other = new RadioButton("Other");


        ToggleGroup shapetogglegroup = new ToggleGroup();

        cylinder.setToggleGroup(shapetogglegroup);
        rectangular.setToggleGroup(shapetogglegroup);
        other.setToggleGroup(shapetogglegroup);
        shapetogglegroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (cylinder.isSelected()) {
                    shape = Shape.CYLINDER;
                } else if (rectangular.isSelected()) {
                    shape = Shape.RECTANGULAR;
                } else if (other.isSelected()) {
                    shape = Shape.OTHER;
                }
            }
        });

        HBox shapebox = new HBox(cylinder, rectangular, other);
        shapebox.setSpacing(20);
        shapebox.setAlignment(Pos.CENTER);
        Label labelShape = new Label("Shape");
        labelShape.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        VBox thirdProperty = new VBox(labelShape, shapebox);
        thirdProperty.setSpacing(10);
        thirdProperty.setAlignment(Pos.CENTER);

        // Transparency
        transparent = new RadioButton("Transparent");
        translucent = new RadioButton("Translucent");
        opaque = new RadioButton("Opaque");


        ToggleGroup transToggleGroup = new ToggleGroup();

        transparent.setToggleGroup(transToggleGroup);
        translucent.setToggleGroup(transToggleGroup);
        opaque.setToggleGroup(transToggleGroup);
        transToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (transparent.isSelected()) {
                    transparency = Transparency.TRANSPARENT;
                } else if (translucent.isSelected()) {
                    transparency = Transparency.TRANSLUCENT;
                } else if (opaque.isSelected()) {
                    transparency = Transparency.OPAQUE;
                }
            }
        });

        HBox transBox = new HBox(transparent, translucent, opaque);
        transBox.setSpacing(20);
        transBox.setAlignment(Pos.CENTER);
        Label labelTrans = new Label("Transparency");
        labelTrans.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        VBox fourthProperty = new VBox(labelTrans, transBox);
        fourthProperty.setSpacing(10);
        fourthProperty.setAlignment(Pos.CENTER);

        //Smoothness
        smooth = new RadioButton("Smooth");
        wrinkly = new RadioButton("Wrinkly");


        ToggleGroup smoothnessToggleGroup = new ToggleGroup();
        Text tr = new Text("");
        tr.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        tr.setFill(Color.GREEN);

        smooth.setToggleGroup(smoothnessToggleGroup);
        wrinkly.setToggleGroup(smoothnessToggleGroup);
        smoothnessToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (smooth.isSelected()) {
                    smoothness = Smoothness.SMOOTH;
                } else if (wrinkly.isSelected()) {
                    smoothness = Smoothness.WRINKLY;
                }
            }
        });

        HBox smoothBox = new HBox(smooth, wrinkly);
        smoothBox.setSpacing(20);
        smoothBox.setAlignment(Pos.CENTER);
        Label labelSmooth = new Label("Smoothness");
        labelSmooth.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        VBox fifthProperty = new VBox(labelSmooth, smoothBox);
        fifthProperty.setSpacing(10);
        fifthProperty.setAlignment(Pos.CENTER);

        // Classify Button

        Button classify = new Button("Classify");
        classify.setMinSize(150,50);
        HBox buttonBox = new HBox(classify);
        buttonBox.setAlignment(Pos.CENTER);

        classify.setOnAction(e -> {
            Trash trash = new Trash(transparency, color, color2, shape, smoothness);
            String s = sorting(trash);
            tr.setText(s);

        });

        // Text Pane
        Pane canvas = new Pane();
        canvas.setPrefSize(200,200);
        canvas.getChildren().add(tr);
        HBox textPane = new HBox(canvas);
        textPane.setAlignment(Pos.CENTER);
        



        //MAIN VBOX of ALL PROPERTIES

        VBox properties = new VBox(firstProperty, secondProperty, thirdProperty, fourthProperty, fifthProperty,
                buttonBox, textPane);
        properties.setSpacing(30);
        main.setCenter(properties);

        // setting size of all radiobuttons
        color1.setScaleX(1.2);
        color1.setScaleY(1.2);
        color2box.setScaleX(1.2);
        color2box.setScaleY(1.2);
        shapebox.setScaleX(1.2);
        shapebox.setScaleY(1.2);
        transBox.setScaleX(1.2);
        transBox.setScaleY(1.2);
        smoothBox.setScaleX(1.2);
        smoothBox.setScaleY(1.2);


        primaryStage.show();


    }


    private String sorting(Trash t) {
        if (t.getCol() == Color1.SILVER) {
            return "Metal";
        }

        if (t.getShape() == Shape.RECTANGULAR) {
            if (t.getTrans() == Transparency.OPAQUE) {
                if (t.getCol() == Color1.BROWN) {
                    return "Cardboard";
                } else {
                    return "Paper";
                }
            }
        }

        if (t.getSmoo() == Smoothness.SMOOTH) {
                if (t.getTrans() == Transparency.TRANSPARENT) {
                    return "Glass";
                } else if (t.getTrans() == Transparency.TRANSLUCENT) {
                    return "Plastic";
                } else if (t.getShape() == Shape.CYLINDER) {
                    if (t.getCol() == Color1.BROWN || t.getCol2() == Color1.WHITE) {
                        return "Cigarette Bud";
                    }
                }
            } else if (t.getSmoo() == Smoothness.WRINKLY) {
                if (t.getTrans() == Transparency.TRANSLUCENT) {
                    return "Plastic";
                } else if (t.getTrans() == Transparency.OPAQUE) {
                    return "Paper";
                }

            }

        return "Error";
    }

}