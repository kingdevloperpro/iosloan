package com.face.livechat.vcall.gopu_jethaacfdf;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.face.livechat.vcall.R;

import java.util.ArrayList;

public class gopu_tamarijevuny extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public int selectedPos;
    CustomItemClickListener listener;
    private int ITEM_DATA = 0;
    private Activity activity;
    private ArrayList<String> list;

    public gopu_tamarijevuny(Activity activity2, ArrayList<String> arrayList, CustomItemClickListener customItemClickListener) {
        this.activity = activity2;
        this.list = arrayList;
        this.listener = customItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.saturday_special_bajarangi, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ItemHolder itemHolder = (ItemHolder) viewHolder;
        itemHolder.tvAmount.setText(this.list.get(i));
        itemHolder.llMain.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                gopu_tamarijevuny VBAmountAdapter = gopu_tamarijevuny.this;
                VBAmountAdapter.notifyItemChanged(VBAmountAdapter.selectedPos);
                gopu_tamarijevuny VBAmountAdapter2 = gopu_tamarijevuny.this;
                VBAmountAdapter2.selectedPos = i;
                VBAmountAdapter2.notifyItemChanged(VBAmountAdapter2.selectedPos);
                gopu_tamarijevuny.this.listener.onItemClick(view, i);

            }
        });
        if (this.selectedPos == i) {
            itemHolder.llMain.setBackground(this.activity.getResources().getDrawable(R.drawable.selected_bg));
            itemHolder.tvAmount.setTextColor(ContextCompat.getColor(this.activity, R.color.white));


            return;
        }

        itemHolder.llMain.setBackground(this.activity.getResources().getDrawable(R.drawable.unselected_bgss));

        itemHolder.tvAmount.setTextColor(ContextCompat.getColor(this.activity, R.color.black));


    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.ITEM_DATA;
    }

    public interface CustomItemClickListener {
        void onItemClick(View view, int i);
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        public LinearLayout llMain = ((LinearLayout) this.itemView.findViewById(R.id.llMain));
        public TextView tvAmount = ((TextView) this.itemView.findViewById(R.id.tvAmount));

        public ItemHolder(View view) {
            super(view);
            int i = this.itemView.getResources().getDisplayMetrics().widthPixels;
            int i2 = this.itemView.getResources().getDisplayMetrics().heightPixels;
        }
    }
}
