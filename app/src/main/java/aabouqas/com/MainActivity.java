package aabouqas.com;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    void click(Button btn, TextView res, String str) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (res.getText().toString().length() > 10 || res.getText().toString().equals("0") && str.equals("0"))
                    return;
                if (res.getText().toString().length() > 4 && (res.getTextSize() / 4) > 35) {
                    res.setTextSize(res.getTextSize() / 4);
                }
                if (str.equals("%") && res.getText().toString().contains("%"))
                        return;
                res.setText(res.getText().toString() + str);
            }
        });
    }

    void show_msg(String msg)
    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button sub = findViewById(R.id.min);
        Button mul = findViewById(R.id.sub);
        Button div = findViewById(R.id.div);
        Button sum = findViewById(R.id.plus);
        Button eq = findViewById(R.id.eq);
        Button rem = findViewById(R.id.rem);
        Button clear = findViewById(R.id.clear);
        EditText res = findViewById(R.id._res);
        TextView aabouqas = findViewById(R.id.aabouqas);
        click(b0, res, "0");
        click(b1, res, "1");
        click(b2, res, "2");
        click(b3, res, "3");
        click(b4, res, "4");
        click(b5, res, "5");
        click(b6, res, "6");
        click(b7, res, "7");
        click(b8, res, "8");
        click(b9, res, "9");
        click(rem, res, "%");
        click(mul, res, "*");
        click(div, res, "/");
        click(sub, res, "-");
        click(sum, res, "+");
        res.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b0.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b1.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b2.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b3.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b4.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b5.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b6.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b7.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b8.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        b9.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        div.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        sub.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        sum.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        mul.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        rem.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        eq.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        clear.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);
        gradientDrawable.setColor(Color.parseColor("#023e8a"));
        gradientDrawable.setCornerRadius(50);
        b0.setBackground(gradientDrawable);
        b1.setBackground(gradientDrawable);
        b2.setBackground(gradientDrawable);
        b3.setBackground(gradientDrawable);
        b4.setBackground(gradientDrawable);
        b5.setBackground(gradientDrawable);
        b6.setBackground(gradientDrawable);
        b7.setBackground(gradientDrawable);
        b8.setBackground(gradientDrawable);
        b9.setBackground(gradientDrawable);
        b7.setBackground(gradientDrawable);
        b7.setBackground(gradientDrawable);
        mul.setBackground(gradientDrawable);
        div.setBackground(gradientDrawable);
        sub.setBackground(gradientDrawable);
        sum.setBackground(gradientDrawable);
        rem.setBackground(gradientDrawable);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadius(50);
        drawable.setColor(Color.parseColor("#dd1c1a"));
        eq.setBackground(drawable);
        clear.setBackground(drawable);
        res.setClickable(false);
        aabouqas.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        aabouqas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_msg("aaaabouqassss");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setTextSize(100);
                res.setText("");

            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = 0;
                String str = res.getText().toString();
                String[] parts = {""};
                if (str.contains("+") && str.split("\\+").length == 2)
                {
                    parts = str.split("\\+");
                    result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
                }
                if (str.contains("-") && str.split("-").length == 2)
                {
                    parts = str.split("-");
                    result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
                }
                if (str.contains("*") && str.split("\\*").length == 2)
                {
                    parts = str.split("\\*");
                    result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
                }
                if (str.contains("%") && str.split("%").length == 2)
                {
                    parts = str.split("%");
                    if (Integer.parseInt(parts[1]) == 0)
                    {
                        show_msg("\"Men don't divide by zero :)\"");
                        show_msg("Be man ;)");
                        res.setText("");
                        return;
                    }

                    result = Integer.parseInt(parts[0]) % Integer.parseInt(parts[1]);
                }
                if (str.contains("/") && str.split("/").length == 2)
                {
                    parts = str.split("/");
                    if (Integer.parseInt(parts[1]) == 0)
                    {
                        show_msg("Are you fucking serious :)");;
                        show_msg("Be man ;)");
                        res.setText("");
                        return;
                    }
                    result = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
                }
                if (parts.length != 2)
                    return;
                res.setText(Integer.toString(result));
            }
        });
    }
}