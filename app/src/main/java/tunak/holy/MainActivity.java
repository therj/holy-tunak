package tunak.holy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer tunakSound = MediaPlayer.create(this, R.raw.tunak);
        Button playNow = (Button) this.findViewById(R.id.play_holy_tunak);
        playNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tunakSound.setLooping(true);
                tunakSound.start();

            }
        });
    }
}
