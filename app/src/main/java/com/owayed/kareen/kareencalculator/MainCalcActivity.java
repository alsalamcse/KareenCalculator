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
    private Button btnzaied,btnnakes,btndrb,btnkesma,btnusawe,btnkowa,btnClear;

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
        btnusawe=(Button)findViewById(R.id.btnusawe);
        btnkowa=(Button)findViewById(R.id.btnkowa);
        btnzaied.setOnClickListener(this);
        btnnakes.setOnClickListener(this);
        btndrb.setOnClickListener(this);
        btnkesma.setOnClickListener(this);
        btnkowa.setOnClickListener(this);
        btnusawe.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String stNum1=etNum1.getText().toString();
        double num1=
        if(view==btnzaied)
        {

        }
        if(view==btnnakes)
        {

        }
        if(view==btndrb)
        {

        }
        if(view==btnkesma)
        {

        }
        if(view==btnkowa)
        {

        }
        if (view == btnusawe)
        {

        }

    }
}
