import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Controller{

    ObservableList<Shape> allShapes;
    TableView.TableViewSelectionModel<Shape> selectionModel;
    TextInputDialog dialog;

    @FXML
    StackPane centerPanel;
    @FXML
    ColorPicker borderColorPicker;
    @FXML
    ColorPicker fillColorPicker;
    @FXML
    Slider changeXSlider;
    @FXML
    Slider changeYSlider;
    @FXML
    Slider rotationSlider;
    @FXML
    TableView<Shape> allElementsTable;
    @FXML
    TableColumn<Shape, Double> xColumn;
    @FXML
    TableColumn<Shape, Double> yColumn;
    @FXML
    TableColumn<Shape, Color> frameColorColumn;
    @FXML
    TableColumn<Shape, Color> fillColorColumn;
    @FXML
    TableColumn<Shape, String> layerNumberColumn;

    public Controller(){
        allShapes = FXCollections.observableArrayList();
        dialog = new TextInputDialog();
    }

    @FXML
    public void initialize(){
        selectionModel = allElementsTable.getSelectionModel();

        initTableColumns();
        allElementsTable.setItems(allShapes);

        selectionModel.selectedItemProperty().addListener( (obs, oldSelection, newSelection) ->
            assignShapeToControls(oldSelection, newSelection
        ));
    }

    @FXML
    public void addRect() {
        Optional<String> result = getValueFromDialog("Tworzenie prostokąta", "Podaj wymiary oddzielone ;");
        try{
            result.ifPresent(val -> {
                String[] arr = val.split(";");
                double doubleVal1 = Double.parseDouble(arr[0]);
                double doubleVal2 = Double.parseDouble(arr[1]);
                Rectangle rect = new Rectangle(doubleVal1, doubleVal2);
                allShapes.add(rect);
                selectionModel.select(rect);
                centerPanel.getChildren().addAll(rect);
            });
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawna wartość");
        }
    }

    @FXML
    public void addCircle() {
        Optional<String> result = getValueFromDialog("Tworzenie koła", "Podaj promień");
        try{
            result.ifPresent(val -> {
                double radius = Double.parseDouble(val);
                Circle circle = new Circle(radius, radius, radius);
                allShapes.add(circle);
                selectionModel.select(circle);
                centerPanel.getChildren().addAll(circle);
            });
        }catch(NumberFormatException e){
            System.out.println("Podano wartość tekstową, spróbuj ponownie");
        }
    }

    @FXML
    public void addFigForm(){
        Optional<String> result = getValueFromDialog("Tworzenie wielokąta foremnego", "Podaj liczbę boków");
        try{
            result.ifPresent(val -> {
                int number = Integer.parseInt(val);
                if(number > 2 && number < 100){
                    List<Double> points = new ArrayList<>();
                    Polygon polygon = new Polygon();
                    double phi = 0;
                    double aStep = (Math.PI*2)/number;
                    for (int i = 0; i < number; i++){
                        points.add(((Math.sin(phi)*30)*2)+30.0);
                        points.add(((Math.cos(phi)*30)*2)+30.0);
                        phi += aStep;
                    }
                    polygon.getPoints().addAll(points);
                    allShapes.add(polygon);
                    selectionModel.select(allShapes.size()-1);
                    centerPanel.getChildren().addAll(polygon);
                }
                else
                    System.out.println("Podano wartosc spoza zakresu");
            });
        }catch(NumberFormatException e){
            System.out.println("Podano wartość tekstową, spróbuj ponownie");
        }
    }

    @FXML
    public void addStar(){
        Optional<String> result = getValueFromDialog("Tworzenie gwiazdy", "Podaj liczbe ramion");
        try{
            result.ifPresent(val -> {
                int rays = Integer.parseInt(val);
                int outerRadius = 80, innerRadius = 40;
                int center = 80;
                List<Double> points = new ArrayList<>();
                Polygon star = new Polygon();
                double deltaAngleRad = Math.PI / rays; // kąt w ramieniu
                for (int i = 0; i < rays * 2; i++)
                {
                    double angleRad =i * deltaAngleRad; //kąt wyjścia ze środka
                    double cosAngleRad = Math.cos(angleRad);
                    double sinAngleRad = Math.sin(angleRad);
                    double x,y;
                    if ((i % 2) == 0)
                    {
                        x=cosAngleRad*outerRadius;
                        y=sinAngleRad*outerRadius;
                    }
                    else
                    {
                        x=cosAngleRad*innerRadius;
                        y=sinAngleRad*innerRadius;
                    }
                    points.add(center + x);
                    points.add(center + y);
                }
                star.getPoints().addAll(points);
                allShapes.add(star);
                selectionModel.select(allShapes.size()-1);
                centerPanel.getChildren().addAll(star);
            });
        }catch(NumberFormatException e){
            System.out.println("Podano wartość tekstową, spróbuj ponownie");
        }
    }

    @FXML
    public void addArrow(){
        Polygon arrow = new Polygon();

        arrow.getPoints().addAll(
                0.0,45.0,
                30.0,90.0,
                30.0,60.0,
                105.0,60.0,
                105.0,30.0,
                30.0,30.0,
                30.0,0.0,
                0.0,45.0
        );
        allShapes.add(arrow);
        selectionModel.select(allShapes.size()-1);
        centerPanel.getChildren().addAll(arrow);
    }

    @FXML
    public void addArc(){
        Optional<String> result = getValueFromDialog("Tworzenie łuku", "Podaj długość i kąt oddzielone ;");
        try{
            result.ifPresent(val -> {
                String[] arr = val.split(";");
                double length = Double.parseDouble(arr[0]);
                double angle = Double.parseDouble(arr[1]);
                Arc arc = new Arc(length, length, angle, angle, 0, length);
                arc.setType(ArcType.ROUND);
                allShapes.add(arc);
                selectionModel.select(allShapes.size()-1);
                centerPanel.getChildren().addAll(arc);
            });
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawna wartosc");
        }
    }

    private void initTableColumns(){
        xColumn.setCellValueFactory(new PropertyValueFactory<>("translateX"));
        yColumn.setCellValueFactory(new PropertyValueFactory<>("translateY"));
        frameColorColumn.setCellValueFactory(new PropertyValueFactory<>("stroke"));
        fillColorColumn.setCellValueFactory(new PropertyValueFactory<>("fill"));
        layerNumberColumn.setCellValueFactory(cellData -> {
            int layerNumber = centerPanel.getChildren().indexOf(cellData.getValue());
            return new SimpleStringProperty(String.valueOf(layerNumber));
        });
    }

    public void assignShapeToControls(Shape oldSelection, Shape newSelection){

        if(oldSelection != null){
            oldSelection.fillProperty().unbind();
            oldSelection.strokeProperty().unbind();
            oldSelection.translateXProperty().unbind();
            oldSelection.translateYProperty().unbind();
            oldSelection.rotateProperty().unbind();
        }

        fillColorPicker.setValue((Color) newSelection.getFill());
        borderColorPicker.setValue((Color) newSelection.getStroke());
        changeXSlider.setValue(newSelection.getTranslateX());
        changeYSlider.setValue(newSelection.getTranslateY());
        rotationSlider.setValue(newSelection.getRotate());

        newSelection.fillProperty().bind(fillColorPicker.valueProperty());
        newSelection.strokeProperty().bind(borderColorPicker.valueProperty());
        newSelection.translateXProperty().bind(changeXSlider.valueProperty());
        newSelection.translateYProperty().bind(changeYSlider.valueProperty());
        newSelection.rotateProperty().bind(rotationSlider.valueProperty());

    }

    private Optional<String> getValueFromDialog(String title, String content){
        dialog.setTitle(title);
        dialog.setContentText(content);
        return dialog.showAndWait();
    }
}
