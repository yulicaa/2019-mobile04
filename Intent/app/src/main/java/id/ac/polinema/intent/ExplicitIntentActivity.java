package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    private TextView outputText;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        outputText = findViewById(R.id.text_output);
        inputText = findViewById(R.id.input_name);
    }

    public void handleSubmit(View view) {
        String name = inputText.getText().toString();
        outputText.setText(name);
    }
}
