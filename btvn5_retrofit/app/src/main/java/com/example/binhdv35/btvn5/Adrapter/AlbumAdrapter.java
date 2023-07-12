package com.example.binhdv35.btvn5.Adrapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.binhdv35.btvn5.R;
import com.example.binhdv35.btvn5.model.Album;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AlbumAdrapter extends RecyclerView.Adapter<AlbumAdrapter.ViewHolderAlbum>{

    private List<Album> albumList;

    public AlbumAdrapter(List<Album> albumList) {
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public ViewHolderAlbum onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album,parent,false);
        return new ViewHolderAlbum(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAlbum holder, int position) {
        Album album = albumList.get(position);

        if (album == null){
            return;
        }

        Picasso.get().load(album.getUrl()).
                placeholder(R.drawable.ic_baseline_image_24)
                .error(R.drawable.ic_baseline_error_24)
                .into(holder.img);
        holder.tvAlbumId.setText(album.getAlbumId()+"");
        holder.tvID.setText(album.getId()+"");
        holder.tvTitle.setText(album.getTitle());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public class ViewHolderAlbum extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView tvAlbumId, tvID, tvTitle;

        public ViewHolderAlbum(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.item_img_);
            tvAlbumId = itemView.findViewById(R.id.item_tv_albumId);
            tvID = itemView.findViewById(R.id.item_tv_id);
            tvTitle = itemView.findViewById(R.id.item_tv_title);
        }
    }
}
