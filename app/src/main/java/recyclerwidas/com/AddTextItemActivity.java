package recyclerwidas.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddTextItemActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "MESSAGE";

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_text_item);

        send = (Button) findViewById(R.id.Button01);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTextItemActivity.this, MainActivity.class);
                EditText editText = (EditText) findViewById(R.id.EditText01);
                String message = editText.getText().toString();
                intent.putExtra("key", message);
                Log.d("mmm","Called read message event"+message);
                setResult(2,intent);
                finish();
            }
        });

    }
}
