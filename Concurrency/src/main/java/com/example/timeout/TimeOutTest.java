package com.example.timeout;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by loon on 17/2/9.
 */
public class TimeOutTest {


    public static void main(String[] args) {


        List<String> stringList = new ArrayList<String>();


        ExecutorService exec = Executors.newFixedThreadPool(2);

        List<QueryData> queryDataList = Lists.newArrayList(new QueryDataOneImpl(), new QueryDataSecondImpl());
        List<Future<String>> futureList = Lists.newArrayList();

        for (final QueryData queryData : queryDataList) {

            futureList.add(exec.submit(new Callable<String>() {
                        public String call() throws Exception {
                            return queryData.getData();
                        }
                    })
            );

        }


        for (Future<String> stringFuture : futureList) {

            try {
                stringList.add(stringFuture.get(3, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

        }


        System.out.println(stringList);

    }
}


