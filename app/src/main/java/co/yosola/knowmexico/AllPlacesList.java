package co.yosola.knowmexico;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class AllPlacesList {

    public static AllPlacesList allPlaces = null;
    private Place[] mPlaces;
    private int mCurrentPlaceIndex = 0;

    private AllPlacesList(Context context) {
        mPlaces = new Place[10];

        String placeOneName = context.getResources().getString(R.string.namePlaceOne);
        String placeShortDescOne = context.getResources().getString(R.string.shortdescPlaceOne);
        Drawable placeOneImg = context.getResources().getDrawable(R.drawable.castillochapultepec);
        String placeOntype = context.getResources().getString(R.string.typePlaceOne);

        Place placeOne = new Place(placeOneName, placeShortDescOne, placeOneImg, placeOntype);
        mPlaces[0] = placeOne;

        String placeTwoName = context.getResources().getString(R.string.namePlaceTwo);
        String placeShortDescTwo = context.getResources().getString(R.string.shortdescPlaceTwo);
        Drawable placeTwoImg = context.getResources().getDrawable(R.drawable.bellasartes);
        String placeTwotype = context.getResources().getString(R.string.typePlaceTwo);

        Place placeTwo = new Place(placeTwoName, placeShortDescTwo, placeTwoImg, placeTwotype);
        mPlaces[1] = placeTwo;

        String placeThreeName = context.getResources().getString(R.string.namePlaceThree);
        String placeShortDescThree = context.getResources().getString(R.string.shortdescPlaceThree);
        Drawable placeThreeImg = context.getResources().getDrawable(R.drawable.angelindependencia_);
        String placeThreetype = context.getResources().getString(R.string.typePlaceThree);

        Place placeThree = new Place(placeThreeName,placeShortDescThree, placeThreeImg, placeThreetype);
        mPlaces[2] = placeThree;

        String placeFourName = context.getResources().getString(R.string.namePlaceFour);
        String placeShortDescFour = context.getResources().getString(R.string.shortdescPlaceFour);
        Drawable placeFourImg = context.getResources().getDrawable(R.drawable.revolutionmonument);
        String placeFourtype = context.getResources().getString(R.string.typePlaceFour);

        Place placeFour = new Place(placeFourName,placeShortDescFour, placeFourImg, placeFourtype);
        mPlaces[3] = placeFour;

        String placeFiveName = context.getResources().getString(R.string.namePlaceFive);
        String placeShortDescFive = context.getResources().getString(R.string.shortdescPlaceFive);
        Drawable placeFiveImg = context.getResources().getDrawable(R.drawable.museoantropologia);
        String placeFivetype = context.getResources().getString(R.string.typePlaceFive);

        Place placeFive = new Place(placeFiveName, placeShortDescFive, placeFiveImg, placeFivetype);
        mPlaces[4] = placeFive;

        String placeSixName = context.getResources().getString(R.string.namePlaceSix);
        String placeShortDescSix = context.getResources().getString(R.string.shortdescPlaceSix);
        Drawable placeSixImg = context.getResources().getDrawable(R.drawable.nationalpalace);
        String placeSixtype = context.getResources().getString(R.string.typePlaceSix);

        Place placeSix = new Place(placeSixName, placeShortDescSix, placeSixImg,  placeSixtype);
        mPlaces[5] = placeSix;

        String placeSevenName = context.getResources().getString(R.string.namePlaceSeven);
        String placeShortDescSeven = context.getResources().getString(R.string.shortdescPlaceSeven);
        Drawable placeSevenImg = context.getResources().getDrawable(R.drawable.cathedral);
        String placeSeventype = context.getResources().getString(R.string.typePlaceSeven);

        Place placeSeven = new Place(placeSevenName, placeShortDescSeven, placeSevenImg, placeSeventype);
        mPlaces[6] = placeSeven;

        String placeEightName = context.getResources().getString(R.string.namePlaceEight);
        String placeShortDescEight = context.getResources().getString(R.string.shortdescPlaceEight);
        Drawable placeEightImg = context.getResources().getDrawable(R.drawable.bibliotecamexico);
        String placeEightype = context.getResources().getString(R.string.typePlaceEight);

        Place placeEight = new Place(placeEightName, placeShortDescEight, placeEightImg, placeEightype);
        mPlaces[7] = placeEight;

        String placeNineName = context.getResources().getString(R.string.namePlaceNine);
        String placeShortDescNine = context.getResources().getString(R.string.shortdescPlaceNine);
        Drawable placeNineImg = context.getResources().getDrawable(R.drawable.sanindelfonso);
        String placeNinetype = context.getResources().getString(R.string.typePlaceNine);

        Place placeNine = new Place(placeNineName, placeShortDescNine, placeNineImg, placeNinetype);
        mPlaces[8] = placeNine;

        String placeTenName = context.getResources().getString(R.string.namePlaceTen);
        String placeShortDescTen = context.getResources().getString(R.string.shortdescPlaceTen);
        Drawable placeTenImg = context.getResources().getDrawable(R.drawable.threecultures);
        String placeTentype = context.getResources().getString(R.string.typePlaceTen);

        Place placeTen = new Place(placeTenName, placeShortDescTen, placeTenImg, placeTentype);
        mPlaces[9] = placeTen;
    }

    public static AllPlacesList getAllPlaces(Context context) {
        if (allPlaces == null) {
            allPlaces = new AllPlacesList(context);
        }
        return allPlaces;
    }

    public ArrayList<Place> getAllToDoPlaces(){
        ArrayList<Place> toDoPlaces = new ArrayList<>();
        for(int i = 0; i < mPlaces.length; i++){
            if(mPlaces[i].getPlaceType().equals("todo")){
                toDoPlaces.add(allPlaces.getPlacebyIndex(i));
            }
        }
        return  toDoPlaces;
    }

    public Place getNextPlace() {
        if (mCurrentPlaceIndex == mPlaces.length - 1) {
            return null;
        } else {
            mCurrentPlaceIndex += 1;
            return mPlaces[mCurrentPlaceIndex];
        }
    }

    public Place getPlacebyIndex(int index){
        return  mPlaces[index];
    }


    public int getTotalPlaces() {
        return mPlaces.length;
    }

    public int getPlaceIndex(Place place){
        int index = -1;
        for(int i = 0; i < mPlaces.length; i++){
            if(mPlaces[i] == place){
                index = i;
            }
        }
        return index;

    }

}
