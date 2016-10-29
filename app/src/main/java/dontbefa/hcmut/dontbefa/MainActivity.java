package dontbefa.hcmut.dontbefa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);

        Firebase myFirebaseRef = new Firebase("https://dont-be-fa.firebaseio.com/");
        for (int i = 0; i <= 10; i++) {
            myFirebaseRef.child("Devpro").child("key " + i).setValue("Value " + i);
        }
    }
}
