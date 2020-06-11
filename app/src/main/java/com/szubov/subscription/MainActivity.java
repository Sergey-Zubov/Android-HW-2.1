package com.szubov.subscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button btnOk = findViewById(R.id.btnOk);
        Button btnClear = findViewById(R.id.btnClear);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtSubCompleted = findViewById(R.id.subCompleted);
                EditText uName = findViewById(R.id.editName);
                EditText uEmail = findViewById(R.id.editEmail);

                String inputName = uName.getText().toString();
                String inputEmail = uEmail.getText().toString();

                String subMessage = "Подписка на рассылку успешно оформлена для пользователя "
                        + inputName + " на электронный адрес " + inputEmail;

                txtSubCompleted.setText(subMessage);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtSubCompleted = findViewById(R.id.subCompleted);
                EditText uName = findViewById(R.id.editName);
                EditText uEmail = findViewById(R.id.editEmail);

                uName.getText().clear();
                uEmail.getText().clear();
                txtSubCompleted.setText("");
            }
        });
    }
}