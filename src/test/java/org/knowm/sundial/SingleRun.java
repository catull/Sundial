package org.knowm.sundial;

/** @author timmolter */
public class SingleRun {

  public static void main(String[] args) {

    SundialJobScheduler.startScheduler();

    SundialJobScheduler.addJob("SampleJob8", "org.knowm.sundial.jobs.SampleJob8");

    SundialJobScheduler.startJob("SampleJob8");

//        try {
//          Thread.sleep(1000);
//        } catch (InterruptedException e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//        }

    SundialJobScheduler.shutdown();
  }
}