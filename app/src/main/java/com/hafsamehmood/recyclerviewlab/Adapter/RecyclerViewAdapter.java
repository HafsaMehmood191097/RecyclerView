package com.hafsamehmood.recyclerviewlab.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hafsamehmood.recyclerviewlab.R;
import com.hafsamehmood.recyclerviewlab.model.student;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private Context context;
    private List<student> studentlist;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context context, List<student> studentlist) {
        this.context = context;
        this.studentlist = studentlist;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
    student stu=studentlist.get(position);
    holder.txtname.setText(stu.getName());
    holder.txtroll.setText(stu.getRollNo());
    }

    @Override
    public int getItemCount() {
    return studentlist.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtname,txtroll;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.txtname);
            txtroll=itemView.findViewById(R.id.txtrollno);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
