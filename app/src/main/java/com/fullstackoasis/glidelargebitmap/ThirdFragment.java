package com.fullstackoasis.glidelargebitmap;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.fullstackoasis.glidelargebitmap.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
    private static final String TAG = ThirdFragment.class.getCanonicalName();
    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FirstFragment);
            }
        });
        binding.tvNatali.setMovementMethod(LinkMovementMethod.getInstance());
        binding.tvNataliCredit.setMovementMethod(LinkMovementMethod.getInstance());
        // getString(R.string.corey_logo)
        // Glide.with(this).load("https://goo.gl/gEgYUd").into(binding.ivPhoto);
        Log.d(TAG, getString(R.string.corey_url));
        Glide.with(this).load(getString(R.string.corey_url)).into(binding.ivPhoto);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}