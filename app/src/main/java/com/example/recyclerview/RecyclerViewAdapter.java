package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<president> mData;


    public RecyclerViewAdapter(Context mContext, List<president> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate (R.layout.cardview_president_name,parent,false);
        return new MyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv_president_title.setText (mData.get(position).getName ());
        holder.img_president_thumbnail.setImageResource(mData.get(position).getThumbnail ());

        holder.cardView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (mContext, President_Activity.class);

                //passing the data to the president activity
                intent.putExtra("Name",mData.get(position).getName ());
                intent.putExtra("Description",mData.get(position).getDescription ());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail ());


                mContext.startActivity (intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_president_title;
        ImageView img_president_thumbnail;
        CardView cardView;
        public MyViewHolder( View itemView) {
            super (itemView);

            tv_president_title = (TextView) itemView.findViewById (R.id.president_name_id);
            img_president_thumbnail = (ImageView)itemView.findViewById (R.id.president_img_id);
            cardView = (CardView) itemView.findViewById (R.id.cardview_id);
        }

    }
}
