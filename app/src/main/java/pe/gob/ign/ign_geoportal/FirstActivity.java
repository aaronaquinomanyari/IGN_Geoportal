package pe.gob.ign.ign_geoportal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements DialogInterface.OnClickListener, View.OnClickListener {
    Button lebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        lebutton = (Button)findViewById(R.id.btIgresar);
        lebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }
    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btIgresar:
                    Intent intent = new Intent(this,WebActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }

}
