package com.jintingbo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LeftFragment extends Fragment implements AdapterView.OnItemClickListener {
    public String[] neiRong={"aaaa","bbbb","cccc","dddd","eeee"};
    String[] mDatas={"新闻11","新闻22","新闻33","新闻4","新闻5"};

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //将碎片转换为视图用inflate()
        View fragmentView= inflater.inflate(R.layout.fragment_left, container, false);
        //求碎片视图中的ListView控件
        final ListView lv = (ListView) fragmentView.findViewById(R.id.listView1);
        ArrayAdapter<String> ada=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,
                mDatas
        );
        lv.setAdapter(ada);
        lv.setOnItemClickListener(this);

        return fragmentView;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(),neiRong[position],Toast.LENGTH_LONG).show();
    }
}
