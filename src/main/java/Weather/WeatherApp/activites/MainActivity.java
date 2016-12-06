package Weather.WeatherApp.activites;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;


import Weather.WeatherApp.R;
import Weather.WeatherApp.fragments.ForcastFragment;

public class MainActivity extends BaseFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return ForcastFragment.newInstance();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                startActivity(new Intent(this,SettingActivity.class));
                break;
        }
        return true;
    }
}
