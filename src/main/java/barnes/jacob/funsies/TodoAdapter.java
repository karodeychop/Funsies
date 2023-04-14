package barnes.jacob.funsies;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class TodoAdapter extends TypeAdapter<TodoListItem> {
    @Override
    public void write(JsonWriter jsonWriter, TodoListItem todoListItem) throws IOException {

    }

    @Override
    public TodoListItem read(JsonReader jsonReader) throws IOException {
        return null;
    }
}
