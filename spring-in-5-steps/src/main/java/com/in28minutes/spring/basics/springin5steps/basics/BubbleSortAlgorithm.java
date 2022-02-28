package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
  public int[] sort(int[] numbers) {
	  
	  
	  return numbers;
  }
}
