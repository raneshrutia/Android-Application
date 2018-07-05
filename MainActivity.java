package poc.shruti.example.com.poc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button) findViewById(R.id.btSend);

      /*  send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intsend = new Intent(this.send.java);

            }

        }); */
    }
}
