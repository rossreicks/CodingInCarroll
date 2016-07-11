package day4;

import java.util.Random;
import java.math.*;

public class ArrayMethods {
	private int[] values = {4,9,12,1};
	
	public ArrayMethods(){
	}
	
	
	public String printArray(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < values.length-1; i++){
			sb.append(values[i]+",");
		}
		sb.append(values[values.length-1] + "]");
		return sb.toString();
	}
	
	public void shiftRight(){
		int last = values[values.length-1];
		for(int i = values.length-1; i > 0; i--){
			values[i] = values[i-1];
		}
		values[0] = last;
	}
	
	public void swapFirstAndLast(){
		int first = values[0];
		int last = values[values.length-1];
		values[0] = last;
		values[values.length-1]=first;
	}
	
	public void evenReplace(){
		for(int i = 0; i<values.length;i++){
			if(i%2==0){
				values[i]=0;
			}
		}
	}
	
	public void swap(int index1, int index2){
		int first = values[index1];
		int last = values[index2];
		
		values[index2] = first;
		values[index1] = last;
	}
	
	public void neighborReplace(){
		for(int i = 1; i < values.length-1; i++){
			int left = values[i-1];
			int right = values[i+1];
			values[i] = Math.max(left,right);
		}
	}
	
	public void middleRemove(){
		if(values.length %2==1){
			
		}
	}
	
	public void moveEven(){
		int count = 0;
		for(int i = 0;i<values.length;i++){
			if(values[i]%2==0){
				shift(i,count);
				count++;
			}
		}
	}
	
	public void shift(int valueIndex, int count){
		int value = values[valueIndex];
		for(int i = valueIndex; i > count; i--){
			values[i] = values[i-1];
		}
		values[count] = value;
	}
	
	public int secondLargest(){
		int largest = 0;
		int second = 0;
		for(int i = 0; i<values.length;i++){
			if(values[i]>largest){
				second = largest;
				largest = values[i];
			}
		}
		return second;
	}
	
	public boolean isInOrder(){
		for(int i = 0; i<values.length-1;i++){
			if(values[i+1]<values[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean adjDupes(){
		for(int i = 0; i<values.length-1; i++){
			if(values[i+1] == values[i]){
				return true;
			}
		}
		return false;
	}
	
	public boolean dupes(){
		for(int i = 0; i<values.length-1;i++){
			for(int j = i+1; j<values.length;j++){
				if(values[i]==values[j]){
					return true;
				}
			}
		}
		return false;
	}
	
	public int[] sort(){
		int smallest = values[0];
		int[] arr = new int[values.length];
		int count = 0;
		int index = 0;
		for(int i = 0; i<values.length; i++){
			index = 0;
			for(int j = count; j<values.length;j++){
				if(values[j]<smallest){
					smallest = values[j];
					index = j;
				}
			}
			values[index] = 
			arr[count] = smallest;
			smallest = 1000;
			count++;
		}
		values = arr;
		return values;
	}
	
	public static void main(String[] args){
		ArrayMethods arr = new ArrayMethods();
		//arr.swapFirstAndLast();
		//arr.printArray();
		//arr.shiftRight();
		//arr.evenReplace();
		//arr.neighborReplace();
		//arr.moveEven();
		arr.sort();
		System.out.println(arr.printArray());
		//arr.swapFirstAndLast();
		//System.out.println(arr.dupes());
	}
}
