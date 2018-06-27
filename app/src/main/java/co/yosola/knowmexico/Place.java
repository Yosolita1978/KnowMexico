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

    public Place(String placeName, String shortDescription, Drawable placeImage, String placeType){
        mPlaceName = placeName;
        mPlaceShortDescription = shortDescription;
        mImageResource = placeImage;
        mPlaceType = placeType;
    }

    // The construtor of the Place Object

    public Place(String placeName, String placeshortDescription, Drawable imagePlace, String placeType,  String longPlaceDescription, String placeAddress, String placeUrl) {
        mPlaceName = placeName;
        mPlaceShortDescription = placeshortDescription;
        mPlaceLongDescription = longPlaceDescription;
        mPlaceType = placeType;
        mPlaceAddress = placeAddress;
        mPlaceUrl = placeUrl;
        mImageResource = imagePlace;
    }

    /**
     * Getter method for Place Name
     * @return placeName
     */
    public String getPlaceName(){
        return mPlaceName;
    }

    /**
     * Getter method for Place Short Description
     * @return placeShortDescription
     */
    public String getPlaceShortDescription(){
        return mPlaceShortDescription;
    }

    /**
     * Getter method for Place Long Description
     * @return placeLongDescription
     */
    public String getPlaceLongDescription(){
        return mPlaceLongDescription;
    }

    /**
     * Getter method for Place Type
     * @return placeType
     */
    public String getPlaceType(){
        return mPlaceType;
    }

    /**
     * Getter method for Place Address
     * @return placeAddress
     */
    public String getPlaceAddress(){
        return mPlaceAddress;
    }

    /**
     * Getter method for Place url
     * @return placeurl
     */
    public String getPlaceUrl(){
        return mPlaceUrl;
    }

    /**
     * Getter method for Place Image
     * @return placeImg Drawable
     */
    public Drawable getImageResource() {
        return mImageResource;
    }
}
