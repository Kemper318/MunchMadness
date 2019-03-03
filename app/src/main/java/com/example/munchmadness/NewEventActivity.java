package android.com.hoosgotplans.munchmadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.munchmadness.R;

import java.util.Calendar;

public class NewEventActivity extends AppCompatActivity {
    Button SubmitNew;
    EditText restaurants_input, invitee_input, Eventname_input;
    TextView title, newEventname_text, DateDeadline_text, invitee_text, restaurants_text;
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
    }
    SubmitNew = (Button)findViewbyId(R.id.SubmitNew);
    resturants_input= (EditText)findViewbyId(R.id.resturants_input);
    invitee_input= (EditText)findViewbyId(R.id.invitee_input);
    Eventname_input= (EditText)findViewbyId(R.id.Eventname_input);
    title= (TextView)findViewbyId(R.id.title);
    newEventname_text= (TextView)findViewbyId(R.id.newEventname_text);
    DateDeadline_text= (TextView)findViewbyId(R.id.DateDeadline_text);
    invitee_text= (TextView)findViewbyId(R.id.invitee_text);
    restaurants_text= (TextView)findViewbyId(R.id.restaurants_text);

    timePicker= (TimePicker)findViewbyId(R.id.timePicker);
    timePicker.setIs24HourView(false);// used to display am and pm
    timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
        @Override
        public void onTimeChanged(TimePicker timePicker,View view, int hourOfDay, int minute) {
            // display a toast with changed values of time picker
            Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();

        })

        SubmitNew.setOnClickListener(new View.setonClickListener(){
            @Override
            public void onClick(View v){
                String eventname=Eventname_input.getText().toString();
                String invitee= invitee_input.getText().toString();
                String restaurants= restaurants_input.getText().toString();
                // TODO: This is where the results are put in the other Activities I think
            }});
    }


}