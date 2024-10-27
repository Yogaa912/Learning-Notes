package com.mj.adapter;

class Applicator {
	public static void apply(ProcessorInterface p, Object o) {
		System.out.println("The name is " + p.name());
		System.out.println("The result is " + p.process(o));
	}
}

class waveform {
	private static long counter;
    private final long id = counter++;
    
    @Override
    public String toString() {
        return "Waveform " + id;
    }
}

interface ProcessorInterface {
	String name();
	Object process(Object input);
}

class AdapterFilter implements ProcessorInterface {
	Filter filter;
	AdapterFilter(Filter filter) {
		this.filter = filter;
	}
	@Override
	public String name() {
		return filter.name();
	}
	@Override
	public Object process(Object input) {
		return filter.process((waveform)input);
	}
}

public class AdapterProcess {
	public static void main(String[] args) {
		waveform w = new waveform();
		Applicator.apply(new AdapterFilter(new Filter()),w);
		Applicator.apply(new AdapterFilter(new LowPass(2.1)),w);
		Applicator.apply(new AdapterFilter(new HighPass(3.4)),w);
	}
}
