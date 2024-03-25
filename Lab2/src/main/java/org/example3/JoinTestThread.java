package org.example3;

import java.util.List;

public class JoinTestThread extends Thread{
    Thread t;
    int n;



    public JoinTestThread(String name, Thread t) {
        this.setName(name);
        this.t = t;
        if(t == null)
            this.n = 50001;
        else
            this.n = 20001;
    }

    public void run(){
        try {
            if(t != null) {
                t.join();
            }
            int[] divisors = new int[n+1];
            int sum = 0;
            for (int i=1; i<=n; i++){
                if(n % i == 0){
                    divisors[i] = i;
                    sum += divisors[i];
                }
            }

            Main.value += sum;
            System.out.println("Thread " + this.getName() +" printed: " + Main.value);


            Thread.sleep(3000);

        } catch (Exception e) {
                e.printStackTrace();
            }
    }

}

