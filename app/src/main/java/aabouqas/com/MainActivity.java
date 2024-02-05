package aabouqas.com;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int num1 = 0;
    private static int num2 = 0;
    private  boolean num1IsSet = false;
    private static int nums = 0;
    private static String operator = "0";

    void click(Button btn, TextView res, String str, TextView to_show, TextView showBin) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (res.getText().toString().length() == 0 && to_show.getText().toString().equals("0") && str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%"))
//                        return ;
                if (!str.equals("+") && !str.equals("-") && !str.equals("/") && !str.equals("*") && !str.equals("%"))
                    res.setText(res.getText().toString() + str);
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%"))
                {
                    operator = str;
                    if (!num1IsSet)
                        nums = Integer.parseInt(res.getText().toString());
                    else
                        nums = Integer.parseInt(to_show.getText().toString());
                    res.setText("");
                    num1IsSet = true;
                    to_show.setText(String.valueOf(nums));
                }
                if (nums >= 0)
                {
                    showBin.setText(Integer.toBinaryString(Integer.parseInt(res.getText().toString())));
                }
               if (res.getText().toString().length() > 0 && num1IsSet && operator.equals("+"))
                   to_show.setText(String.valueOf(nums + Integer.parseInt(res.getText().toString())));
               else if (res.getText().toString().length() > 0 && num1IsSet && operator.equals("-"))
                   to_show.setText(String.valueOf(nums - Integer.parseInt(res.getText().toString())));
               else if (res.getText().toString().length() > 0 && num1IsSet && operator.equals("*"))
                   to_show.setText(String.valueOf(nums * Integer.parseInt(res.getText().toString())));
               else if (res.getText().toString().length() > 0 && num1IsSet && operator.equals("/"))
                   to_show.setText(String.valueOf(nums / Integer.parseInt(res.getText().toString())));
               else if (res.getText().toString().length() > 0 && num1IsSet && operator.equals("%"))
                   to_show.setText(String.valueOf(nums % Integer.parseInt(res.getText().toString())));
            }
        });
    }

    void show_msg(String msg)
    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    void    init_ui()
    {

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
        TextView bin = findViewById(R.id.binary);
        TextView _result = findViewById(R.id._result);
        TextView aabouqas = findViewById(R.id.aabouqas);
        click(b0, res, "0", _result, bin);
        click(b1, res, "1", _result, bin);
        click(b2, res, "2", _result, bin);
        click(b3, res, "3", _result, bin);
        click(b4, res, "4", _result, bin);
        click(b5, res, "5", _result, bin);
        click(b6, res, "6", _result, bin);
        click(b7, res, "7", _result, bin);
        click(b8, res, "8", _result, bin);
        click(b9, res, "9", _result, bin);
        click(rem, res, "%", _result, bin);
        click(mul, res, "*", _result, bin);
        click(div, res, "/", _result, bin);
        click(sub, res, "-", _result, bin);
        click(sum, res, "+", _result, bin);
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
                bin.setText("0");
                _result.setText("0");
                num1 = 0;
                num2 = 0;
                nums = 0;
                num1IsSet = false;
                operator = "0";

            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int result = 0;
//                String str = res.getText().toString();
//                String[] parts = {""};
//                if (str.contains("+") && str.split("\\+").length == 2)
//                {
//                    parts = str.split("\\+");
//                    result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
//                }
//                if (str.contains("-") && str.split("-").length == 2)
//                {
//                    parts = str.split("-");
//                    result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
//                }
//                if (str.contains("*") && str.split("\\*").length == 2)
//                {
//                    parts = str.split("\\*");
//                    result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
//                }
//                if (str.contains("%") && str.split("%").length == 2)
//                {
//                    parts = str.split("%");
//                    if (Integer.parseInt(parts[1]) == 0)
//                    {
//                        show_msg("\"Men don't divide by zero :)\"");
//                        show_msg("Be man ;)");
//                        res.setText("");
//                        return;
//                    }
//
//                    result = Integer.parseInt(parts[0]) % Integer.parseInt(parts[1]);
//                }
//                if (str.contains("/") && str.split("/").length == 2)
//                {
//                    parts = str.split("/");
//                    if (Integer.parseInt(parts[1]) == 0)
//                    {
//                        show_msg("Are you fucking serious :)");;
//                        show_msg("Be man ;)");
//                        res.setText("");
//                        return;
//                    }
//                    result = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
//                }
//                if (parts.length != 2)
//                    return;
            }
        });
    }
}