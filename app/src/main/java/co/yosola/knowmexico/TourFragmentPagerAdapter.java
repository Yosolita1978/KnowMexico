package co.yosola.knowmexico;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;


    public TourFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1){
            return new DoFragment();
        } else if (position == 2){
            return new EatFragment();
        } else{
            return new DrinkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.city);
        } else if (position == 1) {
            return mContext.getString(R.string.todo);
        } else if (position == 2) {
            return mContext.getString(R.string.toeat);
        } else {
            return mContext.getString(R.string.todrink);
        }
    }
}