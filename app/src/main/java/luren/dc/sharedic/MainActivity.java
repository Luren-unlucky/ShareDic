package luren.dc.sharedic;

import android.content.Intent;
import android.os.*;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import luren.dc.sharedic.R;
import luren.dc.sharedic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }

    private void initView() {
        setSupportActionBar(binding.mainToolbar);
        binding.mainFunctionBotDownload.setOnClickListener(this);
        binding.mainFunctionDicDownload.setOnClickListener(this);
        binding.mainFunctionFeelback.setOnClickListener(this);
        binding.mainFunctionUpgrade.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_function_dic_download:
                break;
            case R.id.main_function_bot_download:
                break;
            case R.id.main_function_feelback:
                startActivity(new Intent(this, FeelbackActivity.class));
                break;
            case R.id.main_function_upgrade:
                break;
        }
    }
}
