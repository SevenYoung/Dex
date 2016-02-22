package cn.siat.dex.server;
import org.apache.spark.launcher.SparkLauncher;
import org.apache.thrift.TException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Created by SevenYoung on 15-10-27.
 */
public class AppSubmitter implements DexService.Iface {
    //This is for the local
//    private static final String SPARK_HOME = "/Users/SevenYoung/packs/spark-1.5.1-bin-hadoop2.4";
//    private static final String RESOURCE_HOME = "/Users/SevenYoung/packs/postSpark/target/scala-2.10/postspark_2.10-1.0.jar";

    //This is for the cluster
    private static final String SPARK_HOME = "/usr/local/spark-1.5.1-bin-hadoop2.4";
    private static final String RESOURCE_HOME = "/root/postspark_2.10-1.0.jar";
    private static final String SPARK_MASTER = "spark://192.168.1.2:7077";
//    private static final String SPARK_LOCAL = "local[3]";



//    @Override
//    public Map<String, Integer> wordcount(String filename) throws TException, IOException, InterruptedException {
//
//        System.out.println("I'm Word Count");
//        HashMap<String, Integer> res = new HashMap<>();
//        String bracket1 = Pattern.quote("(");
//        String bracket2 = Pattern.quote(")");
//
////        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.WordCount", "local[3]");
//        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.WordCount", SPARK_MASTER, filename);
//
//        Process sLauncher = launcher.launch();
//        try (Scanner in = new Scanner(sLauncher.getInputStream())) {
//            while (in.hasNextLine()) {
//                String tmp = in.nextLine();
//                System.out.println(tmp);
//                Pattern kvPattern = Pattern.compile(bracket1 + "(\\w*)" + "," + "(\\d*)" + bracket2);
//                Matcher matcher = kvPattern.matcher(tmp);
//                if (matcher.matches()) {
//                    String Key = matcher.group(1);
//                    String Value = matcher.group(2);
//                    res.put(Key, Integer.parseInt(Value));
//                    System.out.println(Key + "," + Value);
//                }
//            }
//        }
//        sLauncher.waitFor();
//        return res;
//    }
//
//    @Override
//    public String DTR(String filename, String impurity, String maxDepth) throws TException, IOException, InterruptedException {
//        System.out.println("I am SparkPgML Regression DecisionTree");
//        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.SparkPgML", "local[3]",
//                filename, "DT", "R", impurity, maxDepth);
////        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.SparkPgML", SPARK_MASTER,
////                filename, "DT", "R", impurity, maxDepth);
//        Process sLauncher = launcher.launch();
//        StringBuffer res = new StringBuffer();
//        try (Scanner in = new Scanner(sLauncher.getInputStream())) {
//            while (in.hasNextLine()) res.append(in.nextLine());
//        }
//        sLauncher.waitFor();
//        return res.toString();
//    }
//
//    @Override
//    public String DTC(String filename, String numClasses, String impurity, String maxDepth) throws TException, IOException, InterruptedException {
//        System.out.println("I am SparkPgML Classification DecisionTree");
////        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.SparkPgML", "local[3]",
////                filename, "DT", "C", numClasses, impurity, maxDepth);
//        SparkLauncher launcher = getLauncher("cn.siat.dex.mllib.SparkPgML", SPARK_MASTER,
//                filename, "DT", "C", numClasses, impurity, maxDepth);
//        System.out.println("111111");
//        Process sLauncher = launcher.launch();
//        System.out.println(filename);
//        System.out.println(numClasses);
//        System.out.println(impurity);
//        System.out.println(maxDepth);
//        if(sLauncher == null) System.out.println("not launch");
////        StringBuffer res = new StringBuffer();
////        try (Scanner in = new Scanner(sLauncher.getInputStream())) {
////            while (in.hasNextLine()) res.append(in.nextLine());
////        }
////
//        System.out.println("222222");
//        sLauncher.waitFor();
////        sLauncher.wait(10000, 0);
////        return res.toString();
//        return "DTC is Done";
//
//    }

    public SparkLauncher getLauncher(String mainClass, String master, String... args){
        SparkLauncher launcher = new SparkLauncher().setSparkHome(SPARK_HOME).setAppResource(RESOURCE_HOME)
                .setMainClass(mainClass)
                .setMaster(master)
                .addAppArgs(args);
        return launcher;
    }

    @Override
    public DexResponse wc(WCParams params) throws TException {
        return null;
    }

    @Override
    public DexResponse DTR(DTRParams params) throws TException {
        return null;
    }

    @Override
    public DexResponse DTC(DTCParams params) throws TException {
        return null;
    }
}
