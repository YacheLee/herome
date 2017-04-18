package com.dentaltw.herome.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.dentaltw.herome.Fragments.MainFragment;
import com.dentaltw.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FragmentManager manager = getSupportFragmentManager();
//        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
//        if(fragment!=null){
//            FragmentTransaction transaction = manager.beginTransaction();
//            transaction.add(R.id.fragment_container, fragment);
//            transaction.commit();
//        }
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }
}
