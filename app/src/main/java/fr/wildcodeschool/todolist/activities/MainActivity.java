package fr.wildcodeschool.todolist.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import fr.wildcodeschool.todolist.R;
import fr.wildcodeschool.todolist.adapters.TodoAdapter;
import fr.wildcodeschool.todolist.models.Todo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
        List<Todo> todos = null;
        try {
            todos = Arrays.asList(
                    new Todo("Récupérer ma voiture", dateFormat.parse("01/01/2019")),
                    new Todo("Passer l'aspirateur", dateFormat.parse("03/01/2019")),
                    new Todo("Acheter des tacos", dateFormat.parse("06/02/2019"))
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ListView listTodo = findViewById(R.id.listTodo);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todos);
        listTodo.setAdapter(adapter);
    }
}
