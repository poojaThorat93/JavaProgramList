package ArryaysTest;
public class SingleDiArray {
	
public static void main(String []args){
	
int[]a = new int[5];//declaration and instantiation  
a[0] =10; //initialization  
a[1] =20;
a[2] =30;
a[3] =40;
a[4] =50;

System.out.println(a[4]); // to print single value
for(int i=0;i<a.length; i++)//length is the property of array  
	System.out.println(a[i]);

int[]b = {70,80,90};//declaration, instantiation and initialization 
for(int p=0;p<b.length;p++)
	System.out.println(b[p]);

// --------- For-each Loop for Java Array ----------
int[]value = {1,2,3,};
for(int j :value)
	System.out.println(j);

}
}