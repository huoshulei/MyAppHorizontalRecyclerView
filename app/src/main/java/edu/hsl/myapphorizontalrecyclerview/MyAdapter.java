package edu.hsl.myapphorizontalrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/29.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myholder> {
    List<String> data = new ArrayList<>();
    LayoutInflater mInflater;
    private static final String TAG = "MyAdapter";

    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        for (int i = 0; i < 50; i++) {
            String s = i + "群";
            data.add(s);
        }
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Myholder(mInflater.inflate(R.layout.layout, parent, false));
    }

    @Override
    public void onBindViewHolder(Myholder holder, int position) {
        holder.mTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Myholder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public Myholder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_);
        }
    }
}
