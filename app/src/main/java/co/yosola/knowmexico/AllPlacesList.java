package co.yosola.knowmexico;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

// Creating a AllPlaces Class to handle all the places objects

public class AllPlacesList {

    public static AllPlacesList allPlaces = null;
    private Place[] mPlaces;

    // Initial instance
    private AllPlacesList(Context context) {
        mPlaces = new Place[27];

        String placeOneName = context.getResources().getString(R.string.namePlaceOne);
        String placeShortDescOne = context.getResources().getString(R.string.shortdescPlaceOne);
        Drawable placeOneImg = context.getResources().getDrawable(R.drawable.castillochapultepec);
        String placeOntype = context.getResources().getString(R.string.typePlaceOne);
        String placeLongDescOne = context.getResources().getString(R.string.longdescPlaceOne);
        String placeAddressOne = context.getResources().getString(R.string.addresPlaceOne);
        String placeurlOne = context.getResources().getString(R.string.urlPlaceOne);

        Place placeOne = new Place(placeOneName, placeShortDescOne, placeOneImg, placeOntype, placeLongDescOne, placeAddressOne, placeurlOne);
        mPlaces[0] = placeOne;

        String placeTwoName = context.getResources().getString(R.string.namePlaceTwo);
        String placeShortDescTwo = context.getResources().getString(R.string.shortdescPlaceTwo);
        Drawable placeTwoImg = context.getResources().getDrawable(R.drawable.bellasartes);
        String placeTwotype = context.getResources().getString(R.string.typePlaceTwo);
        String placeLongDescTwo = context.getResources().getString(R.string.longdescPlaceTwo);
        String placeAddressTwo = context.getResources().getString(R.string.addresPlaceTwo);
        String placeurlTwo = context.getResources().getString(R.string.urlPlaceTwo);

        Place placeTwo = new Place(placeTwoName, placeShortDescTwo, placeTwoImg, placeTwotype, placeLongDescTwo, placeAddressTwo, placeurlTwo);
        mPlaces[1] = placeTwo;

        String placeThreeName = context.getResources().getString(R.string.namePlaceThree);
        String placeShortDescThree = context.getResources().getString(R.string.shortdescPlaceThree);
        Drawable placeThreeImg = context.getResources().getDrawable(R.drawable.angelindependencia_);
        String placeThreetype = context.getResources().getString(R.string.typePlaceThree);
        String placeLongDescThree = context.getResources().getString(R.string.longdescPlaceThree);
        String placeAddressThree = context.getResources().getString(R.string.addresPlaceThree);
        String placeurlThree = context.getResources().getString(R.string.urlPlaceThree);

        Place placeThree = new Place(placeThreeName, placeShortDescThree, placeThreeImg, placeThreetype, placeLongDescThree, placeAddressThree, placeurlThree);
        mPlaces[2] = placeThree;

        String placeFourName = context.getResources().getString(R.string.namePlaceFour);
        String placeShortDescFour = context.getResources().getString(R.string.shortdescPlaceFour);
        Drawable placeFourImg = context.getResources().getDrawable(R.drawable.revolutionmonument);
        String placeFourtype = context.getResources().getString(R.string.typePlaceFour);
        String placeLongDescFour = context.getResources().getString(R.string.longdescPlaceFour);
        String placeAddressFour = context.getResources().getString(R.string.addresPlaceFour);
        String placeurlFour = context.getResources().getString(R.string.urlPlaceFour);


        Place placeFour = new Place(placeFourName, placeShortDescFour, placeFourImg, placeFourtype, placeLongDescFour, placeAddressFour, placeurlFour);
        mPlaces[3] = placeFour;

        String placeFiveName = context.getResources().getString(R.string.namePlaceFive);
        String placeShortDescFive = context.getResources().getString(R.string.shortdescPlaceFive);
        Drawable placeFiveImg = context.getResources().getDrawable(R.drawable.museoantropologia);
        String placeFivetype = context.getResources().getString(R.string.typePlaceFive);
        String placeLongDescFive = context.getResources().getString(R.string.longdescPlaceFive);
        String placeAddressFive = context.getResources().getString(R.string.addresPlaceFive);
        String placeurlFive = context.getResources().getString(R.string.urlPlaceFive);

        Place placeFive = new Place(placeFiveName, placeShortDescFive, placeFiveImg, placeFivetype, placeLongDescFive, placeAddressFive, placeurlFive);
        mPlaces[4] = placeFive;

        String placeSixName = context.getResources().getString(R.string.namePlaceSix);
        String placeShortDescSix = context.getResources().getString(R.string.shortdescPlaceSix);
        Drawable placeSixImg = context.getResources().getDrawable(R.drawable.nationalpalace);
        String placeSixtype = context.getResources().getString(R.string.typePlaceSix);
        String placeLongDescSix = context.getResources().getString(R.string.longdescPlaceSix);
        String placeAddressSix = context.getResources().getString(R.string.addresPlaceSix);
        String placeurlSix = context.getResources().getString(R.string.urlPlaceSix);

        Place placeSix = new Place(placeSixName, placeShortDescSix, placeSixImg, placeSixtype, placeLongDescSix, placeAddressSix, placeurlSix);
        mPlaces[5] = placeSix;

        String placeSevenName = context.getResources().getString(R.string.namePlaceSeven);
        String placeShortDescSeven = context.getResources().getString(R.string.shortdescPlaceSeven);
        Drawable placeSevenImg = context.getResources().getDrawable(R.drawable.cathedral);
        String placeSeventype = context.getResources().getString(R.string.typePlaceSeven);
        String placeLongDescSeven = context.getResources().getString(R.string.longdescPlaceSeven);
        String placeAddressSeven = context.getResources().getString(R.string.addresPlaceSeven);
        String placeurlSeven = context.getResources().getString(R.string.urlPlaceSeven);

        Place placeSeven = new Place(placeSevenName, placeShortDescSeven, placeSevenImg, placeSeventype, placeLongDescSeven, placeAddressSeven, placeurlSeven);
        mPlaces[6] = placeSeven;

        String placeEightName = context.getResources().getString(R.string.namePlaceEight);
        String placeShortDescEight = context.getResources().getString(R.string.shortdescPlaceEight);
        Drawable placeEightImg = context.getResources().getDrawable(R.drawable.bibliotecamexico);
        String placeEightype = context.getResources().getString(R.string.typePlaceEight);
        String placeLongDescEight = context.getResources().getString(R.string.longdescPlaceEight);
        String placeAddressEight = context.getResources().getString(R.string.addresPlaceEight);
        String placeurlEight = context.getResources().getString(R.string.urlPlaceEight);

        Place placeEight = new Place(placeEightName, placeShortDescEight, placeEightImg, placeEightype, placeLongDescEight, placeAddressEight, placeurlEight);
        mPlaces[7] = placeEight;

        String placeNineName = context.getResources().getString(R.string.namePlaceNine);
        String placeShortDescNine = context.getResources().getString(R.string.shortdescPlaceNine);
        Drawable placeNineImg = context.getResources().getDrawable(R.drawable.sanindelfonso);
        String placeNinetype = context.getResources().getString(R.string.typePlaceNine);
        String placeLongDescNine = context.getResources().getString(R.string.longdescPlaceNine);
        String placeAddressNine = context.getResources().getString(R.string.addresPlaceNine);
        String placeurlNine = context.getResources().getString(R.string.urlPlaceNine);

        Place placeNine = new Place(placeNineName, placeShortDescNine, placeNineImg, placeNinetype, placeLongDescNine, placeAddressNine, placeurlNine);
        mPlaces[8] = placeNine;

        String placeTenName = context.getResources().getString(R.string.namePlaceTen);
        String placeShortDescTen = context.getResources().getString(R.string.shortdescPlaceTen);
        Drawable placeTenImg = context.getResources().getDrawable(R.drawable.threecultures);
        String placeTentype = context.getResources().getString(R.string.typePlaceTen);
        String placeLongDescTen = context.getResources().getString(R.string.longdescPlaceTen);
        String placeAddressTen = context.getResources().getString(R.string.addresPlaceTen);
        String placeurlTen = context.getResources().getString(R.string.urlPlaceTen);

        Place placeTen = new Place(placeTenName, placeShortDescTen, placeTenImg, placeTentype, placeLongDescTen, placeAddressTen, placeurlTen);
        mPlaces[9] = placeTen;

        String place11Name = context.getResources().getString(R.string.namePlaceEleven);
        String placeShortDesc11 = context.getResources().getString(R.string.shortdescPlaceEleven);
        Drawable place11Img = context.getResources().getDrawable(R.drawable.enchiladas);
        String place11type = context.getResources().getString(R.string.typePlaceEleven);
        String placeLongDesc11 = context.getResources().getString(R.string.longdescPlaceEleven);
        String placeAddress11 = context.getResources().getString(R.string.addresPlaceEleven);
        String placeurl11 = context.getResources().getString(R.string.urlPlaceEleven);

        Place place11 = new Place(place11Name, placeShortDesc11, place11Img, place11type, placeLongDesc11, placeAddress11, placeurl11);
        mPlaces[10] = place11;

        String place12Name = context.getResources().getString(R.string.namePlaceTwelve);
        String placeShortDesc12 = context.getResources().getString(R.string.shortdescPlaceTwelve);
        Drawable place12Img = context.getResources().getDrawable(R.drawable.hostalquesos);
        String place12type = context.getResources().getString(R.string.typePlaceTwelve);
        String placeLongDesc12 = context.getResources().getString(R.string.longdescPlaceTwelve);
        String placeAddress12 = context.getResources().getString(R.string.addresPlaceTwelve);
        String placeurl12 = context.getResources().getString(R.string.urlPlaceTwelve);

        Place place12 = new Place(place12Name, placeShortDesc12, place12Img, place12type, placeLongDesc12, placeAddress12, placeurl12);
        mPlaces[11] = place12;

        String place13Name = context.getResources().getString(R.string.namePlaceThirteen);
        String placeShortDesc13 = context.getResources().getString(R.string.shortdescPlaceThirteen);
        Drawable place13Img = context.getResources().getDrawable(R.drawable.lacasadelpastor);
        String place13type = context.getResources().getString(R.string.typePlaceThirteen);
        String placeLongDesc13 = context.getResources().getString(R.string.longdescPlaceThirteen);
        String placeAddress13 = context.getResources().getString(R.string.addresPlaceThirteen);
        String placeurl13 = context.getResources().getString(R.string.urlPlaceThirteen);

        Place place13 = new Place(place13Name, placeShortDesc13, place13Img, place13type, placeLongDesc13, placeAddress13, placeurl13);
        mPlaces[12] = place13;

        String place14Name = context.getResources().getString(R.string.namePlaceFourteen);
        String placeShortDesc14 = context.getResources().getString(R.string.shortdescPlaceFourteen);
        Drawable place14Img = context.getResources().getDrawable(R.drawable.lapoblanita);
        String place14type = context.getResources().getString(R.string.typePlaceFourteen);
        String placeLongDesc14 = context.getResources().getString(R.string.longdescPlaceFourteen);
        String placeAddress14 = context.getResources().getString(R.string.addresPlaceFourteen);
        String placeurl14 = context.getResources().getString(R.string.urlPlaceFourteen);

        Place place14 = new Place(place14Name, placeShortDesc14, place14Img, place14type, placeLongDesc14, placeAddress14, placeurl14);
        mPlaces[13] = place14;

        String place15Name = context.getResources().getString(R.string.namePlaceFifteen);
        String placeShortDesc15 = context.getResources().getString(R.string.shortdescFifteen);
        Drawable place15Img = context.getResources().getDrawable(R.drawable.azulejoscasa);
        String place15type = context.getResources().getString(R.string.typePlaceFifteen);
        String placeLongDesc15 = context.getResources().getString(R.string.longdescFifteen);
        String placeAddress15 = context.getResources().getString(R.string.addresPlaceFifteen);
        String placeurl15 = context.getResources().getString(R.string.urlPlaceFifteen);

        Place place15 = new Place(place15Name, placeShortDesc15, place15Img, place15type, placeLongDesc15, placeAddress15, placeurl15);
        mPlaces[14] = place15;

        String place16Name = context.getResources().getString(R.string.namePlaceSixteen);
        String placeShortDesc16 = context.getResources().getString(R.string.shortdescSixteen);
        Drawable place16Img = context.getResources().getDrawable(R.drawable.alipuscondesa);
        String place16type = context.getResources().getString(R.string.typePlaceSixteen);
        String placeLongDesc16 = context.getResources().getString(R.string.longdescSixteen);
        String placeAddress16 = context.getResources().getString(R.string.addresPlaceSixteen);
        String placeurl16 = context.getResources().getString(R.string.urlPlaceSixteen);

        Place place16 = new Place(place16Name, placeShortDesc16, place16Img, place16type, placeLongDesc16, placeAddress16, placeurl16);
        mPlaces[15] = place16;

        String place17Name = context.getResources().getString(R.string.namePlaceSeventeen);
        String placeShortDesc17 = context.getResources().getString(R.string.shortdescSeventeen);
        Drawable place17Img = context.getResources().getDrawable(R.drawable.pujol);
        String place17type = context.getResources().getString(R.string.typePlaceSeventeen);
        String placeLongDesc17 = context.getResources().getString(R.string.longdescSeventeen);
        String placeAddress17 = context.getResources().getString(R.string.addresPlaceSeventeen);
        String placeurl17 = context.getResources().getString(R.string.urlPlaceSeventeen);

        Place place17 = new Place(place17Name, placeShortDesc17, place17Img, place17type, placeLongDesc17, placeAddress17, placeurl17);
        mPlaces[16] = place17;

        String place18Name = context.getResources().getString(R.string.namePlaceEighteen);
        String placeShortDesc18 = context.getResources().getString(R.string.shortdescEighteen);
        Drawable place18Img = context.getResources().getDrawable(R.drawable.gotan);
        String place18type = context.getResources().getString(R.string.typePlaceEighteen);
        String placeLongDesc18 = context.getResources().getString(R.string.longdescEighteen);
        String placeAddress18 = context.getResources().getString(R.string.addresPlaceEighteen);
        String placeurl18 = context.getResources().getString(R.string.urlPlaceEighteen);

        Place place18 = new Place(place18Name, placeShortDesc18, place18Img, place18type, placeLongDesc18, placeAddress18, placeurl18);
        mPlaces[17] = place18;

        String place19Name = context.getResources().getString(R.string.namePlaceNineteen);
        String placeShortDesc19 = context.getResources().getString(R.string.shortdescNineteen);
        Drawable place19Img = context.getResources().getDrawable(R.drawable.cabrera7);
        String place19type = context.getResources().getString(R.string.typePlaceNineteen);
        String placeLongDesc19 = context.getResources().getString(R.string.longdescNineteen);
        String placeAddress19 = context.getResources().getString(R.string.addresPlaceNineteen);
        String placeurl19 = context.getResources().getString(R.string.urlPlaceNineteen);

        Place place19 = new Place(place19Name, placeShortDesc19, place19Img, place19type, placeLongDesc19, placeAddress19, placeurl19);
        mPlaces[18] = place19;

        String place20Name = context.getResources().getString(R.string.namePlaceTwenty);
        String placeShortDesc20 = context.getResources().getString(R.string.shortdescTwenty);
        Drawable place20Img = context.getResources().getDrawable(R.drawable.labellalula);
        String place20type = context.getResources().getString(R.string.typePlaceTwenty);
        String placeLongDesc20 = context.getResources().getString(R.string.longdescTwenty);
        String placeAddress20 = context.getResources().getString(R.string.addresPlaceTwenty);
        String placeurl20 = context.getResources().getString(R.string.urlPlaceTwenty);

        Place place20 = new Place(place20Name, placeShortDesc20, place20Img, place20type, placeLongDesc20, placeAddress20, placeurl20);
        mPlaces[19] = place20;

        String place21Name = context.getResources().getString(R.string.namePlace21);
        String placeShortDesc21 = context.getResources().getString(R.string.shortdesc21);
        Drawable place21Img = context.getResources().getDrawable(R.drawable.tenampa);
        String place21type = context.getResources().getString(R.string.typePlace21);
        String placeLongDesc21 = context.getResources().getString(R.string.longdesc21);
        String placeAddress21 = context.getResources().getString(R.string.addresPlace21);
        String placeurl21 = context.getResources().getString(R.string.urlPlace21);

        Place place21 = new Place(place21Name, placeShortDesc21, place21Img, place21type, placeLongDesc21, placeAddress21, placeurl21);
        mPlaces[20] = place21;

        String place22Name = context.getResources().getString(R.string.namePlace22);
        String placeShortDesc22 = context.getResources().getString(R.string.shortdesc22);
        Drawable place22Img = context.getResources().getDrawable(R.drawable.riviera);
        String place22type = context.getResources().getString(R.string.typePlace22);
        String placeLongDesc22 = context.getResources().getString(R.string.longdesc22);
        String placeAddress22 = context.getResources().getString(R.string.addresPlace22);
        String placeurl22 = context.getResources().getString(R.string.urlPlace22);

        Place place22 = new Place(place22Name, placeShortDesc22, place22Img, place22type, placeLongDesc22, placeAddress22, placeurl22);
        mPlaces[21] = place22;

        String place23Name = context.getResources().getString(R.string.namePlace23);
        String placeShortDesc23 = context.getResources().getString(R.string.shortdesc23);
        Drawable place23Img = context.getResources().getDrawable(R.drawable.barmilan);
        String place23type = context.getResources().getString(R.string.typePlace23);
        String placeLongDesc23 = context.getResources().getString(R.string.longdesc23);
        String placeAddress23 = context.getResources().getString(R.string.addresPlace23);
        String placeurl23 = context.getResources().getString(R.string.urlPlace23);

        Place place23 = new Place(place23Name, placeShortDesc23, place23Img, place23type, placeLongDesc23, placeAddress23, placeurl23);
        mPlaces[22] = place23;

        String place24Name = context.getResources().getString(R.string.namePlace24);
        String placeShortDesc24 = context.getResources().getString(R.string.shortdesc24);
        Drawable place24Img = context.getResources().getDrawable(R.drawable.coyoacana);
        String place24type = context.getResources().getString(R.string.typePlace24);
        String placeLongDesc24 = context.getResources().getString(R.string.longdesc24);
        String placeAddress24 = context.getResources().getString(R.string.addresPlace24);
        String placeurl24 = context.getResources().getString(R.string.urlPlace24);

        Place place24 = new Place(place24Name, placeShortDesc24, place24Img, place24type, placeLongDesc24, placeAddress24, placeurl24);
        mPlaces[23] = place24;

        String place25Name = context.getResources().getString(R.string.namePlace25);
        String placeShortDesc25 = context.getResources().getString(R.string.shortdesc25);
        Drawable place25Img = context.getResources().getDrawable(R.drawable.tapanegra);
        String place25type = context.getResources().getString(R.string.typePlace25);
        String placeLongDesc25 = context.getResources().getString(R.string.longdesc25);
        String placeAddress25 = context.getResources().getString(R.string.addresPlace25);
        String placeurl25 = context.getResources().getString(R.string.urlPlace25);

        Place place25 = new Place(place25Name, placeShortDesc25, place25Img, place25type, placeLongDesc25, placeAddress25, placeurl25);
        mPlaces[24] = place25;

        String place26Name = context.getResources().getString(R.string.namePlace26);
        String placeShortDesc26 = context.getResources().getString(R.string.shortdesc26);
        Drawable place26Img = context.getResources().getDrawable(R.drawable.covadonga);
        String place26type = context.getResources().getString(R.string.typePlace26);
        String placeLongDesc26 = context.getResources().getString(R.string.longdesc26);
        String placeAddress26 = context.getResources().getString(R.string.addresPlace26);
        String placeurl26 = context.getResources().getString(R.string.urlPlace26);

        Place place26 = new Place(place26Name, placeShortDesc26, place26Img, place26type, placeLongDesc26, placeAddress26, placeurl26);
        mPlaces[25] = place26;

        String place27Name = context.getResources().getString(R.string.namePlace27);
        String placeShortDesc27 = context.getResources().getString(R.string.shortdesc27);
        Drawable place27Img = context.getResources().getDrawable(R.drawable.leonoro);
        String place27type = context.getResources().getString(R.string.typePlace27);
        String placeLongDesc27 = context.getResources().getString(R.string.longdesc27);
        String placeAddress27 = context.getResources().getString(R.string.addresPlace27);
        String placeurl27 = context.getResources().getString(R.string.urlPlace27);

        Place place27 = new Place(place27Name, placeShortDesc27, place27Img, place27type, placeLongDesc27, placeAddress27, placeurl27);
        mPlaces[26] = place27;
    }

    // Method to grab all the places
    public static AllPlacesList getAllPlaces(Context context) {
        if (allPlaces == null) {
            allPlaces = new AllPlacesList(context);
        }
        return allPlaces;
    }

    // Method to grab all the places with the type "to-do"
    public ArrayList<Place> getAllToDoPlaces() {
        ArrayList<Place> toDoPlaces = new ArrayList<>();
        for (int i = 0; i < mPlaces.length; i++) {
            if (mPlaces[i].getPlaceType().equals("todo")) {
                toDoPlaces.add(allPlaces.getPlacebyIndex(i));
            }
        }
        return toDoPlaces;
    }

    // Method to grab all the places according with the type
    public ArrayList<Place> getAllToEatPlaces() {
        ArrayList<Place> toeatPlaces = new ArrayList<>();
        for (int i = 0; i < mPlaces.length; i++) {
            if (mPlaces[i].getPlaceType().equals("toeat")) {
                toeatPlaces.add(allPlaces.getPlacebyIndex(i));
            }
        }
        return toeatPlaces;
    }

    // Method to grab all the places with the type "todrink"
    public ArrayList<Place> getAllToDrinkPlaces() {
        ArrayList<Place> todrinkPlaces = new ArrayList<>();
        for (int i = 0; i < mPlaces.length; i++) {
            if (mPlaces[i].getPlaceType().equals("todrink")) {
                todrinkPlaces.add(allPlaces.getPlacebyIndex(i));
            }
        }
        return todrinkPlaces;
    }

    // Method to grab a place for index. Used to change the intents

    public Place getPlacebyIndex(int index) {
        return mPlaces[index];
    }

}
