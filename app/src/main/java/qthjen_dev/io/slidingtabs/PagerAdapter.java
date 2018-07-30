package qthjen_dev.io.slidingtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

public class PagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

    final int PAGE_COUNT = 3;
    private String tabTitle[] = new String[] {"Tab 1", "Tab 2", "Tab 3"};
    private int tabIcons[] = {R.drawable.one, R.drawable.two, R.drawable.three};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentPager.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    /*@Override
    public CharSequence getPageTitle(int position) {

        return tabTitle[position];
    }*/

    @Override
    public int getPageIconResId(int position) {
        return tabIcons[position];
    }
}
