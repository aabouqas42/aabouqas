package aabouqas.com;

import android.content.SharedPreferences;
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
        Button min = findViewById(R.id.min);
        Button sub = findViewById(R.id.sub);
        Button div = findViewById(R.id.div);
        Button plus = findViewById(R.id.plus);
        Button eq = findViewById(R.id.eq);
        Button rem = findViewById(R.id.rem);
        Button clear = findViewById(R.id.clear);
        EditText res = findViewById(R.id._res);
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
        click(sub, res, "*");
        click(div, res, "/");
        click(min, res, "-");
        click(plus, res, "+");
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = 0;
                String str = res.getText().toString();
                String[] parts = {""};
//                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
                if (str.contains("+"))
                {
                    parts = str.split("\\+");
                    result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
                }
                if (str.contains("-"))
                {
                    parts = str.split("-");
                    result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
                }
                if (str.contains("*"))
                {
                    parts = str.split("\\*");
                    result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
                }
                if (str.contains("%"))
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
                if (str.contains("/"))
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