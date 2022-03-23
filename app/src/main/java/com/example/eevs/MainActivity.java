package com.example.eevs;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.eevs.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        BottomNavigationView navView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_contact)
                .build();
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
//        NavigationUI.setupWithNavController(binding.toolbar, navController);

        binding.toolbar.setTitle("");
        navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
            Log.i("destination ", navDestination.getId() + "");
            int id = navDestination.getId();
            if (id == R.id.navigation_home || id == R.id.navigation_dashboard || id == R.id.navigation_contact) {
                Objects.requireNonNull(getSupportActionBar()).setDisplayUseLogoEnabled(true);
                Objects.requireNonNull(getSupportActionBar()).setLogo(ContextCompat.getDrawable(getApplicationContext(), R.drawable.logo));
                binding.toolbar.setTitle("");
            } else {
                binding.toolbar.setTitle("");
                Objects.requireNonNull(getSupportActionBar()).setDisplayUseLogoEnabled(false);
            }
        });

    }

    //Setting Up the back button
    @Override
    public boolean onSupportNavigateUp() {
//        return super.onSupportNavigateUp();
        return NavigationUI.navigateUp(navController, (Openable) null);
    }
}