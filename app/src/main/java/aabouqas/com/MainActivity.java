package aabouqas.com;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int num1 = 0;
    private static int num2 = 0;
    private  boolean numsIsSet = false;
    private static int nums = 0;
    private static String operator = "0";

    void click(Button btn, TextView input, TextView output, String character, TextView bin, TextView hexa) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean notContainsOperators = (!character.equals("+") && !character.equals("-") && !character.equals("/") && !character.equals("*") && !character.equals("%"));
                if (notContainsOperators)
                {
                    if (input.getText().toString().startsWith("0"))
                        input.setText(character);
                    else
                        input.setText(input.getText().toString() + character);
                }
                if (character.equals("+") || character.equals("-") || character.equals("*") || character.equals("/") || character.equals("%"))
                {
                    operator = character;
                    if (!numsIsSet)
                        nums = Integer.parseInt(input.getText().toString());
                    else
                        nums = Integer.parseInt(output.getText().toString());

                    input.setText("0");
                    numsIsSet = true;
                    output.setText(String.valueOf(nums));
                }
                if (nums >= 0 && notContainsOperators)
                {
                    bin.setText(Integer.toBinaryString(Integer.parseInt(input.getText().toString())));
                    hexa.setText(Integer.toHexString(Integer.parseInt(input.getText().toString())));
                }
                if (!input.getText().toString().equals("0") && numsIsSet && operator.equals("+"))
                   output.setText(String.valueOf(nums + Integer.parseInt(input.getText().toString())));
               else if (!input.getText().toString().equals("0") && numsIsSet && operator.equals("-"))
                   output.setText(String.valueOf(nums - Integer.parseInt(input.getText().toString())));
               else if (!input.getText().toString().equals("0") && numsIsSet && operator.equals("*"))
                   output.setText(String.valueOf(nums * Integer.parseInt(input.getText().toString())));
               else if (!input.getText().toString().equals("0") && numsIsSet && operator.equals("/"))
                   output.setText(String.valueOf(nums / Integer.parseInt(input.getText().toString())));
               else if (!input.getText().toString().equals("0") && numsIsSet && operator.equals("%"))
                   output.setText(String.valueOf(nums % Integer.parseInt(input.getText().toString())));
            }
        });
    }

    void show_msg(String msg)
    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
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
        TextView input = findViewById(R.id.input);
        TextView bin = findViewById(R.id.binary);
        TextView hexa = findViewById(R.id.hexa);
        TextView output = findViewById(R.id.output);
        TextView aabouqas = findViewById(R.id.aabouqas);
        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);
        TextView t3 = findViewById(R.id.t3);
        TextView t4 = findViewById(R.id.t4);
        click(b0, input, output, "0",  bin, hexa);
        click(b1, input, output, "1",  bin, hexa);
        click(b2, input, output, "2",  bin, hexa);
        click(b3, input, output, "3",  bin, hexa);
        click(b4, input, output, "4",  bin, hexa);
        click(b5, input, output, "5",  bin, hexa);
        click(b6, input, output, "6",  bin, hexa);
        click(b7, input, output, "7",  bin, hexa);
        click(b8, input, output, "8",  bin, hexa);
        click(b9, input, output, "9",  bin, hexa);
        click(rem, input, output, "%", bin, hexa);
        click(mul, input, output, "*", bin, hexa);
        click(div, input, output, "/", bin, hexa);
        click(sub, input, output, "-", bin, hexa);
        click(sum, input, output, "+", bin, hexa);
        input.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
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
        t1.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        t2.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        t3.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        t4.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        input.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        output.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        bin.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        hexa.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
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
        input.setClickable(false);
        aabouqas.setTypeface(Typeface.createFromAsset(getAssets(), "font/roboto_slab.ttf"));
        aabouqas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_msg("aabouqas :)");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("0");
                bin.setText("0");
                hexa.setText("0");
                output.setText("0");
                num1 = 0;
                num2 = 0;
                nums = 0;
                numsIsSet = false;
                operator = "0";
            }
        });
    }
}