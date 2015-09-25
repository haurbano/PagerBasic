package movil.salt.fragmentbasico1;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    List<TitleFragment> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);

        data = new ArrayList<>();

        BlankFragment1 fragment1 = new BlankFragment1();
        BlankFragment2 fragment2 = new BlankFragment2();

        data.add(fragment1);
        data.add(fragment2);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),data);
        pager.setAdapter(adapter);

    }


}
