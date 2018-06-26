package co.yosola.knowmexico;

import android.graphics.drawable.Drawable;

public class Place {

    private String mPlaceName;

    private String mPlaceShortDescription;

    private String mPlaceLongDescription;

    private Drawable mImageResource;

    private String mPlaceType;

    private String mPlaceUrl;

    private String mPlaceAddress;


    // A short construtor of the Place Object for the list

    public Place(String shortDescription, String placeName, Drawable placeImage){
        mPlaceName = placeName;
        mPlaceShortDescription = shortDescription;
        mImageResource = placeImage;
    }


    // The construtor of the Place Object

    public Place(String placeName, String placeshortDescription, String placeLongDescription, String placeType, String placeAddress, String placeUrl, Drawable imagePlace) {
        mPlaceName = placeName;
        mPlaceShortDescription = placeshortDescription;
        mPlaceLongDescription = placeLongDescription;
        mPlaceType = placeType;
        mPlaceAddress = placeAddress;
        mPlaceUrl = placeUrl;
        mImageResource = imagePlace;
    }

    public String getPlaceName(){
        return mPlaceName;
    }

    public String getPlaceShortDescription(){
        return mPlaceShortDescription;
    }

    public String getPlaceLongDescription(){
        return mPlaceLongDescription;
    }

    public String getPlaceType(){
        return mPlaceType;
    }

    public String getPlaceAddress(){
        return mPlaceAddress;
    }

    public String getPlaceUrl(){
        return mPlaceUrl;
    }

    public Drawable getImageResource() {
        return mImageResource;
    }
}
