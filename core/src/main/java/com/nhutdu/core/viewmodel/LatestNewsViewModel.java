package com.nhutdu.core.viewmodel;

import android.databinding.Bindable;
import android.util.Log;

import com.nhutdu.core.model.entities.Restaurant;
import com.nhutdu.core.view.INavigator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NhutDu on 04/08/2016.
 */
public class LatestNewsViewModel extends BaseViewModel {

    //region Properties

    private List<Restaurant> mRestaurants;

    //endregion

    //region Getter and Setter

    @Bindable
    public List<Restaurant> getRestaurants() {
        return mRestaurants;
    }

    public void setRestaurants(List<Restaurant> mRestaurants) {
        this.mRestaurants = mRestaurants;
//        notifyPropertyChanged(BR.restaurant);?\
    }

    //endregion

    //region Constructor

    public LatestNewsViewModel(INavigator navigator) {
        super(navigator);
    }

    //endregion

    //region Private methods

    private void loadFoods(){
        List<Restaurant> lRestaurants = new ArrayList<>();
        getNavigator().hideBusyIndicator();
    }

    //endregion

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("start","ok");
        getNavigator().showBusyIndicator("Loading...");
        loadFoods();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mRestaurants =null;
    }
}
