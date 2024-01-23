package com.example.movies;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.movies.Model.BannerMovies;
import com.example.movies.adapter.BannerMoviesPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    BannerMoviesPagerAdapter  bannerMoviesPagerAdapter;
    TabLayout indicatorTab,categoryTab;


    ViewPager bannerMoviesViewsPager;
    List<BannerMovies> HomeBannerList;
    List<BannerMovies> tvShowsBannerList;
    List<BannerMovies> moviesBannerList;
    List<BannerMovies> kidsBannerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          indicatorTab = findViewById(R.id.tab_indicator);
          categoryTab = findViewById(R.id.tabLayout);

        HomeBannerList = new ArrayList<>();
        HomeBannerList.add(new BannerMovies(1,"Avengers","https://c4.wallpaperflare.com/wallpaper/869/847/751/movies-hollywood-movies-wallpaper-preview.jpg",""));
        HomeBannerList.add(new BannerMovies(2,"Avengers1","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        HomeBannerList.add(new BannerMovies(3,"Avengers2","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        HomeBannerList.add(new BannerMovies(4,"Avengers3","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        HomeBannerList.add(new BannerMovies(5,"Avengers4","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));

        tvShowsBannerList = new ArrayList<>();
        tvShowsBannerList.add(new BannerMovies(1,"Avengers","https://c4.wallpaperflare.com/wallpaper/869/847/751/movies-hollywood-movies-wallpaper-preview.jpg",""));
        tvShowsBannerList.add(new BannerMovies(2,"Avengers1","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        tvShowsBannerList.add(new BannerMovies(3,"Avengers2","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        tvShowsBannerList.add(new BannerMovies(4,"Avengers3","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));
        tvShowsBannerList.add(new BannerMovies(5,"Avengers4","https://i.pinimg.com/736x/e2/20/e2/e220e2ffea9e944a48684b897beaaf56.jpg",""));







        setBannerMoviesPagerAdapter(HomeBannerList);


    }
    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){
        bannerMoviesViewsPager = findViewById(R.id.banner_viewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewsPager.setAdapter(bannerMoviesPagerAdapter);
        indicatorTab.setupWithViewPager(bannerMoviesViewsPager);

Timer sliderTimer = new Timer();
sliderTimer.schedule(new AutoSlider(),6000 ,6000);
indicatorTab.setupWithViewPager(bannerMoviesViewsPager,true);

    }

    class AutoSlider extends TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(bannerMoviesViewsPager.getCurrentItem() < (HomeBannerList.size() - 1)){

                        bannerMoviesViewsPager.setCurrentItem(bannerMoviesViewsPager.getCurrentItem() + 1);
                    }
                    else{
                        bannerMoviesViewsPager.setCurrentItem(0);
                    }


                }
            });
        }
    }
}