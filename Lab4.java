//Author Sean Stitzer
//Date 9/19/18

public class Lab4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Integer[] arr1 = {1,8,5,9,2,6,7}; //normal case
		Integer[] arr2 = {45,46,47,48,49,50,51}; //an already oppositely sorted case
		Integer[] arr3 = {}; //an empty array case
		Integer[] arr4 = {12,null,38,97,42,35,61}; //a partially null case
		Integer[] arr5 = {12,76,12,43,98,7,29}; //a duplicate case
		Integer[] arr6 = null;

		sort(arr1);
		printArr(arr1);
		sort(arr2);
		printArr(arr2);
		sort(arr3);
		printArr(arr3);
		sort(arr4);
		printArr(arr4);
		sort(arr5);
		printArr(arr5);
		sort(arr6);
		printArr(arr6);
	}

	public static Integer[] sort(Integer[] inputArr)
	{
		Integer[] tempArr;
		int max = -999999999;
		tempArr = inputArr;

		try
		{
			for(int i = 0; i < tempArr.length - 1; i++)
				for(int j = i + 1; j < tempArr.length; j++)
				{
						if(tempArr[j] > tempArr[i])
						{
							//checks to see if the element if viable to be switched
							max = tempArr[j];
							tempArr[j] = tempArr[i];
							tempArr[i] = max;
						}
				}
		}
		catch(Exception e)
		{
			System.out.println("couldn't read array completely");
		}
		return tempArr;
	}


	public static void printArr(Integer[] inputArr)
	{
		if(inputArr != null)
		{
			for(Integer x: inputArr)
				if(x != null)
					System.out.print(x + "\t");
			System.out.println();
		}
	}
}
