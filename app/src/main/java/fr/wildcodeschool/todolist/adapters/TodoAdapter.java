package fr.wildcodeschool.todolist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import fr.wildcodeschool.todolist.R;
import fr.wildcodeschool.todolist.models.Todo;

public class TodoAdapter extends ArrayAdapter<Todo> {

    public TodoAdapter(Context context, List<Todo> todos) {
        super(context, 0, todos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Todo item = getItem(position);

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_todo, parent, false);
        }

        TextView textDescription = convertView.findViewById(R.id.textDescription);
        TextView textDate = convertView.findViewById(R.id.textDate);

        textDescription.setText(item.getDescription());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
        textDate.setText(dateFormat.format(item.getDate()));

        return convertView;
    }
}
