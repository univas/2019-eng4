package br.edu.univas;

import java.util.HashMap;
import java.util.Map;

public class ExpressionCache {

	private Map<String, Double> cache;
	
	public ExpressionCache() {
		cache = new HashMap();
	}
	
	public void add(String expression, Double result) {
		cache.put(expression, result);
	}
	
	public Double get(String expression) {
		return cache.get(expression);
	}
	
}
