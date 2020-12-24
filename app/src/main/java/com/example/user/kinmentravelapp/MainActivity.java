package com.example.user.kinmentravelapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private String url = "https://next.json-generator.com/api/json/get/EysxObI_L";
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private int CheckID = R.id.note;
    private int PreId;
    private NavigationView navigationView;
    private Context context = this;

    private RequestQueue queue;
    private JsonObjectRequest request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        queue = Volley.newRequestQueue(this);
        request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Toast.makeText(context, "更新成功", Toast.LENGTH_LONG).show();
                        DataApi.update(context, response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "更新失敗", Toast.LENGTH_LONG).show();
            }
        });
        queue.add(request);
        replaceFragment(new Web(false));
    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (CheckID == R.id.note) {
            Web.onBackPressed();
        } else {
            super.onBackPressed();
        }

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        CheckID = item.getItemId();
        if (!(CheckID == PreId))
            switch (CheckID) {
                case R.id.note:
                    replaceFragment(new Web(false));
                    break;
                case R.id.eat:
                    Uri uri = Uri.parse("https://www.google.com/maps/@24.451571,118.3704086,13z/data=!3m1!4b1!4m3!11m2!2sC9VF7Q2gGJ6zXh9CiGSF9_AFaKRtiA!3e2");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    break;
                case R.id.day1:
                    replaceFragment(new day123("day1"));
                    break;
                case R.id.day2:
                    replaceFragment(new day123("day2"));
                    break;
                case R.id.day3:
                    replaceFragment(new day123("day3"));
                    break;
                case R.id.hackmd:
                    replaceFragment(new Web(true));
                    break;
            }

        if (CheckID == R.id.update)
            queue.add(request);

        drawer.closeDrawer(GravityCompat.START);
        PreId = CheckID;
        return true;
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content_frame, fragment);
        ft.commit();
    }
}
