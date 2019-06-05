package com.ithaka;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ithaka.models.CartModel;

import java.util.List;

public class CartActivitiesAdapter extends RecyclerView.Adapter<CartActivitiesAdapter.ItemViewHolder> {

    final String TAG = "CartActivitiesAdapter";
    private List<CartModel.ActivityTransaction> activityList;
    private Activity activity;
    private CartActivitiesAdapter.ItemViewHolder itemViewHolder;

    public CartActivitiesAdapter(Activity activity, List<CartModel.ActivityTransaction> items) {
        this.activity = activity;
        this.activityList = items;
    }

    @NonNull
    @Override
    public CartActivitiesAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_cart_activities, null);
        return new CartActivitiesAdapter.ItemViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CartActivitiesAdapter.ItemViewHolder holder, int position) {
//        holder.playlistVideoTitle.setText(activityList.get(position).getSnippet().getTitle());

//        Glide.with(activity)
//                .load(thumbnailUrl)
//                .centerCrop()
//                .placeholder(R.drawable.youplay_logo_placeholder)
//                .error(R.drawable.youplay_logo_placeholder)
//                .override(AppConstants.GLIDE_VIDEO_THUMBNAIL_WIDTH_LARGE, AppConstants.GLIDE_VIDEO_THUMBNAIL_HEIGHT_LARGE)
//                .into(holder.playlistVideoThumbnail);
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout playlistVideoLayout;
        ImageView playlistVideoThumbnail;
        TextView playlistVideoTitle;

        public ItemViewHolder(View itemView) {
            super(itemView);
//            playlistVideoLayout = itemView.findViewById(R.id.playlist_video_layout);
//            playlistVideoThumbnail = itemView.findViewById(R.id.playlist_video_thumbnail);

        }
    }
}
