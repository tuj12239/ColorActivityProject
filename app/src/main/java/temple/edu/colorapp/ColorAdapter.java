package temple.edu.colorapp;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter
{
    private String[] colors;

    public ColorAdapter(String[] data)
    {
        super();
        colors = data;
    }

    @Override
    public int getCount()
    {
        return colors.length;
    }

    @Override
    public Object getItem(int position)
    {
        return colors[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView colorOption = new TextView(parent.getContext());
        colorOption.setText(colors[position]);
        Log.d("ColorAdapter", (String)colorOption.getText());
        colorOption.setBackgroundColor(Color.parseColor(colors[position]));

        return colorOption;
    }
}