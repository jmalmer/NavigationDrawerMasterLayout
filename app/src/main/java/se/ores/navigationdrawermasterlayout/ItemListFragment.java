package se.ores.navigationdrawermasterlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import se.ores.navigationdrawermasterlayout.dummy.DummyContent;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemListFragment extends Fragment {

    private RecyclerView recyclerView;
    private SimpleItemRecyclerViewAdapter adapter;

    public ItemListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.item_list);
        adapter = new SimpleItemRecyclerViewAdapter(getActivity(), DummyContent.ITEMS);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
