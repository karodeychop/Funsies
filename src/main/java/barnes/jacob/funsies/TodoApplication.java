package barnes.jacob.funsies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

import com.google.gson.*;




//TODO: implement reading json array of TodoListItems from file, populate a ListView within the window with those items, and store upon application exit.
public class TodoApplication extends Application {

    String PATH = System.getProperty("user.dir");
    String testJson = "{description:\"Eat a lot of spaghetti.\",dateCreated:\"2021-05-12\", dateUpdated:\"2022-01-02\", goal:\"2029-1-03\"}";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TodoApplication.class.getResource("todo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        System.out.println(new TodoListItem("Make breakfast."));
        System.out.println(PATH);

        File listFile = getDataFile();
        readDataFile();
    }


    private File getDataFile(){
        String dataPath = PATH.concat(File.separator + "src"
                                        + File.separator + "main"
                                        + File.separator + "java"
                                        + File.separator + "data");

        String filePath = dataPath.concat(File.separator + "list.json");


        System.out.println("File directory: " + dataPath);
        System.out.println("File: " + filePath);

        new File(dataPath).mkdirs();
        File listFile = new File(filePath);

        try {
            listFile.createNewFile();
        } catch(IOException ioException) {
            System.out.println("Unable to create or locate list file at " + filePath);
        }

        return listFile;
    }

    //implement reading json from file
    private void readDataFile() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(TodoListItem.class, new TodoListItemDeserializer())
        Gson gson = new Gson();
        TodoListItem item1 = gson.fromJson(testJson, TodoListItem.class);

        System.out.println(item1);

    }

    public static void main(String[] args) {
        launch();
    }
}