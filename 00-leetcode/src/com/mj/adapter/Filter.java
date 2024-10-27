package com.mj.adapter;

class LowPass extends Filter {
	double cutoff;
	
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	@Override
	public waveform process(waveform w) {
		return w;
	}
}

class HighPass extends Filter {
	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	@Override
	public waveform process(waveform w) {
		return w;
	}
}

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public waveform process(waveform w) {
		return w;
	}
}
