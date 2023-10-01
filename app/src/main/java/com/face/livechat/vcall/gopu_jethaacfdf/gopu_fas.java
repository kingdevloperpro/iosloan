package com.face.livechat.vcall.gopu_jethaacfdf;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.face.livechat.vcall.gopu_magasharzxcdxcxc.gopu_roada;
import com.face.livechat.vcall.gopu__poshaxazx.gopu_isadsax;
import com.face.livechat.vcall.R;

import java.util.ArrayList;

public class gopu_fas extends RecyclerView.Adapter<gopu_fas.ViewHolder> {
    public Context activity;
    private int ITEM_DATA = 0;
    private ArrayList<gopu_isadsax> list;


    public gopu_fas(Activity activity2, ArrayList<gopu_isadsax> arrayList) {
        this.activity = activity2;
        this.list = arrayList;
    }

    @NonNull
    @Override
    public gopu_fas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.saturday_special_tumke, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull gopu_fas.ViewHolder holder, int position) {
        gopu_isadsax SFLoanBankDetails = this.list.get(position);
        Glide.with(this.activity).load(SFLoanBankDetails.getImage()).apply(new RequestOptions().error(R.drawable.ic_launcher)).thumbnail(Glide.with(this.activity).load(R.drawable.ic_loading_gif)).into(holder.imgIcon);
        holder.tvName.setText(SFLoanBankDetails.getTitle());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity.getApplicationContext(), gopu_roada.class);
                intent.putExtra("image", SFLoanBankDetails.getImage());
                intent.putExtra("NAME", SFLoanBankDetails.getName());
                intent.putExtra("number", SFLoanBankDetails.getNumber());
                activity.startActivity(intent);
            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filterList(ArrayList<gopu_isadsax> arrayList) {
        this.list = arrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.ITEM_DATA;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgIcon;
        public LinearLayout linearLayout;
        public TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
            this.imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            this.tvName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }
}

