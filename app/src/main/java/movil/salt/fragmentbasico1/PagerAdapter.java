package movil.salt.fragmentbasico1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by pc on 25/09/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    List<TitleFragment> data;

    public PagerAdapter(FragmentManager fm, List<TitleFragment> data) {
        super(fm);
        this.data = data;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return data.get(position).getTitle();
    }
}
