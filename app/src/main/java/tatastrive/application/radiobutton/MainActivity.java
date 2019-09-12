package tatastrive.application.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    RadioButton radioButton,radioButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        radioButton=findViewById( R.id.radioButton );
        radioButton1=findViewById( R.id.radioButton2 );

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId())
        {
            case R.id.radioButton:
                if (buttonView.isChecked())
                Toast.makeText( this, "Male"+buttonView.getText(), Toast.LENGTH_SHORT ).show();
                break;
            case R.id.radioButton2:
                if (buttonView.isChecked())
                Toast.makeText( this, "Female"+buttonView.getText(), Toast.LENGTH_SHORT ).show();
        }
    }

}
