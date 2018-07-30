package qthjen_dev.io.slidingtabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPager extends Fragment {

    private View root;
    private static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public FragmentPager() {
        // Required empty public constructor
    }

    public static FragmentPager newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FragmentPager fragmentPager = new FragmentPager();
        fragmentPager.setArguments(args);
        return fragmentPager;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_fragment_pager, container, false);
        TextView tv = root.findViewById(R.id.tvTitle);
        tv.setText("Fragment " + mPage);

        return root;
    }
}
