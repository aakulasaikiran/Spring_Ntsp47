package com.nt.serviceLocator;



import com.nt.extenal.ScoreCardComp;
import com.nt.extenal.ScoreCardCompImpl;

public class ScoreCardCompServiceLocator{

public  ScoreCardComp  locateService(){
   ScoreCardComp scc=new ScoreCardCompImpl();
 return scc;
 }
}