package com.time.timing.UI.PreviousWeekAdapter.UserAdapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.time.timing.UI.PreviousWeekAdapter.PreviousWeekUserVH.PSundayUserVH;
import com.time.timing.UI.PreviousWeekAdapter.UserWeekModel.MondayUserModel;
import com.time.timing.databinding.PreviousthusdayuseritemBinding;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PreviousMondayUserAdapter extends RecyclerView.Adapter<PSundayUserVH> {

    @Getter
    @Setter
    private List<MondayUserModel> list;

    @NonNull
    @Override
    public PSundayUserVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        var layoutInflater  = LayoutInflater.from(parent.getContext());
        var view = PreviousthusdayuseritemBinding.inflate(layoutInflater, parent, false);
        return new PSundayUserVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PSundayUserVH holder, int position) {
        holder.binding.UserName.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        if(list == null) {
            return 0;
        }return list.size();
    }
}
