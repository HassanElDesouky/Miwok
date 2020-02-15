package com.example.miwok;

import java.util.ArrayList;
import java.util.Arrays;

public class DummyDate {
    public static ArrayList<String> listItemMenu = new ArrayList<String>(Arrays.asList("Numbers", "Family Members", "Colors", "Phrases", "Test", "Test", "Test", "Test", "Test", "Test", "Test"));
    public static ArrayList<Integer> colorListItemMenuId = new ArrayList<Integer>(Arrays.asList(R.color.colorTextViewNumbers, R.color.colorTextViewFamilyMembers, R.color.colorTextViewColors, R.color.colorTextViewPhrases));
    public static ArrayList<Integer> imageNumbers = new ArrayList();
    public static ArrayList<Integer> imageFamilyMembers = new ArrayList();
    public static ArrayList<Integer> imageColors = new ArrayList();
    public static ArrayList<String> miwokWordNumbers = new ArrayList();
    public static ArrayList<String> miwokWordFamilyMembers = new ArrayList();
    public static ArrayList<String> miwokWordColors = new ArrayList();
    public static ArrayList<String> miwokWordPhrases = new ArrayList();
    public static ArrayList<String> defaultWordNumbers = new ArrayList();
    public static ArrayList<String> defaultWordFamilyMembers = new ArrayList();
    public static ArrayList<String> defaultWordColors = new ArrayList();
    public static ArrayList<String> defaultWordPhrases = new ArrayList();
    public static ArrayList<Integer> audioNumbers = new ArrayList<>();
    public static ArrayList<Integer> audioFamilyMembers = new ArrayList<>();
    public static ArrayList<Integer> audioColors = new ArrayList<>();
    public static ArrayList<Integer> audioPhrases = new ArrayList<>();

    public static void setDummyDate(){
        imageNumbers.add(R.drawable.number_one);
        imageNumbers.add(R.drawable.number_two);
        imageNumbers.add(R.drawable.number_three);
        imageNumbers.add(R.drawable.number_four);
        imageNumbers.add(R.drawable.number_five);
        imageNumbers.add(R.drawable.number_six);
        imageNumbers.add(R.drawable.number_seven);
        imageNumbers.add(R.drawable.number_eight);
        imageNumbers.add(R.drawable.number_nine);
        imageNumbers.add(R.drawable.number_ten);
        miwokWordNumbers.add("lutti");
        miwokWordNumbers.add("otiiko");
        miwokWordNumbers.add("tolookosu");
        miwokWordNumbers.add("oyyisa");
        miwokWordNumbers.add("massokka");
        miwokWordNumbers.add("temmokka");
        miwokWordNumbers.add("kenekaku");
        miwokWordNumbers.add("kawinta");
        miwokWordNumbers.add("wo’e");
        miwokWordNumbers.add("na’aacha");
        defaultWordNumbers.add("one");
        defaultWordNumbers.add("two");
        defaultWordNumbers.add("three");
        defaultWordNumbers.add("four");
        defaultWordNumbers.add("five");
        defaultWordNumbers.add("six");
        defaultWordNumbers.add("seven");
        defaultWordNumbers.add("eight");
        defaultWordNumbers.add("nine");
        defaultWordNumbers.add("ten");
        imageFamilyMembers.add(R.drawable.family_father);
        imageFamilyMembers.add(R.drawable.family_mother);
        imageFamilyMembers.add(R.drawable.family_son);
        imageFamilyMembers.add(R.drawable.family_daughter);
        imageFamilyMembers.add(R.drawable.family_older_brother);
        imageFamilyMembers.add(R.drawable.family_younger_brother);
        imageFamilyMembers.add(R.drawable.family_older_sister);
        imageFamilyMembers.add(R.drawable.family_younger_sister);
        imageFamilyMembers.add(R.drawable.family_grandmother);
        imageFamilyMembers.add(R.drawable.family_grandfather);
        miwokWordFamilyMembers.add("әpә");
        miwokWordFamilyMembers.add("әṭa");
        miwokWordFamilyMembers.add("angsi");
        miwokWordFamilyMembers.add("tune");
        miwokWordFamilyMembers.add("taachi");
        miwokWordFamilyMembers.add("chalitti");
        miwokWordFamilyMembers.add("teṭe");
        miwokWordFamilyMembers.add("kolliti");
        miwokWordFamilyMembers.add("ama");
        miwokWordFamilyMembers.add("paapa");
        defaultWordFamilyMembers.add("father");
        defaultWordFamilyMembers.add("mother");
        defaultWordFamilyMembers.add("son");
        defaultWordFamilyMembers.add("daughter");
        defaultWordFamilyMembers.add("older brother");
        defaultWordFamilyMembers.add("younger brother");
        defaultWordFamilyMembers.add("older sister");
        defaultWordFamilyMembers.add("younger sister");
        defaultWordFamilyMembers.add("grandmother");
        defaultWordFamilyMembers.add("grandfather");
        imageColors.add(R.drawable.color_red);
        imageColors.add(R.drawable.color_green);
        imageColors.add(R.drawable.color_brown);
        imageColors.add(R.drawable.color_gray);
        imageColors.add(R.drawable.color_black);
        imageColors.add(R.drawable.color_white);
        imageColors.add(R.drawable.color_dusty_yellow);
        imageColors.add(R.drawable.color_mustard_yellow);
        miwokWordColors.add("weṭeṭṭi");
        miwokWordColors.add("chokokki");
        miwokWordColors.add("ṭakaakki");
        miwokWordColors.add("ṭopoppi");
        miwokWordColors.add("kululli");
        miwokWordColors.add("kelelli");
        miwokWordColors.add("ṭopiisә");
        miwokWordColors.add("chiwiiṭә");
        defaultWordColors.add("red");
        defaultWordColors.add("green");
        defaultWordColors.add("brown");
        defaultWordColors.add("gray");
        defaultWordColors.add("black");
        defaultWordColors.add("white");
        defaultWordColors.add("dusty yellow");
        defaultWordColors.add("mustard yellow");
        miwokWordPhrases.add("minto wuksus");
        miwokWordPhrases.add("tinnә oyaase'nә");
        miwokWordPhrases.add("oyaaset...");
        miwokWordPhrases.add("michәksәs?");
        miwokWordPhrases.add("kuchi achit");
        miwokWordPhrases.add("әәnәs'aa?");
        miwokWordPhrases.add("hәә’ әәnәm");
        miwokWordPhrases.add("әәnәm");
        miwokWordPhrases.add("yoowutis");
        miwokWordPhrases.add("әnni'nem");
        defaultWordPhrases.add("Where are you going?");
        defaultWordPhrases.add("What is your name?");
        defaultWordPhrases.add("My name is...");
        defaultWordPhrases.add("How are you feeling?");
        defaultWordPhrases.add("I’m feeling good.");
        defaultWordPhrases.add("Are you coming?");
        defaultWordPhrases.add("Yes, I’m coming.");
        defaultWordPhrases.add("I’m coming.");
        defaultWordPhrases.add("Let’s go.");
        defaultWordPhrases.add("Come here.");
        audioNumbers.add(R.raw.number_one);
        audioNumbers.add(R.raw.number_two);
        audioNumbers.add(R.raw.number_three);
        audioNumbers.add(R.raw.number_four);
        audioNumbers.add(R.raw.number_five);
        audioNumbers.add(R.raw.number_six);
        audioNumbers.add(R.raw.number_seven);
        audioNumbers.add(R.raw.number_eight);
        audioNumbers.add(R.raw.number_nine);
        audioNumbers.add(R.raw.number_ten);
        audioColors.add(R.raw.color_red);
        audioColors.add(R.raw.color_green);
        audioColors.add(R.raw.color_brown);
        audioColors.add(R.raw.color_gray);
        audioColors.add(R.raw.color_black);
        audioColors.add(R.raw.color_white);
        audioColors.add(R.raw.  color_dusty_yellow);
        audioColors.add(R.raw.color_mustard_yellow);
        audioFamilyMembers.add(R.raw.family_father);
        audioFamilyMembers.add(R.raw.family_mother);
        audioFamilyMembers.add(R.raw.family_son);
        audioFamilyMembers.add(R.raw.family_daughter);
        audioFamilyMembers.add(R.raw.family_older_brother);
        audioFamilyMembers.add(R.raw.family_younger_brother);
        audioFamilyMembers.add(R.raw.family_older_sister);
        audioFamilyMembers.add(R.raw.family_younger_sister);
        audioFamilyMembers.add(R.raw.family_grandmother);
        audioFamilyMembers.add(R.raw.family_grandfather);
        audioPhrases.add(R.raw.phrase_where_are_you_going);
        audioPhrases.add(R.raw.phrase_what_is_your_name);
        audioPhrases.add(R.raw.phrase_my_name_is);
        audioPhrases.add(R.raw.phrase_how_are_you_feeling);
        audioPhrases.add(R.raw.phrase_im_feeling_good);
        audioPhrases.add(R.raw.phrase_are_you_coming);
        audioPhrases.add(R.raw.phrase_yes_im_coming);
        audioPhrases.add(R.raw.phrase_im_coming);
        audioPhrases.add(R.raw.phrase_lets_go);
        audioPhrases.add(R.raw.phrase_come_here);
    }
}