// Exercise 10: MVC Pattern
class Model {
    private String data = "Hello";
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}

class View {
    public void show(String data) {
        System.out.println("View displaying: " + data);
    }
}

class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void updateView() {
        view.show(model.getData());
    }
    public void changeData(String data) {
        model.setData(data);
    }
}

class MVCTest {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView();
        controller.changeData("Updated Hello");
        controller.updateView();
    }
}
