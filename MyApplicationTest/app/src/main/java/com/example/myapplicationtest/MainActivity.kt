package com.example.myapplicationtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

//    EditText editTextEmail;
//    EditText2 editTextSenha;
//    EditTextView editextIncorreto;
//    EditTextView2 editextInvalida;
//    EditButton editButtonLogin;


    EditTextEmail EditTextEmail;
    EditTextSenha EditTextSenha;
    EditTextViewIncorrect EditextIncorreto
    EditTextViewInvalid EditextInvalida;
    EditButton EditButtonLogin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        editTextEmail = findViewById(R.id.editEmail);
//        editTextSenha = findViewById(R.id.editSenha);
//        edittextIncorreto = findViewById(R.id.textViewIncorreto);
//        edittextInvalida = findViewById(R.id.textViewInvalida);
//        editButton = findViewById(R.id.ButtonLogin);
          EditTextEmail = findViewById(R.id.editEmail);
          EditTextSenha = findViewById(R.id.editSenha);
          EditextIncorreto = findViewById(R.id.textViewIncorreto);
          EditextInvalida = findViewById(R.id.textViewInvalida);
          EditButtonLogin = findViewById(R.id.ButtonLogin);

        ButtonLogin.setOnClickListener(new View.OnClickListener () {

            public void onClick(View view){



        }
    })


    }
}
