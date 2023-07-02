package ik.dev.testgame;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import com.jawnnypoo.physicslayout.Physics;
import com.jawnnypoo.physicslayout.PhysicsLinearLayout;

public class MainActivity extends AppCompatActivity {

    TextView gg;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gg = (TextView)findViewById(R.id.gg);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        PhysicsLinearLayout physicsLinearLayout = (PhysicsLinearLayout)findViewById(R.id.physic_layout);

        physicsLinearLayout.getPhysics().enableFling();

        physicsLinearLayout.getPhysics().setOnCollisionListener(new Physics.OnCollisionListener() {
      @Override
     public void onCollisionEntered(int viewIdA, int viewIdB) {


          if(viewIdA == R.id.img1) {

              count++;
              gg.setText("Score : "+String.valueOf(count));

          }

      }

       @Override
       public void onCollisionExited(int viewIdA, int viewIdB) {

                }

            }

        );
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
