package id.ac.poliban.latihan09;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        final EditText etYourName = findViewById(R.id.etName);
        Button btFinish = findViewById(R.id.btFinish);

        btFinish.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = etYourName.getText().toString();
            intent.putExtra("subactivity", data);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

    }
}
