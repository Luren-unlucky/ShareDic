package luren.dc.sharedic;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import luren.dc.sharedic.R;
import luren.dc.sharedic.databinding.ActivityFeelbackBinding;

public class FeelbackActivity extends AppCompatActivity {

    private static final String TAG = "Feelback";

    private ActivityFeelbackBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeelbackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }
    
    private void initView() {
        setSupportActionBar(binding.feelbackToolbar);
        binding.feelbackToolbar.setNavigationOnClickListener(view -> {
            finish();
        });
    }
}
