package example.com.client;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Model> mList;
    private Context context;

    public MyAdapter(ArrayList<Model> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(mList.get(position).getImageUrl()).into(holder.imageView);

        //Binding the name abd price to their views in the UI
        Model model = mList.get(position);
        holder.productName.setText(model.getProduct());
        holder.productPrice.setText(model.getProductPrice());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public TextView productName;
        public TextView productPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //getting the views from item.xml
            imageView = itemView.findViewById(R.id.image);
            productName = itemView.findViewById(R.id.name);
            productPrice = itemView.findViewById(R.id.price);
        }
    }


}
