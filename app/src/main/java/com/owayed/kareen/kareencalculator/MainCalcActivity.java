package com.owayed.kareen.kareencalculator;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvsoaal,tvResult;
    private EditText etNum1,etNum2,etResult;
    private Button btnzaied,btnnakes,btndrb,btnkesma,btnusawee,btnkowa,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        tvResult=(TextView)findViewById(R.id.tvResult);
        tvsoaal=(TextView)findViewById(R.id.tvsoaal);
        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        etResult=(EditText)findViewById(R.id.etResult);
        btnzaied=(Button)findViewById(R.id.btnzaied);
        btnnakes=(Button)findViewById(R.id.btnnakes);
        btndrb=(Button)findViewById(R.id.btndrb);
        btnkesma=(Button)findViewById(R.id.btnkesma);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnusawee=(Button)findViewById(R.id.btnusawe);
        btnkowa=(Button)findViewById(R.id.btnkowa);
        btnzaied.setOnClickListener(this);
        btnnakes.setOnClickListener(this);
        btndrb.setOnClickListener(this);
        btnkesma.setOnClickListener(this);
        btnkowa.setOnClickListener(this);
        btnusawee.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String stNum1=etNum1.getText().toString();
        String stNum2=etNum2.getText().toString();
        String stResult2=etResult.getText().toString();
        double num1=Double.parseDouble(stNum1);
        double num2=Double.parseDouble(stNum2);
        double result=Double.parseDouble(stResult2);
        if(view==btnzaied)
        {
            tvsoaal.setText("+");
        }
        if(view==btnnakes)
        {
            tvsoaal.setText("-");

        }
        if(view==btndrb)
        {
            tvsoaal.setText("x");

        }
        if(view==btnkesma)
        {
            tvsoaal.setText(":");
        }
        if(view==btnkowa)
        {
            tvsoaal.setText("^");

        }
        if (view == btnusawee)
        {
           String soaal=tvsoaal.getText().toString();
            double res=0;
            switch (soaal)
            {
                case"+":
                   res=num1+num2;
                    etResult.setText(res+"");
                    break;
                case "-":
                    res=num1-num2;
                    etResult.setText(res+"");
                    break;
                case ":":
                    res=num1/num2;
                    etResult.setText(res+"");
                    break;
                case "x":
                    res=num1*num2;
                    etResult.setText(res+"");
                    break;
                case "^":
                    res=num1*num2;
                    etResult.setText(res+"");
                    break;
            }
        }
        if(view==btnClear)
        {
            etNum1.setText("");
            etNum2.setText("");
            etResult.setText("");
            tvsoaal.setText("?");
        }

    }
}
