package com.alichis.dvpgiomov.quierocomer.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alichis.dvpgiomov.quierocomer.Locations;
import com.alichis.dvpgiomov.quierocomer.Models.ModeLocations;
import com.alichis.dvpgiomov.quierocomer.R;

import java.util.List;

/**
 * Created by user on 03/01/2018.
 */

public class AddLocation extends RecyclerView.Adapter<AddLocation.VHlocation> implements View.OnClickListener {

    Context context;
    List<ModeLocations> ListLocation;
    private View.OnClickListener listener;

    public Typeface rcvstyle;

    public AddLocation (Context context,List<ModeLocations> ListLocation){
        this.context=context;
        this.ListLocation=ListLocation;
    }
    public  static class VHlocation extends RecyclerView.ViewHolder{
        TextView  Titlelocation;
        ImageView Imagelocation;
        public VHlocation(View itemView){
            super(itemView);
            Titlelocation = (TextView) itemView.findViewById(R.id.textlugar);
            Imagelocation =(ImageView) itemView.findViewById(R.id.imagelugar);
             /*creando el metodo,tomando referencia y emviando la tipografia*/



        }
    }
    @Override
    public VHlocation onCreateViewHolder(ViewGroup parent, int viewType){
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.carditem,parent,false);
        layoutView.setOnClickListener(this);
        VHlocation rcv= new VHlocation(layoutView);
        return rcv;
    }
    @Override
    public void  onBindViewHolder(VHlocation holder,int position){
        holder.Imagelocation.setImageResource(ListLocation.get(position).getImageLocation());
        holder.Titlelocation.setText(ListLocation.get(position).getTitlelocation());

        /*creo que aqui puedo mandar la lista con texto personalisado*/
    }

    @Override
    public int getItemCount(){return this.ListLocation.size();}
    public void setOnclickListener(View.OnClickListener listener)
    {this.listener=listener;}

    @Override
    public void onClick(View view){listener.onClick(view);}
}
