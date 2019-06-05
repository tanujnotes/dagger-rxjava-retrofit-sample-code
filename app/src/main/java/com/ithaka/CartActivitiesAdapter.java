package com.ithaka;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ithaka.models.CartModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CartActivitiesAdapter extends RecyclerView.Adapter<CartActivitiesAdapter.ItemViewHolder> {

    final String TAG = "CartActivitiesAdapter";
    private List<CartModel.ActivityTransaction> activityList;
    private Activity activity;

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
        holder.activityDescription.setText(activityList.get(position).getActivityTitle());
        holder.cityName.setText(activityList.get(position).getCity());
        holder.variantTitle.setText(activityList.get(position).getVariantTitle());
        holder.timing.setText(String.format("%s at %s", activityList.get(position).getDate(), activityList.get(position).getStartTime()));
        holder.activityAmount.setText(String.format(Locale.getDefault(), "₹ %.0f", activityList.get(position).getAmount()));

        List<String> inclusionList = activityList.get(holder.getAdapterPosition()).getInclusions();
        ArrayAdapter inclusionAdapter = new ArrayAdapter<>(activity, R.layout.check_listview, inclusionList);
        holder.inclusionList.setAdapter(inclusionAdapter);

        List<String> exclusionList = activityList.get(holder.getAdapterPosition()).getExclusions();
        ArrayAdapter exclusionAdapter = new ArrayAdapter<>(activity, R.layout.cross_listview, exclusionList);
        holder.exclusionList.setAdapter(exclusionAdapter);

        if (holder.getAdapterPosition() > 0 && activityList.get(holder.getAdapterPosition()).getCity().equals(activityList.get(holder.getAdapterPosition() - 1).getCity()))
            holder.cityName.setVisibility(View.GONE);
        else holder.cityName.setVisibility(View.VISIBLE);

        if (activityList.get(holder.getAdapterPosition()).getCancellationType().equalsIgnoreCase("REFUNDABLE")) {
            int freeCancellationHour = activityList.get(holder.getAdapterPosition()).getFreeCancellationHours();
            String dateOfEvent = String.format("%s %s", activityList.get(position).getDate(), activityList.get(position).getStartTime());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a", Locale.getDefault());
            try {
                Date date = formatter.parse(dateOfEvent);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.HOUR, -1 * freeCancellationHour);
                holder.cancellationDetails.setText(String.format("Free cancellation till %s", formatter.format(cal.getTime())));

            } catch (ParseException e) {
                holder.cancellationDetails.setText(String.format(Locale.getDefault(), "%d hours before %s", freeCancellationHour, dateOfEvent));
                e.printStackTrace();
            }
        } else {
            holder.cancellationDetails.setText(activity.getString(R.string.non_refundable));
        }

        Glide.with(activity)
                .load(activityList.get(position).getImageUrl())
                .centerCrop()
//                .apply(RequestOptions.bitmapTransform(new RoundedCorners(8)))
                .placeholder(R.drawable.ithaka_logo)
                .error(R.drawable.ithaka_logo)
//                .override(100, 200)
                .into(holder.activityImage);
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView activityImage;
        ListView inclusionList, exclusionList;
        TextView activityDescription, cityName, variantTitle, timing, cancellationDetails, activityAmount;

        public ItemViewHolder(View itemView) {
            super(itemView);
            activityImage = itemView.findViewById(R.id.activity_image);
            activityDescription = itemView.findViewById(R.id.activity_description);
            cityName = itemView.findViewById(R.id.city_name);
            variantTitle = itemView.findViewById(R.id.variant_title);
            timing = itemView.findViewById(R.id.date_and_time);
            inclusionList = itemView.findViewById(R.id.inclusion_list);
            exclusionList = itemView.findViewById(R.id.exclusion_list);
            cancellationDetails = itemView.findViewById(R.id.cancellation_details);
            activityAmount = itemView.findViewById(R.id.activity_amount);
        }
    }
}
