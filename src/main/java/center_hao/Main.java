package center_hao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iss on 2018/4/26.
 */
public class Main {

    public static void main(String[] args) {
        String old ="17078018113,17078018975,17078019032,17078019539,17078019707,17078019839,17078020620,17078021270,17078021607,17078021893,17078022092,17078023937,17078023952,17078025225,17078025950,17078027016,17078028223,17078029212,17078029280,17078029361,17078029808,17088020653,17088023907,17088026062,17088027636,17088027786,17088030807,17088031268,17088031612,17088031727,17088036163,17088036578,17088036967,17088038281,17088038337,17088038763,17088090596,17088090598,17088092721,17088092865,17088093018,17088093286,17088093786,17088095768,17088095960,17088096368,17088097026,17088097536,17088097795,17088098516,17088098935,17088140187,17088140679,17088140787,17088140902,17088140985,17088141396,17088141557,17088141619,17088141629,17088141671,17088141976,17088143075,17088143289,17088143695,17088143917,17088145095,17088145378,17088145975,17088146252,17088146291,17088147216,17088147823,17088147908,17088148536,17088149062,17088149505,17088149693,17092816856,17092820103,17092880836,17092880861,17092881083,17092881629,17092881882,17092881908,17092882072,17092882219,17092882695,17092882762,17092883073,17092883156,17092883267,17092883859,17092883991,17092885217,17092885292,17092885307,17092885563,17092885663,17092885692,17092885825,17092886107,17092886112,17092886523,17092886573,17092886623,17092886632,17092887503,17092887831,17092888323,17092888356,17092888572,17092888958,17092889075,17092889507,17092889686,17092889761,17092889768,17092889928,17092889956,17092889959,17098350318,17098350773,17098350873,17098351356,17098352152,17098352236,17098352532,17098352853,17098353110,17098353616,17098353675,17098353832,17098353885,17098353891,17098353915,17098353916,17098355087,17098355250,17098355265,17098355379,17098355982,17098356807,17098356816,17098357591,17098358807,17098359051,17098359337,17098359667,17072880134,17072880140,17088100018,17088100028,17088100078,17088100198,17088100210,17088100829,17088101829,17088102829,17088103829,17088104092,17088104093,17088104094,17088104095,17088104096,17088104097,17088104101,17088104102,17088104103,17088104105,17088104106,17088104107,17088104109,17088104110,17088104112,17088104113,17088104151,17088104152,17088104153,17088104154,17088104156,17088104157,17088104159,17088104160,17088104161,17088104162" ;
        String[] olds= old.split(",");
        List<String> stringArrayList = new ArrayList<String>();
        for(String cell:olds){
            stringArrayList.add(cell);
        }

        List<String> stringNew = new ArrayList<String>();

        for(String cell:olds){
            stringNew.add(cell);
        }

        String now ="17072878663,17072890157,17072890957,17072896501,17078023937,17078025225,17078029280,17078029808,17088023907,17088030807,17088092721,17088095960,17088140902,17088141396,17088145975,17088146291,17092880836,17092882695,17092883156,17092883859,17092886632,17092888958,17092889686,17098353915,17098355265,17098359337,17088038763,17088098516,17088140787,17088141557,17088143917,17088149693,17092880861,17092881629,17092881908,17092882762,17092883267,17092885563,17092885692,17092886623,17092889075,17092889928,17098350773,17098353916,17098355250,17098355379,17098359051,17098359667,17078019032,17078023952,17078029361,17088020653,17088026062,17088027786,17088031727,17092889507,17092883073,17088140985,17072875771,17072878697,17072890589,17078003217,17078005771,17078008323";
        String[] nows= now.split(",");
        List<String> stringArrayListb = new ArrayList<String>();
        for(String cell:nows){
            stringArrayListb.add(cell);
        }

        stringArrayList.retainAll(stringArrayListb);

        stringNew.removeAll(stringArrayList);

        String result = "";
        for(String cell:stringNew){

            System.out.println();
            result +=cell+",";
        }

        System.out.println(result);

    }
}
