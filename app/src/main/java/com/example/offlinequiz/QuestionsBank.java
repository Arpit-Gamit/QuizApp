package com.example.offlinequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        // creating object of questionlist class and passing a questions along with options and answer.

        final QuestionsList question1 = new QuestionsList("Which of these keywords is used to define interfaces in Java?","intf","Intf","interface","Interface","interface","");
        final QuestionsList question2 = new QuestionsList("Which of these are selection statements in Java?","break","continue"," for()","if()","if()","");
        final QuestionsList question3 = new QuestionsList("What is the extension of compiled java classes?",".txt",".js",".class",".java",".class","");
        final QuestionsList question4 = new QuestionsList("Which of the following is not an OOPS concept in Java?","Compilation","Inheritance","Encapsulation","Polymorphism","Compilation","");
        final QuestionsList question5 = new QuestionsList("What is the extension of java code files?",".java",".txt",".class",".js",".java","");
        final QuestionsList question6 = new QuestionsList("Which component is used to compile, debug and execute the java programs?","JVM","JDK","JIT","JRE","JDK","");
        final QuestionsList question7 = new QuestionsList("Which of these cannot be used for a variable name in Java?","identifier","keyword","none of the mentioned","identifier & keyword","keyword","");

        //Adding All Questions to List<QuestionList>

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);

        return questionsList;
    }
    private static List<QuestionsList> phpQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        // creating object of questionlist class and passing a questions along with options and answer.

        final QuestionsList question1 = new QuestionsList("PHP stands for -","Personal Home Processor","Hypertext Preprocessor","Pretext Hypertext Preprocessor","None of the above","Hypertext Preprocessor","");
        final QuestionsList question2 = new QuestionsList("Variable name in PHP starts with -","$ (Dollar)","! (Exclamation)"," # (Hash)","& (Ampersand)","$ (Dollar)","");
        final QuestionsList question3 = new QuestionsList("Which of the following is not a variable scope in PHP?","Extern","Global","Static","Local","Extern","");
        final QuestionsList question4 = new QuestionsList("Which of the following is correct to add a comment in php?","& …… &","// ……","/* …… */","Both (b) and (c)","Both (b) and (c)","");
        final QuestionsList question5 = new QuestionsList("Which of the following function displays the information about PHP and its configuration?","php_info()","info()","phpinfo()","None of the above ","phpinfo()","");
        final QuestionsList question6 = new QuestionsList("Which of the following is the correct syntax to write a PHP code?","<?php ?>"," <? ?>","< ? php ?>","< php >","<?php ?>","");
        final QuestionsList question7 = new QuestionsList(" A function in PHP which starts with __ (double underscore) is known as __________","User Defined Function","Magic Function","Inbuilt Function","Default Function","Magic Function","");

        //Adding All Questions to List<QuestionList>

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);

        return questionsList;
    }
    private static List<QuestionsList> androidQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        // creating object of questionlist class and passing a questions along with options and answer.

        final QuestionsList question1 = new QuestionsList("Identify the language on which Android is based upon.","None","Java","Pretext Hypertext Preprocessor","Python","Java","");
        final QuestionsList question2 = new QuestionsList("The full form of APK is","Android Package Kit","Android Photo Kit","Android Page Kit","Android Phone Kit","Android Package Kit","");
        final QuestionsList question3 = new QuestionsList("In android, mini activities are also known as","Adapter","Fragments","Activity","None","Fragments","");
        final QuestionsList question4 = new QuestionsList("Choose the correct option related to Android.","Android is a web browser","Android is an Operating System","Android is a web server","None","Android is an Operating System","");
        final QuestionsList question5 = new QuestionsList("Activity in Android can be killed using?","finishActivity (int requestCode)","finish() method","neither a and b","None ","finish() method","");
        final QuestionsList question6 = new QuestionsList("AVD stands for","Android Virtual Device","Active Virtual Device","Android Virtual display","Active Virtual Display","Android Virtual Device","");
        final QuestionsList question7 = new QuestionsList("Which of the following is the first callback method that is invoked by the system during an activity life-cycle?","onClick() method","onCreate() method","onRestart() method","onStart() method","onCreate() method","");

        //Adding All Questions to List<QuestionList>

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);

        return questionsList;
    }
    private static List<QuestionsList> htmlQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        // creating object of questionlist class and passing a questions along with options and answer.

        final QuestionsList question1 = new QuestionsList(" HTML stands for -","HighText Machine Language","HyperText and links Markup Language","HyperText Markup Language","None of these","HyperText Markup Language","");
        final QuestionsList question2 = new QuestionsList("Which of the following element is responsible for making the text bold in HTML?","<pre>","<a>","<b>","<br>","<b>","");
        final QuestionsList question3 = new QuestionsList("Which of the following tag is used to insert a line-break in HTML?","<br>","<a>","<pre>","<b>","<br>","");
        final QuestionsList question4 = new QuestionsList("Which of the following element is responsible for making the text italic in HTML?","<italic>","<i>","<pre>","<it>","<i>","");
        final QuestionsList question5 = new QuestionsList("<input> is -","an empty tag.","a format tag.","All of the above","None of the above","an empty tag.","");
        final QuestionsList question6 = new QuestionsList("Which of the following tag is used to define options in a drop-down selection list?","<list>","<dropdown>","<option>","<select>","<option>","");
        final QuestionsList question7 = new QuestionsList("In which part of the HTML metadata is contained?","html tag","body tag","title tag","head tag","head tag","");

        //Adding All Questions to List<QuestionList>

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);

        return questionsList;
    }

    public  static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return  phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return  htmlQuestions();
        }
    }


}
