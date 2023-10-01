package com.face.livechat.vcall.gopu_jethaacfdf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.face.livechat.vcall.gopu__poshaxazx.gopu_dfdf;
import com.face.livechat.vcall.R;

import java.util.ArrayList;

public class gopu_nana extends RecyclerView.Adapter<gopu_nana.MyViewHolder> {
    ArrayList<gopu_dfdf> SFLoanListData;
    Context context;
    View.OnClickListener onClickListener;

    public gopu_nana(Context context2, ArrayList<gopu_dfdf> arrayList, View.OnClickListener onClickListener2) {
        this.context = context2;
        this.SFLoanListData = arrayList;
        this.onClickListener = onClickListener2;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.saturday_special_vikram, viewGroup, false));
    }

    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        gopu_dfdf SFLoanList2 = this.SFLoanListData.get(i);
        myViewHolder.name.setText(SFLoanList2.getAppName());
        myViewHolder.tvInterest.setText(SFLoanList2.getInterest());
        myViewHolder.tvLoan.setText(SFLoanList2.getBorrowRange());
        myViewHolder.tvTerms.setText(SFLoanList2.getBorrowTerm());
        myViewHolder.cvMain.setTag(i);
        myViewHolder.cvMain.setOnClickListener(this.onClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return SFLoanListData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cvMain;
        ImageView icon;
        TextView name;
        TextView tvInterest;
        TextView tvLoan;
        TextView tvTerms;

        public MyViewHolder(View view) {
            super(view);
            cvMain = (CardView) view.findViewById(R.id.cvMain);
            name = (TextView) view.findViewById(R.id.tvName);
            tvInterest = (TextView) view.findViewById(R.id.tvInterest);
            tvTerms = (TextView) view.findViewById(R.id.tvTerms);
            tvLoan = (TextView) view.findViewById(R.id.tvLoan);
            icon = (ImageView) view.findViewById(R.id.icon);
        }
    }
}
