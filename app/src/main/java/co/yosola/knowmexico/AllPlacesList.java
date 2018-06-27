package co.yosola.knowmexico;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class AllPlacesList {

    public static AllPlacesList allPlaces = null;
    private Place[] mPlaces;
    private int mCurrentPlaceIndex = 0;

    private AllPlacesList(Context context) {
        mPlaces = new Place[20];

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

        String place11Name = context.getResources().getString(R.string.namePlaceEleven);
        String placeShortDesc11 = context.getResources().getString(R.string.shortdescPlaceEleven);
        Drawable place11Img = context.getResources().getDrawable(R.drawable.enchiladas);
        String place11type = context.getResources().getString(R.string.typePlaceEleven);

        Place place11 = new Place(place11Name, placeShortDesc11, place11Img, place11type);
        mPlaces[10] = place11;

        String place12Name = context.getResources().getString(R.string.namePlaceTwelve);
        String placeShortDesc12 = context.getResources().getString(R.string.shortdescPlaceTwelve);
        Drawable place12Img = context.getResources().getDrawable(R.drawable.hostalquesos);
        String place12type = context.getResources().getString(R.string.typePlaceTwelve);

        Place place12 = new Place(place12Name, placeShortDesc12, place12Img, place12type);
        mPlaces[11] = place12;

        String place13Name = context.getResources().getString(R.string.namePlaceThirteen);
        String placeShortDesc13 = context.getResources().getString(R.string.shortdescPlaceThirteen);
        Drawable place13Img = context.getResources().getDrawable(R.drawable.lacasadelpastor);
        String place13type = context.getResources().getString(R.string.typePlaceThirteen);

        Place place13 = new Place(place13Name, placeShortDesc13, place13Img, place13type);
        mPlaces[12] = place13;

        String place14Name = context.getResources().getString(R.string.namePlaceFourteen);
        String placeShortDesc14 = context.getResources().getString(R.string.shortdescPlaceFourteen);
        Drawable place14Img = context.getResources().getDrawable(R.drawable.lapoblanita);
        String place14type = context.getResources().getString(R.string.typePlaceFourteen);

        Place place14 = new Place(place14Name, placeShortDesc14, place14Img, place14type);
        mPlaces[13] = place14;

        String place15Name = context.getResources().getString(R.string.namePlaceFifteen);
        String placeShortDesc15 = context.getResources().getString(R.string.shortdescFifteen);
        Drawable place15Img = context.getResources().getDrawable(R.drawable.azulejoscasa);
        String place15type = context.getResources().getString(R.string.typePlaceFifteen);

        Place place15 = new Place(place15Name, placeShortDesc15, place15Img, place15type);
        mPlaces[14] = place15;

        String place16Name = context.getResources().getString(R.string.namePlaceSixteen);
        String placeShortDesc16 = context.getResources().getString(R.string.shortdescSixteen);
        Drawable place16Img = context.getResources().getDrawable(R.drawable.alipuscondesa);
        String place16type = context.getResources().getString(R.string.typePlaceSixteen);

        Place place16 = new Place(place16Name, placeShortDesc16, place16Img, place16type);
        mPlaces[15] = place16;

        String place17Name = context.getResources().getString(R.string.namePlaceSeventeen);
        String placeShortDesc17 = context.getResources().getString(R.string.shortdescSeventeen);
        Drawable place17Img = context.getResources().getDrawable(R.drawable.pujol);
        String place17type = context.getResources().getString(R.string.typePlaceSeventeen);

        Place place17 = new Place(place17Name, placeShortDesc17, place17Img, place17type);
        mPlaces[16] = place17;

        String place18Name = context.getResources().getString(R.string.namePlaceEighteen);
        String placeShortDesc18 = context.getResources().getString(R.string.shortdescEighteen);
        Drawable place18Img = context.getResources().getDrawable(R.drawable.gotan);
        String place18type = context.getResources().getString(R.string.typePlaceEighteen);

        Place place18 = new Place(place18Name, placeShortDesc18, place18Img, place18type);
        mPlaces[17] = place18;

        String place19Name = context.getResources().getString(R.string.namePlaceNineteen);
        String placeShortDesc19 = context.getResources().getString(R.string.shortdescNineteen);
        Drawable place19Img = context.getResources().getDrawable(R.drawable.cabrera7);
        String place19type = context.getResources().getString(R.string.typePlaceNineteen);

        Place place19 = new Place(place19Name, placeShortDesc19, place19Img, place19type);
        mPlaces[18] = place19;

        String place20Name = context.getResources().getString(R.string.namePlaceTwenty);
        String placeShortDesc20 = context.getResources().getString(R.string.shortdescTwenty);
        Drawable place20Img = context.getResources().getDrawable(R.drawable.labellalula);
        String place20type = context.getResources().getString(R.string.typePlaceTwenty);

        Place place20 = new Place(place20Name, placeShortDesc20, place20Img, place20type);
        mPlaces[19] = place20;
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

    public ArrayList<Place> getAllToEatPlaces(){
        ArrayList<Place> toeatPlaces = new ArrayList<>();
        for(int i = 0; i < mPlaces.length; i++){
            if(mPlaces[i].getPlaceType().equals("toeat")){
                toeatPlaces.add(allPlaces.getPlacebyIndex(i));
            }
        }
        return  toeatPlaces;
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
