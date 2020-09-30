package temple.edu.colorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout colorLayout = findViewById(R.id.colorLayout);
        final Spinner colorSpinner = findViewById(R.id.colorSpinner);

        final String colors[] = {"Red", "Blue", "Green", "Yellow", "Magenta",
         "Purple", "Teal", "Aqua", "Maroon", "Olive"};
        final ColorAdapter colorAdapter = new ColorAdapter(colors);

        colorSpinner.setAdapter(new ColorAdapter(colors));
        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                colorLayout.setBackgroundColor(Color.parseColor((String)((TextView)view).getText()));
                view.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                colorLayout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}

