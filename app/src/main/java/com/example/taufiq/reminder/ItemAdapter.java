package com.example.taufiq.reminder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created By Taufiq on 5/27/2019.
 * Reminder
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<DataModel> dataModels;
    private Context context;

    public ItemAdapter(Context context,List<DataModel> dataModels) {
        this.dataModels = dataModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder item, int position) {

    item.binding(dataModels.get(position));

    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }



     class ItemViewHolder extends RecyclerView.ViewHolder {

         TextView nama;
         TextView time;
         TextView like;
         TextView comment;

         ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.name_id);
            time = itemView.findViewById(R.id.time_id);
            like = itemView.findViewById(R.id.fav_id);
            comment = itemView.findViewById(R.id.comment_id);
        }

         void binding(final DataModel DataModel){
            nama.setText(DataModel.getNama());
            time.setText(DataModel.getTime());
            like.setText(DataModel.getLike());
            comment.setText(DataModel.getComment());
        }

    }
}
