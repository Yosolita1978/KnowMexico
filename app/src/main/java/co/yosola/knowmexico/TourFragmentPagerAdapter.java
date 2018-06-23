package co.yosola.knowmexico;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        }else{
            return new CityFragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}