package com;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolExecutor extends ThreadPoolExecutor{
	
	public MyThreadPoolExecutor() {
		
		super(3,3,0L,TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>());
	}

}
